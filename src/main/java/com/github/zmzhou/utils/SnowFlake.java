package com.github.zmzhou.utils;

/**
 * 「雪花算法」是由符号位+时间戳+工作机器id+序列号组成
 * 雪花算法能存放多少数据？时间范围：2^41 / (3652460601000) = 69年 工作进程范围：2^10 = 1024
 * 序列号范围：2^12 = 4096，表示1ms可以生成4096个ID
 *
 * @author zmzhou
 * @version 1.0
 * date 2021/1/15 16:34
 */
public class SnowFlake {

	/**
	 * 起始的时间戳，可设置系统部署之日时间戳
	 */
	private static final long START_STMP = 1613994923346L;

	/**
	 * 每一部分占用的位数
	 * 序列号占用的位数
	 */
	private static final long SEQUENCE_BIT = 12;
	/**
	 * 机器标识占用的位数
	 */
	private static final long MACHINE_BIT = 5;
	/**
	 * 数据中心占用的位数
	 */
	private static final long DATACENTER_BIT = 5;

	/**
	 * 每一部分的最大值
	 */
	private static final long MAX_DATACENTER_NUM = ~(-1L << DATACENTER_BIT);
	private static final long MAX_MACHINE_NUM = ~(-1L << MACHINE_BIT);
	private static final long MAX_SEQUENCE = ~(-1L << SEQUENCE_BIT);

	/**
	 * 每一部分向左的位移
	 */
	private static final long MACHINE_LEFT = SEQUENCE_BIT;
	private static final long DATACENTER_LEFT = SEQUENCE_BIT + MACHINE_BIT;
	private static final long TIMESTMP_LEFT = DATACENTER_LEFT + DATACENTER_BIT;

	/**
	 * 数据中心
	 */
	private final long datacenterId;
	/**
	 * 机器标识
	 */
	private final long machineId;
	/**
	 * 序列号
	 */
	private long sequence = 0L;
	/**
	 * 上一次时间戳
	 */
	private long lastStmp = -1L;

	/**
	 * Instantiates a new Snow flake.
	 *
	 * @param datacenterId the 数据中心 id
	 * @param machineId    the 机器标识 id
	 */
	public SnowFlake(long datacenterId, long machineId) {
		if (datacenterId > MAX_DATACENTER_NUM || datacenterId < 0) {
			throw new IllegalArgumentException("datacenterId can't be greater than " +
					MAX_DATACENTER_NUM + " or less than 0");
		}
		if (machineId > MAX_MACHINE_NUM || machineId < 0) {
			throw new IllegalArgumentException("machineId can't be greater than " +
					MAX_MACHINE_NUM + " or less than 0");
		}
		this.datacenterId = datacenterId;
		this.machineId = machineId;
	}

	/**
	 * 产生下一个ID
	 * Next id long.
	 *
	 * @return the long 下一个ID
	 */
	public synchronized long nextId() {
		long currStmp = currentTimeMillis();
		if (currStmp < lastStmp) {
			throw new RuntimeException("Clock moved backwards.  Refusing to generate id");
		}
		if (currStmp == lastStmp) {
			//相同毫秒内，序列号自增
			sequence = (sequence + 1) & MAX_SEQUENCE;
			//同一毫秒的序列数已经达到最大
			if (sequence == 0L) {
				currStmp = getNextMillis();
			}
		} else {
			//不同毫秒内，序列号置为0
			sequence = 0L;
		}
		lastStmp = currStmp;
		//时间戳部分 | 数据中心部分 | 机器标识部分 | 序列号部分
		return (currStmp - START_STMP) << TIMESTMP_LEFT | datacenterId << DATACENTER_LEFT
				| machineId << MACHINE_LEFT | sequence;
	}

	/**
	 * 下一个时间戳
	 * @return next currentTimeMillis
	 * @author zmzhou
	 * @date 2021/1/15 17:04
	 */
	private long getNextMillis() {
		long mill = currentTimeMillis();
		while (mill <= lastStmp) {
			mill = currentTimeMillis();
		}
		return mill;
	}

	/**
	 * 当前时间戳
	 * @return currentTimeMillis
	 * @author zmzhou
	 * @date 2021/1/15 16:49
	 */
	private long currentTimeMillis() {
		return System.currentTimeMillis();
	}
}

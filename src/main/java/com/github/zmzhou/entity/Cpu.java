package com.github.zmzhou.entity;


import com.github.zmzhou.utils.Arith;

import lombok.ToString;

/**
 * CPU相关信息
 * @author zmzhou
 * @version 1.0
 * <p>
 * date 2020/9/18 20:48
 * </p>
 */
@ToString
public class Cpu {
	/**
	 * 核心数
	 */
	private int cpuNum;
	
	/**
	 * CPU总的使用率
	 */
	private double total;
	
	/**
	 * CPU系统使用率
	 */
	private double sys;
	
	/**
	 * CPU用户使用率
	 */
	private double used;
	
	/**
	 * CPU当前等待率
	 */
	private double wait;
	
	/**
	 * CPU当前空闲率
	 */
	private double free;
	
	/**
	 * Gets cpu num.
	 *
	 * @return the cpu num
	 */
	public int getCpuNum() {
		return cpuNum;
	}
	
	/**
	 * Sets cpu num.
	 *
	 * @param cpuNum the cpu num
	 */
	public void setCpuNum(int cpuNum) {
		this.cpuNum = cpuNum;
	}
	
	/**
	 * Gets total.
	 *
	 * @return the total
	 */
	public double getTotal() {
		return Arith.round(Arith.mul(total, 100), 2);
	}
	
	/**
	 * Sets total.
	 *
	 * @param total the total
	 */
	public void setTotal(double total) {
		this.total = total;
	}
	
	/**
	 * Gets sys.
	 *
	 * @return the sys
	 */
	public double getSys() {
		return Arith.round(Arith.mul(sys / total, 100), 2);
	}
	
	/**
	 * Sets sys.
	 *
	 * @param sys the sys
	 */
	public void setSys(double sys) {
		this.sys = sys;
	}
	
	/**
	 * Gets used.
	 *
	 * @return the used
	 */
	public double getUsed() {
		return Arith.round(Arith.mul(used / total, 100), 2);
	}
	
	/**
	 * Sets used.
	 *
	 * @param used the used
	 */
	public void setUsed(double used) {
		this.used = used;
	}
	
	/**
	 * Gets wait.
	 *
	 * @return the wait
	 */
	public double getWait() {
		return Arith.round(Arith.mul(wait / total, 100), 2);
	}
	
	/**
	 * Sets wait.
	 *
	 * @param wait the wait
	 */
	public void setWait(double wait) {
		this.wait = wait;
	}
	
	/**
	 * Gets free.
	 *
	 * @return the free
	 */
	public double getFree() {
		return Arith.round(Arith.mul(free / total, 100), 2);
	}
	
	/**
	 * Sets free.
	 *
	 * @param free the free
	 */
	public void setFree(double free) {
		this.free = free;
	}
}

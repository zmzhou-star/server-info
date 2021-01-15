package com.github.zmzhou.utils;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * SnowFlakeTest
 * @author zmzhou
 * @version 1.0
 * @date 2021/1/15 16:42
 */
public class SnowFlakeTest {

	@Test
	public void nextId() {
		SnowFlake snowFlake = new SnowFlake(1, 1);
		for (int i = 0; i < (1 << 12); i++) {
			System.out.println(snowFlake.nextId());
		}
		Assert.assertNotNull(snowFlake);
	}
}

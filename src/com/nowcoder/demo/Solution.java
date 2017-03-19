package com.nowcoder.demo;

import org.junit.Test;

public class Solution {
	/**
	 * 获得两个整形二进制表达位数不同的数量
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public int countBitDiff(int m, int n) {
		String mnString = Integer.toBinaryString(m ^ n);
		int count = 0;
		for (int i = 0; i < mnString.length(); i++) {

			if (mnString.charAt(i) == '1') {
				count += 1;
			}
		}

		return count;
	}

	@Test
	public void testCountBitDiff() {
		int m = 16807;
		int n = 282475249;
		String mnString = Integer.toBinaryString(m ^ n);
		System.out.println(countBitDiff(m, n));
	}
}

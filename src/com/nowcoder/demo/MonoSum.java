package com.nowcoder.demo;

import org.junit.Test;

/**
 * @see 现定义数组单调和为所有元素i的f(i)值之和。这里的f(i)函数定义为元素i左边(不包括其自身)小于等于它的数字之和。请设计一个高效算法，
 *      计算数组的单调和。给定一个数组A同时给定数组的大小n，请返回数组的单调和。保证数组大小小于等于500，同时保证单调和不会超过int范围。
 * 
 * @author pengmin
 *
 */
public class MonoSum {
	/**
	 * 
	 * @param A
	 *            [1,3,5,2,4,6]
	 * @param n
	 *            6
	 * @return 27
	 */
	public int monoSum(int[] A, int n) {
		// write code here
		int monoSum = 0;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (A[j] < A[i]) {
					monoSum += A[j];
				}
			}
		}
		return monoSum;
	}

	@Test
	public void monoSumTest() {
		int[] A = { 461, 533, 323, 533, 320, 191, 167 };
		int n = A.length;
		System.out.println(monoSum(A, n));
	}
}

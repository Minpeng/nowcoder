package com.nowcoder.demo;

import java.util.Arrays;

import org.junit.Test;

/**
 * 相邻最大差值
 * 
 * @author pengmin
 *
 */
public class MaxDivision {
	/**
	 * @see计算一个未排序数组中排序后相邻元素的最大差值。
	 * @param A
	 * @param n
	 * @return
	 */
	public int findMaxDivision(int[] A, int n) {
		// write code here
		int maxDivision = 0;
		// 排序
		Arrays.sort(A);
		for (int i = 0; i < A.length - 1; i++) {
			maxDivision = Math.abs(A[i] - A[i + 1]) > maxDivision ? Math
					.abs(A[i] - A[i + 1]) : maxDivision;
		}
		return maxDivision;
	}

	@Test
	public void testFindMaxDivision() {
		int A[] = { 9, 3, 1, 10 };
		int n = A.length;
		System.out.println(findMaxDivision(A, n));
	}
}

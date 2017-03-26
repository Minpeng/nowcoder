package com.nowcoder.demo;

import org.junit.Test;

/**
 * 二分查找
 * 
 * @author pengmin
 *
 */
public class BinarySearch {
	/**
	 * 二分查找元素所在位置
	 * 
	 * @param A
	 *            数组[1,3,5,7,9]
	 * @param n
	 *            数组长度 5
	 * @param val
	 *            3 查找的数字
	 * @return
	 */
	public int getPos(int[] A, int n, int val) {
		// write code here
		int index = 0;
		int start = 0;
		int end = n - 1;
		int mid;
		while (start <= end) {
			mid = (start + end) / 2;
			// 右边
			if (A[mid] < val) {
				start = mid + 1;
			} else {
				// 左边
				end = mid - 1;
			}
			index = start;
		}

		if (A[index] != val) {
			index = -1;
		}
		return index;
	}

	@Test
	public void testGetPos() {
		int[] A = { 1, 3, 5, 7, 9 };
		int n = A.length;
		int val = 3;
		System.out.println(getPos(A, n, val));
	}
}

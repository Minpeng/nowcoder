package com.nowcoder.demo;

import org.junit.Test;

/**
 * 左右最值最大差值
 * 
 * @author pengmin
 *
 */
public class MaxGap {
	/**
	 * @see给定一个长度为N(N>1)的整型数组A，可以将A划分成左右两个部分，左部分A[0..K]，右部分A[K+1..N-1]，K可以取值的范围是[0,N-2]。求这么多划分方案中，左部分中的最大值减去右部分最大值的绝对值，最大是多少？
	 * @param A
	 * @param n
	 * @return
	 */
	public int findMaxGap(int[] A, int n) {
		int maxGap = 0;
		// List listA = new ArrayList<>();
		// for (int i = 0; i < A.length; i++) {
		// listA.add(A[i]);
		// }
		// for (int k = 0; k <= n / 2; k++) {
		// int tempMaxGap = 0;
		// List leftList = listA.subList(0, k);
		// List rightList = listA.subList(k, n);
		// if (leftList != null && leftList.size() > 0 && rightList != null
		// && rightList.size() > 0) {
		// int leftMax = Collections.max(leftList);
		// int rightMax = Collections.max(rightList);
		// tempMaxGap = leftMax - rightMax > 0 ? leftMax - rightMax
		// : rightMax - leftMax;
		//
		// maxGap = maxGap > tempMaxGap ? maxGap : tempMaxGap;
		// }
		//
		// }

		/*** 数组的方式 **/
		for (int k = 1; k <= n - 1; k++) {
			int[] leftA = new int[k];
			int[] rightA = new int[n - k];
			int tempMaxGap = 0;
			for (int i = 0; i < n; i++) {
				if (i < k) {
					leftA[i] = A[i];
				} else {
					rightA[i - k] = A[i];
				}
			}
			int leftMax = 0;
			for (int m = 0; m < leftA.length; m++) {
				if (leftMax < leftA[m]) {
					leftMax = leftA[m];
				}

			}
			int rightMax = 0;
			for (int m = 0; m < rightA.length; m++) {
				if (rightMax < rightA[m]) {
					rightMax = rightA[m];
				}
			}

			tempMaxGap = leftMax - rightMax > 0 ? leftMax - rightMax : rightMax
					- leftMax;
			maxGap = maxGap > tempMaxGap ? maxGap : tempMaxGap;
		}

		return maxGap;

	}

	@Test
	public void testFindMaxGap() {
		int A[] = new int[] { 28, 75, 38, 44, 66, 1 };
		int n = A.length;
		int maxGap = findMaxGap(A, n);
		System.out.println(maxGap);
	}
}

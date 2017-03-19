package com.nowcoder.demo;

/**
 * @see 有一个长为n的数组A，求满足0≤a≤b<n的A[b]-A[a]的最大值。 给定数组A及它的大小n，请返回最大差值。
 * @see 测试样例：[10,5],2 返回：0
 * 
 * @author pengmin
 *
 */
public class LongestDistance {
	public int getDis(int[] A, int n) {
		// write code here
		int dis = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				dis = A[i] - A[j] < dis ? dis : A[i] - A[j];
			}
		}
		return dis;
	}

}

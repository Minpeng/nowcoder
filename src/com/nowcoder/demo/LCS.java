package com.nowcoder.demo;

import org.junit.Test;

public class LCS {
	/**
	 * 最长公共子序列
	 * 
	 * @see http://www.cnblogs.com/en-heng/p/3963803.html
	 * @param A
	 * @param n
	 * @param B
	 * @param m
	 * @return
	 */
	public int findLCS(String A, int n, String B, int m) {
		// write code here
		int temp[][] = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				if (i == 0 || j == 0) {
					temp[i][j] = 0;
				} else if (A.charAt(i - 1) == B.charAt(j - 1)) {
					temp[i][j] = temp[i - 1][j - 1] + 1;
				} else {
					temp[i][j] = temp[i - 1][j] > temp[i][j - 1] ? temp[i - 1][j]
							: temp[i][j - 1];
				}
			}
		}
		return temp[n][m];
	}

	@Test
	public void testFindLCS() {
		String A = "1A2C3D4B56";
		String B = "B1D23CA45B6A";
		int n = A.length();
		int m = B.length();
		System.out.println(findLCS(A, n, B, m));
	}
}

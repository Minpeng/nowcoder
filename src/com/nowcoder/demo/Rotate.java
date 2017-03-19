package com.nowcoder.demo;

import org.junit.Test;

public class Rotate {
	public int[][] rotateMatrix(int[][] mat, int n) {
		int[][] rotateMatrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				rotateMatrix[j][n - i - 1] = mat[i][j];
			}
		}
		return rotateMatrix;
	}

	@Test
	public void testRotateMatrix() {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int n = 3;

		int[][] rotateMatrix = rotateMatrix(mat, n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(rotateMatrix[i][j] + " ");
			}
			System.out.println();
		}

	}
}

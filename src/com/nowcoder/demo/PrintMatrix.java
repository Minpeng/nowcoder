package com.nowcoder.demo;

import java.util.ArrayList;

import org.junit.Test;

/**
 * 之字形打印数组
 * 
 * @author pengmin
 *
 */
public class PrintMatrix {
	public int[] printMatrix(int[][] mat, int n, int m) {
		// write code here
		int[] matrix = new int[n * m];
		ArrayList<Integer> matrixList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < m; j++) {
					matrixList.add(mat[i][j]);
				}
			} else {
				for (int j = m - 1; j >= 0; j--) {
					matrixList.add(mat[i][j]);
				}
			}

		}
		for (int i = 0; i < n * m; i++) {
			matrix[i] = matrixList.get(i);
		}

		return matrix;
	}

	@Test
	public void testPrintMatrix() {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		int n = mat.length;
		int m = mat[0].length;
		int matrix[] = printMatrix(mat, n, m);
		for (int matrixindex : matrix) {
			System.out.print(matrixindex + " ");
		}
	}
}

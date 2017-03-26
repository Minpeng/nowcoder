package com.nowcoder.demo;

import java.util.ArrayList;

import org.junit.Test;

/**
 * 二维数组斜对角打印
 * 
 * @author pengmin
 *
 */
public class Printer {
	/**
	 * @see有一个二维数组(n*n),写程序实现从右上角到左下角沿主对角线方向打印。
	 * @param arr
	 *            [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]
	 * @param n
	 *            [4,3,8,2,7,12,1,6,11,16,5,10,15,9,14,13]
	 * @return
	 */
	public int[] arrayPrint(int[][] arr, int n) {
		// write code here

		int[] array = new int[n * n];
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int count = -1;
			for (int j = n - i - 1; j < n; j++) {
				count += 1;
				if (i > 0 && count > 0) {
					list.add(arr[count][j]);
				} else {
					list.add(arr[0][j]);
				}
			}

		}
		for (int i = 1; i <= n; i++) {
			int count = -1;
			for (int j = 0; j <= n - i - 1; j++) {
				count += 1;
				if (count == 0) {
					list.add(arr[i][j]);
				} else {
					list.add(arr[count + 1][j]);
				}

			}

		}

		for (int i = 0; i < n * n; i++) {
			array[i] = list.get(i);
		}
		return array;
	}

	@Test
	public void testArrayPrint() {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		int n = arr.length;
		arrayPrint(arr, n);

	}
}

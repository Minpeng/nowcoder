package com.nowcoder.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * 多维数组中的中位数
 * 
 * @author pengmin
 *
 */
public class SolutionUpMedian {
	/**
	 * 返回二维数组的中位数
	 * 
	 * @param arr1
	 * 
	 * @param arr2
	 * 
	 * @return
	 */
	public int getUpMedian(int[] arr1, int[] arr2) {
		int upMedian = 0;
		// 数组合并
		List list = new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			list.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			list.add(arr2[i]);
		}
		// 排序
		Collections.sort(list);
		int listSize = list.size();
		upMedian = (int) list.get(listSize / 2 - 1);
		return upMedian;
	}

	@Test
	public void testGetUpMedian() {
		int[] arr1 = { 1, 2, 3, 3, 4, 9, 10, 11, 12, 13, 14, 15 };
		int[] arr2 = { 4, 15, 15, 25, 31, 36, 37, 43, 44, 47, 48, 50 };
		System.out.println(getUpMedian(arr1, arr2));
	}
}

package com.nowcoder.demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * 文本嗅探
 * 
 * @author pengmin
 *
 */
public class KeywordDetect {
	/**
	 * 
	 * @param A
	 * @param n
	 * @param keys
	 * @param m
	 * @return
	 */
	public int[] containKeyword(String[] A, int n, String[] keys, int m) {
		List<Integer> countList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			boolean find = false;
			for (int j = 0; j < m; j++) {
				if (A[i].indexOf(keys[j]) != -1) {
					find = true;
					break;
				}
			}
			if (find == true) {
				countList.add(i);
			}
		}

		int[] count = { -1 };
		if (countList != null && !countList.isEmpty()) {
			count = new int[countList.size()];
			for (int i = 0; i < count.length; i++) {
				count[i] = countList.get(i);
			}

		}
		return count;

	}

	@Test
	public void testContainKeyword() {
		String[] A = { "nowcoder", "hello", "now" };
		int n = A.length;
		String[] keys = { "coder", "now" };
		int m = keys.length;
		System.out.println(containKeyword(A, m, keys, m));
	}
}

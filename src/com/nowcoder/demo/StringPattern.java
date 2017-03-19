package com.nowcoder.demo;

import org.junit.Test;

public class StringPattern {

	/**
	 * @see 对于两个字符串A，B。请设计一个高效算法，找到B在A中第一次出现的起始位置。若B未在A中出现，则返回-1
	 * @param A
	 * @param lena
	 * @param B
	 * @param lenb
	 * @return
	 */
	public int findAppearance(String A, int lena, String B, int lenb) {
		/*** 方式一 ***/
		int index = A.indexOf(B);

		return index;

		/** 方式二 **/
		// KMP算法
	}

	@Test
	public void testFindAppearance() {
		String A = "jnduwslil";
		int lena = A.length();

		String B = "l";
		int lenb = B.length();
		System.out.println(findAppearance(A, lena, B, lenb));
	}
}

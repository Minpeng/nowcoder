package com.nowcoder.demo;

import java.util.regex.Pattern;

import org.junit.Test;

public class WildMatch {
	/**
	 * 字符串通配
	 * 
	 * @param A
	 * @param lena
	 * @param B
	 * @param lenb
	 * @return
	 */
	public boolean chkWildMatch(String A, int lena, String B, int lenb) {
		boolean isMatch = false;
		String regxString = B;
		isMatch = Pattern.matches(regxString, A);
		return isMatch;
	}

	@Test
	public void testChkWildMatch() {
		String A = "abbc";
		int lena = A.length();
		String B = ".*";
		int lenb = B.length();

		System.out.println(chkWildMatch(A, lena, B, lenb));
	}
}

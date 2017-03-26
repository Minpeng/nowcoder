package com.nowcoder.demo;

import org.junit.Test;

/**
 * 字符串的旋转
 * 
 * @author pengmin
 *
 */
public class StringRotation {
	/**
	 * 
	 * @param A
	 *            "ABCDEFGH"
	 * @param n
	 *            8
	 * @param p
	 *            4
	 * @return "FGHABCDE"
	 */
	public String rotateString(String A, int n, int p) {
		// write code here
		String rotate = "";
		for (int i = p + 1; i < n; i++) {
			rotate += A.charAt(i);
		}
		for (int i = 0; i < p + 1; i++) {
			rotate += A.charAt(i);
		}
		return rotate;
	}

	@Test
	public void testRotateString() {
		String A = "ABCDEFGH";
		int n = A.length();
		int p = 4;
		System.out.println(rotateString(A, n, p));
	}
}

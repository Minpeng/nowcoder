package com.nowcoder.demo;

import org.junit.Test;

/**
 * 收个重复字符
 * 
 * @author pengmin
 *
 */
public class FirstRepeat {
	/**
	 * @see 找到第一次重复出现的字符。
	 * @param A
	 *            qywyer23tdd
	 * @param n
	 * @return y
	 */
	public char findFirstRepeat(String A, int n) {
		char firstChar = A.charAt(0);
		int index = n;
		// 每一个字母循环一遍
		for (int i = 0; i < n; i++) {
			int num = 0;
			int tempIndex = 0;
			char tempfirstChar = A.charAt(i);
			// 遍历后面的字符
			int j = 0;
			for (j = i + 1; j < n; j++) {
				if (A.charAt(j) == tempfirstChar) {
					num += 1;
					System.out.println(A.charAt(j) + " " + j);
					tempIndex = j;
					break;
				}
			}
			if (num == 1) {
				if (tempIndex < index) {
					index = tempIndex;
					firstChar = tempfirstChar;

				}
			}

		}
		return firstChar;
	}

	@Test
	public void testFindFirstRepeat() {
		String A = "tfecdgfgt";
		int n = A.length();
		System.out.println(findFirstRepeat(A, n));
	}
}

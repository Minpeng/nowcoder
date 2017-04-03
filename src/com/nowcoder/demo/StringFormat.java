package com.nowcoder.demo;

import org.junit.Test;

/**
 * 字符串替换
 * 
 * @author pengmin
 *
 */
public class StringFormat {
	/**
	 * 
	 * @param A
	 * @param n
	 * @param arg
	 * @param m
	 * @return
	 */
	public String formatString(String A, int n, char[] arg, int m) {
		// write code here
		StringBuffer stringBuffer = new StringBuffer();
		// 先找到这个占位符一共有几个
		int count = 0;
		for (int i = 0, index = 0; i < n; i++) {
			index = A.indexOf("%s", i);
			if (index != -1) {
				stringBuffer.append(A.substring(i, index));
				stringBuffer.append(arg[count]);
				i = index + 1;
				count += 1;
			} else {
				stringBuffer.append(A.substring(i, n));
				break;
			}

		}
		// 占位符个数小于参数个数
		if (count < m) {
			for (int i = count; i < m; i++) {
				stringBuffer.append(arg[i]);
			}
		}
		System.out.println(stringBuffer);
		String fomatString = stringBuffer.toString();
		return fomatString;

	}

	@Test
	public void testformatString() {
		String A = "A%sC%sE";
		int n = A.length();
		char[] arg = { 'B', 'D', 'F' };
		int m = arg.length;

		formatString(A, n, arg, m);
	}
}

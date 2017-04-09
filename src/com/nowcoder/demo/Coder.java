package com.nowcoder.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * 寻找coder
 * 
 * @author pengmin
 *
 */
public class Coder {
	public String[] findCoder(String[] A, int n) {
		List<Map<String, Object>> codList = new ArrayList<Map<String, Object>>();
		// 遍历查找coder
		for (int i = 0; i < n; i++) {
			Map<String, Object> codeMap = new HashMap<String, Object>();
			String a = A[i].toLowerCase(); // 转小写
			if (a.contains("coder")) {
				int count = 0;
				// 查找coder 一共有几个
				for (int j = 0, index = 0; j < a.length(); j++) {
					if (index != -1) {
						index = a.indexOf("coder", j);
						j = index + 1;
						count += 1;
					}
				}
				codeMap.put("codeString", a);
				codeMap.put("num", count);
				codList.add(codeMap);
			}

		}
		// 降序
		Collections.sort(codList, new Comparator<Map<String, Object>>() {

			@Override
			public int compare(Map<String, Object> o1, Map<String, Object> o2) {

				return ((Integer) o2.get("num")).compareTo((Integer) o1
						.get("num"));
			}
		});
		String[] codeStrings = new String[codList.size()];
		for (int i = 0; i < codeStrings.length; i++) {
			codeStrings[i] = (String) codList.get(i).get("codeString");
		}
		return codeStrings;
	}

	@Test
	public void testFindCoder() {
		String[] A = { "i am a coder", "Coder Coder", "Code" };
		int n = A.length;

		String[] A1 = findCoder(A, n);
		for (int i = 0; i < A1.length; i++) {
			System.out.println(A1[i]);
		}

	}
}
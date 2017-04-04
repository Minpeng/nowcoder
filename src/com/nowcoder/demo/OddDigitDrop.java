package com.nowcoder.demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * 奇位数丢弃
 * 
 * @author pengmin
 *
 */
public class OddDigitDrop {

	public int getOddDigit(int n) {
		int finalDigit = 0;
		// 初始化list
		List allDigitList = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
			allDigitList.add(i);
		}
		List digitList = null;
		while (allDigitList.size() > 1) {
			digitList = new ArrayList<>();
			for (int i = 0; i < allDigitList.size(); i++) {
				if (i % 2 != 0) {
					digitList.add(allDigitList.get(i));
				}
			}
			allDigitList = digitList;
		}
		finalDigit = (int) allDigitList.get(0);
		return finalDigit;
	}

	@Test
	public void testGetOddDigit() {
		int n = 500;
		System.out.println(getOddDigit(n));
	}
}

package com.nowcoder.demo;

import java.util.HashSet;

/**
 * 微信红包
 * 
 * @author pengmin
 *
 */
public class Gift {
	/**
	 * @see给定一个红包的金额数组gifts及它的大小n，请返回所求红包的金额。 若没有金额超过总数的一半，返回0。
	 * @param gifts
	 *            [1,2,3,2,2]
	 * @param n
	 *            5
	 * @return 2
	 */
	public int getValue(int[] gifts, int n) {
		int value = 0;

		// set集合
		HashSet<Integer> moneySet = new HashSet<>();
		for (int i = 0; i < n; i++) {
			moneySet.add(gifts[i]);
		}
		// 查找出现次数最多的那一个
		int maxCount = 0;
		int maxValue = 0;
		for (int money : moneySet) {
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (money == gifts[i]) {
					count += 1;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				maxValue = money;
			}
		}

		if (maxCount > (double) n / 2) {
			value = maxValue;
		} else {
			value = 0;
		}
		return value;

	}
}

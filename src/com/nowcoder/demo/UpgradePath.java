package com.nowcoder.demo;

import java.util.Scanner;

/**
 * 小易的升级之路
 * 
 * @author pengmin
 *
 */
public class UpgradePath {

	public static void main(String[] args) {
		// 接收参数
		Scanner scanner = new Scanner(System.in);

		// 获取输入判断
		while (scanner.hasNext()) {
			// 怪物的数量
			int n = scanner.nextInt();
			// 初始能力值
			int init = scanner.nextInt();

			// 怪物的防疫力
			int[] monster = new int[n];
			for (int i = 0; i < n; i++) {
				// 获取对应的数值
				monster[i] = scanner.nextInt();
				// 能力值大于怪物防御力，能力值=怪物的防御力+能力值
				if (init > monster[i]) {
					init += monster[i];
				} else {
					// 能力值小于于怪物防御力，能力值=怪物的防御力 能力值 的最大公约数
					init += getGys(init, monster[i]);
				}
			}
			System.out.println("" + init);
		}
		// 关闭scanner
		scanner.close();
	}

	/**
	 * 获取最大公约数
	 * 
	 * @param n
	 * @param m
	 * @return
	 */
	public static int getGys(int n, int m) {
		if (m % n == 0) {
			return n;
		} else {
			return getGys(m % n, n);
		}
	}
}

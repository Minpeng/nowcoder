package com.nowcoder.demo;

/**
 * 风口中的猪-中国牛市
 * 
 * @author pengmin
 *
 */
public class SolutionMax {
	/**
	 * 计算你能获得的最大收益
	 * 
	 * @param prices
	 *            Prices[i]即第i天的股价
	 * @return 整型
	 */
	public int calculateMax(int[] prices) {
		// 第一次买入的价格 设置为最大 因为下面要进行比较
		int firstBuy = Integer.MAX_VALUE;
		// 第一次卖出之后的收益
		int afterfirstSell = 0;
		// 第二次买入之后的收益 设置为最小
		int afterSecondBuy = Integer.MIN_VALUE;
		// 第二次卖出的之后的收益
		int afterSecondSell = 0;

		for (int curPrice : prices) {
			// 第一次买入的价格 越低越好
			firstBuy = Math.min(curPrice, firstBuy);

			// 第一次卖出后的收益=当前价格-第一次买入的价格 越高越好
			afterfirstSell = Math.max(afterfirstSell, curPrice - firstBuy);

			// 第二次买入之后的收益=第一次卖出后的收益-当前价格 越高越好
			afterSecondBuy = Math
					.max(afterSecondBuy, afterfirstSell - curPrice);
			// 第二次卖出之后的收益=第二次买入之后的收益+当前价格 越高越好
			afterSecondSell = Math.max(afterSecondSell, afterSecondBuy
					+ curPrice);
		}

		return afterSecondSell;
	}

}

package com.nowcoder.demo;

import org.junit.Test;

/**
 * 上台阶
 * 
 * @author pengmin
 *
 */
public class GoUpstairs {
	/**
	 * 
	 * @param n
	 * @return
	 */
	public int countWays(int n) {
		/**
		 * n=2 :只有一种跳法<br>
		 * n=3 :两种跳法 <br>
		 * n>3 :有f(n):<br>
		 * 第一次跳1级,则剩下的N-1级跳法有f(n-1)种 <br>
		 * 第一次跳2级,则剩下的N-1级跳法有f(n-2)种<br>
		 * 
		 * f(n)=f(n-1)+f(n-2)
		 */
		int[] dp = new int[n];

		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;

		if (n > 2) {
			for (int i = 3; i < n; i++) {
				dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
			}
		}

		return dp[n - 1];
	}

	@Test
	public void testCountWays() {
		int n = 4;
		System.out.println(countWays(n));
	}
}

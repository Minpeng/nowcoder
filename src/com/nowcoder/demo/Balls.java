package com.nowcoder.demo;

import org.junit.Test;

public class Balls {
	/**
	 * @see小球落地,每次高度为原来的一半
	 * @see n+2n*(1/2+1/4+1/8)=3n
	 * @param A
	 * @return
	 */
	public int calcDistance(int A) {
		return 3 * A;
	}

	@Test
	public void testCalcDistance() {
		int A = 100;
		int B = 90;
		int C = 80;
		int D = 70;

		int highA = calcDistance(A);
		int highB = calcDistance(B);
		int highC = calcDistance(C);
		int highD = calcDistance(D);

		System.out.println(highA + " " + highB + " " + highC + " " + highD
				+ " " + (highA + highB + highC + highD));

	}
}

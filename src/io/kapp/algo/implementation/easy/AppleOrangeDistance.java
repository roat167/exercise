package io.kapp.algo.implementation.easy;

public class AppleOrangeDistance {
	public static void main(String[] args) {
		//Reference problem : https://www.hackerrank.com/challenges/apple-and-orange/problem
		
		int a = 5, b = 15, s = 7, t = 11;

		int countA = 0, countB = 0;

		int[] apples = {-2, 2, 1};
		int[] oranges = {5, -6};
		
		for (int apple_i = 0; apple_i < apples.length; apple_i++) {
			int da = a + apples[apple_i];
			if (da >= s && da <= t) {
				countA++;
			}
		}

		for (int orange_i = 0; orange_i < oranges.length; orange_i++) {
			int ba = b + oranges[orange_i];
			if (ba >= s && ba <= t) {
				countB++;
			}
		}
		System.out.println(countA); // 1
		System.out.println(countB); // 1
	}
}

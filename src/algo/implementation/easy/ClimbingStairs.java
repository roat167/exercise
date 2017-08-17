package algo.implementation.easy;

/**
 * LeetCode 70: You are climbing a stair case. It takes n steps to reach to the
 * top.Each time you can either climb 1 or 2 steps. In how many distinct ways
 * can you climb to the top?
 * 
 * Note: Given n will be a positive integer.
 */
public class ClimbingStairs {

	public static int climbStairs(int n) {
		if (n == 0 || n == 1 || n == 2) {
			return n;
		}

		int a = 1, b = 1;
		for (int i = 1; i <= n; i++) {
			b += a;
			a = b - a;
		}
		return a;
	}

	public static void main(String[] args) {
		// given: 993
		// expected: 1092213863
		System.out.println(ClimbingStairs.climbStairs(993));

	}
}

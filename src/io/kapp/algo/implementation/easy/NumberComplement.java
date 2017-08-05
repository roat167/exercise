package io.kapp.algo.implementation.easy;

public class NumberComplement {

	public static int findComplement1(int num) {
		return num ^ ((Integer.highestOneBit(num) << 1) - 1);
	}

	public static void main(String[] args) {
		/*
		 * LeetCode: Given a positive integer, output its complement number. The
		 * complement strategy is to flip the bits of its binary representation.
		 * 
		 * Note: The given integer is guaranteed to fit within the range of a
		 * 32-bit signed integer. You could assume no leading zero bit in the
		 * integer’s binary representation.
		 */

		/*
		 * The binary representation of 5 is 101 (no leading zero bits), and its
		 * complement is 010. So you need to output 2.
		 */
		int input = 5; // output 2
		System.out.println(findComplement1(input));

		input = 2147483647; // output 0
		System.out.println(findComplement1(input));
	}
}

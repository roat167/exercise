package io.kapp.algo.implementation.easy;

/**
 * LeetCode: Hamming distance between two integers is the number of positions at which the
 * corresponding bits are different.
 *
 */
public class HammingDistance {
	
	public static int hammingDistance(int x, int y) {
		return Integer.bitCount(x ^ y);
	}
	
	public static int hammingDistanceWithBitWise(int x, int y) {
		int xor = x ^ y;
		int count = 0;
		for (int i = 0; i < 32; i++) { // int is 32bit
			count += (xor >> i) & 1;			
		}
		return count;
	}
	
	public static int hammingDistanceWithBitWise_1(int x, int y) {
		int xor = x ^ y;
		int count = 0;
		while (xor != 0) {
			count += xor & 1;
			xor >>= 1;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("Hamming Distance Integer");
		int x = 1, y = 4;
		
		// expected out put: 2
		// 1 (0 0 0 1)
		// 4 (0 1 0 0)
		//		?   ?
		System.out.println(HammingDistance.hammingDistance(x, y));
		System.out.println("===============Using Bit Wise For Loop======================");
		System.out.println(HammingDistance.hammingDistanceWithBitWise(x, y));
		System.out.println("===============Using Bit Wise While loop======================");
		System.out.println(HammingDistance.hammingDistanceWithBitWise_1(x, y));
	}
}

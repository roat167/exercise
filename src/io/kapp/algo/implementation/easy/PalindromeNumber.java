package io.kapp.algo.implementation.easy;

public class PalindromeNumber {

	public static boolean isPalindrome(int x) {
		// Ignore negative number
		if (x < 0)
			return false;
		int h = x, t = 0;

		while (h != 0) {
			t = t * 10 + h % 10;
			h = h / 10;
		}

		return (t == x);
	}

	public static boolean isPalindrome_1(int x) {
		if (x < 0 || (x != 0 && x % 10 == 0)) {
			return false;
		}
		
		int t = 0;
		while (x > t) {
			t = t * 10 + x % 10;
			x = x / 10;
		}
		return (x == t || x == t / 10);

	}

	public static void main(String[] args) {
		System.out.println("========Palindrome Number=========");
		System.out.println(isPalindrome(-23555555)); // false
		System.out.println("========5664665 is Palindrome=========");
		System.out.println(isPalindrome(5664665)); // true
		System.out.println("============2147483647=================");
		System.err.println(isPalindrome_1(2147483647)); // false
	}
}

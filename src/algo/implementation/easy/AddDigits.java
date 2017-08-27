package algo.implementation.easy;

/**
 * LeetCode 258: Given a non-negative integer num, repeatedly add all its digits
 * until the result has only one digit.
 * 
 * without using any loop/recursion in O(1) runtime
 */
public class AddDigits {

	public int addDigits(int num) {
		return num == 0 ? 0 : (num - 1) % 9 + 1;
	}

	public static void main(String[] args) {
		/*
		 * Ref: https://en.wikipedia.org/wiki/Digital_root#Congruence_formula
		 * For base b (decimal case b = 10), the digit root of an integer is:
		 * 
		 * f(n) = 0 if n == 0
		 * 
		 * f(n) = (b-1) if n != 0 and n % (b-1) == 0
		 * 
		 * f(n) = n mod (b-1) if n % (b-1) != 0
		 * 
		 * ==> f(n) = 1 + (n - 1) % 9
		 * 
		 * when n = 0, the return value is zero since (n - 1) % 9 = -1
		 * 
		 * From the formula, we can find that the result of this problem is
		 * imminent periodic, with period (b-1).
		 * 
		 */

		/*
		 * For example: Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 =
		 * 2. Since 2 has only one digit, return it.
		 */

		// arrange
		int n = 38;

		// act
		int result = new AddDigits().addDigits(n);

		// assert
		System.out.println(result);
	}
}

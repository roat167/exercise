package algo.implementation.easy;

/**
 * LeetCode 13: Given a Roman numeral, convert it to an integer.
 * 
 * Input is guaranteed to be within the range from 1 to 3999.
 * 
 */
public class RomanToInteger {

	public int romanToInt(String s) {
		/*
		 * M = 1000, D = 500, C = 100, L = 50, X = 10, V = 5, I = 1
		 */
		int n = s.length();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			switch (s.charAt(i)) {
			case 'M':
				nums[i] = 1000;
				break;
			case 'D':
				nums[i] = 500;
				break;
			case 'C':
				nums[i] = 100;
				break;
			case 'L':
				nums[i] = 50;
				break;
			case 'X':
				nums[i] = 10;
				break;
			case 'V':
				nums[i] = 5;
				break;
			case 'I':
				nums[i] = 1;
				break;
			}
		}

		int sum = nums[n - 1];
		for (int i = 0; i < n - 1; i++) {
			if (nums[i] >= nums[i + 1]) {
				sum += nums[i];
			} else {
				sum -= nums[i];
			}			
		}

		return sum;
	}

	public static void main(String[] args) {
		// arrange
		String s = "DCXXI";
		
		// act
		int n = new RomanToInteger().romanToInt(s);

		// assert expected true		
		System.out.println(n == 621);

	}
}

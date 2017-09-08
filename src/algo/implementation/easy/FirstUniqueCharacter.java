package algo.implementation.easy;

/**
 * LeetCode 387: Given a string, find the first non-repeating character in it
 * and return it's index. If it doesn't exist, return -1.
 */

public class FirstUniqueCharacter {

	/*
	 * O(n) going through the string twice:
	 * 
	 * - Store the number of occurrence of each character.
	 * 
	 * - Return the first character that has number occurrence one.
	 * 
	 * - using 256 instead of 26 to store other kinds of characters.
	 */
	public int firstUniqChar(String s) {
		int freq[] = new int[26];
		s = s.toLowerCase();
		
		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i) - 'a']++;
		}
		
		for (int i = 0; i < s.length(); i++) {
			if (freq[s.charAt(i) - 'a'] == 1)
				return i;
		}

		return -1; // not found
	}

	public static void main(String[] args) {
		// arrange
		String s = "Leetcode";

		// act
		int actual = new FirstUniqueCharacter().firstUniqChar(s);

		// assert
		System.out.println(0 == actual);
	}

}

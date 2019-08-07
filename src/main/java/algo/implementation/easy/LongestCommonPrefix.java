package algo.implementation.easy;

import java.util.Arrays;

/**
 * LeetCode 14:
 * 
 * 
 *
 */
public class LongestCommonPrefix {

	/**
	 * The below logic is thank to leetCode user Vgn.
	 * 
	 * 1. Pick a character at i=0th location and compare it with the character
	 * at that location in every string.
	 * 
	 * 2. If any of them doesn't have that just return ""
	 * 
	 * 3. Else append that character in to the result.
	 * 
	 * 4. Increment i and do steps 1-3 till the length of that string.
	 * 
	 * 5. return result.
	 */

	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";

		StringBuilder result = new StringBuilder();
		for (int i = 0; i <= strs.length; i++) {
			for (int j = 0; j < strs.length; j++) {
				if (i >= strs[j].length() || (j > 0 && strs[j].charAt(i) != strs[j - 1].charAt(i))) {
					return result.toString();
				}
			}
			result.append(strs[0].charAt(i));
		}

		return result.toString();
	}

	public String longestCommonPrefixWithSorted(String[] strs) {
		StringBuilder result = new StringBuilder();

		if (strs != null && strs.length > 0) {

			Arrays.sort(strs);

			/**
			 * Since the arrays already sort so we only need to compare first
			 * index (shorter string) with last index(longest string) and find
			 * the common character
			 */

			char[] first = strs[0].toCharArray();
			char[] last = strs[strs.length - 1].toCharArray();

			for (int i = 0; i < first.length; i++) {
				if (last.length > i && last[i] == first[i]) {
					result.append(last[i]);
				} else {
					return result.toString();
				}
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {

		/**
		 * {"a","a","b"} return "" as there is nothing common in all the 3
		 * strings.
		 * 
		 * {"a", "a"} return "a" as a is longest common prefix in all the
		 * strings.
		 * 
		 * {"abca", "abc"} return abc
		 * 
		 * {"ac", "ac", "a", "a"} return a.
		 */
		// arrange
		String[] strs = { "a", "a", "b" };

		// act
		String result = new LongestCommonPrefix().longestCommonPrefix(strs);

		// assert
		String expected = "";
		System.out.println(expected.equals(result));

		/* Test case 2 */
		// arrange
		String[] strs1 = { "abca", "abc" };

		// act
		result = new LongestCommonPrefix().longestCommonPrefix(strs1);

		// assert
		expected = "abc";
		System.out.println(expected.equals(result));

		/* Test case 3 */
		// arrange
		String[] strs2 = { "a", "a", "ab" };

		// act
		result = new LongestCommonPrefix().longestCommonPrefix(strs2);

		// assert
		expected = "a";
		System.out.println(expected.equals(result));

	}
}

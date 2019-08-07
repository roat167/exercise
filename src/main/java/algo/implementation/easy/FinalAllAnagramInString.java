package algo.implementation.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 438: Given a string s and a non-empty string p, find all the start
 * indices of p's anagrams in s.
 * 
 * Strings consists of lowercase English letters only and the length of both
 * strings s and p will not be larger than 20,100.
 * 
 * The order of output does not matter.
 * 
 */
public class FinalAllAnagramInString {

	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> list = new ArrayList<Integer>();
		// this check is for best practice, the given problem doesn't required
		if (s == null || p == null || s.length() == 0 || p.length() == 0) {
			return list;
		}

		int[] freq = new int[26]; // number of character a-z
		for (char c : p.toCharArray()) {

			/**
			 * assuming all character are in lower case 'a' 's will be stored at
			 * freq[0] and the number of 'z' 's will be at freq[25]
			 * 
			 * if character occur <= 1 the value is = 0, otherwise the value
			 * equals to (number of occurrence - 1)
			 */
			freq[c - 'a']++;
		}

		int begin = 0, end = 0, count = p.length(), len = s.length();
		while (end < len) {
			// if st.charAt(end++) exist in freq[] then decrease count
			// here we also decrease the freq count

			if (freq[s.charAt(end++) - 'a']-- >= 1) {
				count--;
			}

			if (count == 0) { // found
				list.add(begin);
			}

			if (end - begin == p.length() && freq[s.charAt(begin++) - 'a']++ >= 0) {
				count++;
			}
		}

		return list;
	}

	public static void main(String[] args) {

		// expected 0, 6
		System.out.println(FinalAllAnagramInString.findAnagrams("cbaebabacd", "abc"));
		System.out.println("====================================================");
		/**
		 * Explanation: The substring with start index = 0 is "ab", which is an
		 * anagram of "ab". The substring with start index = 1 is "ba", which is
		 * an anagram of "ab". The substring with start index = 2 is "ab", which
		 * is an anagram of "ab".
		 */
		// expected 0 1 2
		System.out.println(FinalAllAnagramInString.findAnagrams("abab", "ab"));
	}
}

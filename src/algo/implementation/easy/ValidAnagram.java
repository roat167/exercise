package algo.implementation.easy;

/**
 * LeetCode 242: Given 2 strings s and t, determine if t is an anagram of s.
 * 
 * For example, s = "anagram", t = "nagaram", return true. s = "rat", t = "car",
 * return false.
 * 
 */
public class ValidAnagram {

	// assume that all character are lower case
	public boolean isAnagram(String s, String t) {
		if (t.length() != s.length())
			return false;
		
		
		int[] freq = new int[26]; // number of character a-z
		for (int i = 0; i < t.length() ; i++) {

			/**
			 * assuming all character are in lower case 'a' 's will be stored at
			 * freq[0] and the number of 'z' 's will be at freq[25]
			 * 
			 * if character occur <= 1 the value is = 0, otherwise the value
			 * equals to (number of occurrence - 1)
			 */
			freq[t.charAt(i) - 'a']++;
			freq[s.charAt(i) - 'a']--;
		}
		
		for (int i = 0; i < 26; i++) {
			if (freq[i] != 0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {

	}
}

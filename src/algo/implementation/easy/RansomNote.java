package algo.implementation.easy;

/**
 * LeetCode 383: Given an arbitrary ransom note string and another string containing letters
 * from all the magazines, write a function that will return true if the ransom
 * note can be constructed from the magazines ; otherwise, it will return false.
 * 
 * Each letter in the magazine string can only be used once in your ransom note.
 * 
 * Note: You may assume that both strings contain only lowercase letters.
 * 
 * canConstruct("a", "b") -> false canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 * 
 */
public class RansomNote {

	public boolean canConstruct_2(String ransomNote, String magazine) {
		if (magazine == null || (ransomNote.length() > magazine.length()))
			return false;

		int[] arr = new int[26];
		// number of occurrence
		for (char c : magazine.toCharArray()) {
			arr[c - 'a']++;
		}
		for (char c : ransomNote.toCharArray()) {
			if (--arr[c - 'a'] < 0) {
				return false;
			}
		}
		return true;

	}

	public boolean canConstruct(String ransomNote, String magazine) {
		if (magazine == null || (ransomNote.length() > magazine.length()))
			return false;

		int[] table = new int[128];
		for (char c : magazine.toCharArray()) {
			table[c]++;
		}
		for (char c : ransomNote.toCharArray()) {
			if (--table[c] < 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// arrange
		// String rans = "fffbfg";
		// String magazine = "effjfggbffjdgbjjhhdegh";

		String rans = "bjaajgea";
		String magazine = "affhiiicabhbdchbidghccijjbfjfhjeddgggbajhidhjchiedhdibgeaecffbbbefiabjdhggihccec";

		// act
		boolean actual = new RansomNote().canConstruct(rans, magazine);

		// assert

		System.out.println(true == actual);

	}
}

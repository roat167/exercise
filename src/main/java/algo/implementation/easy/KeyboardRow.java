package algo.implementation.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * LeetCode: Given a List of words, return the words that can be typed using
 * letters of alphabet on only one row's of American keyboard
 * 
 * You may use one character in the keyboard more than once. You may assume the
 * input string will only contain letters of alphabet.
 */

public class KeyboardRow {
	public static boolean validWord(String w, String[] keys) {
		for (String key : keys) {
			if (w.toLowerCase().matches(key)) {
				return true;
			}
		}
		return false;
	}

	public static String[] findWords(String[] words) {
		List<String> res = new ArrayList<String>();
		// The (*) mean the match can contain zero or more of any character in
		// the brackets
		// you may need to check empty string
		String[] keys = { "[qwertyuiop]*", "[asdfghjkl]*", "[zxcvbnm]*" };
		for (String w : words) {
			if (validWord(w, keys)) {
				res.add(w);
			}
		}
		return res.toArray(new String[res.size()]);
	}

	//short version with Stream
	public static String[] findWordsWithStream(String[] words) {
		return Stream.of(words).filter(s -> s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*"))
				.toArray(String[]::new);
	}

	public static void main(String[] args) {
		// Input: ["Hello", "Alaska", "Dad", "Peace"]
		// Output: ["Alaska", "Dad"]
		String[] words = { "Hello", "Alaska", "Dad", "Peace" };
		String[] res = KeyboardRow.findWords(words);
		System.out.println(res.length);
		Arrays.stream(res).forEach(System.out::println);
	}
}

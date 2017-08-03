package io.kapp.algo.implementation.easy;

public class DetectCapital {
	
	public static boolean detectCapitalUse(String word) {
		return (word.matches("^[A-Z]+|[a-z]+|[A-Z][a-z]+"));
	}

	public static void main(String[] args) {
		/* Leetcode:
		 * We define the usage of capitals in a word to be right when one of the
		 * following cases holds:
		 * 
		 * - All letters in this word are capitals, like "USA". 
		 * - All letters in this word are not capitals, like "leetcode".
		 * - Only the first letter in this word is capital if it has more than one letter, like "Google".
		 * 
		 * Otherwise, we define that this word doesn't use capitals in a rightway.
		 */
		
		System.out.println(DetectCapital.detectCapitalUse("USA")); //true
		System.out.println(DetectCapital.detectCapitalUse("FlaG")); //false
		System.out.println(DetectCapital.detectCapitalUse("Flag")); //true		
		System.out.println(DetectCapital.detectCapitalUse("leetcode")); //true
	}	
}

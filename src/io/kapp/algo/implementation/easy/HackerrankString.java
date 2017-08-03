package io.kapp.algo.implementation.easy;

import java.util.Stack;

public class HackerrankString {
	
	//check if the given string contains hackkerank in the order 
	public static boolean isHackerrank(String s) {
		char[] arr = s.toLowerCase().toCharArray();
		Stack<Character> stk = new Stack<Character>();
		stk.add('k');
		stk.add('n');
		stk.add('a');
		stk.add('r');
		stk.add('r');
		stk.add('e');
		stk.add('k');
		stk.add('c');
		stk.add('a');
		stk.add('h');
		
		for (int i = 0; i < s.length(); i++) {			
			if (stk.peek().equals((Character) arr[i])) {				
				stk.pop();
			}
			if (stk.isEmpty()) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		String s = "hereiamstackerrank";		
		// Expected : true
		System.out.println(HackerrankString.isHackerrank(s));
		
		s= "hackerworld";
		// Expected : false
		System.out.println(HackerrankString.isHackerrank(s));
	}
}

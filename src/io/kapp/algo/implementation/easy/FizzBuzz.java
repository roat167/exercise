package io.kapp.algo.implementation.easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	/**  
	 * @param n positive number from 1 to n
	 * @return List of string
	 */
	public List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<String>();
		if (n == 1) {
			list.add(String.valueOf(1));
			return list;
		}

		list.add(String.valueOf(1));
		list.add(String.valueOf(2));

		for (int i = 3; i <= n; i++) {
			if ((i % 15) == 0) {
				list.add("FizzBuzz");
			} else if ((i % 5) == 0) {
				list.add("Buzz");
			} else if ((i % 3) == 0) {
				list.add("Fizz");
			} else {
				list.add(String.valueOf(i));
			}
		}
		return list;
	}
}

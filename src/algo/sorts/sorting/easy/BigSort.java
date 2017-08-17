package algo.sorts.sorting.easy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Hackerrank: Consider an array of numeric strings, , where each string is a
 * positive number with anywhere from 1 to 10 power 6 digits. Sort the array's
 * elements in non-decreasing (i.e., ascending) order of their real-world
 * integer values and print each element of the sorted array on a new line.
 */
public class BigSort {

	public static String[] sortStringNumber(String[] arr) {

		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1.length() != s2.length()) {
					return s1.length() - s2.length();
				} else {
					return s1.compareTo(s2);
				}
			}
		});
		return arr;
	}

	public static void printArray(Object[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// input 31415926535897932384626433832795, 1, 3, 10, 3, 5
		String[] arr = { "31415926535897932384626433832795", "1", "3", "10", "3", "5" };

		BigSort.sortStringNumber(arr);
		// expected: 1, 3, 3, 5, 10, 31415926535897932384626433832795
		BigSort.printArray(arr);

	}
}

package algo.implementation.easy;

public class ReverseString {

	public static String reverseString(String s) {
		char[] arr = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(arr[i]);
		}
		return sb.toString();
	}

	/**
	 * Reverse the first k characters for every 2k characters counting from the
	 * start of the string. If there are less than k characters left, reverse
	 * all of them. If there are less than 2k but greater than or equal to k
	 * characters, then reverse the first k characters and left the other as
	 * original.
	 * 
	 * @param s	String 
	 * @param k integer
	 * @return reversed string s
	 */
	public static String reverseString_1(String s, int k) {
		// Assume the string consist only lower English letter only
		// range [1, 10000]

		char[] arr = s.toCharArray();
		int n = arr.length;
		for (int i = 0; i < n - 1; i += 2 * k) {
			int j = Math.min(n, i + k) - 1;
			reverse(arr, i, j);
		}
		return String.valueOf(arr);
	}

	public static void reverse(char[] arr, int i, int j) {
		while (i < j) {
			char tmp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = tmp;
		}
	}

	public static void main(String[] args) {
		String s = "abcdefg";
		int k = 2;
		System.out.println(reverseString(s)); // expected "gfedcba"
		System.out.println(reverseString_1(s, k)); // expected: "bacdfeg"
	}

}

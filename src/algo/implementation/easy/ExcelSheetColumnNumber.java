package algo.implementation.easy;

/**
 * LeetCode 171: Given a column title as appear in an Excel sheet, return its
 * corresponding column number.
 * 
 * For example:
 * 
 * A -> 1, B -> 2, C -> 3 ..., Z -> 26, BA -> 53, AB -> 28....
 *
 */
public class ExcelSheetColumnNumber {

	public int titleToNumber(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum *= 26;
			sum += (s.charAt(i) - 'A' + 1);
		}
		return sum;
	}

	// s.charAt(i) - 'A') + 1
	public static void main(String[] args) {		
		// arange
		ExcelSheetColumnNumber xsc = new ExcelSheetColumnNumber();
		String s = "A";
		String ss = "BA";
		String sss = "AD";
		String ssss = "AAC";		
		
		// act
		int s1 = xsc.titleToNumber(s);	
		int s2 = xsc.titleToNumber(ss);
		int s3 = xsc.titleToNumber(sss);
		int s4 = xsc.titleToNumber(ssss);

		// assert
		System.out.println(1 == s1);
		System.out.println(53 == s2);
		System.out.println(30 == s3);
		System.out.println(705 == s4);
	}
}

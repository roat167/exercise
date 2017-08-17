package algo.implementation.easy;

public class PalindromeString {
	
	/**
	 * considering only alphanumeric characters and ignoring cases
	 * 
	 * @param st String
	 * @return
	 */
	public static boolean validPalindrome(String st) {
		st = st.toLowerCase(); //convert to lower case
		int n = st.length();
		int h = 0 , t = n - 1;
		
		char[] arr = st.toCharArray();
		while (h <= t) {
			char head = arr[h];
			char tail = arr[t];
			
			if (!Character.isLetterOrDigit(head)) {
				h++;
			} else if(!Character.isLetterOrDigit(tail)) {
				t--;
			} else {						
				if (head == tail) {
					h++;
					t--;
				} else {
					return false;
				}
			}
		}
		return true;		
	}
	
	public static void main(String[] args) {		
		String st = "A man, a plan, a canal: Panama"; // true
		String st1 = "race a car"; // false
		
		System.out.println(PalindromeString.validPalindrome(st));
		System.out.println(PalindromeString.validPalindrome(st1));
	}
}

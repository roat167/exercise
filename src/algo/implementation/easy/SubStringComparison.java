package algo.implementation.easy;

import java.util.TreeSet;

/*
 * Lexicographical order
 */
public class SubStringComparison {
	
	//return the respective lexicographically smallest  
	//and largest substrings as a single newline-separated string.
	public static String getSmallestAndLargest(String s, int k) {        
        TreeSet<String> list = new TreeSet<String>();        
        for (int i = 0; i <= s.length() - k; i++) {
        	list.add(s.substring(i, i + k));
        }        
        
        return list.first() + "\n" + list.last();
    }

	public static void main(String[] args) {
		String s = "welcometojava";
		int k = 3;
		//expected outpu: ava wel
		System.out.println(SubStringComparison.getSmallestAndLargest(s, k));
	}
}

package algo.implementation.easy;

import java.util.Arrays;

/**
 * LeetCode 455: Assume you are an awesome parent and want to give your children
 * some cookies. But, you should give each child at most one cookie. Each child
 * i has a greed factor gi, which is the minimum size of a cookie that the child
 * will be content with; and each cookie j has a size sj. If sj >= gi, we can
 * assign the cookie j to the child i, and the child i will be content. Your
 * goal is to maximize the number of your content children and output the
 * maximum number.
 * 
 * You may assume the greed factor is always positive. You cannot assign more
 * than one cookie to one child.
 * 
 * Example 1: Input: [1,2,3], [1,1]
 * 
 * Output: 1
 * 
 * Explanation: You have 3 children and 2 cookies. The greed factors of 3
 * children are 1, 2, 3. And even though you have 2 cookies, since their size is
 * both 1, you could only make the child whose greed factor is 1 content. You
 * need to output 1.
 * 
 */
public class AssignCookies {

	public int findContentChildren(int[] g, int[] s) {
		// assuming that the arrays already sort
		Arrays.sort(g);
		Arrays.sort(s);

		int len = g.length - 1;
		int max = 0;

		
		for (int i = 0; i < s.length; i++) {		
			if (i > len)
				break;

			if (s[i] <= g[i]) {
				max ++;
			}
		}

		return max;
	}

	public static void main(String[] args) {

		// arrange
		int[] s = { 1, 2, 3 }, g = { 1, 1 }; // expect 1
		int[] s2 = { 1, 2 }, g2 = { 1, 2, 3 }; // expect 2
		 
		// act
		int acutal = new AssignCookies().findContentChildren(g, s);
		int acutal2 = new AssignCookies().findContentChildren(g2, s2);

		// assert
		System.out.println(1 == acutal);
		System.out.println(2 == acutal2);

	}
}

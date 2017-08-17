package algo.implementation.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 448: Given an array of integers where 1<= a[i] <= n
 * 
 * (n = size of array), some elements appear twice and others appear once.
 * 
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 */
public class DisappearedNumbers {

	public static List<Integer> findDisappearedNumbers_1(int[] nums) {

		int n = nums.length;
		for (int i = 0; i < n; i++) {
			nums[(nums[i] - 1) % n] += n;
		}

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			if (nums[i] <= n) {
				list.add(i + 1);
			}
		}

		return list;

	}

	public static void main(String[] args) {
		// Input:
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		// Output: 5,6
		System.out.println(DisappearedNumbers.findDisappearedNumbers_1(nums));
	}
}

package algo.implementation.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode: Given an array of integers, return indices of the two numbers such
 * that they add up to a specific target. You may assume that each input would
 * have exactly one solution, and you may not use the same element twice.
 */
public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			Integer x = nums[i];
			int comp = target - x;
			if (pairs.containsKey(x)) { //Each look up in the table costs only O(1)time.
				return new int[] { pairs.get(x), i };
			}
			pairs.put(comp, i);
		}
		return new int[] {};
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 7, 11, 15};
		int target = 9;
		System.out.println(Arrays.toString(twoSum(arr, target))); //expected [0, 1]
		
		arr = new int[] {3,0,2,1,4};
		target = 6;
		System.out.println(Arrays.toString(twoSum(arr, target))); //expected [2, 4]		
	}
}

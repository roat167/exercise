package io.kapp.algo.implementation.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 169: Given an array of size n, find the majority element. The
 * majority element is the element that appears more than n/2 times.
 * 
 * You may assume that the array is non-empty and the majority element always
 * exist in the array.
 * 
 */
public class MajorityElement {

	// get the element which majority numbers
	public static int majorityElement(int[] nums) {
		int len = nums.length;
		Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
		for (int i = 0; i < len; i++) {
			Integer count = maps.get(nums[i]);
			maps.put(nums[i], count == null ? 0 : count.intValue() + 1);
		}

		int max = Integer.MIN_VALUE;
		int i = 0;
		for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
			if (max < entry.getValue()) {
				max = entry.getValue();
				i = entry.getKey();
			}
		}

		return i;
	}

	// number of majority element > n / 2
	public static int majorityElement_1(int[] nums) {
		int len = nums.length;
		Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
		for (int i = 0; i < len; i++) {
			Integer count = maps.get(nums[i]);
			maps.put(nums[i], count == null ? 0 : count.intValue() + 1);
		}

		for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
			if (entry.getValue() >= len / 2) {
				return entry.getKey();
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		// Given
		int[] nums = { 1, 2, 1, 2, 2, 5, 6, 7, 9, 1, 2, 2 };
		
		//output: 2
		System.out.println(majorityElement(nums));
	}
}

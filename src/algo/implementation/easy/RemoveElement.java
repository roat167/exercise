package algo.implementation.easy;

import java.util.Arrays;

/**
 * LeetCode 27: Given an array and a value, remove all instances of that value
 * in place and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this in place with
 * constant memory.
 * 
 * The order of elements can be changed. It doesn't matter what you leave beyond
 * the new length. *
 */
public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int count = nums.length;
		if (count == 0)
			return 0;
		if (count == 1 && val == nums[0])
			return 0;

		Arrays.sort(nums);
		int j = count - 1;

		for (int i = 0; i < nums.length; i++) {
			if (val == nums[i]) {
				while (j > i && val == nums[j]) {
					j--;
				}
				if (j > i)
					nums[i] = nums[j--];
				count--;
			}
		}
		return count;
	}

	public int removeElementShort(int[] nums, int val) {
		int start = 0;
		for (int i = 0; i < nums.length; i++)
			if (nums[i] != val)
				nums[start++] = nums[i];
		return start;
	}

	public static void main(String[] args) {
		/*
		 * Example: Given input array nums = [3,2,2,3], val = 3
		 * 
		 * Your function should return length = 2, with the first two elements
		 * of nums being 2.
		 */
		
		// arrange
		// int[] nums = new int[]{3};
		// int[] nums = new int[] { 3, 3 };
		int[] nums = new int[] { 3, 2, 2, 3 };
		int val = 3;

		// act
		int res = new RemoveElement().removeElement(nums, val);

		// assert
		int expectVal = 2;
		System.out.println(expectVal == res);
	}
}

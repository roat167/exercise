package algo.implementation.easy;

import java.util.Arrays;

/**
 * LeetCode: write a function to move all 0's to the end of it while maintaining
 * the relative order of the non-zero elements.
 * 
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums
 * should be [1, 3, 12, 0, 0].
 * 
 * You must do this in-place without making a copy of the array. Minimize the
 * total number of operations.
 */
public class MoveZeros {
	
	public static int[] moveZeroes(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			j = i + 1;
			if (nums[i] == 0) {
				while (j < nums.length && nums[j] == 0) {
					// increase j index till found the non zero
					j++;
				}
				if (j < nums.length) {
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		//output: 1, 3, 12, 0, 0
		Arrays.stream(moveZeroes(nums)).forEach(System.out::println);;
	}
}

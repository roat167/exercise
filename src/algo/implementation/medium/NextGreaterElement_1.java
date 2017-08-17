package algo.implementation.medium;

import java.util.Arrays;
import java.util.Stack;

/**
 * LeetCode (500-Next Greater Element II): Given a circular array (the next
 * element of the last element is the first element of the array), print the
 * Next Greater Number for every element. The Next Greater Number of a number x
 * is the first greater number to its traversing-order next in the array, which
 * means you could search circularly to find its next greater number. If it
 * doesn't exist, output -1 for this number.
 * 
 * Constraint: n <= 10000
 */
public class NextGreaterElement_1 {

	public static int[] nextGreaterElements(int[] nums) {
		int max = Integer.MIN_VALUE;
		for (int num : nums) {
			if (max < num)
				max = num;
		}

		int len = nums.length;
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			int x = -1;
			int n = nums[i];
			int j = i + 1;

			// check if value is max and do circular search
			while (n != max && j <= len && j != i) {
				if (j == len) {
					j = 0;
				}

				if (n < nums[j]) {
					x = nums[j];
					break;
				}
				j++;
			}
			System.out.printf("%d ", x);
			arr[i] = x;
		}
		System.out.println("");
		return arr;
	}

	public int[] nextGreaterElementsWithStack(int[] nums) {
		int len = nums.length;
		int[] arr = new int[len];
		Arrays.fill(arr, -1);

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < len * 2; i++) {
			int n = nums[i % len];

			while (!stack.isEmpty() && nums[stack.peek()] < n) {
				arr[stack.pop()] = n;
			}

			if (i < n) {
				stack.push(i);
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		/*
		 * Input: [1,2,1] Output: [2,-1,2] Explanation: The first 1's next
		 * greater number is 2; The number 2 can't find next greater number; The
		 * second 1's next greater number needs to search circularly, which is
		 * also 2.
		 */
		int[] nums1 = { 1, 2, 1 };
		// expected 2, -1, 2
		NextGreaterElement_1.nextGreaterElements(nums1);

		System.out.println("===============================");
		int[] nums2 = { 1, 2, 1, 3, 5, 7, 4, 2 };
		// expected 2,3,3,5,7,-1,5,3
		NextGreaterElement_1.nextGreaterElements(nums2);
	}
}

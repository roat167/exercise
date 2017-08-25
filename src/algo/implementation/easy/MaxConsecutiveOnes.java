package algo.implementation.easy;

/**
 * LeetCode 458: Given a binary array, find the maximum number of consecutive 1s
 * in this array.
 * 
 * The input array will only contain 0 and 1. The length of input array is a
 * positive integer <= 10,000
 *
 */
public class MaxConsecutiveOnes {
	
	public int findMaxConsecutiveOnes(int[] nums) {
		int max = 0, count = 0;
        for(int i = 0; i < nums.length ; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }            
        }
        
        return Math.max(max, count);
	}

	public static void main(String[] args) {
		/*
		 * Input: [1,1,0,1,1,1] Output: 3 Explanation: The first two digits or
		 * the last three digits are consecutive 1s. The maximum number of
		 * consecutive 1s is 3.
		 */
		// arrange
		int[] nums = new int[] {1,1,0,1,1,1};
		
		// act
		int max = new MaxConsecutiveOnes().findMaxConsecutiveOnes(nums);
		
		// assert 
		System.out.println(max == 3);		
	}
}

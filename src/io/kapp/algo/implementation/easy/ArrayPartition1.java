package io.kapp.algo.implementation.easy;

import java.util.Arrays;

/**
 * LeetCode: Given an array of 2n integers, your task is to group these integers
 * into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes
 * sum of min(ai, bi) for all i from 1 to n as large as possible. * 
 */
public class ArrayPartition1 {
	
	// Assume in each pair of i, bi >= ai
	//sort the input array and then the sum of odd elements.
	public static int arrayPairSum(int[] nums) {
        int sum = 0;
        int n = nums.length;
        Arrays.sort(nums);
        //sum += Math.min(nums[i], nums[n-i-1]);
        for (int i = 0; i < n ; i+=2) {
            sum += nums[i];
        }
        return sum;
    }
	
	public static void main(String[] args) {
		int[] arr = {1, 4, 3, 2};
		
		//expected output: 4
		System.out.println(ArrayPartition1.arrayPairSum(arr));		
	}
}

package algo.implementation.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode: given two arrays (without duplicates) nums1 and nums2 where nums1’s
 * elements are subset of nums2. Find all the next greater numbers for nums1's
 * elements in the corresponding places of nums2.
 * 
 * The Next Greater Number of a number x in nums1 is the first greater number to
 * its right in nums2. If it does not exist, output -1 for this number.
 * 
 * Constraint: All elements in nums1 and nums2 are unique. The length of both
 * nums1 and nums2 would not exceed 1000
 * 
 */
public class NextGreaterElement {

	public static int[] nextGreaterElement(int[] findNums, int[] nums) {
		 int m = nums.length;
	        int[] arr = new int[findNums.length];
	        
	        List<Integer> list = new ArrayList<Integer>();
	        for (int num : nums) {
	            list.add(num);
	        }   
	        
	        for(int i = 0; i < findNums.length; i++) {            
	            int x = -1;
	            int f = findNums[i];
	            int j = list.indexOf(f);	            
	            
	            while( j < m) {
	                if (findNums[i] < nums[j]) {
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

	public static void main(String[] args) {
		/*
		 * Input: nums1 = [4,1,2], nums2 = [1,3,4,2]. Output: [-1,3,-1] Input:
		 * nums1 = [2,4], nums2 = [1,2,3,4]. Output: [3,-1] Explanation: For
		 * number 2 in the first array, the next greater number for it in the
		 * second array is 3. For number 4 in the first array, there is no next
		 * greater number for it in the second array, so output -1.
		 */
		int[] nums1 = {4,1,2};
		int[] nums2 = {1,3,4,2};
		//expected -1, 3, -1
		NextGreaterElement.nextGreaterElement(nums1, nums2);
		
		System.out.println("===============================");
		int[] nums11 = {2, 4};
		int[] nums22 = {1,3,4,2};
		//expected 3, -1
		NextGreaterElement.nextGreaterElement(nums11, nums22);
	}
}

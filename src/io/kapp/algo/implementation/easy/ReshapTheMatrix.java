package io.kapp.algo.implementation.easy;

import java.util.Arrays;

/**
 * LeetCode: reshape a matrix into a new one with different size but keep its
 * original data.
 */
public class ReshapTheMatrix {

	public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int ro = nums.length ;
		int co = nums[0].length;		
		
		//check if the reshape is possible		
        int n = 0, m =0;
		if ( r * c == ro * co) {
            int[][] tmp = new int[r][c];
            
			for (int i = 0; i < r ; i ++) {
                for(int j = 0; j < c; j++) {
                    if (m == co) { // check if origin column reach max
                        n++;
                        m = 0;
                    }
                    tmp[i][j] = nums[n][m++];                    
                }
            }
            return tmp;
		}         
        
        return nums;		
    }
	
	public static int[][] matrixReshape_1(int[][] nums, int r, int c) {
		int ro = nums.length;
		int co = nums[0].length;

		// check if the reshape is possible		
		if (r * c == ro * co) {
			int[][] tmp = new int[r][c];
			for (int i = 0; i < r * c; i++)
				tmp[i / c][i % c] = nums[i / co][i % co];
			return tmp;
		}
		return nums;
	}
		
	public static void main(String[] args) {
		/**
		 * You're given a matrix represented by a two-dimensional array, and two
		 * positive integers r and c representing the row number and column
		 * number of the wanted reshaped matrix, respectively.
		 * 
		 * The reshaped matrix need to be filled with all the elements of the
		 * original matrix in the same row-traversing order as they were.
		 * 
		 * If the 'reshape' operation with given parameters is possible and
		 * legal, output the new reshaped matrix; Otherwise, output the original
		 * matrix.
		 *
		 * nums = [[1,2], [3,4]] r = 1, c = 4 Output: [[1,2,3,4]] Explanation:
		 * The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a
		 * 1 * 4 matrix, fill it row by row by using the previous list.
		 * 
		 * Cases: The height and width of the given matrix is in range [1, 100].
		 * The given r and c are all positive.
		 * 
		 */
		
		int[][] nums = {{1, 2}, {3, 4}};
		int r = 1, c = 4;
		
		//expected [1,2,3,4]
		Arrays.stream(ReshapTheMatrix.matrixReshape(nums, r, c))
				// .map(a -> String.join(",", String.valueOf(a)))
				.map(Arrays::toString)
				.forEach(System.out::println);

		int[][] nums1 = { { 1, 2 }, { 3, 4 } };
		r = 2;
		c = 4;
		System.out.println("===========================");
		Arrays.stream(ReshapTheMatrix.matrixReshape_1(nums1, r, c))
				.map(Arrays::toString)
				.forEach(System.out::println);
	
	}
}

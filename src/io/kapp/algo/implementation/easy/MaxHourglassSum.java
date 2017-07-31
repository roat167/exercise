package io.kapp.algo.implementation.easy;

/**
 * Given a 6x6 2D array. Output the max sum of hourglass
 */
public class MaxHourglassSum {

	public static int maxSum(int[][] arr) {
		int max = Integer.MIN_VALUE; // This handle when sum are negative
		for (int i = 0; i < 4; i++) {
			int j = 0;
			while (j < 4) {
				int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
						+ arr[i + 2][j + 1] + arr[i + 2][j + 2];
				if (max < sum) {
					max = sum;
				}
				j++;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		
		int[][] arr = new int[][]{
				{ 1, 1, 1, 0, 0, 0},
				{ 0, 1, 0, 0, 0, 0},
				{ 1, 1, 1, 0, 0, 0},
				{ 0, 0, 2, 4, 4, 0},
				{ 0, 0, 0, 2, 0, 0},
				{ 0, 0, 1, 2, 4, 0}
		};
		System.out.println(MaxHourglassSum.maxSum(arr)); //expected output 19
	}
}

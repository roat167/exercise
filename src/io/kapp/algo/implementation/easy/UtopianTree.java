package io.kapp.algo.implementation.easy;

/*
 * Hackerrank:
 * The Utopian Tree goes through 2 cycles of growth every year. 
 * Each spring, it doubles in height. Each summer, its height increases by 1 meter.
 */

public class UtopianTree {
	public static void main(String[] args) {
		int[] tree = {0, 1, 4};
		for (int i = 0; i < tree.length; i++) {
			int h = 1;
			for (int j = 1; j <= tree[i] ; j++) {
				if (j % 2 == 0) {
					h += 1;
				} else {
					h *= 2;
				}
			}
			System.out.println(h);
		} //expected output: 1, 2, 7 	
	}
}

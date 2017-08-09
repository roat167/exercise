package io.kapp.algo.implementation.easy;

public class InvertBinaryTree {

	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}
		// swap right node with left node
		TreeNode t = root.left;
		root.left = root.right;
		root.right = t;

		return root;
	}
}

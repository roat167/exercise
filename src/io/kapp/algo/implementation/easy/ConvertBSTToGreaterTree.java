package io.kapp.algo.implementation.easy;

import java.util.Stack;

public class ConvertBSTToGreaterTree {

	static int sum = 0;

	/**
	 * Reverse traversal with computing the original key with sum of all key
	 * 
	 * @param root
	 * @return TreeNode with new values
	 */
	public static TreeNode convertBST(TreeNode root) {
		if (root == null) {
			return null;
		}

		// traverse from right first
		convertBST(root.right);

		root.val += sum;
		sum = root.val;

		convertBST(root.left);

		return root;
	}

	public static TreeNode convertBSTWithDFS(TreeNode root) {
		if (root == null) {
			return null;
		}
		// First start sum = 0
		depthFirstSearch(root, 0);
		return root;
	}

	private static int depthFirstSearch(TreeNode root, int total) {
		if (root.right != null) {
			total = depthFirstSearch(root.right, total);
		}
		root.val = root.val + total;

		if (root.left != null) {
			total = depthFirstSearch(root.left, root.val);
		}
		return root.val;
	}

	public static TreeNode convertBSTWithStack(TreeNode root) {
		if (root == null) {
			return null;
		}

		Stack<TreeNode> stack = new Stack<>();
		TreeNode cur = root;
		int sum = 0;
		while (!stack.isEmpty() || cur != null) {
			while (cur != null) {
				stack.push(cur);
				cur = cur.right;
			}
			cur = stack.pop();
			int tmp = cur.val;
			cur.val += sum;
			sum += tmp;
			cur = cur.left;
		}
		return root;
	}

	public static void main(String[] args) {
		// Input
		int[] nums = { 5, 2, 13 };
		TreeNode root = null;

		for (int i = 0; i < nums.length; i++) {
			root = TreeNode.insert(root, nums[i]);
		}

		// Expected output: 18, 20 , 13
		ConvertBSTToGreaterTree.convertBST(root);
		// ConvertBSTToGreaterTree.convertBSTWithDFS(root);
		// ConvertBSTToGreaterTree.convertBSTWithStack(root);

		TreeNode.printNode(root);
	}
}

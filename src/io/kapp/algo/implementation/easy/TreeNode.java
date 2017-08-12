package io.kapp.algo.implementation.easy;

import java.util.LinkedList;
import java.util.Queue;

//binary tree node.
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}

	public static TreeNode insert(TreeNode root, int x) {
		if (root == null) {
			return new TreeNode(x);
		} else {
			TreeNode cur;
			if (x <= root.val) {
				cur = insert(root.left, x);
				root.left = cur;
			} else {
				cur = insert(root.right, x);
				root.right = cur;
			}
		}
		return root;
	}

	// Using level order traversal
	public static void printNode(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		if (root != null) {
			q.add(root);
		}

		while (!q.isEmpty()) {
			TreeNode cur = q.remove();

			if (cur.left != null) {
				q.add(cur.left);
			}

			if (cur.right != null) {
				q.add(cur.right);
			}

			System.out.printf("%d ", cur.val);
		}
	}
}

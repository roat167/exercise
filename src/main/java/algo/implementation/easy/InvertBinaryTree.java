package algo.implementation.easy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InvertBinaryTree {

	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}

		// swap right node with left node
		TreeNode t = root.left;
		root.left = root.right;
		root.right = t;

		invertTree(root.left);
		invertTree(root.right);

		return root;
	}

	public TreeNode invertTreeWithStack(TreeNode root) {
		if (root == null) {
			return null;
		}

		Stack<TreeNode> stk = new Stack<TreeNode>();
		stk.push(root);

		while (!stk.isEmpty()) {
			TreeNode tmp = stk.pop();
			TreeNode l = tmp.left;
			tmp.left = tmp.right;
			tmp.right = l;

			if (tmp.left != null) {
				stk.push(tmp.left);
			}
			if (tmp.right != null) {
				stk.push(tmp.right);
			}
		}

		return root;
	}
	
	//BFS Level Order Traversal
	public TreeNode invertTreeWithBFS(TreeNode root) {
		if (root == null) {
			return null;
		}

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);

		while (!queue.isEmpty()) {
			TreeNode tmp = queue.poll();
			TreeNode l = tmp.left;
			tmp.left = tmp.right;
			tmp.right = l;

			//add left node first
			if (tmp.left != null) {
				queue.add(tmp.left);
			}
			if (tmp.right != null) {
				queue.add(tmp.right);
			}
		}
		return root;
	}
}

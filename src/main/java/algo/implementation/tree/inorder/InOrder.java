package algo.implementation.tree.inorder;

import algo.implementation.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * In-Order : Left -> Root -> Right
 *
 */
public class InOrder {

	public List<Integer> recursiveInorderTraversal(TreeNode root) {
		List<Integer> arr = new ArrayList<>();
		// base case
		if (root == null) {
			return arr;
		} else {
			arr.addAll(recursiveInorderTraversal(root.left));
			arr.add(root.val);
			arr.addAll(recursiveInorderTraversal(root.right));
		}

		return arr;
	}
}

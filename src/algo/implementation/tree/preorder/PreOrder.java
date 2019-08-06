package algo.implementation.easy;

/**
 * PreOrder : Root -> Left -> Right
 *
 *  preorder traversal of its nodes' values using
 *  Iterative and Recursive
 *  both take about 1ms
 */
public class PreOrder {

	/* Pre-Order Iterative
	 * create stack and push root to it
	 * Pop an item from stack and print it.
	 * Push right child of popped item to stack
	 * Push left child of popped item to stack
	 */
	public List<Integer> iterativePreorder(TreeNode root) {
		List<Integer> arr = new ArrayList<>();
		if (root != null) {
			Stack<TreeNode> stack = new Stack<>();
			stack.push(root);
			while(!stack.empty()) {
				TreeNode node = stack.pop();
				arr.add(node.val);

				// push right child first, cos stack is LIFO
				if (node.right != null) {
					stack.push(node.right);
				}

				// push left child
				if (node.left != null) {
					stack.push(node.left);
				}
			}
		}

		return arr;
	}

	public List<Integer> recursivePreorder(TreeNode root) {
		List<Integer> arr = new ArrayList<>();
		// base case
		if (root == null) {
			return arr;
		} else {
			arr.add(root.val);
		}

		arr.addAll(recursivePreorder(root.left));
		arr.addAll(recursivePreorder(root.right));

		return arr;
	}
}

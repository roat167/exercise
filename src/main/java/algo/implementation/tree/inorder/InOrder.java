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

	/**
	 * using stack and
	 * use temp node as root
	 * step 3: Push the node to stack and set node = node->left until node is NULL
	 * If node == NULL and stack != empty then
	 * <ul>
	 *  <li> Pop item from stack </li>
	 *  <li> add pop to arr, set node = pop->right </li>
	 *  <li> Goto step 3 </li>
	 * </ul>
	 * iterate till node is NULL and stack is empty
	 *
	 */
	public List<Integer> iterativeInorderTraversal(TreeNode root) {
		List<Integer> arr = new ArrayList<>();
		if (root != null) {
			Stack<TreeNode> stack = new Stack<>();
			TreeNode node = root;
			// push node to stack
			stack.push(node);
			while (!stack.empty() || node != null) {
				while(node != null) {
					if(node.left != null) {
						stack.push(node.left);
					}
					node = node.left;
				}
				if (!stack.empty()) {
					TreeNode pop = stack.pop();
					arr.add(pop.val);
					node = pop.right;
					if (node != null) { // repeat step 3 if node is not null
						stack.push(node);
					}
				}
			}
		}
		return arr;
	}

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

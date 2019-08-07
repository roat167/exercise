package algo.implementation.easy;

/**
 * LeetCode 543: Given a binary tree, you need to compute the length of the
 * diameter of the tree. The diameter of a binary tree is the length of the
 * longest path between any two nodes in a tree. This path may or may not pass
 * through the root.
 * 
 */
public class DiameterBinaryTree {
	int max = 0;

	public int diameterOfBinaryTree(TreeNode root) {
		maxDepth(root);
		return max;
	}

	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		int mLeft = maxDepth(root.left);
		int mRight = maxDepth(root.right);

		/**
		 * The max depth of a node :
		 * 
		 * = (max depth of its leftNode + max depth of its rightNod ) + 1 here
		 * we set max to remember the maxDepth node of previous nodes and
		 * compare with current node
		 */
		max = Math.max(max, mLeft + mRight);
		return Math.max(mLeft, mRight) + 1;
	}

	public static void main(String[] args) {
		/**
		 * Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
		 */

		// arrange
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(3);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		// act

		int actual = new DiameterBinaryTree().diameterOfBinaryTree(root);

		// assert
		// expected val = 3 return val should be true

		System.out.println(3 == actual);
	}
}

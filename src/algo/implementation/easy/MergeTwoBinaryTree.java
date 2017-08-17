package algo.implementation.easy;

/**
 * LeetCode: Given two binary trees and imagine that when you put one of them to
 * cover the other, some nodes of the two trees are overlapped while the others
 * are not.
 * 
 * You need to merge them into a new binary tree. The merge rule is that if two
 * nodes overlap, then sum node values up as the new value of the merged node.
 * Otherwise, the NOT null node will be used as the node of new tree.
 */

public class MergeTwoBinaryTree {	
	public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null) return t2;
		if (t2 == null) return t1;
		
		TreeNode tn = new TreeNode(t1.val + t2.val);
		tn.left = mergeTrees(t1.left, t2.left);
		tn.right = mergeTrees(t2.right, t2.right);
		
;		return tn;
	}
	
	public static void displayTreeNode(TreeNode root) {
		if (root == null) return;		
		System.out.printf("%d " , root.val);
		displayTreeNode(root.left);
		displayTreeNode(root.right);
	}	
}

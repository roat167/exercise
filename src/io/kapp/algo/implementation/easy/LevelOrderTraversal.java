package io.kapp.algo.implementation.easy;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
	//Print the  data value of each node in 
	//the tree's level-order traversal as a single line of N space-separated integers.
	//traverse each level of the tree from the root downward,
	//and we process the nodes at each level from left to right.
	//Using Queue
	//Ref: https://www.hackerrank.com/challenges/30-binary-trees/problem
	
	static void levelOrder (Node root) {
		Queue<Node> q = new LinkedList<Node>();
		if (root != null) {
			q.add(root);
		}
		
		while (!q.isEmpty()) {
			Node cur = q.remove();
			//Here we add left node first
			if (cur.left != null) {
				q.add(cur.left);
			}
			
			if (cur.right != null) {
				q.add(cur.right);
			}
			
			System.out.printf("%d ", cur.data);
		}		
	}
	
	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		}
		else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			}
			else {
				cur = insert(root.right, data);
				root.right = cur;
			}
		}
		return root;
	}
	
	
	public static void main(String[] args) {
		//sample input 3 2 5 1 4 7 
		int[] nums = {3, 2, 5, 1, 4, 7};
		Node root = null;
		
		for (int i = 0; i < nums.length; i++) {
			root = insert(root, nums[i]);
		}
		
		//expected output 3 2 5 1 4 7 
		levelOrder(root);
	}
}

class Node {
	Node left, right;
	int data;
	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

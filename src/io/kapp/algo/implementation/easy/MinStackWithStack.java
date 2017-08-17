package io.kapp.algo.implementation.easy;

import java.util.Stack;

public class MinStackWithStack {
	int min = Integer.MAX_VALUE;
	Stack<Integer> stack = new Stack<Integer>();

	public void push(int x) {
		// check if new value less than min
		if (x <= min) {
			stack.push(min);
			min = x;
		}
		stack.push(x);
	}

	public void pop() {
		// compare pop
		if (stack.pop() == min)
			min = stack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return min;
	}
	
	public static void main(String[] args) {
		MinStackWithStack minStack = new MinStackWithStack();
    	minStack.push(-2);
    	minStack.push(0);
    	minStack.push(-3);
    	System.out.println("=========================Expected -3===============================");
    	System.out.println(minStack.getMin());   //--> Returns -3.
    	minStack.pop();
    	System.out.println("=========================Expected 0 ===============================");
    	System.out.println(minStack.top());      //--> Returns 0.
    	System.out.println("=========================Expected -2===============================");
    	System.out.println(minStack.getMin());   //--> Returns -2.
	}
}

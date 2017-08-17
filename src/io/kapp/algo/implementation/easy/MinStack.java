package io.kapp.algo.implementation.easy;

/**
 * LeetCode 155: Design a stack that supports push, pop, top, and retrieving the
 * minimum element in constant time.
 * 
 * push(x) 	-- Push element x onto stack. 
 * pop() 	-- Removes the element on top of the stack. 
 * top() 	-- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 */
public class MinStack {
	class StackNode {       
        int val;
        StackNode next;
        int min;
        
        public StackNode(int x) {
            this.val = x;
            this.min = x;
        }
        
        private StackNode(int val, int min, StackNode next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
	
	StackNode stk;    
    public MinStack() {
            
    }
    
    public void push(int x) {            
        if (stk == null) {
            stk = new StackNode(x);
        } else {
           stk = new StackNode(x, Math.min(stk.min, x), stk);
        }        
    }
    
    public void pop() {
        stk = stk.next;
    }
    
    public int top() {
        return stk.val;
    }
    
    public int getMin() {
        return stk.min;
    }    
    
    public static void testMin() {
    	MinStack minStack = new MinStack();
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
    
    public static void main(String[] args) {
    	MinStack.testMin();
	}

}

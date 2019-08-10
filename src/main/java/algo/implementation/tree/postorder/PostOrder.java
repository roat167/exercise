package algo.implementation.tree.postorder;

import algo.implementation.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * use for finding the length of the tree, delete node, etc
 */
public class PostOrder {
    public List<Integer> recursivePostOrderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        // base case
        if (root == null) {
            return arr;
        } else {
            // null check is not necessary just want to avoid unecessary space (list creation)
            if (root.left != null) {
                arr.addAll(recursivePostOrderTraversal(root.left));
            }
            if (root.right != null) {
                arr.addAll(recursivePostOrderTraversal(root.right));
            }
            arr.add(root.val);
        }

        return arr;
    }

    /**
     * Push root to first stack.
     * Loop while first stack is not empty
     *  Pop a node from first stack and push it to second stack
     *  Push left and right children of the popped node to first stack
     * visit the content of stack2
     */
    public List<Integer> iterativePostOrderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if (root == null) {
            return arr;
        }
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> tmpStack = new Stack<>();
        stack.push(root);
        while(!stack.empty()) {
            TreeNode node = stack.pop();
            tmpStack.push(node);
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }

        while(!tmpStack.empty()) {
            arr.add(tmpStack.pop().val);
        }

        return arr;
    }

    /** Using one stack
     * initialize empty stack
     * while loop till root is null and stack is empty
     *   if root not null push it to stack
     *     Set root as root's left child.
     *   if root is null and stack is not empty
     *     if right child of the top stack is not null set root top's right child
     *     if it is null Pop an item from stack and set it as tmpNode.
     *     If the popped item has a right child and the right child ==  top of stack,
     *     then keep popped the item and visit the node
     */
    public List<Integer> iterativePostOrderTraversalOneStack(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if (root == null) {
            return arr;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (!stack.empty() || curr != null) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else if (!stack.empty()) {
                TreeNode node = stack.peek().right;
                if (node == null) {  // top is leave, no child
                    node = stack.pop();
                    arr.add(node.val);
                    while(!stack.empty() && node == stack.peek().right) {
                        node = stack.pop();
                        arr.add(node.val);
                    }
                } else {
                    curr = node;
                }
            }
        }

        return arr;
    }
}

package algo.implementation.tree.postorder;

import algo.implementation.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

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
}

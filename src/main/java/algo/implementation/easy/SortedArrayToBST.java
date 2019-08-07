package algo.implementation.easy;

public class SortedArrayToBST {

	public static TreeNode sortBST(int[] nums, int low, int high) {
		if (low > high) {
			return null;
		}
		int mid = (low + high) / 2;

		TreeNode head = new TreeNode(nums[mid]);
		head.left = sortBST(nums, low, mid - 1);
		head.right = sortBST(nums, mid + 1, high);

		return head;
	}

	// Convert Sorted Array to Binary Search Tree 108
	public static TreeNode sortedArrayToBST(int[] nums) {
		int len = nums.length;
		if (len == 0) {
			return null;
		}
		if (len == 1) {
			return new TreeNode(nums[0]);
		}

		return sortBST(nums, 0, len - 1);
	}
}

package algo.implementation.easy;

/**
 * Reverse single linkedlist
 *
 */
public class ReverseLinkedList {

	// Recursive call
	public ListNode reverseList(ListNode head) {
		return reverse(head, null);
	}

	// Recursive
	public static ListNode reverse(ListNode head, ListNode node) {
		if (head == null) {
			return node;
		}
		ListNode next = head.next;
		head.next = node;
		return reverse(next, head);
	}

	// Iterative
	public ListNode reverseList_iterative(ListNode head) {
		if (head == null) {
			return null;
		}

		ListNode node = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = node;
			node = head;
			head = next;
		}

		return node;
	}
}

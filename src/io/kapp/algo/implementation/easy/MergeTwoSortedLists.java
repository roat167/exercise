package io.kapp.algo.implementation.easy;

/**
 * LeetCode 21: Merge two sorted linked lists and return it as a new list. The
 * new list should be made by splicing together the nodes of the first two lists
 */
public class MergeTwoSortedLists {

	// Using recursive will use stack space which is proportional to the length
	// of the lists.
	public ListNode mergeTwoListsWithRecursvie(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		}

		if (l1.val < l2.val) {
			l1.next = mergeTwoListsWithRecursvie(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoListsWithRecursvie(l1, l2.next);
			return l2;
		}
	}
}

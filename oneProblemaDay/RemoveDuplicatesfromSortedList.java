package com.saniyat.problemSolving.leetcodeSolutions.oneProblemaDay;

import java.util.HashSet;

// Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class RemoveDuplicatesfromSortedList {
	public static ListNode deleteDuplicates(ListNode head) {
		HashSet<Integer> count = new HashSet<>();

		ListNode temp = head;

		while (temp != null) {
			if (!count.contains(temp.val)) {
				count.add(temp.val);
				temp = temp.next;
			} else {
				temp = temp.next; 
			}

		}

		return null;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2 };

		ListNode head = new ListNode(nums[0]);

		ListNode temp = head;
		for (int i = 1; i < nums.length; i++) {
			temp.next = new ListNode(nums[i]);
			temp = temp.next;
		}

//		while (head != null) {
//			System.out.printf(head.val + ", ");
//			head = head.next;
//		}

		ListNode result = deleteDuplicates(head);

		while (result != null) {
			System.out.printf(result.val + ", ");
			result = result.next;
		}

		System.out.println();
	}
}

package problems.theLeetCodeBeginnersGuide;

import java.util.ArrayList;

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

public class MiddleofTheLinkedList {
	public static ListNode middleNode(ListNode head) {
//		ArrayList<ListNode> result = new ArrayList<>();
//
//		while (head != null) {
//			result.add(head);
//			head = head.next;
//		}
//
//		return result.get(result.size() / 2);

		ListNode middle = head;
		ListNode end = head;

		while (end != null && end.next != null) {
			middle = middle.next;
			end = end.next.next;
		}

		return middle;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6 };
		ListNode temp = new ListNode(nums[0]);
		ListNode head = temp;

		for (int i = 1; i < nums.length; i++) {
			temp.next = new ListNode(nums[i]);
			temp = temp.next;
		}

//		while(head != null) {
//			System.out.println(head.val + ", ");
//			head = head.next;
//		}

		System.out.println(middleNode(head).val);
		;
	}
}

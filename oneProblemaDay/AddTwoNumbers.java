package problems.oneProblemaDay;

public class AddTwoNumbers {
	public static class ListNode {
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

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode previous = new ListNode();
		ListNode head = previous;
		int carryOver = 0;

		while (l1 != null || l2 != null || carryOver != 0) {
			ListNode current = new ListNode();
			int sum = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val) + carryOver;
			current.val = sum % 10;
			carryOver = sum / 10;
			previous.next = current;
			previous = current;

			l1 = (l1 == null) ? l1 : l1.next;
			l2 = (l2 == null) ? l2 : l2.next;
		}

		return head.next;
	}

	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 3 };
		int[] arr2 = { 5, 6, 4 };
		ListNode currNode = new ListNode();

		ListNode m3 = new ListNode(arr1[2]);
		ListNode m2 = new ListNode(arr1[1], m3);
		ListNode l1 = new ListNode(arr1[0], m2);

		currNode = l1;
		while (currNode != null) {
			System.out.print(currNode.val + " ");
			currNode = currNode.next;
		}

		ListNode n3 = new ListNode(arr2[2]);
		ListNode n2 = new ListNode(arr2[1], n3);
		ListNode l2 = new ListNode(arr2[0], n2);

		currNode = l2;
		while (currNode != null) {
			System.out.print(currNode.val + " ");
			currNode = currNode.next;
		}

		currNode = addTwoNumbers(l1, l2);
		while (currNode != null) {
			System.out.print(currNode.val + " ");
			currNode = currNode.next;
		}
	}
}

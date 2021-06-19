package linkedList;

import java.util.Stack;

public class AssignmentLL extends LinkedList {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		LL<Integer> head = getInput();
//		head = evenAfterOdd(head);
//		head = swapTwoNodes(head, 0, 6);
//		head = deleteEveryN(head, 1, 3);
		head = kReverse(head, 2);
		printLL(head);

	}

	// reverse every k nodes //
	public static LL<Integer> kReverse(LL<Integer> head, int k) {
		if (head == null) {
			return head;
		}
		int c = 1;
		LL<Integer> temp = head;
		while (temp != null && c < k) {
			temp = temp.next;
			c++;
		}
		System.out.println(temp.data);
		LL<Integer> temp2 = temp.next;
		temp.next = null;
		temp = reverseLL(head);
		head.next = kReverse(temp2, k);
		return temp;

	}

	// Retain m nodes and then delete n nodes //
	public static LL<Integer> deleteEveryN(LL<Integer> head, int m, int n) {
		if (head == null) {
			return null;
		}
//		System.out.println(m + " " + n);
		LL<Integer> temp1 = head;
		while (temp1 != null) {
			int p1 = 1;
			int p2 = 1;
			while (p1 < m && temp1.next != null) {
				temp1 = temp1.next;
				p1++;
			}
			if (temp1.next == null) {
				break;
			}
			LL<Integer> temp2 = temp1.next;
			while (p2 < n && temp2.next != null) {
				temp2 = temp2.next;
				p2++;
			}
			if (temp2.next == null) {
				temp1.next = null;
				break;
			}
			temp1.next = temp2.next;
			temp1 = temp2.next;
		}
		return head;
	}

	// Swap 2 nodes and not data //
	public static LL<Integer> swapTwoNodes(LL<Integer> head, int i, int j) {
		LL<Integer> temp = head;
		LL<Integer> prev = null;
		LL<Integer> node1_prev = null, node1 = null;
		LL<Integer> node2_prev = null, node2 = null;
		System.out.println(i + " " + j);
		int pos = 0;
		while (temp != null) {
			if (pos == i) {
				node1_prev = prev;
				node1 = temp;
			}
			if (pos == j) {
				node2_prev = prev;
				node2 = temp;
			}
			pos++;
			prev = temp;
			temp = temp.next;
		}

		if (node1_prev != null) {
			node1_prev.next = node2;
		} else {
			head = node2;
		}

		if (node2_prev != null) {
			node2_prev.next = node1;
		} else {
			head = node1;
		}

		LL<Integer> temp1 = node2.next;
		node2.next = node1.next;
		node2_prev = node1;
		node1.next = temp1;

		return head;
	}

	// Segreagte even after off list //
	public static LL<Integer> evenAfterOdd(LL<Integer> head) {
		LL<Integer> eh = null;
		LL<Integer> et = null;
		LL<Integer> oh = null;
		LL<Integer> ot = null;
		while (head != null) {
			if (head.data % 2 == 0) {
				if (eh == null) {
					eh = head;
					et = head;
				} else {
					et.next = head;
					et = et.next;
				}
			} else {
				if (oh == null) {
					oh = head;
					ot = head;
				} else {
					ot.next = head;
					ot = ot.next;
				}
			}
			head = head.next;
		}
		if (ot == null) {
			return eh;
		} else {
			ot.next = eh;
			head = oh;
		}
		if (eh != null) {
			et.next = null;
		}
		return oh;
	}

	public static LL<Integer> reverseLL(LL<Integer> head) {
		if (head.next == null) {
			return head;
		}
		LL<Integer> smallHead = reverseLL(head.next);
		head.next.next = head;
		head.next = null;
		return smallHead;

	}
}

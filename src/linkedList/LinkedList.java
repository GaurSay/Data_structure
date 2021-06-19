package linkedList;

import java.util.Scanner;

public class LinkedList {

	public static void main(String args[]) {
		LL<Integer> head1 = getInput();
		printLL(head1);
	}

	public static LL<Integer> mergeSortedLL(LL<Integer> head1, LL<Integer> head2) {
		if (head1 == null) {
			return head2;
		}
		if (head2 == null) {
			return head1;
		}

		LL<Integer> t1 = head1;
		LL<Integer> t2 = head2;
		LL<Integer> h3 = head1;
		LL<Integer> t3 = head1;
		if (t1.data < t2.data) {
			h3 = t1;
			t3 = t1;
			t1 = t1.next;
		} else {
			h3 = t2;
			t3 = t2;
			t2 = t2.next;
		}
		while (t3.next != null) {
			if (t1.data <= t2.data) {
				t3.next = t1;
				t3 = t3.next;
				t1 = t1.next;
			} else {
				t3.next = t2;
				t3 = t3.next;
				t2 = t2.next;
			}
		}
		if (t1 == null) {
			t3.next = t2;
		} else {
			t3.next = t1;
		}
		return h3;
	}

	public static boolean checkPalindrome(LL<Integer> head) {
		LL<Integer> slow = head;
		LL<Integer> fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		LL<Integer> head2 = reverseRecursive2(slow.next);
		slow.next = null;
		printLL(head);
		printLL(head2);
		while (head2 != null) {
			if (head.data != head2.data) {
				return false;
			}
			head = head.next;
			head2 = head2.next;
		}
		return true;

	}

	public static LL<Integer> findMid(LL<Integer> head) {
		LL<Integer> slow = head;
		LL<Integer> fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("midpoint of LL is : " + slow.data);
		return slow;
	}

	public static LL<Integer> eliminateDuplicates(LL<Integer> head) {
		if (head == null || head.next == null) {
			return head;
		}
		if (head.data == head.next.data) {
			head.next = head.next.next;
		}
		eliminateDuplicates(head.next);
		return head;
	}

	public static LL<Integer> LastNToFirst(LL<Integer> head, int c) {
		LL<Integer> temp = head;
		int length = 1;
		while (temp.next != null) {
			length++;
			temp = temp.next;
		}

		c = length - c - 1;
		temp.next = head;
		while (c != 0) {
			head = head.next;
			c--;
		}
		System.out.println(head.data);
		temp = head.next;
		head.next = null;
		return temp;
	}

	public static int findNode(LL<Integer> head, int n, int i) {
		if (head == null) {
			System.out.println("Node not found");
			return -1;
		}
		if (n == head.data) {
			System.out.println("Node found");
			return i;
		}
		return findNode(head.next, n, i + 1);
	}

	public static LL<Integer> deleteNode(LL<Integer> head, int i) {
		if (head == null) {
			System.out.println("Give index within range !");
			return null;
		}
		if (i == 0) {
			return head.next;
		}
		head.next = deleteNode(head.next, i - 1);
		return head;
	}

	public static LL<Integer> reverseRecursive2(LL<Integer> head) {
		if (head == null || head.next == null) {
			return head;
		}
		LL<Integer> smallHead = reverseRecursive1(head.next);
		head.next.next = head;
		head.next = null;
		return smallHead;
	}

	public static LL<Integer> reverseRecursive1(LL<Integer> head) {
		if (head == null || head.next == null) {
			return head;
		}
		LL<Integer> smallHead = reverseRecursive1(head.next);
		LL<Integer> temp = smallHead;
		// Unnecessary traversal //
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = head;
		head.next = null;
		return smallHead;

	}

	public static LL<Integer> reverseIterative(LL<Integer> head) {
		if (head.next == null) {
			return head;
		}
		LL<Integer> prev = head;
		LL<Integer> curr = head.next;

		while (curr.next != null) {
			LL<Integer> temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
			System.out.println("prev : " + prev.data + " " + " curr : " + curr.data);
		}
		head.next = null;
		head = curr;
		curr.next = prev;
		return head;
	}

	public static void print_iThNode(LL<Integer> head, int i) {
		if (head == null) {
			System.out.println("Give index within range !");
			return;
		}
		if (i == 0) {
			System.out.println(head.data);
			return;
		}
		print_iThNode(head.next, i - 1);
	}

	public static int lengthOfLL(LL<Integer> head) {
		if (head == null) {
			return 0;
		}

		return 1 + lengthOfLL(head.next);

	}

	public static void printLL(LL<Integer> root) {
		LL<Integer> temp = root;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static LL<Integer> getInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the elements");
		int x = s.nextInt();
		LL<Integer> head = null;
		LL<Integer> curr = null;
		while (x != -1) {
			LL<Integer> newNode = new LL<>(x);
			if (head == null) {
				head = newNode;
				curr = head;
			} else {
				curr.next = newNode;
				curr = newNode;
			}
			x = s.nextInt();

		}
		s.close();
		return head;
	}
}

class LL<T> {
	LL<T> next;
	T data;

	public LL(T data) {
		this.data = data;
		next = null;
	}
}

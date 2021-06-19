package linkedList;

public class Loop extends LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL<Integer> head = new LL<>(50);
		head.next = new LL<>(20);
		head.next.next = new LL<>(15);
		head.next.next.next = new LL<>(4);
		head.next.next.next.next = new LL<>(10);

		// Creating a loop for testing
		head.next.next.next.next.next = head.next.next;
		detectLoop(head);
	}

	private static void detectLoop(LL<Integer> head) {
		LL<Integer> slow = head;
		LL<Integer> fast = head;
		while (slow != null && fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				System.out.println("Loop detected ");
				removeLoop(head, slow);
				break;
			}
		}
	}

	private static void removeLoop(LL<Integer> head, LL<Integer> slow) {
		// TODO Auto-generated method stub
		LL<Integer> p1 = head;
		LL<Integer> p2 = null;
//		System.out.println(slow.data);

		while (1 == 1) {
			p2 = slow;
			while (p2.next != slow && p2.next != p1) {
				p2 = p2.next;
			}
			if (p2.next == p1) {
				break;
			}
			p1 = p1.next;

		}
		System.out.println(p2.data);
		p2.next = null;
		System.out.println("Loop removed !");
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}

	}
}

package linkedList;

public class bubbleSortIterative extends LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL<Integer> root = getInput();
		root = sort(root);
		printLL(root);

	}

	private static LL<Integer> sort(LL<Integer> head) {
		LL<Integer> temp = head;
		int length = 0;
		while (temp != null) {
			length++;
			temp = temp.next;
		}
		System.out.println(length);

		for (int i = 0; i < length; i++) {
			LL<Integer> curr = head;
			LL<Integer> prev = null;
			while (curr.next != null) {
				if (curr.data > curr.next.data) {
					// need to swap
					temp = curr.next;
					// check if first node
					if (prev == null) {
						curr.next = temp.next;
						temp.next = curr;
						head = temp;
						prev = temp;
					}
					else {
						prev.next = temp;
						curr.next = temp.next;
						temp.next = curr;
						prev = prev.next;
					}
				} else {
					prev = curr;
					curr = curr.next;
				}
			}
		}
		return head;
	}

}

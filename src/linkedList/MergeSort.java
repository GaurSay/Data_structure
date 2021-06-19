package linkedList;

public class MergeSort extends LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL<Integer> head = getInput();
		head  = mergeSort(head);
		printLL(head);
	}

	private static LL<Integer> mergeSort(LL<Integer> head) {
		if(head.next ==null) {
			return head;
		}
		LL<Integer> mid = findMidOfLL(head,head);
		LL<Integer> temp= mid.next;
		mid.next =null;
		mid= temp;
		
		head = mergeSort(head);
		mid = mergeSort(mid);
		return merge(head,mid);
	}

	private static LL<Integer> merge(LL<Integer> head, LL<Integer> mid) {
		if (head == null) {
			return mid;
		}
		if (mid == null) {
			return head;
		}

		LL<Integer> t1 = head;
		LL<Integer> t2 = mid;
		LL<Integer> h3 = head;
		LL<Integer> t3 = head;
		if(t1.data <=t2.data) {
			h3=t1;
			t3=t1;
			t1=t1.next;
		}
		else {
			h3=t2;
			t3=t2;
			t2=t2.next;
		}
		while(t3.next!=null) {
			if(t1.data<=t2.data) {
				t3.next=t1;
				t1=t1.next;
				t3=t3.next;
			}
			else {
				t3.next=t2;
				t2=t2.next;
				t3=t3.next;
			}
		}
		if(t1 == null) {
			t3.next = t2;
		}
		else {
			t3.next = t1;
		}
		return h3;
	}

	private static LL<Integer> findMidOfLL(LL<Integer> slow, LL<Integer> fast) {
		if(fast.next ==null || fast.next.next==null) {
			return slow;
		}
		slow=slow.next;
		fast= fast.next.next;
		return findMidOfLL(slow,fast);
		
	}

}

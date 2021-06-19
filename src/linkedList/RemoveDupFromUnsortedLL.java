package linkedList;

import java.util.HashSet;

public class RemoveDupFromUnsortedLL extends LinkedList{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL<Integer> head = getInput();
		removeFromSorted(head);
		printLL(head);
	}
	private static void removeFromSorted(LL<Integer> head) {
		if(head == null) return;
		if(head.next == null) return;
		LL<Integer> prev=head;
		LL<Integer> curr=head.next;
		while(curr!=null) {
			if(curr.data !=prev.data) {
				prev = curr;
				curr = curr.next;
			}
			else {
				prev.next = curr.next;
				curr = curr.next;
			}
		}
	}
	
	private static void removeFromUnsorted(LL<Integer> head) {
		// TODO Auto-generated method stub
		
		LL<Integer> curr=head;
		LL<Integer> prev=null;
		HashSet<Integer> hs=new HashSet<>();
		while(curr!=null)
		{
			int currValue=curr.data;
			if(hs.contains(currValue))
			{
				prev.next=curr.next;
			}
			else
			{
				hs.add(currValue);
				prev=curr;
			}
			curr=curr.next;
			
		}
		
	}

}

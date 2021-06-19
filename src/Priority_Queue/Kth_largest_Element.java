package Priority_Queue;

import java.util.PriorityQueue;

public class Kth_largest_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 9, 4, 8, 7, 11, 3 };
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int k = 5;
		for (int i = 0; i < arr.length; i++) {
			if(i<k) {
				pq.add(arr[i]);
			}
			else {
				if(arr[i]>pq.peek()) {
					pq.remove();
					pq.add(arr[i]);
				}
			}
		}
//		while(pq.size()!=1) {
			System.out.print(pq.remove()+" ");
//		}
		

	}

}

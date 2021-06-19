package Priority_Queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class K_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		Comparator<Integer> c = new Comparator<>() {
			@Override
			public int compare(Integer o,Integer s) {
				return o-s;
			}
		};
		int arr[] = { 2, 3, 1, 9, 6, 8 };
		int k =3;
		for(int i=0;i<arr.length;i++) {
			if(i<k) {
				pq.add(arr[i]);
			}
			else {
				if(pq.peek() < arr[i]) {
					pq.remove();
					pq.add(arr[i]);
				}
			}
		}
		while(!pq.isEmpty()) {
			System.out.print(pq.remove()+" ");
		}

	}

}

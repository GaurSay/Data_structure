package algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class K_closest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5 };
		int k =5;
		int x =3;

		find(arr,k,x);
	}

	private static void find(int[] arr, int k, int x) {
			
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>(Collections.reverseOrder());
		for (int i = 0; i < arr.length; i++) {
			if(pq.size()<k) {
				pq.add(new Pair(arr[i],Math.abs(arr[i]-x)));
			}
			else {
				if(pq.peek().gap> Math.abs(arr[i]-x)) {
					pq.remove();
					pq.add(new Pair(arr[i],Math.abs(arr[i]-x)));
				}
			}
		}
		System.out.println(pq.size());
		List<Integer> list = new ArrayList<>();
		
		while(!pq.isEmpty()) {
			list.add(pq.peek().value);
			pq.remove();
		}
		Collections.sort(list);
		System.out.println(list);
		
	}
}

class Pair implements Comparable<Pair>{
	int value;
	int gap;
	public Pair(int value,int gap) {
		this.gap=gap;
		this.value=value;
	}
	public int compareTo(Pair o) {
		if(this.gap==o.gap) {
			return this.value-o.value;
		}
		return this.gap-o.gap;
	}
}

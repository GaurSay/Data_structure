package GS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class K_closest_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5 };
		int k =3;
		int x =4;

		find(arr,k,x);
	}
	//k closest element to x in array

	private static void find(int[] arr,int k,int x) {
		PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i =0;i<arr.length;i++) {
			if(pq.size()<k) {
				pq.add(new Pair(arr[i],Math.abs(arr[i]-x)));
			}
			else {
				if(pq.peek().gap > Math.abs(arr[i]-x)) {
				   pq.remove();
				   pq.add(new Pair(arr[i],Math.abs(arr[i]-x)));
				}
			}
		}
		List<Integer> list = new ArrayList<>();
		while(!pq.isEmpty()) {
			Pair p = pq.remove();
			System.out.println(p.value);
			list.add(p.value);
		}
		Collections.sort(list);
//		System.out.println(list);
		
	}
}

class Pair implements Comparable<Pair>{
	int value;
	int gap;
	Pair(int value,int gap){
		this.value = value;
		this.gap= gap;
	}
	
	public int compareTo(Pair o) {
		if(this.gap == o.gap) {
			return this.value-o.value;
		}
		else {
			return this.gap-o.gap;
		}
	}
}

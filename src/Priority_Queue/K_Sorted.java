package Priority_Queue;

import java.util.PriorityQueue;

public class K_Sorted {
	
	public static void main(String[] args) {
		// time complexity is O(nlogk)
		int arr[] = { 2, 3, 1, 9, 6, 8 };
		int k = 3;
		ksort(arr, k);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void ksort(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int i=0;
		
		for (i = 0; i < k; i++) {
			pq.add(arr[i]);
		}
		for(;i<arr.length;i++) {
			arr[i-k] = pq.remove();
			pq.add(arr[i]);
		}
		
		for(i=arr.length-k;i<arr.length;i++) {
			arr[i] = pq.remove();
		}
		
		

	}

}

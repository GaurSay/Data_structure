package arrays;

import java.util.Arrays; 

public class Kth_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7, 10, 4, 3, 20, 15};
		int k = 4;
		System.out.println("Kth min value: " + Kth_min(arr,k).key);
		System.out.println("Kth min value: " + Kth_min(arr,k).value);
	}

	private static Pair<Integer> Kth_min(int[] arr,int k) {
		Arrays.sort(arr);
		return new Pair<Integer>(arr[k-1],arr[arr.length-k]);
	}

}

class Pair<T>{
	T key;
	T value;
	public Pair(T key, T value){
		this.key = key;
		this.value = value;
	}
	
	
}

package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class PairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr3[] = { 2, 1, -2, 2, 3 };
		int arr4[] = { 0, 0, 0, 0, 0 };
		System.out.println(pairSum(arr4,0));

	}
	private static int pairSum(int[] arr,int sum) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int count = 0;
		for (int i : arr) {
			if (hm.containsKey(sum - i)) {
				count += hm.get(sum - i);
			}
			if (hm.containsKey(i)) {
				hm.put(i, hm.get(i) + 1);
			} else {
				hm.put(i, 1);
			}
		}

		return count;

	}

}

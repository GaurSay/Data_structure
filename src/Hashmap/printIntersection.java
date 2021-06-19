package Hashmap;

import java.util.HashMap;

public class printIntersection {

	public static void main(String[] args) {
		int arr1[] = { 2, 6, 1, 2 };
		int arr2[] = { 1, 2, 3, 4, 2 };
		find(arr1, arr2);

	}

	private static void find(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i : arr1) {
			if (hm.containsKey(i)) {
				hm.put(i, hm.get(i) + 1);
			} else {
				hm.put(i, 1);
			}
		}
		System.out.println(hm);
		for (int i : arr2) {
			if (hm.containsKey(i) && hm.get(i) > 0) {
				System.out.print(i + " ");
				hm.put(i, hm.get(i) - 1);
			} else {
				hm.put(i, 1);
			}
		}
		return ;
	}


}

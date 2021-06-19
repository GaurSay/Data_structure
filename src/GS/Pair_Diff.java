package GS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Pair_Diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 2, 3, 80, 5, 20 };
		int k = 17;
		int arr2[] = { -1,-2,-3 };
		K_PAIR(arr2,1);

		Arrays.sort(arr);
		int i = 0;
		int j = i + 1;
		int count = 0;
		while (i < j) {
			if (arr[j] - arr[i] == k) {
				System.out.println(arr[i] + " " + arr[j]);
				break;
			} else if (arr[j] - arr[i] < k) {
				j++;
			} else {
				i++;
			}
		}
		
		
	}

	private static void K_PAIR(int arr[],int k) {
		Map<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
		}
		int count = 0;
		for (int x : hm.keySet()) {
			if ((k > 0 && hm.containsKey(x + k)) || (k == 0 && hm.get(x) > 1)) {
				count++;
			}
		}
		System.out.println(count);
	}

}

package Hashmap;
import java.util.HashMap;

public class MaxfreqNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 12, 11, 11, 12, 2, 1, 2, 2, 11, 12, 11, 6 };
		int arr2[] = {1 ,4, 5};
		int num = find(arr2);
		System.out.println(num);

	}

	private static int find(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int max = arr[0];
		int count = 0;
		for (int i : arr) {
			if (hm.containsKey(i)) {
				int value = hm.get(i) + 1;
				if(value> count) {
					count  =  value;
					max = i;
				}
				hm.put(i, value);
			} else {
				hm.put(i, 1);
			}
		}
		System.out.println(hm);
		System.out.println(max + " " + count);
		return 0;
	}

}

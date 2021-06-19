package arrays;

import java.util.ArrayList;

// First and last occurrences of x
public class GFG_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 };
		int n = arr.length;
		first_last_occ(arr, n, 5);
		int arr2[] = { 15, 2, 45, 12, 7 };
		valueEqualToIndex(arr2);
	}

	// Fix point in array //
	private static void valueEqualToIndex(int arr[]) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (i + 1 <= arr.length && arr[i] == i + 1) {
				list.add(i + 1);
			}
		}
	}

	private static void first_last_occ(int arr[], int n, int x) {
		int first = -1;
		int last = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] == x) {
				if (first == -1) {
					first = i;
				}
				last = i;
			}
		}
		System.out.println("first :" + first);
		System.out.println("last :" + last);
	}

}

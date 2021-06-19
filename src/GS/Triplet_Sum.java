package GS;

import java.util.Arrays;

public class Triplet_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		Arrays.sort(arr);
		int sum = 12;
		int arr_size = arr.length;

		find3Numbers(arr, arr_size, sum);
	}

	private static void find3Numbers(int[] arr, int n, int sum) {

		for (int i = 0; i < n - 2; i++) {
			int l = i + 1;
			int r = n - 1;

			while (l < r) {
				if (arr[i] + arr[l] + arr[r] == sum) {
					System.out.print(arr[i] + " " + arr[l] + " " + arr[r]);
					System.out.println();
					l++;
				} else if (arr[i] + arr[l] + arr[r] < sum) {
					l++;
				} else {
					r--;
				}
			}
		}

	}

}

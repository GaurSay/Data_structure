package GS;

import java.util.Arrays;

public class max_product_of_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,-7,4,5,6,-8};
		int n = arr.length;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int p1 = arr[0]*arr[1]*arr[n-1];
		int p2 = arr[n-3]*arr[n-2]*arr[n-1];
		int ans = p1<p2 ? p2:p1;
		System.out.println(ans);
	}

}

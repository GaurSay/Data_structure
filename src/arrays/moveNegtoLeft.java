package arrays;

import java.util.Arrays;

public class moveNegtoLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		moveNeg(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	private static void moveNeg(int[] arr) {
		// 
		int neg = arr.length-1;
		for(int i=0;i<=neg;i++) {
			if(arr[i]>=0) {
				int temp = arr[neg]; 
				arr[neg] = arr[i];
				arr[i] = temp;
				i--;
				neg--;
			}
		}
	}
}

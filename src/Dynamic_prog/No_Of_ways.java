package Dynamic_prog;

import java.util.HashMap;

public class No_Of_ways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		// coins 1,2,3
		System.out.println(NumOfWays(4));
		System.out.println(DP(4));
		
		
	}

	private static int NumOfWays(int n) {
		if(n<0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}
		return NumOfWays(n-1)+NumOfWays(n-2)+NumOfWays(n-3);
	}
	private static int DP(int n) {
		if(n ==0 || n==1) {
			return 1;
		}
		if(n==2) {
			return 2;
		}
		int arr[] = new int[n+1];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 2;
		for (int i = 3; i < arr.length; i++) {
			arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
		}
		return arr[n];
	}
}

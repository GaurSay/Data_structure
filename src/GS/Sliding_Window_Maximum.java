package GS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Sliding_Window_Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int aa[][] = {{1,2},{3,4}};
		int k = 3; 
		Arrays.sort(arr);
		
//		System.out.println(Arrays.toString(arr));
//		Brute force 
//		for (int i = 0; i <= arr.length-k; i++) {
//			int max = arr[i];
//			
//			for(int j =1;j<k;j++) {
//				if (arr[i + j] > max)
//                    max = arr[i + j];
//			}
//			System.out.print(max+" ");
//		}
		method2();

	}
	private static void method2() {
		//doesnt need to be sorted //
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int n= arr.length;
		int k = 3;
		Stack<Integer> stack = new Stack<>();
		stack.add(n-1);
		int nge[]= new int[arr.length];
		nge[n-1] = n;
		
		for(int i =n-2;i>=0;i--) {
			while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]) {
				stack.pop();
			}
		
			if (!stack.isEmpty()) {
				nge[i] = stack.peek();
			} else {
				nge[i] = n;
			}
			stack.push(i);
		}
//		for (int i = 0; i < nge.length; i++) {
//			System.out.print(nge[i]+" ");
//		}
		
		for (int i = 0; i <= n-k; i++) {
			int j =i;
			//if  inside loop //
			while(nge[j]<i+k) {
				j = nge[j];
			}
			System.out.print(arr[j]+" ");
			
		}
		
	}

}

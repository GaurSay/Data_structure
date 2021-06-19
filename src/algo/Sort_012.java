package algo;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sort_012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =  {2,1, 0, 1, 2,0};
	   	    
//		sort012(arr);
		sorting(arr);
		System.out.println(Arrays.toString(arr));
		//Dutch National Flag Algorithm OR 3-way Partitioning:
		// At first, the full array is unknown. 
		// There are three indices – low, mid and high. Initially, the value of low = mid = 1 and high = N.
		
	}

	private static void sort012(int[] arr) {
		// 
		int low = 0;
		int mid = 0;
		int high = arr.length-1;
		while(mid<=high) {
			switch (arr[mid]) {
			case 0 :
				swap(arr,low,mid);
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				swap(arr,high,mid);
				high--;
				break;
			}
				
					
		}
	}
	
	private static void sorting(int arr[]) {
		int low =0;
		int mid=0;
		int high =arr.length-1;
		
		while(mid<=high) {
			switch (arr[mid]) {
				case 0:
					swap(arr,low,mid);
					low++;
					mid++;
					break;
				case 1:
					mid++;
					break;
				case 2:
					swap(arr,mid,high);
					high--;
					break;
			}					
		}
	}
	
	private static void swap(int arr[],int a,int b) {
		int k = arr[a];
		arr[a] = arr[b];
		arr[b] = k;
	}

}

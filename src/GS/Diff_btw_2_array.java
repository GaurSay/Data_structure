package GS;

import java.util.Arrays;

public class Diff_btw_2_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {2, 4, 5, 7, 8, 10, 12, 15};
		int arr2[] = {5, 8, 11, 12, 14, 15};
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int m = arr1.length;
		int n = arr2.length;
		
		int i =0;
		int j =0;
		while(i<m && j<n) {
			if(arr1[i]<arr2[j]) {
				System.out.print(arr1[i]+" ");
				i++;
			}
			else if(arr1[i] > arr2[j]) {
				System.out.print(arr2[j]+" ");
				j++;
			}
			else {
				i++;
				j++;
			}
		}
		
		while(i<m) {
			System.out.print(arr1[i]+" ");
			i++;
		}
		while(j<n) {
			System.out.print(arr2[j]+" ");
			j++;		
		}
		
		
		
	}

}

package GS;

import java.util.Arrays;

public class max_interval_overlap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 9, 5, 5 };
		int exit[] = { 4, 5, 12, 9, 12 };

		Arrays.sort(arr);
		Arrays.sort(exit);	

		int i = 1;
		int j = 0;
		int count =1;
		int max =1;
		int time =arr[0];
		while (i < arr.length && j < exit.length) {
			if (arr[i] <= exit[j]) {
				count++;
				
				if(count>max) {
					time = arr[i];
					max = count;
				}
				i++;
			}
			else {
				count--;
				j++;
			}
			

		}
		System.out.println(time);
		System.out.println(max);
	}

}

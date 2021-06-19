package GS;

import java.util.Arrays;

public class Minimize_max_diff_btw_heights {
	
	
	//	Given heights of n towers and a value k. We need to either increase or decrease height of every tower by k (only once) where k > 0. The task is to minimize the difference between the heights of the longest and the shortest tower after modifications, and output this difference.
	//	Examples: 
	//
	//	Input  : arr[] = {1, 15, 10}, k = 6
	//	Output :  Maximum difference is 2.
	//	Explanation : We change 1 to 7, 15 to 
	//	9 and 10 to 4. Maximum difference is 5
	//	(between 7 and 9). We can't get a lower
	//	difference.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[] = {1, 10, 14, 14, 14, 15};
//		int arr[]= {5,5,8,6,4,10,3,8,9,10};
		int arr[] = {6, 1, 9, 1, 1, 7, 9, 5, 2, 10};
        int k = 4;
        int n = arr.length;
        
        Arrays.sort(arr);
        
        int ans = arr[n-1]-arr[0];
        int big = arr[n-1]-k;
        int small = arr[0]+k;
        
        int temp = 0;
        
        if(small > big) {
        	
        	//swap
        	temp = big;
        	big = small;
        	small = temp;  	
        }
        
        // Traverse middle elements
        for (int i = 1; i < n-1; i ++)
        {
        	int sub = arr[i] -k;
        	int add = arr[i] +k;
        	
        	if(sub >= small || add <= big ) {
        		continue;
        	}
        	if(big-sub <= add-small ) {
        		small = sub;
        	}
        	else {
        		big = add;
        	}
        }
        
        System.out.println(Math.min(ans, big - small));
        

	}

}

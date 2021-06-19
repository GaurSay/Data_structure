package GS;

import java.util.Arrays;
import java.util.HashMap;

public class H_index {

	public static void main(String[] args) {
		
		int arr[] = {1,5,6,7,8};
//		int arr2[] = {3,0,6,1,5};
		int arr2[] = {6,5,4,2,1};
		Arrays.sort(arr2);
		System.out.println(find(arr2));
		
	}
	private static int find(int arr[]) {
		int n =arr.length;
        int low=0,high=n-1,mid;
        
        while(low<=high)
        {
            mid = (low+high)/2;
            if(arr[mid]==(n-mid))
                return arr[mid];
            else if(arr[mid]>(n-mid))
                high = mid-1;
            else
                low = mid+1;
        }
        return n-low;
	}
}


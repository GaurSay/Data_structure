package GS;

public class Reverse_Pairs {
	
	static int count = 0;

	public static void main(String[] args) {

		/* 
		 * 
		 * https://leetcode.com/problems/reverse-pairs/
		 * 
		 * 
		 * 	 Given an integer array nums, return the number of reverse pairs in the array.
 		     A reverse pair is a pair (i, j) where 0 <= i < j < nums.length and nums[i] > 2 * nums[j].
		 */
		
		int arr[] = {2,4,3,5,1};
		int arr2[] = {1,3,2,3,1};
		sort(arr,0,arr.length-1);
		System.out.println(count);

	}
	
	
	private static void sort(int[] arr,int s,int e) {
		if(s>=e) {
			return ;
		}
		int mid = (s+e)/2;
		sort(arr,s,mid);
		sort(arr,mid+1,e);
		merge(arr,s,e);
		
	}

	private static void merge(int[] arr, int s, int e) {
		if (s >= e) {
			return;
		}
		int ans[] = new int[e-s+1];
		int i =s;
		int mid = (s+e)/2;
		int j = mid+1;
		int k =0;
		int x = s;
		for(int z = j ; z<=e ; z++) {
			while(x<=mid && arr[x] <= 2* arr[z]) {
				x++;
			}
			count  += mid - x +1;
		}
		
		while(i<=mid && j<=e) {
			if(arr[i] < arr[j]) {
				ans[k] = arr[i];
				k++;
				i++;
			}
			else {
				ans[k] = arr[j];
				k++;
				j++;
			}
		}
		while(i<=mid) {
			ans[k] = arr[i];
			k++;
			i++;
		}
		while(j<=e) {
			ans[k] = arr[j];
			k++;
			j++;
		}
		for(i =0; i<ans.length; i++){
			arr[s+i] = ans[i];
		}
			
	}

}

package GS;

public class first_last_occurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,2,2,4,5};
		int target = 2;
		int ans[]= new int[2];
		ans = find(arr,target);
		System.out.println("first: " +ans[0]);
		System.out.println("last: " +ans[1]);
	}

	private static int[] find(int[] arr, int target) {
		
		int ans[] = {-1,-1};
		
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid  = (low+high)/2;
			if(arr[mid] == target) {
				ans[0] = mid;
				high = mid-1;
			}
			else if(target < arr[mid]) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		
		
		low = 0;
		high = arr.length-1;
		
		while(low<=high) {
			int mid  = (low+high)/2;
			if(arr[mid] == target) {
				ans[1] = mid;
				low = mid+1;
			}
			else if(target < arr[mid]) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		return ans;	
	}
}

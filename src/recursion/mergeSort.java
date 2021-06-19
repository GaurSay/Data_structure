package recursion;

public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {2,6,8,5,4,3};
			sort(arr,0,arr.length-1);
			for(int i : arr) {
				System.out.print(i+" ");
			}
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
	
	private static void merge(int[] arr,int s,int e) {
		int mid = (s+e)/2;
		int ans[]=new int[e-s+1];
		int i=s;
		int j=mid+1;
		int k =0;
		while(i<=mid && j<=e) {
			if(arr[i] < arr[j]) {
				ans[k] =arr[i];
				i++;
				k++;
			}
			else {
				ans[k] =arr[j];
				j++;
				k++;
			}
		}
		while(i<=mid) {
			ans[k] =arr[i];
			i++;
			k++;
		}
		while(j<=e) {
			ans[k] =arr[j];
			j++;
			k++;
		}
		for(i=0;i<ans.length;i++) {
			arr[s+i]=ans[i];
		}
		
		
			
	}
}

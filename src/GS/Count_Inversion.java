package GS;

public class Count_Inversion {
	static int c = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =  {5,3,2,4,1};
		int[] arr2 = {8, 4, 2, 1};
		sort(arr2,0,arr2.length-1);
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
		System.out.println(c);
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
				c = c + (mid-i+1);
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

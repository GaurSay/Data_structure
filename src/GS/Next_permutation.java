package GS;

public class Next_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,5,4,2};
		int a[]= {2,1,3,9};
		print_next(arr);
		print_next(a);
	}

	private static void print_next(int[] arr) {
		int n = arr.length;
		if(arr ==null  || n <=1) {
			return ;
		}
		int i = n-2;
		
		int index1 = n;
		while(i>=0 && arr[i]>=arr[i+1]) {
			i--;
		}
		if(i>=0) {
			int j = n-1;
			while(arr[j]<=arr[i]) {
				j--;
			}
//			swap // 
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		// reverse after index1;

		reverse(arr,i+1,n-1);
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		
	}
	private static void reverse(int arr[],int l, int r) {
		while(l<r) {
			int t = arr[l];
			arr[l] = arr[r];
			arr[r] = t;
			l++;
			r--;
		}
	}

}

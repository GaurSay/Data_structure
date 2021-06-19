package GS;

public class special_product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		
		findProduct(arr);
	}

	private static void findProduct(int[] arr) {
		int n = arr.length;
		int left[] = new int[n];
		int right[] = new int[n];
		int output[] = new int[n];
		
		//left sum
		for(int i =0;i<n;i++) {
			if(i==0) {
				left[i] = arr[i];
			}
			else {
				left[i] = left[i-1]*arr[i];
			}
		}
		
		//right sum
		for(int i=n-1;i>=0;i--) {
			if(i == n-1) {
				right[i] = arr[i];
			}
			else {
				right[i] = right[i+1]*arr[i];
			}
		}
		// output
		for(int i=0;i<n;i++) {
			int l =1;
			int r =1;
			if(i-1>=0) {
				l = left[i-1];
			}
			if(i+1<n) {
				r = right[i+1];
			}
			output[i] = l*r;
		}
		
		
		for (int i = 0; i < left.length; i++) {
			System.out.print(left[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < left.length; i++) {
			System.out.print(right[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < left.length; i++) {
			System.out.print(output[i]+" ");
		}
		
	}

}

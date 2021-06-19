package algo;

public class even_odd_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {9,3,8,6,7,2,3};
		int arr[] = {9,3,1,7,9,1,8};
		int i=0;
		int j =0;
		while(i<arr.length) {
			// if even
			if(arr[i]%2==0) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
				j++;
			}
			//if odd
			else {
				i++;
			}
		}
		for ( i= 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}

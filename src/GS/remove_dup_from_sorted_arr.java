package GS;

public class remove_dup_from_sorted_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,1,2,2,2,2,2,3,3,4,5,5,5};
		int n = arr.length;
		int i =0;
		int j = i+1;
		while(i<j && j<n) {
			if(arr[i]==arr[j]) {
				j++;
			}
			else {
				i++;
				arr[i]= arr[j];
			}
		}
		for (int x=0;x<=i;x++) {
			System.out.print(arr[x]+" ");
		}
	}

}

package arrays;

public class secondLagest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		find(arr);
		
	}
	
	public static void find(int arr[]) {
		// TODO Auto-generated method stub
		int largest = Integer.MIN_VALUE;
		int Seclargest = Integer.MIN_VALUE;
		for(int i=0; i<arr.length ;i++) {
			if(arr[i]>largest) {
				Seclargest = largest ;
				largest = arr[i];
			}
			else if(arr[i] > Seclargest) {
				Seclargest = arr[i];
			}
		}
		System.out.println("largest : " +  largest);
		System.out.println("second largest : " + Seclargest );

	}
	


}

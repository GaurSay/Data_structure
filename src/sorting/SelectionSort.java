package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		sort(arr);
		printArray(arr);
	}

	private static void sort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int minIndex = i ;
			int min = arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;	
				}			
			}
			arr[i]= arr[minIndex];
			arr[minIndex] = min;
		}
	}

	/* Prints the array */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}

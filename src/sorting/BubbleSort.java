package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		int arr1[] = {4 ,3,2,1};
		
		bubbleSort(arr1);
		printArray(arr1);
	}
	static void bubbleSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			System.out.print("this is round " + i+" : ");
			for(int j=0;j<arr.length-i-1;j++) {
				System.out.print(j+" ");
				if(arr[j]>arr[j+1]) {
					int temp =  arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.println();
		}
	}
	
	/* Prints the array */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}

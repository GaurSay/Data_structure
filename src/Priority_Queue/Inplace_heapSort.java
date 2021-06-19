package Priority_Queue;

public class Inplace_heapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 1, 9, 2, 0, 6 };
		int n = arr.length;

		for (int i = 0; i < arr.length; i++) {
			buildHeap(arr, i);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			arr[n-i-1] = removeMin(arr, n - i);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static int removeMin(int[] arr, int heapsize) {
		int element = arr[0];
		arr[0] = arr[heapsize - 1];
		heapsize--;
		int parentIndex = 0;
		int minIndex = parentIndex;
		int l = (2 * parentIndex) + 1;
		int r = (2 * parentIndex) + 2;

		while (l < heapsize) {
			if(arr[l] < arr[minIndex]) {
				minIndex = l;
			}
			if(r<heapsize && arr[r] < arr[minIndex]) {
				minIndex = r;
			}
			if(minIndex!=parentIndex) {
				int t = arr[minIndex];
				arr[minIndex] = arr[parentIndex];
				arr[parentIndex] = t;
				parentIndex = minIndex;
				l = (2 * parentIndex) + 1;
				r = (2 * parentIndex) + 2;
			}
			else {
				break;
			}	
		}
		return element;

	}

	private static void buildHeap(int[] arr, int i) {
		int childIndex = i;
		int parentIndex = (childIndex - 1) / 2;

		while (childIndex > 0) {
			if (arr[childIndex] < arr[parentIndex]) {
				int temp = arr[childIndex];
				arr[childIndex] = arr[parentIndex];
				arr[parentIndex] = temp;
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else {
				break;
			}
		}
	}

}

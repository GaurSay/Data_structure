package Priority_Queue;

public class HeapSort {

	public static void main(String[] args) {
		int arr[] = { 7, 6, 5, 4, 3, 2, 1 };
		int n = arr.length;
		buildHeap(arr, n);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void buildHeap(int[] arr, int n) {
		// i-1 /2 = n-1-1 /2 = n-2 /2 = n/2 -1
		int startIndex = (n / 2) - 1;

		for (int i = startIndex; i >= 0; i--) {
			heapify(arr, n, i);
		}

		// sort
		for (int i = n - 1; i > 0; i--) {
			int t = arr[0];
			arr[0] = arr[i];
			arr[i] = t;
			heapify(arr, i, 0);
		}
	}

	private static void heapify(int arr[], int n, int i) {
		int largest = i;
		int left = (2 * i) + 1;
		int right = (2 * i) + 2;

		if (left < n && arr[left] > arr[largest]) {
			largest = left;
		} 
		if (right < n && arr[right] > arr[largest]) {
			largest = right;
		}
		if (largest != i) {
			int t = arr[largest];
			arr[largest] = arr[i];
			arr[i] = t;
			heapify(arr, n, largest);
		}

	}
	
	private static void heapify2(int arr[], int n, int i) {
		int smallest = i;
		int left = (2 * i) + 1;
		int right = (2 * i) + 2;

		if (left < n && arr[left] < arr[smallest]) {
			smallest = left;
		} 
		if (right < n && arr[right] < arr[smallest]) {
			smallest = right;
		}
		if (smallest != i) {
			int t = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = t;
			heapify(arr, n, smallest);
		}
	}

}

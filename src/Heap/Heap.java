package Heap;

public class Heap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		int n = arr.length;
		buildHeap(arr, n);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void buildHeap(int[] arr, int n) {

		int startIndex = n / 2 - 1;

		// build max heap;
		for (int i = startIndex; i >= 0; i--) {
			heapify(arr, n, i);
		}

		// to sort
		for (int i = n - 1; i > 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
		}

	}

	private static void heapify(int[] arr, int n, int i) {
		int largest = i;
		int l = (2 * i) + 1;
		int r = (2 * i) + 2;

		if (l < n && arr[l] > arr[largest]) {
			largest = l;
		}
		if (r < n && arr[r] > arr[largest]) {
			largest = r;
		}
		if (largest != i) {
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
			heapify(arr, n, largest);
		}

	}

}

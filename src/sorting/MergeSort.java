package sorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 4, 3, 2, 1 };
		merge_sort(arr, 0, arr.length-1);
		printArray(arr);

	}

	private static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private static void merge_sort(int[] arr, int s, int e) {
		if (s >= e) {
			return;
		}
		int mid = (s + e) / 2;
		merge_sort(arr, s, mid);
		merge_sort(arr, mid+1, e);
		merge(arr, s, e);
	}

	private static void merge(int[] arr, int s, int e) {
		if (s >= e) {
			return;
		}
		int mid = (s + e) / 2;
		int ans[] = new int[e - s + 1];
		int k = 0;
		int i = s;
		int j = mid + 1;
		while (i <= mid && j <= e) {
			if (arr[i] < arr[j]) {
				ans[k] = arr[i];
				i++;
			} else {
				ans[k] = arr[j];
				j++;
			}
			k++;
		}
		while (i <= mid) {
			ans[k] = arr[i];
			i++;
			k++;
		}
		while (j <= e) {
			ans[k] = arr[j];
			j++;
			k++;
		}
		
		for (int x = 0; x < ans.length; x++) {
			arr[x+s] = ans[x];
		}
	}

}

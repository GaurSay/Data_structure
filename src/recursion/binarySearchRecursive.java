package recursion;

public class binarySearchRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int x = 7;
		System.out.println(find(arr, x));
	}

	private static int find(int[] arr, int x) {
		return findHelper(arr, 0, arr.length - 1, x);
	}

	private static int findHelper(int[] arr, int s, int e, int x) {
		if (s > e) {
			return -1;
		}
		int mid = (s + e) / 2;

		if (arr[mid] == x) {
			return mid;
		}
		if (arr[mid] <= x) {
			return findHelper(arr, mid + 1, e, x);
		} else {
			return findHelper(arr, s, mid - 1, x);
		}
	}

}

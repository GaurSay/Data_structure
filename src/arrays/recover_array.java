package arrays;

public class recover_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 3, 2, 4, 1, 5 };
		int arr2[] = { 3, 4, 2, 5, 1, 6 };
		int ans[] = recover(arr1);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	private static int[] recover(int[] arr) {
		// solution
		int ans[] = new int[arr.length];
		int n = arr.length;
		int left, right;

		int mid = n / 2;
		int i = 0;
		if (n % 2 != 0) {
			ans[mid] = arr[i];
			left = mid - 1;
			right = mid + 1;
			i++;
		} else {
			left = mid - 1;
			right = mid;
		}

		while (i < n) {
			ans[left] = arr[i];
			left--;
			i++;
			ans[right] = arr[i];
			right++;
			i++;
		}
		return ans;
	}
}

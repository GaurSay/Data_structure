package Dynamic_prog;

import java.util.Arrays;

public class min_cost_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 3, 4, 1, 2 }, { 2, 1, 8, 9 }, { 4, 7, 8, 1 } };
		int m = arr.length;
		int n = arr[0].length;
//		System.out.println(findMin(arr, m - 1, n - 1));

		int dp[][] = new int[m][n];

		Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));

//		System.out.println(memoization(arr, m - 1, n - 1, dp));
		DP(arr, m - 1, n - 1);

	}

	private static void DP(int arr[][], int m, int n) {

		int ans[][] = new int[m + 1][n + 1];
		ans[0][0] = arr[0][0];

		// first row
		for (int j = 1; j < ans[0].length; j++) {
			ans[0][j] = ans[0][j - 1] + arr[0][j];
		}

		// first col
		for (int i = 1; i < ans.length; i++) {
			ans[i][0] = ans[i - 1][0] + arr[i][0];
		}

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				ans[i][j] = arr[i][j] + Math.min(Math.min(ans[i - 1][j], ans[i][j - 1]), ans[i - 1][j - 1]);
			}
		}
		System.out.println(ans[m][n]);

	}

	private static int findMin(int[][] arr, int i, int j) {
		if (i == 0 && j == 0) {
			return arr[i][j];
		}

		if (i < 0 || j < 0) {
			return Integer.MAX_VALUE;
		}

		int up = findMin(arr, i - 1, j);
		int diagonal = findMin(arr, i - 1, j - 1);
		int left = findMin(arr, i, j - 1);
		return arr[i][j] + Math.min(Math.min(up, diagonal), left);

	}

	private static int memoization(int[][] arr, int i, int j, int dp[][]) {
		if (i == 0 && j == 0) {
			return arr[i][j];
		}

		if (i < 0 || j < 0) {
			return Integer.MAX_VALUE;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}

		int up = memoization(arr, i - 1, j, dp);
		int diagonal = memoization(arr, i - 1, j - 1, dp);
		int left = memoization(arr, i, j - 1, dp);

		int ans = arr[i][j] + Math.min(Math.min(up, diagonal), left);
		dp[i][j] = ans;

		return ans;

	}

}

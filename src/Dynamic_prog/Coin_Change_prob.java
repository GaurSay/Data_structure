package Dynamic_prog;

import java.util.Arrays;

public class Coin_Change_prob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 18;
		int arr[] = { 7, 5, 1 };
		int dp[] = new int[n + 1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		System.out.println(minCoins(n, arr, dp));
		System.out.println(basicminCoins(n, arr));

		System.out.println(DP(arr, n));
//		int a[]= {1,2,3};
//		System.out.println(DP(a,5));;

	}

	private static int DP(int coins[], int V) {
		int table[] = new int[V + 1];
		int m = coins.length;

		// Base case (If given value V is 0)
		table[0] = 0;

		// Initialize all table values as Infinite
		for (int i = 1; i <= V; i++)
			table[i] = Integer.MAX_VALUE;

		// Compute minimum coins required for all
		// values from 1 to V
		for (int i = 1; i <= V; i++) {
			// Go through all coins smaller than i
			for (int j = 0; j < m; j++) {
				if (coins[j] <= i) {
					int sub_res = table[i - coins[j]];
					if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i])
						table[i] = sub_res + 1;
				}
			}
		}
		for (int i = 0; i < table.length; i++) {
			System.out.print(table[i] + " ");
		}
		System.out.println();

		if (table[V] == Integer.MAX_VALUE)
			return -1;

		return table[V];

	}

	private static int minCoins(int n, int arr[], int dp[]) {
		if (n == 0) {
			return 0;
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {

			// only for greater than 0
			if (n - arr[i] >= 0) {
				int subAns = 0;

				if (dp[n - arr[i]] != -1) {
					subAns = dp[n - arr[i]];
				} else {
					subAns = minCoins(n - arr[i], arr, dp);
				}

				if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
					ans = subAns + 1;
				}
			}

		}
		dp[n] = ans;
		return ans;
	}

	private static int basicminCoins(int n, int arr[]) {
		if (n == 0) {
			return 0;
		}

		int ans = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] <= n) {
				int subAns = basicminCoins(n - arr[i], arr);
				if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
					ans = subAns + 1;
				}
			}
		}
		return ans;
	}

}

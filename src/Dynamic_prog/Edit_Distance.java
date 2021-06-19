package Dynamic_prog;

public class Edit_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "sunday";
		String b = "saturday";
//		int ans = editDistanceRecursion(a, b, a.length(), b.length());
		int ans = DP(a, b, a.length(), b.length());
		System.out.println(ans);

	}

	private static int DP(String a, String b, int m, int n) {
		
	int T[][] = new int[m+1][n+1];
	T[0][0] = 0;
	
	for(int i=1;i<n+1;i++) {
		T[0][i] = i;
	}
	
	for(int i=1;i<m+1;i++) {
		T[i][0] = i;
	}
	
	for(int i=1;i<T.length;i++) {
		for (int j = 1; j < T[0].length; j++) {
			if(a.charAt(i-1)!=b.charAt(j-1)) {
				T[i][j] = 1+  Math.min(T[i-1][j], Math.min(T[i][j-1], T[i-1][j-1]));
			}
			else {
				T[i][j] = T[i-1][j-1];
			}
			
			System.out.print(T[i][j]+" ");
		}
		System.out.println();
	}
		return T[m][n];
	}

	private static int editDistanceRecursion(String a, String b, int m, int n) {

		if (m == 0 || n == 0) {
			return m == 0 ? n : m;
		}

		// if last char is same
		if (a.charAt(m - 1) == b.charAt(n - 1)) {
			return editDistanceRecursion(a, b, m - 1, n - 1);
		}

		// if last char is not same , try all 3 operations , insert, remove and replace
		// O(3^n)
		int insert = editDistanceRecursion(a, b, m, n - 1);

		int delete = editDistanceRecursion(a, b, m - 1, n);

		int replace = editDistanceRecursion(a, b, m - 1, n - 1);

		return 1 + Math.min(insert, Math.min(delete, replace));

	}

}

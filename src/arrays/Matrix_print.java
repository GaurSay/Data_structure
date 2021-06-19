package arrays;

public class Matrix_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
	int i=0;
//	k - starting row index
	int k=0;
	
//	m - ending row index
	int m=arr1.length;
	
//	l - starting column index
	int l=0;
	
//	n - ending column index
	int n = arr1[0].length;
	while (k < m && l < n) {
        // Print the first row from the remaining rows
        for (i = l; i < n; i++) {
            System.out.print(arr1[k][i] + " ");
        }
        k++;

        // Print the last column from the remaining
        // columns
        for (i = k; i < m; ++i) {
            System.out.print(arr1[i][n - 1] + " ");
        }
        n--;

        // Print the last row from the remaining rows */
        if (k < m) {
            for (i = n - 1; i >= l; --i) {
                System.out.print(arr1[m - 1][i] + " ");
            }
            m--;
        }

        // Print the first column from the remaining
        // columns */
        if (l < n) {
            for (i = m - 1; i >= k; --i) {
                System.out.print(arr1[i][l] + " ");
            }
            l++;
        }
    }
	}

}

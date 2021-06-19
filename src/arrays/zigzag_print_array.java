package arrays;

public class zigzag_print_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 5, 9, 13 }, { 2, 6, 10, 14 }, { 3, 7, 11, 15 }, { 4, 8, 12,16} };
		int arr2[][] = { { 0,0 }};
		print(arr2);

	}


	private static void print(int[][] arr) {
		int col = arr[0].length;
		int row = arr.length;
		int k = 0;
		while (k < col) {
			if (k % 2 == 0) {
				for (int i = 0; i < row; i++) {
					System.out.print(arr[i][k]+ " ");
				}
			} else {
				for (int i = row - 1; i >= 0; i--) {
					System.out.print(arr[i][k] +" ");
				}
			}
			k++;
		}

	}

}

package GS;

public class max_ones_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = {{0,1,1,1},{0,0,1,1},{0,1,1,1},{0,0,0,0}};
		
		// find row with max 1's
		
		find(matrix);
	}

	private static void find(int[][] arr) {
		
		int i = 0;
		int n = arr[0].length;
		int j = n-1;
		int max = 1;
		
		while(i<arr.length && j>=0) {
			if(arr[i][j]==1) {
				if(n-j>max) {
					max = n-j;
				}
				j--;
			}
			else {
				i++;
			}
		}
		System.out.println(max);
		
	}

}

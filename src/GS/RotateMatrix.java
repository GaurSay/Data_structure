package GS;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		print(matrix);
		System.out.println("            ");
//		RightRotate(matrix);
		LeftRotate(matrix);
		print(matrix);
		
		
	}

	private static void RightRotate(int[][] matrix) {
		// Transpose of matrix
		for (int  i= 0;  i < matrix.length; i++) {
			for (int j = i; j < matrix.length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	
		for (int  i= 0;  i < matrix.length; i++) {
			for (int j = 0 ; j < matrix.length/2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length-j-1];
				matrix[i][matrix.length-j-1] = temp;
			}
		}
		
	}
	
	private static void LeftRotate(int[][] matrix) {
		// Transpose of matrix
		for (int  i= 0;  i < matrix.length; i++) {
			for (int j = i; j < matrix.length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
//		print(matrix);
		System.out.println( "  ");
		for (int  i= 0;  i < matrix.length; i++) {
			for (int j = 0 ; j < matrix.length/2; j++) {
				int temp = matrix[j][i];
				matrix[j][i] = matrix[matrix.length-j-1][i];
				matrix[matrix.length-j-1][i] = temp;
			}
		}
		
	}
	
	private static void print(int matrix[][]) {
		for (int  i= 0;  i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}

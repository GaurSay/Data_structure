package GS;

public class search_2D_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Every row sorted and next row starting after that
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
		
		findElement1(matrix,13);
		
		//Every row sorted and every column sorted
		int arr2[][] = {{1,4,7,11,15},{2,5,8,12,20},{4,6,9,16,22},{10,13,14,17,24},{18,21,20,26,30}};
		
		findElement2(arr2,13);
		
	}

	// max TC - O(2*n)
	private static void findElement2(int[][] matrix,int target) {
		int n = matrix.length;
		int row = 0;
		int col = n-1;
		while(row<n && col>0) {
			if(matrix[row][col] == target) {
				System.out.println(row +" "+col);
				break;
			}
			else if(matrix[row][col] > target) {
				col--;
			}
			else {
				row++;
			}
		}
		
	}

	
	// TC -- O(2* log(n))
	private static void findElement1(int[][] matrix,int target) {
		int low = 0;
		int high = matrix.length-1;
		int mid = 0 ;
		
		// first find row 
		while(low<=high) {
			mid = (low + high )/2;
			if(target >= matrix[mid][0] && target <= matrix[mid][matrix[mid].length-1]) {
				break;
			}
			else if(target < matrix[mid][0]) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		int row = mid;
		low = 0;
		high = matrix[mid].length-1;
		
		//find element in that row //
		while(low<=high) {
			mid = (low + high )/2;
			if(target == matrix[row][mid]) {
				System.out.println(row +" " +mid);
				break;
			}
			else if(target < matrix[row][mid]) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		
	}

}

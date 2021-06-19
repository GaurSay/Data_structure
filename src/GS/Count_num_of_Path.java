package GS;

public class Count_num_of_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,3,1},{1,5,1},{4,2,1}};
		
		 int b[][] ={{1, 0, 1, 1, 1},
				     {1, 0, 1, 0, 1},
				     {1, 1, 1, 0, 1},
				     {0, 0, 0, 0, 1}};
		
		int i =2;
		int j =2;
//		int count = countPaths(i,j);
//		System.out.println(min_path_sum(arr,0,0));
//		System.out.println(method2(arr,arr.length-1,arr[0].length-1));
		System.out.println(Dynamic(b));
	}
	
	private static int Dynamic(int arr[][]) {
		int m = arr.length;
		int n = arr[0].length;
		int ans[][] = new int[m][n];
		
		ans[0][0] = arr[0][0];
		// first column
		for(int i=1; i<m;i++) {
			ans[i][0] = ans[i-1][0] + arr[i][0];
		}
		// first row
		for(int i=1; i<n;i++) {
			ans[0][i] = ans[0][i-1] + arr[0][i];
		}
		//rest matrix
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				ans[i][j] = arr[i][j] + Math.min(ans[i-1][j], ans[i][j-1]);
			}
		}
		return ans[m-1][n-1];
		
	}
	
	private static int min_path_sum(int arr[][],int i,int j) {
		if(i>=arr.length || j>=arr[0].length) {
			return Integer.MAX_VALUE;
		}
		if(i==arr.length-1 && j==arr[0].length-1) {
			return arr[i][j];
		}
		int right = min_path_sum(arr,i+1,j);
		int down =  min_path_sum(arr,i,j+1);
		
		return arr[i][j] + Math.min(right,down);
		
	}
	
	private static int method2(int arr[][],int i,int j) 
	{
		 if(i<0 || j<0) {
				return Integer.MAX_VALUE;
			}
			if(i==0 && j==0) {
				return arr[i][j];
			}
			int left = method2(arr,i-1,j);
			int up =  method2(arr,i,j-1);
			
			return arr[i][j] + Math.min(left,up);
	}

 	private static int countPaths(int i, int j) {
		if(i<0 || j<0) {
			return 0;
		}
		if(i==0 && j==0) {
			return 1;
		}
		
		return countPaths(i-1,j) + countPaths(i,j-1);
		
		
	}

}

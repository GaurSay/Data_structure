package arrays;

public class CountPath2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[4][4];
		int a = 3;
		int b = 3;
		int count = find(arr,0,0,a,b);
		System.out.println(paths(3,3));
	}

	private static int find(int[][] arr,int i , int j, int a, int b) {
		if(i>a || j>b) {
			return 0;
		}
		if(i==a && j==b) {
			return 1;
		}
		int forward = find(arr,i,j+1,a,b);
		int down = find(arr,i+1,j,a,b);
		return forward+down;
	}
	private static int paths(int i , int j) {
		if(i==1 || j==1) {
			return 1;
		}
		return paths(i-1,j)+paths(i,j-1);
	}

}

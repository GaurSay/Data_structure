package GS;

public class Range_addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 5;
		// startIndex, EndIndex , Increment
		int arr[][] = {{1,3,2},{2,4,3},{0,2,-2}};
		
		int ans[] = find(arr,length);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}

	}

	private static int[] find(int[][] arr, int length) {
		int ans[] = new int[length];
	
		for (int i = 0; i < arr.length; i++) {
			int startIndex =  arr[i][0];
			int endIndex = arr[i][1];
			int inc = arr[i][2];
			ans[startIndex] += inc;
			if((endIndex+1)<length) {
				ans[endIndex+1] += -inc;
			}
		}
		int sum = 0;
		for (int i = 0; i < ans.length; i++) {
			sum  = sum + ans[i];
			ans[i] = sum;
		}
		return ans;
	}

}

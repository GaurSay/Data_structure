package Dynamic_prog;

public class ways_to_reach_nth_stair {

	public static void main(String[] args) {
		
	 int n =5;
	 // like fibonacci - (n-1) + (n-2)
	 System.out.println(countWaysDistinct(n));
	}

	private static int countWaysDistinct(int n) {
		if(n<=2) {
			return n;
		}
		int ans[] = new int[n+1];
		ans[0]= 0;
		ans[1]= 1;
		ans[2] =2;
		for (int i = 3; i < ans.length; i++) {
			ans[i] = ans[i-1]+ans[i-2];
		}
		
		return ans[n];
	
	}

}

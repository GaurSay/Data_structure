package Dynamic_prog;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
//		System.out.println(Fibo(3));
		System.out.println(optimized(8));
	}
	
	private static int optimized(int n) {
		if(n<=1) {
			return 1;
		}
		int ans[] = new int[n+1];
		ans[0]=0;
		ans[1]=1;
		for(int i=2;i<=n;i++) {
			ans[i] = ans[i-1]+ans[i-2];
		}	
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
		System.out.println();
		
		return ans[n];
		
		
	}
	
	
	// Recursive solution 
	private static int Fibo(int n) {
		if(n<=1) {
			return n;
		}
		
		return Fibo(n-1)+Fibo(n-2);
	}

}

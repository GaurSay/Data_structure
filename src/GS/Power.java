package GS;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fastPow(3,4));
	}

	private static int findPower1(int a, int b) {
		if(b==0) {
			return 1;
		}
		return a*findPower1(a,b-1);		
	}
	
	private static int fastPow(int a, int b) {
		if(b==0) {
			return 1;
		}
		if(b%2==0) {
			return fastPow(a*a,b/2);
		}
		else {
			return a*fastPow(a,b-1);
		}	
	}
}

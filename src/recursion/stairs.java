package recursion;

public class stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
//		System.out.println(staircase(n));
		int x =123459870;
		System.out.println(findDigits(x));
	}

	private static int findDigits(int x) {
		if(x==0) {
			return 0; 
		}
		return 1+ findDigits(x/10);
	
	}

	public static int staircase(int n) {

		if (n < 0) {
			return 0;
		}
		if(n ==0 ) {
			return 1;
		}
		return staircase(n-1) + staircase(n-2) + staircase(n-3);
	}

}

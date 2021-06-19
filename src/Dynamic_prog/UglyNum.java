package Dynamic_prog;

public class UglyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =16;
//		System.out.println(isUgly(n));
		int count =150;
		int i =0;
		while(count>0) {
			i++;
			if(isUgly(i)) {
//				System.out.print(i+" ");
				count--;
			}
			
		}
		System.out.println(i);
		
		
	}

	private static boolean isUgly(int n) {
		while(n%2==0) {
			n=n/2;
		}
		while(n%3==0) {
			n=n/3;
		}
		while(n%5==0) {
			n=n/5;
		}
		return n ==1 ;
		
		
	}

}

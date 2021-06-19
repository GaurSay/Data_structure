package GS;

import java.util.HashSet;

public class prime_factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 89;
		HashSet<Integer> hs = new HashSet<>();
		
		while(n%2 == 0) {
			hs.add(2);
			n= n/2;
		}
		
		for(int i =3; i<=Math.sqrt(n); i+=2) {
			while(n%i==0) {
				hs.add(i);
				n=n/i;
			}
		}
		if(n>2) {
//			System.out.print(n);
			hs.add(n);
		}
		System.out.println(hs.size());
		System.out.println(hs);

	}

}

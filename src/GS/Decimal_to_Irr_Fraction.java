package GS;

public class Decimal_to_Irr_Fraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Convert given Decimal number into an irreducible Fraction
		
//		An irreducible fraction is a fraction in which numerator and 
//		denominator are co-primes i.e., they have no other common divisor other than 1. 
		
		double n = 2.50;
		
		// integer value
		double intVal = Math.floor(n);
		
		// fractional value
		double fVal = n-intVal;
		
		//Precision Value
		final long pVal = 1000000000;
		// calc gcd
		long gcdVal = GCD(Math.round(fVal*pVal),pVal);
	
		
		//calc num and den
//		long num = Math.round(fVal*pVal)/gcdVal;
		long num = Math.round(n*(pVal/gcdVal));
		long den = pVal/gcdVal;
		System.out.println(num+" "+den);
//		System.out.println((long)(intVal*den)+num+"/"+den);
		
		
	}
	
	
	private static long GCD(long a,long b){
		if(a==0) {
			return b;
		}
		if(b==0) {
			return a;
		}
		if(a<b) {
			return GCD(a,b%a);
		}
		else {
			return GCD(b,a%b);
		}
	}
}

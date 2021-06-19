package Basic;
import java.util.ArrayList;

public class trial {
	
	interface func{
		void foo();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			System.out.println("shubham");
			
			 // Declaring object of String type
	        ArrayList<String> gfgNames = new ArrayList<>();
	  
	        // Custom input elements to above object
	        gfgNames.add("Dean");
	        gfgNames.add("castee");
	        gfgNames.add("Dobert");
	  
	        // Creating object of Stream where Stream is created
	        // using arrayList and object as data source
//	        gfgNames.stream().
	        
	        // Print and display elemen
//	        gfgNames.stream().filter(s -> s.startsWith("D")).count();
	        trial t = new trial();
	        
	        operation add = (a,b) -> a+b;
	        operation mul = (a,b) -> a*b;
	        t.test(add,6,8);
	        t.test(mul,6,8);
	        func f = () -> System.out.println("hello");
	        f.foo();
	        
//	        System.out.println(mul.opp(3,6));
	        
	        
	        
	}
	private void test(operation o,int a,int b) {
		System.out.println(o.opp(a,b));
	}


}

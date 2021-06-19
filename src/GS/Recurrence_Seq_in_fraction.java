package GS;

import java.util.HashMap;

public class Recurrence_Seq_in_fraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StringBuilder ans = new StringBuilder();
		int num = 22;
		int den = 10;
		
		int q = num/den;
		int rem = num%den;
		ans.append(q);
		if(rem == 0) {
			System.out.println(ans);
		}
		else {
			ans.append(".");
			HashMap<Integer,Integer> hm = new HashMap<>();
			while(rem!=0) {
				if(hm.containsKey(rem)) {
					int len = hm.get(rem);
					ans.insert(len,"(");
					ans.append(")");
					break;
				}
				else {
					hm.put(rem,ans.length());
					rem = rem*10;
					q = rem /den;
					rem = rem % den;
					ans.append(q);
				}
			}	
			System.out.println(ans);
		}		
	}
}

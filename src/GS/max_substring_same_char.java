package GS;

public class max_substring_same_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "aabbbbcAAdddddceeeeeeee";
		find(s);
	}

	private static void find(String s) {
		int i =0;
		int max_length=0;
		int maxStart =0;
		int maxEnd =0;
		int j =1;
		while(j<s.length()) {
			if(s.charAt(j)!=s.charAt(j-1)) {
				if(j-i>max_length) {
					maxStart = i;
					maxEnd = j;
					max_length = j-i;
					i=j;
				}
				else {
					i=j;
					j++;
				}
			}
			else {
				j++;
			}
		}
//		System.out.println(j+" "+i+" "+max_length);
		if(j-i>max_length) {
			maxStart = i;
			maxEnd = j;
			max_length = s.length()-1;
		}
		System.out.println(s.substring(maxStart,maxEnd));
		
	}

}

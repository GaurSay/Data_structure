package GS;

public class largest_unique_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "BBBB";
		String s2 = "abcdabceb";
		find(s2);
		

	}
	private static void find(String str) {
		int n = str.length();
		if(n==0) {
			System.out.println("");
		}
		
		int lastIndex[] = new int[150];
		for(int i =0;i<lastIndex.length;i++){
           lastIndex[i] = -1;
        }
		int max_substringStart = 0;
		int max_SubstringEnd = 0;
		
		int currSubtringStart = 0;
		int max_length = 1;
		
		for(int i =0;i<str.length();i++) {
			char ch = str.charAt(i);
			//character has come before
			if(lastIndex[ch] >= currSubtringStart) {
				if(i - currSubtringStart > max_length) {
					max_substringStart = currSubtringStart;
					max_SubstringEnd = i-1;
					max_length =  i - currSubtringStart;
				}
				currSubtringStart = lastIndex[ch]+1;
			}
			lastIndex[ch] = i;
		}
		
		if(str.length() - currSubtringStart > max_length) {
			max_substringStart = currSubtringStart;
			max_SubstringEnd = str.length()-1;
			max_length =  str.length() - currSubtringStart;
		}
		System.out.println(str.substring(max_substringStart,max_SubstringEnd+1));
//		System.out.println(max_length);
	}

}

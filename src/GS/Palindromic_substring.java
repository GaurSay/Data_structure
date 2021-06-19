package GS;

public class Palindromic_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbbaaa";
		
		// for Odd length 
		int count = 0;
		int left =0;
		int right =0;
		
		for(int i =0;i<str.length();i++) {
			count++;
			left = i-1;
			right= i+1;
			while(left>=0 && right<str.length()) {
				if(str.charAt(left)==str.charAt(right)) {
					count++;
					left--;
					right++;
				}
				else {
					break;
				}
			}
		}
		
		// EVen length
		int mid1=0;
		int mid2=0;
		for(int i =0;i<str.length()-1;i++) {
			mid1=i;
			mid2=i+1;
			if(str.charAt(mid1)==str.charAt(mid2)) {
				count++;
				left =mid1-1;
				right=mid2+1;
				while(left>=0 && right<str.length()) {
					if(str.charAt(left)==str.charAt(right)) {
						count++;
						left--;
						right++;
					}
					else {
						break;
					}
				}
				
			}
		}
		
		System.out.println(count);
	}

}

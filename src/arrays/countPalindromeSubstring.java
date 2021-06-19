package arrays;

public class countPalindromeSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aba";
//		System.out.println(Ispalindrome("shubuhas"));
		System.out.println(countPalindromeSubstrings(s));
	}
	
	public static int countPalindromeSubstrings(String s) {
		// Write your code here
        int ans =0;
        for(int i =0;i<s.length();i++){
            for(int j = i+1 ; j<=s.length() ; j++){
                if(Ispalindrome(s.substring(i,j))){
//                	System.out.println(s.substring(i,j));
                    ans++;
                }
            }
        }
		return ans;
	}
    private static boolean Ispalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}

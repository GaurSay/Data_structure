package recursion;

public class ReplaceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abacd";
		char c1 = 'a';
		char c2 = 'x';
		System.out.println(replaceCharacter(s,c1,c2));
	}
	
	public static String replaceCharacter(String s, char c1, char c2) {
		if(s.length()==0) {
			return s;
		}
		String ans="";
		if(s.charAt(0) == c1) {
			return c2+replaceCharacter(s.substring(1,s.length()),c1,c2);
		}
		return s.charAt(0)+replaceCharacter(s.substring(1,s.length()),c1,c2);
	}

}

package recursion;

public class checkAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbaabbaa";
		System.out.println(check(s));
	}

	private static boolean check(String s) {
		if(s.length()==0) {
			return true;
		}
		if(s.charAt(0)=='a') {
			if(s.length()==1) {
				return true;
			}
			else if(s.charAt(1)=='a') {
				return check(s.substring(1));
			}
			else if(s.length()>=3 && s.substring(1,3).contentEquals("bb")) {
				return check(s.substring(3));
			}
			else {
				return false;
			}
			
		}
		return false;
	}

}

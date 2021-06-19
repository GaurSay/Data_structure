package GS;

public class faulty_keyboard {

	public static void main(String[] args) {
		
		String name = "shubham";
		String typed = "sshuubhaam";
		System.out.println(find(name,typed));
		System.out.println(find("aabbcc","aaabbb"));

	}
	
	private static boolean find(String name,String typed) {
		
		int i = 0;
		int j = 0;
		if(typed.length()<name.length()) {
			return false;
		}
		while(i<name.length() && j<typed.length()) {
			if(name.charAt(i) == typed.charAt(j)) {
				i++;
				j++;
			}
			else {
				if(i>0 && name.charAt(i-1) != typed.charAt(j)) {
					return false;
				}
				else {
					j++;
				}
			}
		}
		while(j<typed.length()) {
			if(typed.charAt(j)!=name.charAt(i-1)) {
				return false;
			}
			j++;
		}
		if(i<name.length()) {
			return false;
		}
		
		return true;
	}

}

package arrays;

public class checkPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcde";
		String b = "baedx";
//		System.out.println(find(a,b));
		print_permuatation("abc","");
	}

	private static boolean find(String a, String b) {
		// TODO Auto-generated method stub
		int arr[] = new int[150];
		for(int i =0;i<a.length();i++) {
			arr[a.charAt(i)]++;
		}
		for(int i =0;i<b.length();i++) {
			if(arr[b.charAt(i)]!=1) {
				return false;
			}
		}
		return true;
		
	}
	public static void print_permuatation(String s,String asf) {
		if(s.length()==0) {
			System.out.println(asf);
		}
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			String prev = s.substring(0,i);
			String after = s.substring(i+1);
			String rest = prev+after;
			print_permuatation(rest,asf+ch);
		}
	}

}

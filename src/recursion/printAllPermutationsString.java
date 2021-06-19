package recursion;

import java.util.ArrayList;

public class printAllPermutationsString {
	
	static ArrayList<String> list = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		
		helper(str, 0, str.length() - 1);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	private static void helper(String str, int l, int r) {
		if (l == r) {
//			System.out.println(str);
			list.add(str);
		} else {
			for (int i = l; i < r; i++) {
				str = swap(str,l,i);
				helper(str,l+1,r);
				str = swap(str,i,l);
			}
		}
	}

	private static String swap(String str, int i, int j) {
		char arr[] = str.toCharArray();
		char temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
		return String.valueOf(arr);

	}

}

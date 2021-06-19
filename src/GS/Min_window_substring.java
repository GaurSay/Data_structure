package GS;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Min_window_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bbacacdcbbcaadcdca";
		SameStringUniqueChar(s);
		method2(s);
//		method2("abcdabceb");
//		SameStringUniqueChar("abcdabceb");
//		method2("BBBB");
//		SameStringUniqueChar("BBBB");
		
		String ss="abcd";

//		Given two strings string1 and string2 (named large and small), find the smallest substring in string1 
//		containing all characters of string2 in O(n). You need to return the output substring.
		String large = "Looks for minimum string";
		String small = "mums";
//		MinWindowSubstring_TwoString(large, small);
//		MinWindowSubstring_TwoString(s, ss);

	}

	private static void MinWindowSubstring_TwoString(String large, String small) {
		// s1 is large that is String 1
		// s2 is small that is String 2
		int l1 = large.length();
		int l2 = small.length();
		if (l1 < l2) {
			 System.out.println("No such window exists");
		}

		int large_hash[] = new int[150];
		int small_hash[] = new int[150];

		// Store occurrence of characters of pattern
		for (int i = 0; i < l2; i++) {
			small_hash[small.charAt(i)]++;
		}

		int start = 0, start_index = -1, min_len = Integer.MAX_VALUE;

		int count = 0;
		for (int j = 0; j < l1; j++) {

			large_hash[large.charAt(j)]++;
			if (large_hash[large.charAt(j)] <= small_hash[large.charAt(j)]) {
				count++;
			}

			if (count == l2) {

				// Try to minimize the window
				while (large_hash[large.charAt(start)] > small_hash[large.charAt(start)]
						|| small_hash[large.charAt(start)] == 0) {
					if (large_hash[large.charAt(start)] > small_hash[large.charAt(start)]) {
						large_hash[large.charAt(start)]--;
					}
					start++;
				}

				// update window length
				int len_window = j - start + 1;
				if (len_window < min_len) {
					min_len = len_window;
					start_index = start;
				}
			}
		}
		// If no window found
		if (start_index == -1) {
			 System.out.println("No such window exists");
		}

		System.out.println(large.substring(start_index, start_index + min_len));

	}

	private static void SameStringUniqueChar(String s) {
		Set<Character> set = new HashSet<>();
		int startIndex = 0;
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		
		int i = -1;
		int j = -1;
		HashMap<Character, Integer> hm = new HashMap<>();

		int min = s.length();
		while (true) {
			boolean f1 = false;
			boolean f2 = false;

			while (j < s.length() - 1 && hm.size() < set.size()) {
				j++;
				char ch = s.charAt(j);
				hm.put(ch, hm.getOrDefault(ch, 0) + 1);
				f1 = true;
			}

			while (i < j && hm.size() == set.size()) {
				int pot_length = j - i;
				if (pot_length < min) {
					min = pot_length;
					startIndex = i + 1;
				}
				i++;
				char ch = s.charAt(i);
				if (hm.get(ch) == 1) {
					hm.remove(ch);
				} else {
					hm.put(ch, hm.get(ch) - 1);
				}
				f2 = true;
			}
			if (f1 == false && f2 == false) {
				break;
			}
		}
		System.out.println(min);
		System.out.println(s.substring(startIndex, startIndex + min));
	}
	
	private static void method2(String s) {
		Set<Character> set = new HashSet<>();
		int startIndex = 0;
		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			if(set.add(s.charAt(i))) {
				temp = temp+ s.charAt(i);
			}	
		}
//		System.out.println(temp);
		
		MinWindowSubstring_TwoString(s,temp);
	}

}

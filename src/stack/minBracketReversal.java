package stack;

import java.util.Stack;

public class minBracketReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "{{{}}{{";
		String s2 = "}}}{{{";
		System.out.println(findMIN(s1));
		System.out.println(findMIN(s2));

	}

	private static int findMIN(String s) {
		if (s.length() == 0) {
			return 0;
		}
		if (s.length() % 2 != 0) {
			return -1;
		}
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '}' && !stack.isEmpty()) {
				if (stack.peek() == '{') {
					stack.pop();
				} else {
					stack.push(ch);
				}
			} else {
				stack.push(ch);
			}
		}
		int red_length = stack.size();
		int count =0;
		while(!stack.isEmpty()) {
			if(stack.peek()=='{') {
				count++;
			}
			stack.pop();
		}
		return red_length/2 + (count%2);

	}

}

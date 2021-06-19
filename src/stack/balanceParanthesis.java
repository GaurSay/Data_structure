package stack;

import java.util.Stack;

public class balanceParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(()()(()))";
		System.out.println(check(s));

	}

	private static boolean check(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '{' || c == '(' || c == '[') {
				stack.push(c);
			} else if (c == '}' || c == ')' || c == ']') {
				if (stack.empty()) {
					return false;
				}
				char ch = stack.pop();
				if (ch == '{' && c != '}') {
					return false;
				} else if (ch == '(' && c != ')') {
					return false;
				} else if (ch == '[' && c != ']') {
					return false;
				} else {
					continue;
				}
			}
		}
		if (stack.empty()) {
			return true;
		} else {
			return false;
		}

	}
}

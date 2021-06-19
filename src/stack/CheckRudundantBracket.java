package stack;

import java.util.Stack;

public class CheckRudundantBracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a+(b)+c";
		System.out.println(checkParanthesis(s));

	}

	private static boolean checkParanthesis(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch=='+' || ch == '-' || ch =='*' || ch=='/') {
				stack.push(ch);
			} else if(ch == ')') {
				boolean hasOperator = false;
				while(!stack.isEmpty() && stack.peek() != '(') {
					stack.pop();
					hasOperator = true;
				}
				if(!hasOperator) {
					return true;
				}
				if(!stack.isEmpty()) {
					stack.pop();
				}
			}
		}
		return false;
	}
	

}

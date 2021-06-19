package stack;
import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s1 = new Stack<>();
		int i = 0;
		s1.push(++i);
		s1.push(++i);
		s1.push(++i);
		s1.push(++i);
		s1.push(++i);
		Stack<Integer> s2 = new Stack<>();
		reverseStack(s1,s2);
		while(!s1.isEmpty()) {
			System.out.print(s1.pop()+" ");
		}
	}

	private static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {
		if(s1.size()<=1) {
			return ;
		}
		int t = s1.pop();
		reverseStack(s1,s2);
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(t);
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		
	}

}

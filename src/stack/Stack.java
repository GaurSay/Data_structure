package stack;

import java.util.Arrays;

public class Stack {
	private int arr[];
	int top;

	public Stack() {
		arr = new int[5];
		Arrays.fill(arr, 0);
		top = -1;
	}

	public int size() {
		return top + 1;
	}

	public void push(int data) {
		if (isFull()) {
			System.out.println("Stack Overflow");
			return;
		}
		arr[++top] = data;
		System.out.println(data + " has been added into Stack");
	}
	
	public int peek() {
		if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
		System.out.println(arr[top]+ " is at top"); 
		return arr[top];
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty ... nothing to pop!");
			return 0;
		}
		int temp = arr[top];
		arr[top] = 0;
		System.out.println(temp + " has been removed from Stack");
		top--;
		return temp;
	}

	public boolean isFull() {
		if (top >= arr.length-1) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		return top<0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stack st = new Stack();
//		st.push(9);
//		st.push(8);
//		st.push(7);
//		st.push(6);
//		st.push(5);
//		st.push(4);
//		st.pop();
//		st.pop();
//		st.peek();
//		st.pop();
//		st.peek();
//		st.pop();
//		st.pop();
//		st.pop();
//		

	}

}

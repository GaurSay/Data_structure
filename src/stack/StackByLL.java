package stack;

public class StackByLL {
	private Node top;
	
	int size = 0;
	
	StackByLL(){
		top = null;
		size = 0;
	}
	int peek() {
		System.out.println(top.data + " is at the top");
		return top.data;
	}
	
	int size() {
		return size;
	}
	void pop() {
		if(top == null) {
			System.out.println("Stack underflow");
		}
		else {
			size--;
			System.out.println(top.data + " has been popped from Stack");
			top = top.next;
		}
	}
	
	void push(int data) {
		if(top == null) {
			size++;
			top = new Node(data);
		}else {
			size++;
			Node newNode = new Node(data);
			newNode.next = top;
			top = newNode;
			System.out.println(data + " has been added into Stack");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackByLL st = new StackByLL();
		st.pop();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.peek();
		st.pop();
		st.push(34);
		st.pop();
		st.pop();
		System.out.println(st.size());
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		
	}

}

class Node {
	Node next;
	int data;

	Node(int data) {
		this.data = data;
		next = null;
	}
}

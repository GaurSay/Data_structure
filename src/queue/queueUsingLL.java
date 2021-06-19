package queue;

public class queueUsingLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q = new Q();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.size();
		q.front();
		q.rear();
		q.dequeue();
		q.dequeue();
		q.size();
		q.dequeue();
		q.dequeue();
	}
}

class Q {
	Node<Integer> front;
	Node<Integer> rear;
	int size;

	Q() {
		front = null;
		rear = null;
		size = 0;
	}

	void enqueue(int data) {
		Node<Integer> newNode = new Node<>(data);
		if (front == null) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		System.out.println("enqueue " + newNode.data + " in Queue ");
		size++;
	}
	void dequeue() {
		if (size ==0) {
			System.out.println("Queue is Empty!");
		} else {
			System.out.println("ELement dequeue is " + front.data);
			front = front.next;
		}
		size--;
	}

	Node<Integer> front() {
		if (front == null) {
			System.out.println("Queue is Empty !");
			return null;
		} else {
			System.out.println(front.data + " is at front!");
			return front;
		}
	}
	Node<Integer> rear() {
		if (rear == null) {
			System.out.println("Queue is Empty !");
			return null;
		} else {
			System.out.println(rear.data + " is at rear!");
			return rear;
		}
	}

	int size() {
		System.out.println("size is " + size);
		return size;
	}

	boolean isEmpty() {
		if (size()==0) {
			return true;
		}
		return false;
	}

}

class Node<T> {
	T data;
	Node<T> next;

	Node(T data) {
		this.data = data;
		next = null;
	}
}

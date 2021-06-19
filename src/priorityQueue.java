import java.util.ArrayList;

public class priorityQueue {

	private ArrayList<Integer> heap;
	int size;

	public priorityQueue() {
		heap = new ArrayList<>();
		size = 0;
	}

	boolean isEmpty() {
		return heap.size() == 0;
	}

	public int size() {
		return size;
	}

	int getMin() throws priorityQueueException {
		if (size == 0) {
			throw new priorityQueueException();
		}
		return heap.get(0);
	}

	void print() {
		for (int i = 0; i < heap.size(); i++) {
			System.out.print(heap.get(i) + " ");
		}
		System.out.println();
	}

	public void insert(int element) {
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while (childIndex > 0) {
			if (heap.get(childIndex) < heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else {
				return;
			}
		}

	}

	int removeMin() {
		int element = heap.get(0);
		int t = heap.size() - 1;

		heap.set(0, heap.get(t));
		heap.remove(heap.size() - 1);

		int parentIndex = 0;
		int minIndex = 0;
		int leftIndex = (2 * parentIndex) + 1;
		int rightIndex = (2 * parentIndex) + 2;

		while (leftIndex < heap.size()) {
			if(heap.get(leftIndex) < heap.get(minIndex)) {
				minIndex = leftIndex;
			}
			if(rightIndex < heap.size() && heap.get(rightIndex) < heap.get(minIndex)) {
				minIndex =  rightIndex;
			}
			if(minIndex == parentIndex ) {
				break;
			}
			else {
				int temp = heap.get(minIndex);
				heap.set(minIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				parentIndex = minIndex;
				leftIndex = (2 * parentIndex) + 1;
				rightIndex = (2 * parentIndex) + 2;
			}
		}
		return element;
	}

	public static void main(String[] args) {

		priorityQueue pq = new priorityQueue();
		pq.insert(5);
		pq.insert(6);
		pq.insert(7);
		pq.insert(8);
		pq.insert(9);
		pq.insert(1);
		pq.insert(2);
		pq.print();
		System.out.println(pq.removeMin());
		pq.print();
	}

}

class priorityQueueException extends Exception {

}

package Priority_Queue;

import java.util.ArrayList;

public class MaxPriorityQueue {
	
	private ArrayList<Integer> heap;
	int size;

	public MaxPriorityQueue() {
		heap = new ArrayList<>();
		size = 0;
	}

	boolean isEmpty() {
		return heap.size() == 0;
	}

	public int size() {
		return size;
	}
	
	void insert(int element) {
		heap.add(element);
        int childIndex =  heap.size()-1;
        int parentIndex = (childIndex-1)/2;
        while(childIndex>0){
            if(heap.get(childIndex)> heap.get(parentIndex)){
                int temp = heap.get(childIndex);
                heap.set(childIndex,heap.get(parentIndex));
                heap.set(parentIndex,temp);
                childIndex = parentIndex;
                parentIndex = (childIndex-1)/2;
            }
            else{
                break;
            }
        }     
	}
	
	void print() {
		for (int i = 0; i < heap.size(); i++) {
			System.out.print(heap.get(i) + " ");
		}
		System.out.println();
	}

	int getMin() throws priorityQueueException {
		if (size == 0) {
			throw new priorityQueueException();
		}
		return heap.get(0);
	}
	int removeMax() {
		 // if(size==0){
		 // throw new priorityQueueException();
		 // }
       int element = heap.get(0);
       heap.set(0,heap.get(heap.size()-1));
       heap.remove(heap.size()-1);
       int parentIndex = 0;
       int l = (2*parentIndex)+1;
       int r = (2*parentIndex)+2;
       int maxIndex = parentIndex;
       
       while(l<heap.size()){
       if(heap.get(l) > heap.get(parentIndex)){
            maxIndex = l; 
       }
       if(r<heap.size() && heap.get(r) > heap.get(parentIndex)){
           maxIndex = r;
       }
       if(maxIndex == parentIndex){
           break;
       }
       else
       {
           int temp = heap.get(maxIndex);
           heap.set(maxIndex,heap.get(parentIndex));
           heap.set(parentIndex,temp);
           parentIndex = maxIndex;
           l = (2*parentIndex)+1;
           r = (2*parentIndex)+2;
       }
     }
    return element;
   }

	public static void main(String[] args) {
		MaxPriorityQueue pq = new MaxPriorityQueue();
		pq.insert(5);
		pq.insert(9);
		pq.insert(1);
		pq.insert(6);
		pq.insert(8);
		pq.print();
		while(!pq.isEmpty()) {
			System.out.println(pq.removeMax());
		}
		
	}

}

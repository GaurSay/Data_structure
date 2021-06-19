package Hashmap;

import java.util.ArrayList;

public class Map<K,V> {
	ArrayList<MapNode<K,V>> buckets;
	// num of entries in map
	int size;
	// num of buckets  - ( size of list )
	int numBuckets;
	
	public Map(){
		numBuckets = 5;
		buckets = new ArrayList<>(numBuckets);
		for(int i=0; i<numBuckets;i++) {
			buckets.add(null);
		}
	}
	
	public V removeKey(K key) {
		int bucketIndex = getBucketIndex(key);	
		MapNode<K,V> head = buckets.get(bucketIndex);
		MapNode<K,V> prev = null;
		while(head != null) {
			if(head.key.equals(key)) {
				size--;
				if(prev == null) {
					buckets.set(bucketIndex, head.next);
				}
				else {
					prev.next = head.next;
				}
			}
			prev = head;
			head = head.next;
		}
		return null;
	}
	
	public double getloadFactor() {
		return (1.0*size)/numBuckets;
	}
	
	private void rehash() {
		System.out.println("buckets size : "+ numBuckets +", size :" + size);
		ArrayList<MapNode<K,V>> temp = buckets;
		buckets = new ArrayList<>();
		for(int i =0; i<numBuckets*2 ;i++) {
			buckets.add(null);
		}
		size = 0;
		numBuckets = numBuckets*2;
		for(int i =0; i<temp.size() ;i++) {
			MapNode<K,V> head = temp.get(i);
			while(head!=null) {
				K key = head.key;
				V value = head.value;
				insert(key,value);
				head = head.next;
			}
			buckets.add(null);
		}
	}
	
	public int size() {
		return size;
	}
	
	public V getValue(K key) {
		int bucketIndex = getBucketIndex(key);	
		MapNode<K,V> head = buckets.get(bucketIndex);
		while(head != null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return null;
	}
	
	public void insert(K key, V value) {
		int bucketIndex = getBucketIndex(key);		
		MapNode<K,V> head = buckets.get(bucketIndex);
		while(head != null) {
			// using  == compares the address 
			// .equals compares the content
			if(head.key.equals(key)) {
				head.value = value;
				return ;
			}
			head = head.next;
		}
		head = buckets.get(bucketIndex);
		MapNode<K,V> newElementNode= new MapNode<>(key,value);
		size++;
		newElementNode.next = head;
		buckets.add(bucketIndex,newElementNode);
		double loadfactor = (1.0*size)/numBuckets;
		if(loadfactor >0.7) {
			rehash();
		}
	}
	
	private int getBucketIndex(K key) {
		int hashCode = key.hashCode();
		return hashCode % numBuckets; 
	}
}

class MapNode<K,V>{
	K key;
	V value;
	MapNode<K,V> next;
	MapNode(K key,V value){
		this.key = key;
		this.value = value;
		next = null;
	}
	
}

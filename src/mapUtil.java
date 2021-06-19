import java.util.ArrayList;
import java.util.List;

public class mapUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		map<String, Integer> hm = new map<>();
		hm.put("a", 123);
		System.out.println(hm.getloadFactor());
		hm.put("b", 123);
		System.out.println(hm.getloadFactor());
		hm.put("c", 123);
		System.out.println(hm.getloadFactor());
		hm.put("d", 123);
		System.out.println(hm.getloadFactor());
		hm.put("e", 123);
		System.out.println(hm.getloadFactor());
		hm.put("f", 123);
		System.out.println(hm.getloadFactor());
	}

}

class map<K, V> {
	List<mapNode<K, V>> buckets;
	int size;
	int numBuckets;

	public map() {
		numBuckets = 5;
		size = 0;
		buckets = new ArrayList<>();
		for (int i = 0; i < numBuckets; i++) {
			buckets.add(null);
		}
	}

	public V removeKey(K key) {
		int bucketIndex = getBucketIndex(key);
		mapNode<K, V> head = buckets.get(bucketIndex);
		mapNode<K, V> prev = null;
		while (head != null) {
			if (head.key.equals(key)) {
				size--;
				if (prev == null) {
					buckets.set(bucketIndex, head.next);
				} else {
					prev.next = head.next;
				}
			}
			prev = head;
			head = head.next;
		}
		return null;
	}

	public double getloadFactor() {
		return (1.0 * size) / numBuckets;
	}

	public V getValue(K key) {
		int bucketIndex = getBucketIndex(key);
		mapNode<K, V> head = buckets.get(bucketIndex);
		while (head != null) {
			if (head.key == key) {
				return head.value;
			}
			head = head.next;
		}
		return null;
	}

	public void put(K key, V value) {
		int bucketIndex = getBucketIndex(key);
		mapNode<K, V> head = buckets.get(bucketIndex);
		while (head != null) {
			if (head.key == key) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		head = buckets.get(bucketIndex);
		mapNode<K, V> newNode = new mapNode<>(key, value);
		size++;
		newNode.next = head;
		buckets.set(bucketIndex, newNode);
		double loadfactor = (1.0* size) / numBuckets;
		if (loadfactor > 0.7) {
			rehash();
		}
	}

	private void rehash() {
		System.out.println("rehashing");
		List<mapNode<K, V>> temp = buckets;
		buckets = new ArrayList<>();
		for (int i = 0; i < numBuckets * 2; i++) {
			buckets.add(null);
		}
		size = 0;
		numBuckets = numBuckets * 2;
		for (int i = 0; i < temp.size(); i++) {
			mapNode<K, V> head = temp.get(i);
			while (head != null) {
				K key = head.key;
				V value = head.value;
				put(key, value);
				head = head.next;
			}
			buckets.add(null);
		}

	}

	public int getSize() {
		return size;
	}

	private int getBucketIndex(K key) {
		int hashcode = key.hashCode();
		return hashcode % numBuckets;
	}
}

class mapNode<K, V> {
	K key;
	V value;
	mapNode<K, V> next;

	public mapNode(K key, V value) {
		this.key = key;
		this.value = value;
	}

}

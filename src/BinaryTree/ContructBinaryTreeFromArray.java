package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

public class ContructBinaryTreeFromArray extends BinaryTreeImpl {
	static int max_level = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 6, 10, 2, 3, 5, 9, 8, 7, 6 };
		
		BTree<Integer> root = CBT(arr, null, 0);
		printInorder(root);
//		System.out.println("-------- Left View Nodes ----------");
//		leftView(root, 1);

	}

	public static BTree<Integer> CBT(int[] arr, BTree<Integer> root, int i) {
		if (i < arr.length) {
			root = new BTree<>(arr[i]);
			root.left = CBT(arr, root.left, (2 * i) + 1);
			root.right = CBT(arr, root.right, (2 * i) + 2);
		}
		return root;
	}
	private static void printInorder(BTree<Integer> node)
    {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

	public static void leftView(BTree<Integer> root, int level) {
		if (root == null) {
			return;
		}
		if (level > max_level) {
			System.out.print(root.data + " ");
			max_level = level;
		}
		leftView(root.left, level + 1);
		leftView(root.right, level + 1);

	}

	public static void getTopView(BTree<Integer> root) {
		// Write your code here
		if (root == null) {
			return;
		}
		Map<Integer, BTree<Integer>> hm = new TreeMap<>();
		Queue<Pair> q = new LinkedList<Pair>();
		q.add(new Pair(root, 0));
		ArrayList<Integer> list = new ArrayList<>();
		while (!q.isEmpty()) {
			Pair temp = q.poll();
			if (!hm.containsKey(temp.hd)) {
				hm.put(temp.hd, temp.node);
			}
			if (temp.node.left != null) {
				q.add(new Pair(temp.node.left, temp.hd - 1));
			}
			if (temp.node.right != null) {
				q.add(new Pair(temp.node.right, temp.hd + 1));
			}
		}
		for (Entry<Integer, BTree<Integer>> entry : hm.entrySet()) {
			list.add(entry.getValue().data);
		}
	}

	public static void getBottomView(BTree<Integer> root) {
		// Write your code here
		if (root == null) {
			return;
		}
		Map<Integer, BTree<Integer>> hm = new TreeMap<>();
		Queue<Pair> q = new LinkedList<Pair>();
		q.add(new Pair(root, 0));
		ArrayList<Integer> list = new ArrayList<>();
		while (!q.isEmpty()) {
			Pair temp = q.poll();
			hm.put(temp.hd, temp.node);

			if (temp.node.left != null) {
				q.add(new Pair(temp.node.left, temp.hd - 1));
			}
			if (temp.node.right != null) {
				q.add(new Pair(temp.node.right, temp.hd + 1));
			}
		}
		for (Entry<Integer, BTree<Integer>> entry : hm.entrySet()) {
			list.add(entry.getValue().data);
		}
	}
}

class Pair {
	BTree<Integer> node;
	int hd;

	Pair(BTree<Integer> node, int hd) {
		this.node = node;
		this.hd = hd;
	}
}

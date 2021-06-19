package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZigZag extends BinaryTreeImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTree<Integer> root = takeInput();
		printZigZag(root);
	}

	public static void printZigZag(BTree<Integer> root) {
		Queue<BTree<Integer>> q = new LinkedList<>();
		Stack<BTree<Integer>> st = new Stack<>();
		boolean b = false;
		q.add(root);
		while (!q.isEmpty()) {
			BTree<Integer> temp = q.poll();
			System.out.print(temp.data + " ");
			if (!b) {
				if (temp.right != null) {
					st.push(temp.right);
				}
				if (temp.left != null) {
					st.push(temp.left);
				}
			} else {
				if (temp.left != null) {
					st.push(temp.left);
				}
				if (temp.right != null) {
					st.push(temp.right);
				}
			}
			if (q.isEmpty()) {
				b = true;
				while (!st.isEmpty()) {
					q.add(st.pop());
				}
				System.out.println();
			}
		}
	}

	private static void printleft(BTree<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data + " ");
		printleft(root.left);
	}

	private static void printleftBoundary(BTree<Integer> root) {
		if (root == null) {
			return;
		}
		if (root.left != null) {
			System.out.print(root.data + " ");
			printleftBoundary(root.left);
		} else if (root.right != null) {
			System.out.print(root.data + " ");
			printleftBoundary(root.right);
		}
	}

	private static void printRightBoundary(BTree<Integer> root) {
		if (root == null) {
			return;
		}
		if (root.right != null) {
			printleftBoundary(root.right);
			System.out.print(root.data + " ");
		} else if (root.left != null) {
			printleftBoundary(root.left);
			System.out.print(root.data + " ");
		}
	}

	private static void printLeaves(BTree<Integer> root) {
		if (root == null) {
			return;
		}
		printLeaves(root.left);
		if (root.left == null && root.right == null)
			System.out.print(root.data + " ");
		printLeaves(root.right);

	}

}

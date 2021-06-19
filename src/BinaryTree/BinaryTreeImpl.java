package BinaryTree;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class BinaryTreeImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTree<Integer> root = takeInput();
		root = insert(root,10);
//		printTree(root);
		printLevelWise(root);
//		countNodes(root);
		int c = countNodes2(root);
		System.out.println(c);

	}
	 
	private static BTree<Integer> delete(BTree<Integer> root,int data){
		if(root == null) {
			return null;
		}
		if(root.left == null && root.right == null ) {
			if(root.data == data) {
				return null;
			}
		}
		Queue<BTree<Integer>> q = new LinkedList<>();
		BTree<Integer> temp = null;
		BTree<Integer> keyNode = null;
		q.add(root);
		while(!q.isEmpty()) {
			temp = q.poll();
			if(temp.data == data) {
				keyNode = temp;
			}
			if(temp.left!=null) {
				q.add(temp.left);
			}
			if(temp.right!=null) {
				q.add(temp.right);
			}
		}
		
		if(keyNode != null) {
			int x = temp.data;
			deleteDeepest(root,x);
			keyNode.data = x;
		}
		return root;
	}
	private static void deleteDeepest(BTree<Integer> root,int data) {
		Queue<BTree<Integer>> q = new LinkedList<>();
		
		BTree<Integer> temp = null;
	
		q.add(root);
		while(!q.isEmpty()) {
			temp = q.poll();
			if(temp.data == data) {
				temp = null;
				return ;
			}
			if(temp.right!=null) {
				if(temp.right.data == data) {
					temp.right = null;
					return ;
				}
				else {
					q.add(temp.right);
				}
			}
			if(temp.left!=null) {
				if(temp.left.data == data) {
					temp.left = null;
					return ;
				}
				else {
					q.add(temp.left);
				}
			}
		}
				
	}
	
	private static BTree<Integer> insert(BTree<Integer> root,int data){
		if( root == null) {
			return null;
		}
		Queue<BTree<Integer>> q = new LinkedList<>();
		q.add(root);
		BTree<Integer> node = new BTree<>(data);
		
		while(!q.isEmpty()) {
			BTree<Integer> temp = q.poll();
			
			if(temp.left==null) {			
				temp.left = node;
				break;
			}
			else {
				q.add(temp.left);
			}
			if(temp.right == null) {
				temp.right = node;
				break;
			}
			else {
				q.add(temp.right);
			}
		}
		return root;
	}

 	public static void countNodes(BTree<Integer> root) {
		if (root == null) {
			System.out.println("count is 0");
		}
		Queue<BTree<Integer>> q = new LinkedList<>();
		q.add(root);
		int count = 0;
		while (!q.isEmpty()) {
			BTree<Integer> temp = q.poll();
//			System.out.print(temp.data+" ");
			count++;
			if (temp.left != null) {
				q.add(temp.left);
			}
			if (temp.right != null) {
				q.add(temp.right);
			}
		}
		System.out.println(count);

	}
 	
 	public static int countNodes2(BTree<Integer> root) {
		if (root == null) {
			return 0;
		}
		int l = countNodes2(root.left);
		int r = countNodes2(root.right);
		return l+r+1;
	}

	public static void printLevelWise(BTree<Integer> root) {
		Queue<BTree<Integer>> q = new LinkedList<>();
		Queue<BTree<Integer>> sec = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			BTree<Integer> temp = q.poll();
			System.out.print(temp.data + " ");
			if (temp.left != null) {
				sec.add(temp.left);
			}
			if (temp.right != null) {
				sec.add(temp.right);
			}
			if (q.isEmpty()) {
				Queue<BTree<Integer>> t = q;
				q = sec;
				sec = t;
				System.out.println();
			}
		}
	}

	public static BTree<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root : ");
		int rootData = s.nextInt();
		BTree<Integer> root = new BTree<>(rootData);
		Queue<BTree<Integer>> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			BTree<Integer> node = q.poll();
			System.out.println("Enter left of  : " + node.data);
			int leftData = s.nextInt();
			System.out.println("Enter right of  : " + node.data);
			int rightData = s.nextInt();
			if (leftData != -1) {
				BTree<Integer> left = new BTree<>(leftData);
				node.left = left;
				q.add(left);
			}
			if (rightData != -1) {
				BTree<Integer> right = new BTree<>(rightData);
				node.right = right;
				q.add(right);
			}

		}
		s.close();
		return root;
	}

	private static void printTree(BTree<Integer> root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return;
		}
		String tobeprinted = root.data + ":";
		if (root.left != null) {
			tobeprinted += "L:" + root.left.data + ",";
		}
		if (root.right != null) {
			tobeprinted += "R:" + root.right.data;
		}
		System.out.println(tobeprinted);
		printTree(root.left);
		printTree(root.right);
	}

}

class BTree<T> {
	T data;
	BTree<T> left;
	BTree<T> right;

	BTree(T data) {
		this.data = data;
		left = null;
		right = null;
	}
}

package BinaryTree;

public class diameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int diameterOfBinaryTree(TreeNode<Integer> root) {
		// Write your code here.
		return find(root).diameter;
	}

	private static Node find(TreeNode<Integer> root) {
		if (root == null) {
			Node a = new Node(0, 0);
			return a;
		}
		Node left = find(root.left);
		Node right = find(root.right);
		int hieght = 1 + Math.max(left.hieght, right.hieght);
		int diameter = Math.max(Math.max(left.diameter, right.diameter), left.hieght + right.hieght);
		Node ans = new Node(hieght, diameter);
		return ans;
	}

	static class Node {
		int hieght;
		int diameter;

		public Node(int hieght, int diameter) {
			this.hieght = hieght;
			this.diameter = diameter;
		}
	}

	class TreeNode<T> {
		T data;
		TreeNode<T> left;
		TreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

}

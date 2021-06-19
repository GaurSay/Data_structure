package BinaryTree;

import java.util.ArrayList;

public class MakeBST_balanced extends BinaryTreeImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Constructed skewed binary tree is 10 / 8 / 7 / 6 / 5
		 */
		BTree<Integer> root = new BTree<Integer>(10);
		root.left = new BTree<Integer>(8);
		root.left.left = new BTree<Integer>(7);
		root.left.left.left = new BTree<Integer>(6);
		root.left.left.left.left = new BTree<Integer>(5);

		root = buildTree(root);
		System.out.println("Preorder traversal of balanced BST is :");
		inorderTraversal(root);

	}

	private static BTree<Integer> buildTree(BTree<Integer> root) {
		ArrayList<BTree<Integer>> nodes = new ArrayList<>();
		storeBSTNodes(root,nodes);
		int n = nodes.size();
		root = constructBST(nodes,0,n-1);
		return root;
		
	}
	
	private static BTree<Integer> constructBST(ArrayList<BTree<Integer>> nodes, int s, int e) {
		if(s>e) {
			return null;
		}
		int mid = (s+e)/2;
		BTree<Integer> node =  nodes.get(mid);
		node.left =  constructBST(nodes,s,mid-1);
		node.right = constructBST(nodes,mid+1,e);
		
		return node;
		
	}

	private static void storeBSTNodes(BTree<Integer> root, ArrayList<BTree<Integer>> nodes) 
    {
        // Base case
        if (root == null)
            return;
  
        // Store nodes in Inorder (which is sorted order for BST) // 
        storeBSTNodes(root.left, nodes);
        nodes.add(root);
        storeBSTNodes(root.right, nodes);
    }
	
	private static void inorderTraversal(BTree<Integer> root) {
		if (root == null)
			return;

		inorderTraversal(root.left);
		System.out.print(root.data + " ");
		inorderTraversal(root.right);
	}

}

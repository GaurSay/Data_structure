package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class constructBSTfromLevelOrder extends BinaryTreeImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 7, 4, 12, 3, 6, 8, 1, 5, 10 };
		int pre[] = new int[] { 10, 5, 1, 7, 40, 50 };
		int n = arr.length;
//		BTree<Integer> root = constructBst2(arr, n);
		BTree<Integer> root = contruct_BST_FromPreOrder(pre);
		inorderTraversal(root);
	}
	
	static int index;
	private static BTree<Integer> contruct_BST_FromPreOrder(int pre[]){
		index = 0;
		BTree<Integer> root =helper(pre,Integer.MIN_VALUE,Integer.MAX_VALUE);
        return root;
	}
	private static BTree<Integer> helper(int pre[],int min,int max){
        if(index >= pre.length || pre[index]<min || pre[index] > max){
            return null;
        }
        BTree<Integer> node  = new BTree<Integer>(pre[index]);
        index++;
        node.left =  helper(pre,min,node.data);
        node.right =  helper(pre,node.data,max);
        
        return node;
    }
	
	
	
	//----- Time complexity of this is O(n) ------ //
	public static BTree<Integer> constructBst2(int[] arr, int n) {
		BTree<Integer> root = new BTree<>(arr[0]);
		NodeDetails nodeDetails = new NodeDetails(root, Integer.MIN_VALUE,Integer.MAX_VALUE);
		Queue<NodeDetails> q = new LinkedList<>();
		q.add(nodeDetails);
		
		int i=1;
		
		while(!q.isEmpty()) {
			NodeDetails temp = q.poll();
			BTree<Integer> c = temp.node;
			
			if(i<n && temp.min<arr[i] && arr[i] < c.data) {
				c.left = new BTree<>(arr[i]);
				i++;
				q.add(new NodeDetails(c.left, temp.min, c.data));
				
			}
			if(i<n && arr[i] > c.data && temp.max > arr[i]) {
				c.right = new BTree<>(arr[i]);
				i++;
				q.add(new NodeDetails(c.right,c.data,temp.max));
				
			}			
		}
		
		return root;
		
	}
	
	
    //	Time complexity of this is O(n2) -- /////////
	public static BTree<Integer> constructBst(int[] arr, int n) {
		// Write your code here
		if (arr.length == 0) {
			return null;
		}
		BTree<Integer> root = null;
		for (int i = 0; i < arr.length; i++) {
			root = levelOrder(root, arr[i]);
		}
		return root;
	}

	private static BTree<Integer> levelOrder(BTree<Integer> root, int data) {
		if (root == null) {
			root = new BTree<Integer>(data);
			return root;
		}

		if (data < root.data) {
			root.left = levelOrder(root.left, data);
			return root;
		} else {
			root.right = levelOrder(root.right, data);
			return root;
		}
	}

	private static void inorderTraversal(BTree<Integer> root) {
		if (root == null)
			return;

		inorderTraversal(root.left);
		System.out.print(root.data + " ");
		inorderTraversal(root.right);
	}

}

class NodeDetails {
	BTree<Integer> node;
	int min;
	int max;

	NodeDetails(BTree<Integer> node, int min, int max) {
		this.node = node;
		this.max = max;
		this.min = min;
	}
}

package GS;

import java.util.HashMap;
import java.util.Stack;

public class Next_greater_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 3, 6, 7, 1, 8 };
		int arr2[] = { 7, 8, 1, 4 };
		int arr3[] = { 3,8,4,1,2 };
		int nums1[] = { 4, 1, 2 };
		int nums2[] = { 1, 3, 4, 2 };

//		int ans[] = solve(arr2);

//		int ans2[] =nextGreaterElement(nums1,nums2);
		int ans[] = cyclicGreater(arr3);

		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	private static int[] solve(int arr[]) {
		int n = arr.length;
		Stack<Integer> stack = new Stack<>();
		stack.push(arr[n - 1]);
		arr[n - 1] = -1;
		int x = 0;
		for (int i = n - 2; i >= 0; i--) {
			while (!stack.isEmpty() && stack.peek() < arr[i]) {
				stack.pop();
			}
			x = arr[i];
			if (!stack.isEmpty()) {
				arr[i] = stack.peek();
			} else {
				arr[i] = -1;
			}
			stack.push(x);
		}
		return arr;
	}

	private static int[] nextGreaterElement(int nums1[], int nums2[]) {
		int n = nums2.length;
		Stack<Integer> stack = new Stack<>();
		stack.push(nums2[n - 1]);

		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(nums2[n - 1], -1);
		nums2[n - 1] = -1;
		int x = 0;
		for (int i = n - 2; i >= 0; i--) {
			while (!stack.isEmpty() && stack.peek() < nums2[i]) {
				stack.pop();
			}
			x = nums2[i];
			if (!stack.isEmpty()) {
				nums2[i] = stack.peek();
				hm.put(x, nums2[i]);
			} else {
				nums2[i] = -1;
				hm.put(x, nums2[i]);
			}
			stack.push(x);
		}
		int ans[] = new int[nums1.length];
		// System.out.println(hm);
		for (int i = 0; i < ans.length; i++) {
			ans[i] = hm.get(nums1[i]);
		}
		return ans;
	}

	private static int[] cyclicGreater(int arr[]) {
		int n = arr.length;
		int z = arr[n - 1];
		int x = 0;
		Stack<Integer> stack = new Stack<>();
		stack.push(arr[n-1]);
		for (int i = n - 2; i >= 0; i--) {
			while (!stack.isEmpty() && stack.peek() <= arr[i]) {
				stack.pop();
			}
			x = arr[i];
			stack.push(x);
		}
		
		for (int i = n - 1; i >= 0; i--) {
			while (!stack.isEmpty() && stack.peek() <= arr[i]) {
				stack.pop();
			}
			x = arr[i];
			if (!stack.isEmpty()) {
				arr[i] = stack.peek();
			} else {
				arr[i] = -1;
			}
			stack.push(x);
		}
		return arr;
	}

}

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Question 1 :
//		Sliding window maximum 
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int k = 3; 
		
		question1(arr,k);
	
		
		
		
		
		
//		Question 2
//		minumum window substring
		String large = "Looks for minimum string";
		String small = "mums";
		
		question2(large,small);
			
	}
	private static void question2(String large,String small) {
		int l1 = large.length();
		int l2 = small.length();
		if (l1 < l2) {
			 System.out.println("No such window exists");
		}

		int large_hash[] = new int[150];
		int small_hash[] = new int[150];

		// Store occurrence of characters of pattern
		for (int i = 0; i < l2; i++) {
			small_hash[small.charAt(i)]++;
		}
		int count =0;

		int start = 0, start_index = -1, min_len = Integer.MAX_VALUE;
		for(int i=0;i<l1;i++) {
			char ch = large.charAt(i);	
			large_hash[ch]++;
			if(large_hash[ch]<=small_hash[ch]) {
				count++;
			}
			
			if (count == l2) {
				
				while (large_hash[large.charAt(start)] > small_hash[large.charAt(start)]
						|| small_hash[large.charAt(start)] == 0) {
					if (large_hash[large.charAt(start)] > small_hash[large.charAt(start)]) {
						large_hash[large.charAt(start)]--;
					}
					start++;
				}
				
				int len_window = i - start + 1;
				if (len_window < min_len) {
					min_len = len_window;
					start_index = start;
				}
			}
			
		}
		
		if (start_index == -1) {
			 System.out.println("No such window exists");
		}
		System.out.println(large.substring(start_index, start_index + min_len));
		
	}

	private static void question1(int[] arr, int k) {
		Stack<Integer> st = new Stack<>();
		int n = arr.length;
		st.add(n-1);
		
		int nge[] = new int[arr.length];
		nge[n-1] = n;
		for(int i =n-2; i>=0 ;i--) {
			while(!st.isEmpty() && arr[st.peek()]<=arr[i]) {
				st.pop();
			}
			if(!st.isEmpty()) {
				nge[i] = st.peek();
			}
			else {
				nge[i] = n;
			}
			st.add(i);
		}
//		for (int i = 0; i < nge.length; i++) {
//			System.out.print(nge[i]+" ");
//		}
//		System.out.println();
		for(int i =0;i<=n-k;i++) {
			int j =i;
			while(nge[j]<i+k) {
				j = nge[j];
			}		
			System.out.print(arr[j]+" ");
		}		
	}
}



package GS;

public class square_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 80;

		System.out.println(find(x));
	}

	private static int find(int x) {
		if (x == 0 || x == 1) {
			return x;
		}
		int i = 1;
		int ans = 1;
		int low =0;
		int high = x;
		int mid =0;
		while(low<=high) {
			mid = (low+high)/2;
			
			if(mid*mid == x) {
				return mid;
			}
			else if(mid*mid < x) {
				low = mid+1;
				ans = mid;
			}
			else {
				high = mid-1;
			}
		}
		return ans;

	}

}

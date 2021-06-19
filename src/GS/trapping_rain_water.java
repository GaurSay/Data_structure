package GS;

public class trapping_rain_water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		
		// O(N^2)
//		method1(arr);

		
		// O(N)
		method2(arr);

	}

	private static void method2(int[] arr) {
		
		int left[] = new int[arr.length];
		left[0]= arr[0];
	
		// LEFT
		for (int i = 1; i < left.length; i++) {
			left[i] = Math.max(left[i-1], arr[i]);
		}
		int n =arr.length;


		int right[] = new int[arr.length];
		right[n-1] = arr[n-1];

		// RIGHT
		for (int i = arr.length-2; i >=0 ; i--) {
			right[i] = Math.max(right[i+1], arr[i]);
		}
		int res= 0;
		
		for (int i = 0; i < arr.length; i++) {
			res = res + Math.min(left[i], right[i])-arr[i];
		}
		System.out.println(res);
		

	}

	private static void method1(int[] arr) {

		int res = 0;

		for (int i = 1; i < arr.length - 1; i++) {
			int left_max = arr[i];
			int j = i;
			while (j > 0) {
				if (arr[j] > left_max) {
					left_max = arr[j];
				}
				j--;
			}

			int right_max = arr[i];
			j = i;
			while (j < arr.length) {
				if (arr[j] > right_max) {
					right_max = arr[j];
				}
				j++;
			}
			res += Math.min(left_max, right_max) - arr[i];
		}
		System.out.println(res);

	}

}

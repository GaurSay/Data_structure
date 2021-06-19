package GS;

public class Pivot_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 7, 3, 6, 5, 6 };

		int left[] = new int[arr.length];
		left[0] = 0;
//		System.out.print(left[0]+" ");
		for (int i = 1; i < arr.length; i++) {

			left[i] = left[i - 1] + arr[i - 1];

		}

		// right
		int right[] = new int[arr.length];
		right[arr.length - 1] = 0;
		for (int i = arr.length - 2; i >= 0; i--) {
			right[i] = right[i + 1] + arr[i + 1];
		}

		for (int i = 0; i < arr.length; i++) {
			if (left[i] == right[i]) {
				System.out.println(i);
				break;
			}
//			System.out.print(right[i] + " ");
		}

	}
}

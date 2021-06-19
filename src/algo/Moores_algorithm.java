package algo;

public class Moores_algorithm {

	// FIND majority element in array whose frequency is greater than n/2

	// Moore's voting algo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 1, 3, 3, 1, 2 };
		int n = arr.length;

		
		
		int x = getPotentialCandidate(arr);
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(x == arr[i]) {
				count++;
			}
		}
		
		if(count>=n/2) {
			System.out.println(x);
		}
		else {
			System.out.println("NO majority element");
		}
	}

	private static int getPotentialCandidate(int arr[]) {
		int n = arr.length;

		int value = arr[0];
		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == value) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				value = arr[i];
				count = 1;
			}
		}
		
		return value;
	}
}

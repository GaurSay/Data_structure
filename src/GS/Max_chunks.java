package GS;

public class Max_chunks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 0, 1, 2, 5, 4, 8, 6, 7 };
		int arr2[] = { 2, 0, 1, 4, 3, 5 };
		int arr3[] = { 30,10,20,40,60,50,75,70 };
		find2(arr3);
//		System.out.println(find2(arr3));

	}
	// 0 to n elements range and not distinct //
	private static int find1(int arr[]) {
		int maxIndex = -1;
		int count = 0;
        if(arr.length==1){
            return 1;
        }
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxIndex) {
				maxIndex = arr[i];
			} 
			if (i == maxIndex) {
				count++;
			}
		}
		return count;
	}
	
	// any number and not distict element // 
	private static int find2(int arr[]) {
		int n = arr.length;
		int leftmax[] =  new int[n];
		leftmax[0] = arr[0];
		for (int i = 1; i < leftmax.length; i++) {
			leftmax[i]= Math.max(leftmax[i-1], arr[i]);
		}
		
		int rightMin[] =  new int[n+1];
		rightMin[n] = Integer.MAX_VALUE;
		
		for (int i = n-1; i >=0; i--) {
			rightMin[i]= Math.min(rightMin[i+1], arr[i]);
//			System.out.print(rightMin[i]+" ");
		}
	
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(leftmax[i]<=rightMin[i+1]) {
				count++;
			}
		}
		System.out.println(count);
		return 0;
		
	}

}

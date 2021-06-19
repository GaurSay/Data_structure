package arrays;

public class rotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		int arr2[]={5,6,1,2,3,4};
		int rotateBy = 2;
		while(rotateBy >0) {
			rotateByOne(arr);
			rotateBy--;
		}
		printArr(arr);
		printArr(arr2);
		checkRotation(arr2);
	}
	public static void printArr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void rotateByOne(int arr[]) {
		// TODO Auto-generated method stub
		int temp =arr[0];
		for(int i=1; i<arr.length ;i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = temp;
	}
	
	public static void checkRotation(int arr[])
	{
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1] <= arr[i]) {
				System.out.println("no of rotation : " + (i+1));
			}
		}
	}

}

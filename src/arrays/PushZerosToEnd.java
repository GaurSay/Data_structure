package arrays;

public class PushZerosToEnd {
//Move all zeroes to end of array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {2,0,0,1,3,0,0};
		int arr2[] = {0,3,0,2,0};
		arr1 = pushZero(arr1);
		arr2 =pushZero(arr2);
		printArr(arr1);
		printArr(arr2);
			
	}
	public static void printArr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] pushZero(int arr[]) {
		int count= 0;
			
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[count++] = arr[i];
			}
		}
		
		while(count<arr.length) {
			arr[count]=0;
			count++;
		}
		return arr;
	}

}

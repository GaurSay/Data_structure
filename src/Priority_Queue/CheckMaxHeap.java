package Priority_Queue;

public class CheckMaxHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,9,8,7,6,5,4,3,2,7};
		System.out.println(checkMaxHeap(arr));
	}
	
	public static boolean checkMaxHeap(int arr[]) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
        int n = arr.length;
        for(int i=0;i<=(n/2) -1;i++){
            int l = (2*i)+1;
            int r = (2*i)+2;
            if(l<n && arr[i]<arr[l]){
                return false;
            }
            if(r<n && arr[i]<arr[r]){
                return false;
            }
        }
        return true;
	}

}

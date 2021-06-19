package GS;

public class max_product_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,-2,4};	
		System.out.println(find(arr));
	}

	private static int find(int[] arr) {
		int prod = arr[0];
        int max = arr[0];
        int min = arr[0];
        
        for(int i=1;i<arr.length;i++){
         int temp = max;          
         max  = Math.max(arr[i],Math.max(max*arr[i],min*arr[i]));
         min  = Math.min(arr[i],Math.min(temp*arr[i],min*arr[i])); 
         System.out.println(max+" "+min+" "+prod);
         if(max >prod){
                prod = max;
        }
        if(arr[i]==0)
        {
            max =1;
            min =1;
        } 
        
        }
        return prod;
		
	}

}

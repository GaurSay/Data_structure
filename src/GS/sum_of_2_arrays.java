package GS;

public class sum_of_2_arrays {

	public static void main(String[] args) {
		int arr1[]= {6, 2, 4};
		int arr2[]= {7, 5, 6};
		int ans[]=sumOfTwoArrays(arr1,arr2);
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i]+" ");
		}

	}

	private static int[] sumOfTwoArrays(int[] arr1, int[] arr2) {
		int na = arr1.length;
		int nb = arr2.length;
		int nc = 0;
		nc = na < nb ? na+1 : nb+1 ;
		
		int ans[]=new int[nc];
		int sum = 0;
		int carry = 0;
		int i = na-1;
		int j = nb-1;
		int k = nc-1;
		
		while(i>=0 && j>=0) {
			sum=carry+arr1[i]+arr2[j];
			carry = sum/10;
			ans[k] = sum%10;
			i--;
        	j--;
        	k--;
			
		}
		while(i>=0)
        {
        	sum=carry+arr1[i];
        	carry=sum/10;
        	ans[k]=sum%10;
        	i--;
        	k--;
        }
		while(j>=0)
        {
        	sum=carry+arr2[j];
        	carry=sum/10;
        	ans[k]=sum%10;
        	j--;
        	k--;
        }
		ans[k]=carry;
		return ans;
		
	}
}

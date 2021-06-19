package recursion;

public class allSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 15, 20, 12 };
		int ans[][] = subs(arr, 0);
		printArray(ans);
	}

	private static void printArray(int ans[][]) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[i].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int[][] subs(int input[],int si)
	  {
	    if(si==input.length)
	    {
		   int ans[][]=new int [1][0];
	      return ans;
	    }
	    int smallans[][]=subs(input,si+1);
	    int ans[][]=new int[smallans.length*2][];
	    int k=0;
	    for(int i=0;i<smallans.length;i++)
	    {
	      ans[k]=new int[smallans[i].length];
	      for(int j=0;j<smallans[i].length;j++)
	      {
	        ans[k][j]=smallans[i][j];
//	        System.out.println( ans[k][j]+" ");
	      }
	      k++;
	     // System.out.println();
	      
	    }
	    for(int i=0;i<smallans.length;i++)
	    {
	      ans[k]=new int[smallans[i].length+1];
	      ans[k][0]=input[si];
	      for(int j=1;j<smallans[i].length+1;j++)
	      {
	        ans[k][j]=smallans[i][j-1];
	        //System.out.println( ans[k][j]+" ");
	      }
	      k++;
	     // System.out.println();
	      
	    }
	    
	    return ans;
	  }

}

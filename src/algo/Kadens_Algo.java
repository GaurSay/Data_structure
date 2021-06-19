package algo;

public class Kadens_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr2[] ={-2,-3,4,-1,-2,1,5,3}; 
		System.out.println(find(arr2));

	}
	public static int find(int arr[])
	{
		int sum=0;
		int max_so_far=Integer.MIN_VALUE;

		int start=0;
		int end=0;
		int s=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			if(max_so_far<sum)
			{
				max_so_far=sum;
				start=s;
				end=i;
			}
			
			if(sum<0)
			{
				sum=0;
				s=i+1;
			}
		}
		System.out.println("start "+start +"  "+arr[start]);
		System.out.println("end "+end +"  "+arr[end]);
		
		return max_so_far;		
	}

}

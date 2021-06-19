package sorting;

public class QuickSort {

	
//      Time Complexity
//		best case = NlogN
//		worst case= O(n^2)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,4,3,2,1};
		sort(arr,0,arr.length-1);
		System.out.println("quick sort done");
		print(arr);

	}
	
	public static void sort(int arr[],int s,int e)
	{
		if(s>=e)
		{
			return;
		}
		int pos=partition(arr,s,e);
		sort(arr,s,pos-1);
		sort(arr,pos+1,e);
	}
	
	public static int partition(int arr[],int s,int e)
	{
		int pivot=arr[s];
		int count=0;
		for(int i=s+1;i<=e;i++)
		{
			if(arr[i]<=pivot)
			{
				count++;
			}
		}		
		int pivotpos=s+count;
		arr[s]=arr[pivotpos];
		arr[pivotpos]=pivot;
		int i=s;
		int j=e;
		while(i<pivotpos)
		{
			if(arr[i]>pivot)
			{	
				
				while(j>pivotpos)
				{
					if(arr[j]<=pivot)
					{
						int temp=arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
						j--;
						break;
					}
					j--;
				}			
			}
			i++;
		}
		return pivotpos;		
	}
	
	
	
	public static void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

}

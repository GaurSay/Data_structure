package GS;

public class Buy_Sell_stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =  {7,1,5,3,6,4};
		int max_profit = 0;
		int min = Integer.MAX_VALUE;
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}

			if(arr[i]-min > max_profit){
				max_profit = arr[i]-min;
			}
		}
		System.out.println(max_profit);

	}

}

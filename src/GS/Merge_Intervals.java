package GS;

import java.util.ArrayList;
import java.util.Arrays;


public class Merge_Intervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intervals[][] = {{1,3},{2,6},{8,10},{15,18}};
		Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
		
		ArrayList<int[]> list = new ArrayList<>();
		
		for(int[] interval : intervals) {
			
			if(list.size()==0) {
				list.add(interval);
			}
			else {
				int prev[] = list.get(list.size()-1);
				//overlapping 
				if(interval[0] <prev[1]) {
					prev[1] = Math.max(prev[1], interval[1]);
				}
				else {
					list.add(interval);
				}
			}			
		}
		
		int ans[][] = list.toArray(new int[list.size()][]);
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j]+" ");			
			}
			System.out.println();
		}
	}
	

}

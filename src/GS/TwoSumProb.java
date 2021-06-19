package GS;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,7,11,15};
		int sum = 17;
		Map<Integer,Integer> hm = new HashMap<>();
		
		for( int i = 0;i<nums.length;i++) {
			if(hm.containsKey(sum-nums[i])) {
				System.out.println(hm.get(sum-nums[i])+ " " + i);
			}
			else {
				hm.put(nums[i],i);
			}
		}
		
		
	}

}

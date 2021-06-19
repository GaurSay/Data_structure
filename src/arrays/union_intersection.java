package arrays;

import java.util.HashSet;
import java.util.Set;

public class union_intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr1[] = {85, 25, 1, 32, 54, 6};
			int arr2[] = {85 ,2};
			Set<Integer> sh = new HashSet<Integer>();
			for(int i : arr1){
				sh.add(i);
			}
			for(int i : arr2){
				sh.add(i);
			}
			System.out.println(sh.size()+": total num of elements ! ");
			
			for(int i=0; i<arr1.length;i++){
				for(int j=0;j<arr2.length;j++) {
					if(arr1[i] == arr2[j]) {
						System.out.println("intersection at "+ arr1[i]);
					}
				}
			}
			
			
			
			
	}

}

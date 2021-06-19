package GS;

import java.util.ArrayList;
import java.util.List;

public class Union_2_sorted_array {
	
	// TC - O(n+m)
	int x =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,1,2,2,3,4,5};
		int b[] = {1,1,2,3,4,4,5,5,6};
		List<Integer> list = new ArrayList<>();
		int i =0;
		int j =0;
		
		while(i<a.length && j<b.length) {
			if(a[i]==b[j]) {
				if(list.size()>0 && list.get(list.size()-1)!= a[i]){
					list.add(a[i]);
				}
				else if(list.size()==0) {
					list.add(a[i]);
				}
				i++;
				j++;
			}
			else if(a[i] < b[j]) {
				if(list.size()>0 && list.get(list.size()-1)!= a[i]){
					list.add(a[i]);
				}
				else if(list.size()==0) {
					list.add(a[i]);
				}
				i++;
			}
			else {
				if(list.size()>0 && list.get(list.size()-1)!= b[j]){
					list.add(b[j]);
				}
				else if(list.size()==0) {
					list.add(b[j]);
				}
				j++;
			}
		}
		while(i<a.length) {
			if(list.get(list.size()-1)!= a[i]){
				list.add(a[i]);
			}
			i++;
		}
		
		while(j<b.length) {
			if(list.get(list.size()-1)!= b[j]){
				list.add(b[j]);
			}
			j++;
		}
		
		System.out.println(list);
		
		
		
	}

}

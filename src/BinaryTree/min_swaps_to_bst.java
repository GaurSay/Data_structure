package BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class min_swaps_to_bst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]= {4, 2, 5, 1, 6, 3, 7};
		List<Integer> list =  Arrays.asList(arr);
		List<p> toSort =  new ArrayList<>();
		int c =0;
		for(int i : arr) {
			toSort.add(new p(i,c));
			c++;
		}
		
		Collections.sort(toSort,(a,b) -> a.value-b.value);
		for (p pair : toSort) {
			System.out.println(pair.value+" "+pair.index);
		}
	}

}
class p{
	int value;
	int index;
	p(int value,int index) {
		this.value=value;
		this.index = index;
	}
}

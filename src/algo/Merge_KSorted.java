package algo;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge_KSorted {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3));
	}

}

class triplet implements Comparable<triplet>{
    int value;
    int index;
    int arrIndex;
    public triplet(int value,int index,int arrIndex){
        this.value= value;
        this.index = index;
        this.arrIndex = arrIndex;
    }
    
    public int compareTo(triplet o){
        return this.value = o.value;
    }
}

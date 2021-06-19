package GS;

public class distance_btw_words {

	public static void main(String[] args) {
		String s = "geeks for geeks contribute practice";
		String w1 = "geeks";
		String w2 = "practice";

		min_distance(s, w1, w2);

	}

	private static void min_distance(String s, String w1, String w2) {

		String arr[] = s.split(" ");
		int prev = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == w1 || arr[i] == w2) {
				prev = i;
				break;
			}
		}
//		System.out.println(prev);
		int min_dist = arr.length;
		int last=0;
		for (int i = prev; i < arr.length; i++) {
			if (arr[i].equals(w1) || arr[i].equals(w2)) {		
				if(!arr[i].equals(arr[prev])) {	
//					System.out.println(i);
					int dist = i-prev;
					if(dist < min_dist) {
						min_dist = dist;
						last =i;
					}
				}
				else {
					prev =i;
				}
				
			}
		}
//		System.out.println(prev);
//		System.out.println(last);
		System.out.println(min_dist);
	}

}

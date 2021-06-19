package GS;

public class max_consecutive_ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Given a binary array a[] and a number k, we need to find
//		length of the longest subsegment of ‘1’s possible by changing at most k ‘0’s. 
		int a[] = { 1, 0, 0, 1, 0, 1, 0, 1 };
		int k = 2;

		int j = -1;
		int count = 0;
		int maxLength = 1;
		int maxStart = 0;
		int maxEnd = 0;
		int i = 0;
		for (i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				count++;
			}
			while (count > k) {
				j++;
				if (a[j] == 0) {
					count--;
				}
			}
			int len = i - j;
			if (len > maxLength) {
				maxLength = len;
				maxStart=i;
				maxEnd = j;
			}
		}
		System.out.println(maxLength+" "+maxStart+" "+maxEnd);

	}

}

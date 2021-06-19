package arrays;

public class Count_platform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
//		int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
		int arr[] = { 1, 2, 9, 5, 5 };
		int exit[] = { 4, 5, 12, 9, 12 };
		System.out.println("Minimum Number of Platforms Required = " + findPlatform(arr, exit));

	}

	public static int findPlatform(int arr[], int dep[]) {
		
		int n = arr.length;
		 // plat_needed indicates number of platforms
        // needed at a time
        int plat_needed = 1, result = 1;
        int i = 1, j = 0;
 
        // Similar to merge in merge sort to process
        // all events in sorted order
        while (i < n && j < n) {
            // If next event in sorted order is arrival,
            // increment count of platforms needed
            if (arr[i] <= dep[j]) {
                plat_needed++;
                i++;
            }
 
            // Else decrement count of platforms needed
            else if (arr[i] > dep[j]) {
                plat_needed--;
                j++;
            }
 
            // Update result if needed
            if (plat_needed > result)
                result = plat_needed;
        }
 
        return result;
	}
}

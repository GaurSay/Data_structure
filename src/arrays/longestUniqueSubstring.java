package arrays;

public class longestUniqueSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="geeksforgeeks";
		System.out.println(find(s));

	}

	private static int find(String s) {
		// TODO Auto-generated method stub
		int ans = 0;
		for(int i=0;i<s.length();i++) {
			boolean visited[] = new boolean[150];
			for(int j=i;j<s.length();j++) {
				//character already there //
				if(visited[s.charAt(j)] == true) {
					break;
				}
				else {
					ans = Math.max(ans, j-i+1);
					visited[s.charAt(j)] = true; 
				}
			}
			visited[s.charAt(i)] = false;
		}
		return ans;
	}

}

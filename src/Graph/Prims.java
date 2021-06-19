package Graph;

import java.util.Scanner;

public class Prims {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		int adjacencyMatrix[][] = new int[V][V];
		
		for(int i =0;i<E;i++) {
			int s = sc.nextInt();
			int d = sc.nextInt();
			int weight = sc.nextInt();
			adjacencyMatrix[s][d] = weight;
			adjacencyMatrix[d][s] = weight;
		}
		Prim(adjacencyMatrix);

	}
	
	private static void Prim(int[][] adjacencyMatrix) {
		int v = adjacencyMatrix.length;
		boolean visited[] = new boolean[v];
		int parent[] = new int[v];
		parent[0] = -1;
		
		int weights[] = new int[v];
		weights[0] = 0;
		for(int i = 1; i<v ;i++) {
			weights[i] = Integer.MAX_VALUE;
		}
		
		for(int i =0;i<v;i++) {
			// pick vertex with min weight 
			
			int minVertex = findMinVertex(weights,visited);
			visited[minVertex] = true;
			
			// Explore its unvisited neighbors
			
			for (int j = 0; j < v; j++) {
				if(adjacencyMatrix[minVertex][j]!=0 && !visited[j]) {
					if(adjacencyMatrix[minVertex][j] < weights[j]) {
						weights[j] = adjacencyMatrix[minVertex][j];
						parent[j] = minVertex;
					}
				}
			}	
		}
		
		// Print vertices of MST
		for (int i = 1; i < v; i++) {
			if (parent[i] < i) {
				System.out.println(parent[i] + " " + i +" "+ weights[i]);
			} else {
				System.out.println(i+" "+parent[i] +" "+ weights[i]);
			}
		}
	}

	private static int findMinVertex(int[] weights, boolean[] visited) {
		int minvertex = -1;
		
		for (int i = 0; i < weights.length; i++) {
			if(!visited[i] && (minvertex ==-1 || weights[i] < weights[minvertex])) {
				minvertex = i;
			}
		}
		return minvertex;
	}

}
package Graph;

import java.util.Scanner;

public class Dijkstra {

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
        sc.close();
        
        Dijkstras(adjacencyMatrix);
        
	}
	
	private static void Dijkstras(int[][] adjacencyMatrix) {
		int v = adjacencyMatrix.length;
		boolean visited[] = new boolean[v];
		
		int distance[] = new int[v];
		distance[0] = 0;
		for(int i = 1; i<v ;i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		
		for(int i =0;i<v;i++) {
			// pick vertex with min weight 
			
			int minVertex = findMinVertex(distance,visited);
			visited[minVertex] = true;
			
			// Explore its unvisited neighbors
			
			for (int j = 0; j < v; j++) {
				if(adjacencyMatrix[minVertex][j]!=0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE) {
					int newDist = adjacencyMatrix[minVertex][j] + distance[minVertex];
					if(newDist < distance[j]) {
						distance[j] = newDist;
					}
				}
			}	
		}
		
		// Print distances of every vertex from source
		for (int i = 0; i < v; i++) {
			System.out.println(i + " " + distance[i]);
		}
	}
    
    
    private static int findMinVertex(int[] distance, boolean[] visited) {
		int minvertex = -1;
		
		for (int i = 0; i < distance.length; i++) {
			if(!visited[i] && (minvertex ==-1 || distance[i] < distance[minvertex])) {
				minvertex = i;
			}
		}
		return minvertex;
	}

}

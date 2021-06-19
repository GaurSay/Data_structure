package Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Kruskals_Algorithm {

	private static void Kruskals(ArrayList<Edge> input,int V,int E){
        ArrayList<Edge> output = new ArrayList<>();
        
        Collections.sort(input);
         int parent[] = new int[V];
         for(int i =0;i<V;i++){
             parent[i] = i;
         }
          
         int count =0;
         int i =0;
         while(count!=V-1){
             Edge curr = input.get(i);
             if(UnionFind(curr.source,curr.dest,parent)){
                output.add(curr);
                 count++;
             }
             i++;
         }
         // System.out.println(output.size());
         for(int j=0 ; j<output.size();j++){
             Edge e = output.get(j);
             if(e.source < e.dest) {
                System.out.println(e.source + " " + e.dest + " " + e.weight);
            } else {
                System.out.println(e.dest + " " + e.source + " " + e.weight);
            } 
         }
        
    }
    
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
        
        ArrayList<Edge> input = new ArrayList<>();
        
        for(int i=0 ; i<E ; i++){
            int s = sc.nextInt();
            int d = sc.nextInt();
            int w = sc.nextInt();
            // System.out.println(s + " " + d + " " + w);
            Edge e = new Edge(s,d,w);
            input.add(e);
        }
        Kruskals(input,V,E);
    
         
	}
    
    private static boolean UnionFind(int s,int d,int parent[]){
        int parent1 = getParent(s,parent);
        int parent2 = getParent(d,parent);
        if(parent1 != parent2){
            parent[s] = d;
            return true;
        }
        else{
            return false;
        }
    }
    
    private static int getParent(int elem,int parent[]){
       while(elem != parent[elem]){
           elem  = parent[elem];
       } 
       return parent[elem]; 
    }
}


class Edge implements Comparable<Edge>{
    int source;
    int dest;
    int weight;
    public Edge(int source,int dest,int weight){
        this.source = source;
        this.dest = dest;
        this.weight = weight;
    }
    
    public int compareTo(Edge e){
        return this.weight - e.weight;
    }
}
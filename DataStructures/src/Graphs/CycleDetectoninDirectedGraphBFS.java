package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDetectoninDirectedGraphBFS {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> adjacencyLists = new ArrayList<ArrayList<Integer>>();
		int vertices = 4;

		// first arraylists is for storing vertices and second arraylists is for storing
		// adjacent vertices

		for (int i = 0; i < vertices; i++) {
			adjacencyLists.add(new ArrayList<Integer>());
		}
		addinGraph(adjacencyLists, 0, 1);
		addinGraph(adjacencyLists, 1, 2);
		addinGraph(adjacencyLists, 2, 3);
		addinGraph(adjacencyLists, 3, 1);
		

		
		topologicalSorting(adjacencyLists);

	}
	public static void addinGraph(ArrayList<ArrayList<Integer>> adjList, int fromVertex, int toVertex) {
		// it is undirected graph.
		adjList.get(fromVertex).add(toVertex);
	}
	public static void topologicalSorting(ArrayList<ArrayList<Integer>> adjList) {
		
		//calculating indegree of every vertex looping through its adjacency list:
		int inDegree[] = new int[adjList.size()];
		for (int i = 0; i < adjList.size(); i++) {
			for (Integer edge : adjList.get(i)) {
				inDegree[edge] = inDegree[edge] + 1;
			}
		}
		
		//create a queue and all all vertices whose indegree is 0
		Queue<Integer> zeroIndegreeVertices=new LinkedList<Integer>();
		checkInDegrees(inDegree,zeroIndegreeVertices);
		
		int count=0;
		while(!zeroIndegreeVertices.isEmpty()) {
			int dequeue=zeroIndegreeVertices.poll();
			System.out.print(dequeue+" ");
			for(int i:adjList.get(dequeue)) {
				inDegree[i]=inDegree[i]-1;
				if(inDegree[i]==0) {
					zeroIndegreeVertices.add(i);
				}
			}
			count++;
		}
		
		//count is not equal to vertices
		if(count!=adjList.size()) {
			System.out.println("Cyclic Graph");
		}
		
	}
	
	public static void checkInDegrees(int inDegree[],Queue<Integer> zeroIndegreeVertices){
		for(int i=0;i<inDegree.length;i++) {
			if(inDegree[i]==0) {
				zeroIndegreeVertices.add(i);
			}
		}
	}

}

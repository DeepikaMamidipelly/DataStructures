package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
	public static void main(String args[]) {
		ArrayList<ArrayList<Integer>> adjacencyLists = new ArrayList<ArrayList<Integer>>();
		int vertices = 4;

		// first arraylists is for storing vertices and second arraylists is for storing
		// adjacent vertices

		for (int i = 0; i < vertices; i++) {
			adjacencyLists.add(new ArrayList<Integer>());
		}
		addinGraph(adjacencyLists, 0, 1);
		addinGraph(adjacencyLists, 0, 2);
		addinGraph(adjacencyLists, 1, 2);
		addinGraph(adjacencyLists, 1, 3);

		/// printGraph(adjacencyLists);
		BFSGraph(adjacencyLists, vertices, 0);

	}

	public static void addinGraph(ArrayList<ArrayList<Integer>> adjList, int fromVertex, int toVertex) {
		// it is undirected graph.
		adjList.get(fromVertex).add(toVertex);
		adjList.get(toVertex).add(fromVertex);
	}
	
	
	public static void BFSGraph(ArrayList<ArrayList<Integer>> adjList,int vertices,int source) {
		boolean visited[]=new boolean[vertices];
		visited[source]=true;
		Queue<Integer> visitedVertices=new LinkedList<Integer>();
		visitedVertices.add(source);
		
		while(!visitedVertices.isEmpty()) {
			int dequeued=visitedVertices.poll();
			System.out.print(dequeued+" ");
			for(int i:adjList.get(dequeued)) {
				if(visited[i]==false) {
					visitedVertices.add(i);
					visited[i]=true;
				}
			}
		}
	}

}

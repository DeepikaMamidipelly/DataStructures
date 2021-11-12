package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DepthFirstSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> adjacencyLists = new ArrayList<ArrayList<Integer>>();
		int vertices = 5;

		// first arraylists is for storing vertices and second arraylists is for storing
		// adjacent vertices

		for (int i = 0; i < vertices; i++) {
			adjacencyLists.add(new ArrayList<Integer>());
		}
		addinGraph(adjacencyLists, 0, 1);
		addinGraph(adjacencyLists, 0, 2);
		addinGraph(adjacencyLists, 1, 2);
		addinGraph(adjacencyLists, 1, 3);
		addinGraph(adjacencyLists, 2, 4);

		/// printGraph(adjacencyLists);
		DFSGraph(adjacencyLists, vertices, 0);
	}

	public static void addinGraph(ArrayList<ArrayList<Integer>> adjList, int fromVertex, int toVertex) {
		// it is undirected graph.
		adjList.get(fromVertex).add(toVertex);
		adjList.get(toVertex).add(fromVertex);
	}

	public static void DFSGraph(ArrayList<ArrayList<Integer>> adjList, int vertices, int source) {
		boolean visited[] = new boolean[vertices];
		
		DFSGraphRecursion(adjList,visited,source);
	}

	public static void DFSGraphRecursion(ArrayList<ArrayList<Integer>> adjList, boolean visited[], int source) {
		visited[source]=true;
		System.out.print(source+" ");
		for(int i:adjList.get(source)) {
			if(visited[i]==false) {
				DFSGraphRecursion(adjList,visited,i);
			}
		}
	}
}

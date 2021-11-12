package Graphs;

import java.util.ArrayList;

public class AdjacencyListGraphCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we creating graphs using ArrayList of ArrayLists
		// we can also use ArrayList of Linkedlists but arraylists are cachefriendly

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

		printGraph(adjacencyLists);

	}

	public static void addinGraph(ArrayList<ArrayList<Integer>> adjList, int fromVertex, int toVertex) {
		// it is undirected graph.
		adjList.get(fromVertex).add(toVertex);
		adjList.get(toVertex).add(fromVertex);
	}

	public static void printGraph(ArrayList<ArrayList<Integer>> graph) {
		for (int i = 0; i < graph.size(); i++) {
			System.out.print("Vertex is " + i + "  ;AdjacencyLists :");
			for (int j = 0; j < graph.get(i).size(); j++) {
				System.out.print(graph.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
}
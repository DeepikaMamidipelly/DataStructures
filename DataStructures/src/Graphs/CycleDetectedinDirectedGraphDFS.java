package Graphs;

import java.util.ArrayList;

public class CycleDetectedinDirectedGraphDFS {

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
		

		printGraph(adjacencyLists, 0);
		detectCycle(adjacencyLists, 0);

	}

	public static void addinGraph(ArrayList<ArrayList<Integer>> adjList, int fromVertex, int toVertex) {
		// it is undirected graph.
		adjList.get(fromVertex).add(toVertex);
	}

	public static void printGraph(ArrayList<ArrayList<Integer>> adjList, int source) {
		for (int i = 0; i < adjList.size(); i++) {
			System.out.print("Vertex is " + i + "  ;AdjacencyLists :");
			for (Integer edges : adjList.get(i)) {
				System.out.print(edges + " ");
			}
			System.out.println();
		}
	}

	public static void detectCycle(ArrayList<ArrayList<Integer>> adjList, int source) {
		boolean visited[] = new boolean[adjList.size()];
		// boolean isCycleDetected = cycleDetectionMethod(adjList, source, visited);

		// System.out.print("Cycle detection is:" + isCycleDetected);
		visited[source] = true;
		boolean iscycleDetected = cycleDetectionMethod(adjList, false, source, visited);
		System.out.println("Cycle detected is:" + iscycleDetected);
	}

	public static boolean cycleDetectionMethod(ArrayList<ArrayList<Integer>> adjList, boolean detected, int source,
			boolean visited[]) {

		for (int i : adjList.get(source)) {
			if (visited[i] == false) {
				visited[i] = true;
				return cycleDetectionMethod(adjList, detected, i, visited);
			} else {
				detected = true;
			}
		}
		return detected;

	}
}

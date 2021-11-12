package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDetectionInUnDirectedGraphDFS {
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
		addinGraph(adjacencyLists, 1, 2);
		addinGraph(adjacencyLists, 1, 4);
		addinGraph(adjacencyLists, 2, 3);
		detectCycle(adjacencyLists, 0);
	}

	public static void addinGraph(ArrayList<ArrayList<Integer>> adjList, int fromVertex, int toVertex) {
		// it is undirected graph.
		adjList.get(fromVertex).add(toVertex);
		adjList.get(toVertex).add(fromVertex);
	}

	public static void detectCycle(ArrayList<ArrayList<Integer>> adjList, int source) {
		boolean visited[] = new boolean[adjList.size()];
		boolean isCycleDetected = cycleDetectionMethod(adjList, source, source, visited);

		System.out.print("Cycle detection is:" + isCycleDetected);
		visited[source] = true;
	}

	public static boolean cycleDetectionMethod(ArrayList<ArrayList<Integer>> adjList, int parent, int source,
			boolean visited[]) {

		for (int i : adjList.get(source)) {
			if (visited[i] == false) {
				visited[i] = true;
				cycleDetectionMethod(adjList, source, i, visited);
			} else {
				if (i != parent) {
					return true;
				}
			}
		}
		return false;

	}
}

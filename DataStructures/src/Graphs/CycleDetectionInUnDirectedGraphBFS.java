package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDetectionInUnDirectedGraphBFS {

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
		addinGraph(adjacencyLists, 1, 3);
		addinGraph(adjacencyLists, 0, 3);
		detectCycle(adjacencyLists,0);
	}

	public static void addinGraph(ArrayList<ArrayList<Integer>> adjList, int fromVertex, int toVertex) {
		// it is undirected graph.
		adjList.get(fromVertex).add(toVertex);
		adjList.get(toVertex).add(fromVertex);
	}

	public static void detectCycle(ArrayList<ArrayList<Integer>> adjList, int source) {
		boolean visited[] = new boolean[adjList.size()];
		boolean isCycleDetected = cycleDetectionMethod(adjList, source, visited);

		System.out.print("Cycle detection is:" + isCycleDetected);
	}

	public static boolean cycleDetectionMethod(ArrayList<ArrayList<Integer>> adjList, int source, boolean visited[]) {
		Queue<Integer> queueList = new LinkedList<Integer>();
		queueList.add(source);

		visited[source] = true;
		int parent[] = new int[adjList.size()];
		parent[source]=source;
		while (!queueList.isEmpty()) {
			int dequeue = queueList.poll();
			for (int i : adjList.get(dequeue)) {
				if (visited[i] == false) {
					visited[i] = true;
					queueList.add(i);
					parent[i]=dequeue;
				} else {
					if (i != parent[dequeue]) {
						return true;
					}
				}

			}
		}
		return false;
	}
}

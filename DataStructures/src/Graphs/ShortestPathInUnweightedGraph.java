package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInUnweightedGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> adjacencyLists = new ArrayList<ArrayList<Integer>>();
		int vertices = 6;

		// first arraylists is for storing vertices and second arraylists is for storing
		// adjacent vertices

		for (int i = 0; i < vertices; i++) {
			adjacencyLists.add(new ArrayList<Integer>());
		}
		addinGraph(adjacencyLists, 0, 1);
		addinGraph(adjacencyLists, 0, 2);
		addinGraph(adjacencyLists, 0, 4);
		addinGraph(adjacencyLists, 1, 3);
		addinGraph(adjacencyLists, 2, 4);
		addinGraph(adjacencyLists, 3, 5);
		addinGraph(adjacencyLists, 4, 5);
		
		shortestPath(adjacencyLists,0);
	}

	public static void addinGraph(ArrayList<ArrayList<Integer>> adjList, int fromVertex, int toVertex) {
		// it is undirected graph.
		adjList.get(fromVertex).add(toVertex);
		adjList.get(toVertex).add(fromVertex);
	}

	public static void shortestPath(ArrayList<ArrayList<Integer>> adjList, int source) {
		int distance[] = new int[adjList.size()];
		boolean visited[] = new boolean[adjList.size()];
		distance[source] = 0;
		for (int i = 1; i < distance.length; i++) {
			if (i != source) {
				distance[i] = (int) Double.POSITIVE_INFINITY;
			}
		}
		findShortestPath(adjList,distance,visited,source);
	}

	public static void findShortestPath(ArrayList<ArrayList<Integer>> adjList, int distance[],boolean visited[], int source) {
		Queue<Integer> queueList=new LinkedList<Integer>();
		visited[source]=true;
		queueList.add(source);
		while(!queueList.isEmpty()) {
			int dequeued=queueList.poll();
			for(int i:adjList.get(dequeued)) {
				if(visited[i]==false) {
					//go on adding distances by creating one
				distance[i]=distance[dequeued]+1;
				visited[i]=true;
				queueList.add(i);
				}	
			}
		}
		System.out.println("Shortest Path in Unweighted Graph");
		for(int i=0;i<distance.length;i++) {
			System.out.print(distance[i]+" ");
		}
	}
}

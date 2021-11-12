package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathinDAGWeighted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Edge>> adjacencyLists = new ArrayList<ArrayList<Edge>>();
		int vertices = 4;
		// first arraylists is for storing vertices and second arraylists is for storing
		// adjacent vertices

		for (int i = 0; i < vertices; i++) {
			adjacencyLists.add(new ArrayList<Edge>());
		}
		// Edge x=new Edge(1, 2);
		//addinGraph(adjacencyLists, 0, new Edge(1, 2));
		//addinGraph(adjacencyLists, 0, new Edge(4, 1));
		//addinGraph(adjacencyLists, 1, new Edge(2, 3));
		//addinGraph(adjacencyLists, 4, new Edge(2, 2));
		//addinGraph(adjacencyLists, 2, new Edge(3, 6));
		//addinGraph(adjacencyLists, 4, new Edge(5, 4));
		//addinGraph(adjacencyLists, 5, new Edge(3, 1));
		
		addinGraph(adjacencyLists, 0, new Edge(1, 1));
		addinGraph(adjacencyLists, 1, new Edge(2, 3));
		addinGraph(adjacencyLists, 1, new Edge(3, 2));
		addinGraph(adjacencyLists, 2, new Edge(3, 4));
		
		printGraph(adjacencyLists);
		topoOfBFS(adjacencyLists,1);
	}

	public static void addinGraph(ArrayList<ArrayList<Edge>> adjList, int fromVertex, Edge edges) {
		// it is undirected graph.
		// Edge e=new Edge(toVertex, weight);
		adjList.get(fromVertex).add(edges);
	}

	public static void printGraph(ArrayList<ArrayList<Edge>> graph) {
		for (int i = 0; i < graph.size(); i++) {
			System.out.print("Vertex is " + i + "  ;AdjacencyLists :");
			for (Edge j : graph.get(i)) {
				System.out.print("("+j.toVertex+","+j.weight+")"+" ");
			}
			System.out.println();
		}
	}
	
	public static void topoOfBFS(ArrayList<ArrayList<Edge>> adjList,int source) {
		boolean visited[]=new boolean[adjList.size()];
		int inDegree[]=new int[adjList.size()];
		Double distance[]=new Double[adjList.size()];
		//calculating inDegree
		for(int i=0;i<adjList.size();i++) {
			for(Edge edge:adjList.get(i)) {
				inDegree[edge.toVertex]=inDegree[edge.toVertex]+1;
			}
		}
		Queue<Integer> queueList=new LinkedList<Integer>();
		
		//checking inDegrees and addinf infinity distances to all vertices
		for(int i=0;i<inDegree.length;i++) {
			distance[i]= Double.POSITIVE_INFINITY;
			if(inDegree[i]==0) {
				queueList.add(i);
			}
		}
		
		System.out.println("Shortest Path BEfore");
		for(int i=0;i<distance.length;i++) {
			System.out.print(distance[i]+" ");
		}
		
		//setting source distance to 0
		distance[source]=(double) 0;
		
		
		System.out.println("Topological Order:");
		System.out.println();
		while(!queueList.isEmpty()) {
			int dequeue=queueList.poll();
			System.out.print(dequeue+" ");
			for(Edge i:adjList.get(dequeue)) {
				
				if(distance[i.toVertex]>distance[dequeue]+i.weight) {
					distance[i.toVertex]=distance[dequeue]+i.weight;
				}
				inDegree[i.toVertex]=inDegree[i.toVertex]-1;
				if(inDegree[i.toVertex]==0) {
					queueList.add(i.toVertex);
				}
			}
		}
		
		
		System.out.println("Shortest Path");
		for(int i=0;i<distance.length;i++) {
			System.out.print(distance[i]+" ");
		}
	}
}


//it has toVertex and weight
class Edge {
	int toVertex;
	int weight;

	Edge(int toVertex, int weight) {
		this.toVertex = toVertex;
		this.weight = weight;
	}
}
package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class DFSTopologicalSorting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<Integer>> adjacencyLists = new ArrayList<ArrayList<Integer>>();
		int vertices = 6;

		// first arraylists is for storing vertices and second arraylists is for storing
		// adjacent vertices

		for (int i = 0; i < vertices; i++) {
			adjacencyLists.add(new ArrayList<Integer>());
		}
		addinGraph(adjacencyLists, 5, 0);
		addinGraph(adjacencyLists, 5, 2);
		addinGraph(adjacencyLists, 4, 0);
		addinGraph(adjacencyLists, 4, 1);
		addinGraph(adjacencyLists, 2, 3);
		addinGraph(adjacencyLists, 3, 1);
		topologicalSorting(adjacencyLists);
	}
	
	public static void addinGraph(ArrayList<ArrayList<Integer>> adjList, int fromVertex, int toVertex) {
		// it is undirected graph.
		adjList.get(fromVertex).add(toVertex);
	}
	
	public static void topologicalSorting(ArrayList<ArrayList<Integer>> adjList) {
		
		//create a stack and add elements into stack after traversing through all its adjacents
		Stack<Integer> stackList=new Stack<Integer>();
		
		boolean visited[]=new boolean[adjList.size()];
		//making sure all vertices are visited.
		for(int i=0;i<adjList.size();i++) {
			//if vertices are not visited..dfs
			if(visited[i]==false) {
				visited[i]=true;
				topologicalSortingRecursive(adjList,visited,i,stackList);
			}
		}
		
		while(!stackList.isEmpty()) {
			System.out.print(stackList.pop()+" ");
		}
	}
	
	public static void topologicalSortingRecursive(ArrayList<ArrayList<Integer>> adjList,boolean visited[],int source,Stack<Integer> stack) {
		
		for(int adjacent:adjList.get(source)) {
			//if adjacent is not visited
			if(visited[adjacent]==false) {
				//make adjacent vertex as visited and call recursive to check its adjcents
				visited[adjacent]=true;
				topologicalSortingRecursive(adjList,visited,adjacent,stack);
			}
		}
		
		//if no adjacency vertices then that means push it into the stack
		stack.push(source);
	}
}

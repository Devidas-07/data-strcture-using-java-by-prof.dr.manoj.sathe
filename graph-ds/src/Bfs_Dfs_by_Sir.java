import java.util.*; //Inporting ArrayList class
import java.util.LinkedList;
import java.util.Queue;

public class Bfs_Dfs_by_Sir
{
	static class Edge //Structure of Edgge which represents Source and Destination 
	{
		int src;
		int dest;
		
		public Edge(int s,int d)
		{
			this.src = s;
			this.dest = d;
		}
	}
	
	public static void createGraph(ArrayList<Edge> graph[])
	{
		for(int i=0;i<graph.length;i++) //First we have to create an empty arraylist at each null location
		{
			graph[i] = new ArrayList<Edge>(); //Creation of an empty arraylist at each index which is null initially
		}
		graph[0].add(new Edge(0, 1));
		graph[0].add(new Edge(0, 2));
		
		graph[1].add(new Edge(1, 0));
		graph[1].add(new Edge(1, 3));
		
		graph[2].add(new Edge(2, 0));
		graph[2].add(new Edge(2, 4));
		
		graph[3].add(new Edge(3, 1));
		graph[3].add(new Edge(3, 4));
		graph[3].add(new Edge(3, 5));
		
		graph[4].add(new Edge(4, 2));
		graph[4].add(new Edge(4, 3));
		graph[4].add(new Edge(4, 5));
		
		graph[5].add(new Edge(5, 3));
		graph[5].add(new Edge(5, 4));
		graph[5].add(new Edge(5, 6));
		
		graph[6].add(new Edge(6, 5));
	}
	
	public static void bfs_traversal(ArrayList<Edge> graph[], int V)
	{
		Queue<Integer> q = new LinkedList(); //We will first require Queue, here we are creating it
		boolean visited[] = new boolean[V]; //We will create Visitied Array, here we are creating it
		q.add(0); //This is starting point
		while(!q.isEmpty())
		{
			int current = q.remove();
			if(visited[current]==false)
			{
				System.out.print(current+" "); //Print current
				visited[current] = true;
				for(int i = 0;i<graph[current].size();i++) //To find all neighbours of current and add them in queue
				{
					Edge e = graph[current].get(i);
					q.add(e.dest); //All destinations of current are neighbours 
				}
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		int V = 7; //Number of Vertices are 7 , Intially declared by Us 
		
		ArrayList<Edge> graph[]=new ArrayList[V]; //Creating ArrayList for Edges with size of V = 7
		
		createGraph(graph);
		
		bfs_traversal(graph,V);
		System.out.println();
	}
}
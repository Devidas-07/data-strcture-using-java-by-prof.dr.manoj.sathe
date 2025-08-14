import java.util.ArrayList;

public class GraphCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Edge>[] graph= new ArrayList[4];
		
		createGraph(graph);
		System.out.println("graph");
		for (ArrayList<Edge> arrayList : graph) {
			for (Edge data : arrayList) {
				System.out.print(data.src+" ");
			}
		}
		printNeighbours(graph);
	}
	public static void createGraph(ArrayList<Edge> graph[]) {
		for(int i=0; i<graph.length; i++) {
			graph[i]=new ArrayList<Edge>();
		}
		Edge e1 = new Edge(1,2);
		Edge e2 = new Edge(2,1);
		Edge e3 = new Edge(2,4);
		Edge e4 = new Edge(2,3);
		Edge e5 = new Edge(3,2);
		Edge e6 = new Edge(3,4);
		Edge e7 = new Edge(4,2);
		Edge e8 = new Edge(4,3);
		graph[0].add(e1);
		graph[1].add(e2);
		graph[1].add(e3);
		graph[1].add(e4);
		graph[2].add(e5);
		graph[2].add(e6);
		graph[3].add(e7);
		graph[3].add(e8);
	}
	public static void printNeighbours(ArrayList<Edge>[] al) {
		Edge e;
		e =al[1].get(0);
		System.out.println("\nneighbours of "+e.src);
		for(int i=0; i<al[1].size(); i++) {
			 e = al[1].get(i);
			System.out.println(e.dest);
		}
	}

}
class Edge{
	int src;
	int dest;
	//Edge e[];
	public Edge(int data, int dest) {
		this.src=data;
		this.dest=dest;
	}
}
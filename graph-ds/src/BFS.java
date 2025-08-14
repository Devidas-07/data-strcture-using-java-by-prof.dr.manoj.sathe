import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public static void main(String[] args) {
		
		
		ArrayList<Vertices> []graphds = new ArrayList[6];
		creationofGraph(graphds);
		System.out.println("graph ds");
		for(ArrayList<Vertices> gds:graphds) {
			for(Vertices v: gds) {
				System.out.print(v.src+" ");
				
			}
		}
		System.out.println("neighbours");
		printNeighbours(graphds);
		
		System.out.println("BFS");
		bfs(graphds);
		

	}
	public static void printNeighbours(ArrayList<Vertices>[] gds) {
		Vertices v = gds[0].get(0);
		System.out.println("print neighbours of "+v.src);
		for(int i=0; i<gds[0].size(); i++) {
			v=gds[0].get(i);
			System.out.println(v.dest);
		}
	}
	public static void creationofGraph(ArrayList<Vertices>[] graphds) {
		for(int i=0; i<graphds.length; i++) {
			graphds[i]=new ArrayList<Vertices>();
		}
		graphds[0].add(new Vertices(10, 1));
		graphds[0].add(new Vertices(0, 2));
		graphds[1].add(new Vertices(1, 3));
		graphds[1].add(new Vertices(1, 0));
		graphds[2].add(new Vertices(2, 0));
		graphds[2].add(new Vertices(2, 4));
		graphds[3].add(new Vertices(4, 2));
		graphds[3].add(new Vertices(4, 3));
		graphds[4].add(new Vertices(5, 3));
		graphds[4].add(new Vertices(5, 4));
		graphds[4].add(new Vertices(5, 6));
		graphds[5].add(new Vertices(6, 5));
	}
	public static void bfs(ArrayList<Vertices>[] gds) {
		Queue<Integer> q = new LinkedList<Integer>();
		boolean [] visited= new boolean[6];
		HashMap<K, V>
		q.add(0);
		while(!q.isEmpty()) {
			int current = q.remove();
			if(visited[current]==false) {
				
				System.out.println(current+" ");
				visited[current]=true;
				for(int i=0; i<gds[current].size(); i++) {
					Vertices v = gds[current].get(i);
					q.add(v.dest);
				}
			}
		}
	}

}
class Vertices{
	int src;
	int dest;
	public Vertices(int src, int dest) {
		this.src=src;
		this.dest=dest;
	}
}

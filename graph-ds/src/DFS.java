//
//public class DFS {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//	public static void dfs(graph, curr, visited[]) {
//		print(curr);
//		visited[curr]=true;
//		for(int i=0;i<graph[curr].size(); i++) {
//			Edge e = graph[curr].get(i);
//			dfs(graph, e.dest, visited);//recursive
//		}
//	}
//
//}

import java.util.LinkedList;
import java.util.Queue;

public class DFS{
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(8);
		q.add(82);
		q.add(28);
		q.add(58);
		System.out.println(q);
		
		System.out.println(q.remove());
		System.out.println(q);
		
		
	}
}
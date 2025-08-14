import java.util.*;

class GraphTraversal {
    static class Node {
        int data;
        Node(int data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Node node = (Node) obj;
            return data == node.data;
        }

        @Override
        public int hashCode() {
            return Objects.hash(data);
        }
    }

    private Map<Node, List<Node>> adjacencyList;

    public GraphTraversal() {
        adjacencyList = new HashMap<>();
    }

    public void addEdge(int srcData, int destData) {
        Node src = new Node(srcData);
        Node dest = new Node(destData);

        adjacencyList.computeIfAbsent(src, k -> new ArrayList<>()).add(dest);
        adjacencyList.computeIfAbsent(dest, k -> new ArrayList<>()).add(src); // Assuming an undirected graph
    }

    public void BFS(int startNodeData) {
        Node startNode = new Node(startNodeData);
        if (!adjacencyList.containsKey(startNode)) {
            System.out.println("Start node not found in the graph.");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        Set<Node> visited = new HashSet<>();

        queue.offer(startNode);
        visited.add(startNode);

        System.out.println("Breadth-First Search starting from " + startNodeData + ":");

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            List<Node> neighbors = adjacencyList.getOrDefault(current, new ArrayList<>());
            for (Node neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
        System.out.println();
    }

    public void DFS(int startNodeData) {
        Node startNode = new Node(startNodeData);
        if (!adjacencyList.containsKey(startNode)) {
            System.out.println("Start node not found in the graph.");
            return;
        }

        Set<Node> visited = new HashSet<>();
        System.out.println("Depth-First Search starting from " + startNodeData + ":");
        DFSUtil(startNode, visited);
        System.out.println();
    }

    private void DFSUtil(Node currentNode, Set<Node> visited) {
        visited.add(currentNode);
        System.out.print(currentNode.data + " ");

        List<Node> neighbors = adjacencyList.getOrDefault(currentNode, new ArrayList<>());
        for (Node neighbor : neighbors) {
            if (!visited.contains(neighbor)) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        GraphTraversal graph = new GraphTraversal();

        // Add edges based on your provided graph image
        graph.addEdge(100, 20);
        graph.addEdge(100, 30);
        graph.addEdge(20, 40);
        graph.addEdge(30, 50);
        graph.addEdge(40, 70);
        graph.addEdge(40, 60);

        System.out.println("Graph Adjacency List:");
        for (Map.Entry<Node, List<Node>> entry : graph.adjacencyList.entrySet()) {
           // System.out.print(entry.getKey.data + " -> ");
            for (Node neighbor : entry.getValue()) {
                System.out.print(neighbor.data + " ");
            }
            System.out.println();
        }
        System.out.println();

        graph.BFS(100); // Perform BFS starting from node 10
        graph.DFS(100); // Perform DFS starting from node 10
    }
}
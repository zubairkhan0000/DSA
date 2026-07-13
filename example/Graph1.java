import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph1 {
    private int V;
    private List<List<Integer>> adjList;
    private Map<Integer, List<Integer>> adjMap;
    private int[][] adjMatrix;

    public Graph1(int V) {
        this.V = V;
        this.adjList = new ArrayList<>(V);
        this.adjMap = new HashMap<>();
        this.adjMatrix = new int[V][V];
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
            adjMap.put(i, new ArrayList<>());
        }
    }

    public void addEdgeList(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void addEdgeMap(int u, int v) {
        adjMap.get(u).add(v);
        adjMap.get(v).add(u);
    }

    public void addEdgeMatrix(int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
    }

    public void printAdjList() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public void printAdjMap() {
        for (Map.Entry<Integer, List<Integer>> entry : adjMap.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (int neighbor : entry.getValue()) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
    public void printAdjMatrix() {
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Graph1 graph = new Graph1(5);
        graph.addEdgeMatrix(0, 1);
        graph.addEdgeMatrix(0, 2);
        graph.addEdgeMatrix(1, 3);
        graph.addEdgeMatrix(2, 4);
    
        System.out.println("Adjacency Matrix:");
        graph.printAdjMatrix();
    }
    
    
}

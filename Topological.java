import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Topological {
    public static List<Integer> topologicalSort(List<List<Integer>> graph, int V) {
        int[] inDegree = new int[V];
        for (int u = 0; u < V; u++) {
            for (int v : graph.get(u)) {
                inDegree[v]++;
            }
        }
        Queue<Integer> q1 = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
                q1.offer(i);
            }
        }
        List<Integer> l1 = new ArrayList<>();
        while (!q1.isEmpty()) {
            int u = q1.poll();
            l1.add(u);
            for (int v : graph.get(u)) {
                inDegree[v]--;
                if (inDegree[v] == 0) {
                    q1.offer(v);
                }
            }
        }
        return l1;
    }

    public static void addEdge(List<List<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
    }

    public static void main(String[] args) {
        int V = 6;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        
        addEdge(graph, 5, 2);
        addEdge(graph, 5, 0);
        addEdge(graph, 4, 0);
        addEdge(graph, 4, 1);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 1);

        List<Integer> sorted = topologicalSort(graph, V);
        System.out.println("Topological Order: " + sorted);
    }
}

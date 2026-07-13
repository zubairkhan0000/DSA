import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    private int V;
    private int[][] adjMatrix;
    private boolean[] visited;

    public Bfs(int V) {
        this.V = V;
        this.adjMatrix = new int[V][V];
        this.visited = new boolean[V];
    }

    public void addEdge(int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
    }

    public void bfs(int source){
        for(int i=0;i<V;i++){
            visited[i]=false;
        }
        Queue<Integer> queue=new LinkedList<>();
        //enqueue
        visited[source]=true;
        queue.offer(source);
        while(!queue.isEmpty()){
            //dequeue
            int vertex=queue.poll();
            System.out.println(vertex+" ");
            for (int neighbor = 0; neighbor < V; neighbor++) {
                if (adjMatrix[vertex][neighbor] == 1 && !visited[neighbor]) {
                    visited[neighbor] = true; 
                    queue.offer(neighbor);
                }
            }
            

        }
    }
    public static void main(String[] args) {
        Bfs d1=new Bfs(5);
        d1.addEdge(0, 1);
        d1.addEdge(0, 2);
        d1.addEdge(1, 2);
        d1.addEdge(1, 3);
        d1.addEdge(2, 3);
        d1.addEdge(2, 4);
        d1.addEdge(3, 4);
        System.out.println("Bfs result:");
        d1.bfs(1);
    }
}
    


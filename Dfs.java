public class Dfs {
    private int V;
    private int[][] adjMatrix;
    private boolean[] visited;
    public Dfs(int V){
        this.V=V;
        this.adjMatrix=new int[V][V];
        this.visited=new boolean[V];
    }
    public void addEdge(int u,int v){
        adjMatrix[u][v]=1;
        adjMatrix[v][u]=1;
    }
    public void dfs(int source){
        for(int i=0;i<V;i++){
            visited[i]=false;
        }
        dfsUtil(source);
    }
    public void dfsUtil(int vertex){
        visited[vertex]=true;
        System.out.println(vertex+" ");
        for(int neighbor=0;neighbor<V;neighbor++){
            if(adjMatrix[vertex][neighbor]==1&&!visited[neighbor]){
                dfsUtil(neighbor);
            }
        }
    }
    public static void main(String[] args) {
        Dfs d1=new Dfs(5);
        d1.addEdge(0, 1);
        d1.addEdge(0, 2);
        d1.addEdge(1, 2);
        d1.addEdge(1, 3);
        d1.addEdge(2, 3);
        d1.addEdge(2, 4);
        d1.addEdge(3, 4);
        System.out.println("Dfs result:");
        d1.dfs(1);

        
        
    }

}

import java.util.ArrayList;
import java.util.List;

interface Test{
    void addEdge(int source,int destination);
    void removeEdge(int source,int destination);
    boolean isAdjacent( int vertex1,int vertex2);
    List<Integer> getNeighbors(int vertex);
    int getDegree(int vertex);
    int getVertices();
    int getEdges();
}
class Graph implements Test{
    private int numVertices;
    private boolean[] [] adjecencyMatrix;
    public Graph(int numVertices){
        this.numVertices=numVertices;
        this.adjecencyMatrix=new boolean[numVertices][numVertices];
    }
    public void addEdge(int source,int destination){
        if(source>=0&&source<numVertices&&destination>=0&&destination<numVertices){
            adjecencyMatrix[source][destination]=true;
            adjecencyMatrix[destination][source]=true;
        }
    }
    @Override
    public void removeEdge(int source, int destination) {
        if(source>=0&&source<numVertices&&destination>=0&&destination<numVertices){
            adjecencyMatrix[source][destination]=false;
            adjecencyMatrix[destination][source]=false;
        }
        
    }
    @Override
    public boolean isAdjacent(int vertex1, int vertex2) {
        if(vertex1>=0&&vertex1<numVertices&&vertex2>=0&&vertex2<numVertices){
            return adjecencyMatrix[vertex1][vertex2];
        }
        else{
            System.out.println("invalid vertices");
            return false;
        }    
    }
    @Override
    public List<Integer> getNeighbors(int vertex) {
        List<Integer> l1=new ArrayList<>();
        if(vertex>=0&&vertex<numVertices){
            for(int i=0;i<numVertices;i++){
                l1.add(i);
            }
        }
        else{
            System.out.println("invalid vertices");
        }
        return l1;
    }
    @Override
    public int getDegree(int vertex) {
        if(vertex>=0&&vertex<numVertices){
            int degree=0;
            for(int i=0;i<numVertices;i++){
                if(adjecencyMatrix[vertex][i]){
                    degree++;
                }
            }
            return degree;
        }
        else{
            System.out.println("invalid");
        }
        return-1;    
    }
    @Override
    public int getVertices() {
        return numVertices;
    }
    @Override
    public int getEdges() {
        int count=0;
        for(int i=0;i<numVertices;i++){
            for(int j=0;j<numVertices;j++){
                if(adjecencyMatrix[i][j]){
                    count++;
                }
            }
        
        }
        return count;
    }
}
public class GraphAdt {
    public static void main(String[] args) {
        Graph g1=new Graph(7);
        g1.addEdge(0,1);
        g1.addEdge(0,2);
        g1.addEdge(1,3);
        g1.addEdge(1,4);
        g1.addEdge(2,4);
        System.out.println("Number of vertices: " + g1.getVertices());
        System.out.println("Number of edges: " + g1.getEdges());
        System.out.println("Are vertex 1 and vertex 2 adjacent?: " + g1.isAdjacent(1, 2));
        System.out.println("Are vertex 0 and vertex 3 adjacent?: " +g1.isAdjacent(0, 3));
        System.out.println("Neighbors of vertex 1: "+g1.getNeighbors(1));
        System.out.println("Degree of vertex 2: "+g1.getDegree(2));
    }
    
}


import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
    
    
    
class GraphAdjList{
    private int V; // number of vertices
    private List<List<Integer>> adjList;

    public GraphAdjList(int V) {
        this.V = V;
        adjList = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u); // remove for directed graph
    }

    public void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
    
    public static ArrayList<Integer> bfsOfGraph(int V, List<List<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);
        vis[0] = true;
        
        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);
            
            for(Integer it: adj.get(node)){
                if(vis[it] == false){
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }

    public static void main(String[] args) {
        GraphAdjList graph = new GraphAdjList(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();
        
        ArrayList<Integer> bfsTraverse = bfsOfGraph(graph.V, graph.adjList);
        for(int i=0; i<bfsTraverse.size(); i++){
            System.out.print(bfsTraverse.get(i) + " ");            
        }
    }
}

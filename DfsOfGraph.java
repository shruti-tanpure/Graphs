import java.util.List;
import java.util.ArrayList;

class GraphAdjList {
    int V; // number of vertices
    List<List<Integer>> adjList;

    public GraphAdjList(int V) {
        this.V = V;
        adjList = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u); // undirected graph
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

    // DFS driver function
    public static ArrayList<Integer> dfsOfGraph(int V, List<List<Integer>> adj) {
        ArrayList<Integer> ls = new ArrayList<>();
        boolean[] vis = new boolean[V];

        dfs(0, vis, adj, ls); // start DFS from node 0
        return ls;
    }

    // DFS recursive function
    private static void dfs(int node, boolean[] vis,
                            List<List<Integer>> adj,
                            ArrayList<Integer> ls) {

        vis[node] = true;
        ls.add(node);

        for (int it : adj.get(node)) {
            if (!vis[it]) {
                dfs(it, vis, adj, ls);
            }
        }
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

        ArrayList<Integer> dfsTraverse =
                dfsOfGraph(graph.V, graph.adjList);

        System.out.println("DFS Traversal:");
        for (int node : dfsTraverse) {
            System.out.print(node + " ");
        }
    }
}

# Graphs
I am studying graphs and pushing my code(in Java) here.

Java Version 17

Graphs?
-> Graphs are a non-linear data structure consisting of nodes(vertices) and edges. The nodes may contain data and are connected by edges. They have a varied application in real life, such as finding the shortest path, designing an optimal circuit, and connecting people on social media, among many other uses.

Properties:
1. Weighted - edges have values. eg: distance, capacity, etc.
2. Directed - edges between the vertex pairs have a direction.
3. Connected - all the vertices are connected through edges somehow, else it is a Disjoint/Isolated subgraph.  
   
Representation:
1. Adjacency List - has an array that contains all the vertices in the Graph, and each vertex has a Linked List (or Array) with the vertex's edges.
2. Adjacency Matrix - a 2D array, where every index (i,j) stores 1(or edge value) if i and j are connected, else 0, while also considering the direction of the edge.

Traversal:
1. Breadth-First-Traversal(bfs):
     a. graph traversal algorithm that starts from a source node and explores the graph level by level.
     b. Popular graph algorithms like Dijkstra's shortest path, Kahn's Algorithm, and Prim's algorithm are based on BFS.
     c. Time complexity is O(N)+O(2E), where E are the edges of the graph, and N is the number of nodes.
2. Depth-First-Traversal(dfs):
     a. graph traversal method that starts from a source vertex and explores each path completely before backtracking and exploring other paths.
     b. Time complexity is O(N)+O(2E). 

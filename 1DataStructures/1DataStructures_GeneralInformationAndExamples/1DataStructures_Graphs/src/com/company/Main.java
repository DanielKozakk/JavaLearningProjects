package com.company;

public class Main {

    public static void main(String[] args) {

        AdjacencyListGraphSecondImplementation adjacencyListGraph = new AdjacencyListGraphSecondImplementation(6);
        adjacencyListGraph.addVertex("Pierwszy");
        adjacencyListGraph.addVertex("Drugi");
        adjacencyListGraph.addVertex("Trzeci");
        adjacencyListGraph.addVertex("Czwarty");
        adjacencyListGraph.addVertex("Piąty");

        adjacencyListGraph.addEdge(0, 1);
        adjacencyListGraph.addEdge(1, 0);

        adjacencyListGraph.addEdge(0, 2);
        adjacencyListGraph.addEdge(2, 0);

        adjacencyListGraph.addEdge(2, 3);
        adjacencyListGraph.addEdge(3, 2);

        adjacencyListGraph.addEdge(2, 4);
        adjacencyListGraph.addEdge(4, 2);

        adjacencyListGraph.depthFirstTraversalImplementation();



    }
}

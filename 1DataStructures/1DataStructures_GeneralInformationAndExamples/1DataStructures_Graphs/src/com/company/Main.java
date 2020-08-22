package com.company;

public class Main {

    public static void main(String[] args) {

        AdjacencyMatrixGraphSecondImplementation adjacencyMatrixGraphImplementation = new AdjacencyMatrixGraphSecondImplementation(6);
        adjacencyMatrixGraphImplementation.addVertex();
        adjacencyMatrixGraphImplementation.addVertex();
        adjacencyMatrixGraphImplementation.addVertex();
        adjacencyMatrixGraphImplementation.addVertex();
        adjacencyMatrixGraphImplementation.addVertex();
        adjacencyMatrixGraphImplementation.addVertex();


        adjacencyMatrixGraphImplementation.addEdge(0, 1);
        adjacencyMatrixGraphImplementation.addEdge(1, 0);

        adjacencyMatrixGraphImplementation.addEdge(0, 2);
        adjacencyMatrixGraphImplementation.addEdge(2, 0);

        adjacencyMatrixGraphImplementation.addEdge(2, 3);
        adjacencyMatrixGraphImplementation.addEdge(3, 2);

        adjacencyMatrixGraphImplementation.addEdge(2, 4);
        adjacencyMatrixGraphImplementation.addEdge(4, 2);

        adjacencyMatrixGraphImplementation.addEdge(3, 5);
        adjacencyMatrixGraphImplementation.addEdge(5, 3);

        adjacencyMatrixGraphImplementation.depthFirstTraversalImplementation();



    }
}

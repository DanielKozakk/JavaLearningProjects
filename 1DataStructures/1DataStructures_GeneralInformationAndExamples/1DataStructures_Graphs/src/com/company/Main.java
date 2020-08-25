package com.company;

public class Main {

    public static void main(String[] args) {
//
//        AdjacencyMatrixGraphSecondImplementation adjacencyMatrixGraphImplementation = new AdjacencyMatrixGraphSecondImplementation(6);
//        adjacencyMatrixGraphImplementation.addVertex();
//        adjacencyMatrixGraphImplementation.addVertex();
//        adjacencyMatrixGraphImplementation.addVertex();
//        adjacencyMatrixGraphImplementation.addVertex();
//        adjacencyMatrixGraphImplementation.addVertex();
//        adjacencyMatrixGraphImplementation.addVertex();
//
//
//        adjacencyMatrixGraphImplementation.addEdge(0, 1);
//        adjacencyMatrixGraphImplementation.addEdge(1, 0);
//
//        adjacencyMatrixGraphImplementation.addEdge(0, 2);
//        adjacencyMatrixGraphImplementation.addEdge(2, 0);
//
//        adjacencyMatrixGraphImplementation.addEdge(2, 3);
//        adjacencyMatrixGraphImplementation.addEdge(3, 2);
//
//        adjacencyMatrixGraphImplementation.addEdge(2, 4);
//        adjacencyMatrixGraphImplementation.addEdge(4, 2);
//
//        adjacencyMatrixGraphImplementation.addEdge(3, 5);
//        adjacencyMatrixGraphImplementation.addEdge(5, 3);
//
//        adjacencyMatrixGraphImplementation.depthFirstTraversalImplementation();

        AdjacencyListGraphSecondImplementation adjacencyListGraphSecondImplementation = new AdjacencyListGraphSecondImplementation(9);

        adjacencyListGraphSecondImplementation.addVertex("Pierwszy");
        adjacencyListGraphSecondImplementation.addVertex("Drugi");
        adjacencyListGraphSecondImplementation.addVertex("Trzeci");
        adjacencyListGraphSecondImplementation.addVertex("Czwarty");
        adjacencyListGraphSecondImplementation.addVertex("Piąty");
        adjacencyListGraphSecondImplementation.addVertex("Szósty");
        adjacencyListGraphSecondImplementation.addVertex("Siódmy");
        adjacencyListGraphSecondImplementation.addVertex("Ósmy");
        adjacencyListGraphSecondImplementation.addVertex("Dziewiąty");

        adjacencyListGraphSecondImplementation.addEdge(0, 1);
        adjacencyListGraphSecondImplementation.addEdge(1, 0);

        adjacencyListGraphSecondImplementation.addEdge(0, 2);
        adjacencyListGraphSecondImplementation.addEdge(2, 0);

        adjacencyListGraphSecondImplementation.addEdge(0, 3);
        adjacencyListGraphSecondImplementation.addEdge(3, 0);

        adjacencyListGraphSecondImplementation.addEdge(1, 4);
        adjacencyListGraphSecondImplementation.addEdge(4, 1);
        adjacencyListGraphSecondImplementation.addEdge(1, 5);
        adjacencyListGraphSecondImplementation.addEdge(5, 1);

        adjacencyListGraphSecondImplementation.addEdge(2, 6);
        adjacencyListGraphSecondImplementation.addEdge(6, 2);
        adjacencyListGraphSecondImplementation.addEdge(2, 7);
        adjacencyListGraphSecondImplementation.addEdge(7, 2);

        adjacencyListGraphSecondImplementation.addEdge(3, 8);
        adjacencyListGraphSecondImplementation.addEdge(8, 3);

        adjacencyListGraphSecondImplementation.breadthFirstTraversalImplementation();



    }
}

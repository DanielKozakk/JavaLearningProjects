package com.company;

public class Main {

    public static void main(String[] args) {
//
//        AdjacencyMatrixGraphSecondImplementation adjacencyMatrixGraphImplementation = new AdjacencyMatrixGraphSecondImplementation(7);
//        adjacencyMatrixGraphImplementation.addVertex("Pierwszy");
//        adjacencyMatrixGraphImplementation.addVertex("Drugi");
//        adjacencyMatrixGraphImplementation.addVertex("Trzeci");
//        adjacencyMatrixGraphImplementation.addVertex("Czwarty");
//        adjacencyMatrixGraphImplementation.addVertex("Piąty");
//        adjacencyMatrixGraphImplementation.addVertex("Szósty");
//        adjacencyMatrixGraphImplementation.addVertex("Siódmyyyy");
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
//        adjacencyMatrixGraphImplementation.addEdge(1, 6);
//        adjacencyMatrixGraphImplementation.addEdge(6, 1);


//        adjacencyMatrixGraphImplementation.depthFirstTraversalImplementation();

//        AdjacencyListGraphSecondImplementation adjacencyListGraphSecondImplementation = new AdjacencyListGraphSecondImplementation(9);

//        AdjacencyListGraphSecondImplementation adjacencyListGraphSecondImplementation = new AdjacencyListGraphSecondImplementation(7);
//        adjacencyListGraphSecondImplementation.addVertex("Pierwszy");
//        adjacencyListGraphSecondImplementation.addVertex("Drugi");
//        adjacencyListGraphSecondImplementation.addVertex("Trzeci");
//        adjacencyListGraphSecondImplementation.addVertex("Czwarty");
//        adjacencyListGraphSecondImplementation.addVertex("Piąty");
//        adjacencyListGraphSecondImplementation.addVertex("Szósty");
//        adjacencyListGraphSecondImplementation.addVertex("Siódmyyyy");
//
//        adjacencyListGraphSecondImplementation.addEdge(0, 1);
//        adjacencyListGraphSecondImplementation.addEdge(1, 0);
//        adjacencyListGraphSecondImplementation.addEdge(0, 2);
//        adjacencyListGraphSecondImplementation.addEdge(2, 0);
//        adjacencyListGraphSecondImplementation.addEdge(2, 3);
//        adjacencyListGraphSecondImplementation.addEdge(3, 2);
//        adjacencyListGraphSecondImplementation.addEdge(2, 4);
//        adjacencyListGraphSecondImplementation.addEdge(4, 2);
//        adjacencyListGraphSecondImplementation.addEdge(3, 5);
//        adjacencyListGraphSecondImplementation.addEdge(5, 3);
//        adjacencyListGraphSecondImplementation.addEdge(1, 6);
//        adjacencyListGraphSecondImplementation.addEdge(6, 1);
//
//        adjacencyListGraphSecondImplementation.breadthFirstTraversalImplementation();
//
        WeightedBiDirectionalGraph weightedBiDirectionalGraph = new WeightedBiDirectionalGraph(5);
        weightedBiDirectionalGraph.addVertex("A");
        weightedBiDirectionalGraph.addVertex("B");
        weightedBiDirectionalGraph.addVertex("C");
        weightedBiDirectionalGraph.addVertex("D");
        weightedBiDirectionalGraph.addVertex("E");

        weightedBiDirectionalGraph.addEdge(0,1,6);
        weightedBiDirectionalGraph.addEdge(0,3,1);

        weightedBiDirectionalGraph.addEdge(3,1,2);
        weightedBiDirectionalGraph.addEdge(3,4,1);

        weightedBiDirectionalGraph.addEdge(2,4,5);
        weightedBiDirectionalGraph.addEdge(2,1,5);

        weightedBiDirectionalGraph.addEdge(1,4,2);


        weightedBiDirectionalGraph.dijkstraShortestPathAlgorithm(0,2);


    }
}

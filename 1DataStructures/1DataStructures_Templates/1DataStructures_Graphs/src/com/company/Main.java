package com.company;

public class Main {

    public static void main(String[] args) {
//
        AdjacencyMatrixDirectedRawGraph adjacencyMatrixDirectedRawGraph = new AdjacencyMatrixDirectedRawGraph(7);
        adjacencyMatrixDirectedRawGraph.addVertex("Pierwszy");
        adjacencyMatrixDirectedRawGraph.addVertex("Drugi");
        adjacencyMatrixDirectedRawGraph.addVertex("Trzeci");
        adjacencyMatrixDirectedRawGraph.addVertex("Czwarty");
        adjacencyMatrixDirectedRawGraph.addVertex("Piąty");
        adjacencyMatrixDirectedRawGraph.addVertex("Szósty");
        adjacencyMatrixDirectedRawGraph.addVertex("Siódmyyyy");



        adjacencyMatrixDirectedRawGraph.addEdge(0, 1);
        adjacencyMatrixDirectedRawGraph.addEdge(1, 0);

        adjacencyMatrixDirectedRawGraph.addEdge(0, 2);
        adjacencyMatrixDirectedRawGraph.addEdge(2, 0);

        adjacencyMatrixDirectedRawGraph.addEdge(2, 3);
        adjacencyMatrixDirectedRawGraph.addEdge(3, 2);

        adjacencyMatrixDirectedRawGraph.addEdge(2, 4);
        adjacencyMatrixDirectedRawGraph.addEdge(4, 2);

        adjacencyMatrixDirectedRawGraph.addEdge(3, 5);
        adjacencyMatrixDirectedRawGraph.addEdge(5, 3);

        adjacencyMatrixDirectedRawGraph.addEdge(1, 6);
        adjacencyMatrixDirectedRawGraph.addEdge(6, 1);


//        adjacencyMatrixDirectedRawGraph.depthFirstTraversalImplementation();

//        AdjacencyListGraphSecondImplementation adjacencyListGraphSecondImplementation = new AdjacencyListGraphSecondImplementation(9);

        AdjacencyListDirectedRawGraph adjacencyListDirectedRawGraph = new AdjacencyListDirectedRawGraph(7);
        adjacencyListDirectedRawGraph.addVertex("Pierwszy");
        adjacencyListDirectedRawGraph.addVertex("Drugi");
        adjacencyListDirectedRawGraph.addVertex("Trzeci");
        adjacencyListDirectedRawGraph.addVertex("Czwarty");
        adjacencyListDirectedRawGraph.addVertex("Piąty");
        adjacencyListDirectedRawGraph.addVertex("Szósty");
        adjacencyListDirectedRawGraph.addVertex("Siódmyyyy");

        adjacencyListDirectedRawGraph.addEdge(0, 1);
        adjacencyListDirectedRawGraph.addEdge(1, 0);
        adjacencyListDirectedRawGraph.addEdge(0, 2);
        adjacencyListDirectedRawGraph.addEdge(2, 0);
        adjacencyListDirectedRawGraph.addEdge(2, 3);
        adjacencyListDirectedRawGraph.addEdge(3, 2);
        adjacencyListDirectedRawGraph.addEdge(2, 4);
        adjacencyListDirectedRawGraph.addEdge(4, 2);
        adjacencyListDirectedRawGraph.addEdge(3, 5);
        adjacencyListDirectedRawGraph.addEdge(5, 3);
        adjacencyListDirectedRawGraph.addEdge(1, 6);
        adjacencyListDirectedRawGraph.addEdge(6, 1);





    }
}

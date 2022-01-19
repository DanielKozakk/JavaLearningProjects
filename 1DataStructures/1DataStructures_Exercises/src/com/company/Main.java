package com.company;


import com.company.graph.serie1.Collections_22;
import com.company.graph.template.AdjacencyListDirectedRawGraph;
import com.company.graph.serie1.Collections_21;

public class Main {

    public static void main(String[] args) {
        AdjacencyListDirectedRawGraph adjacencyMatrixDirectedRawGraph = new AdjacencyListDirectedRawGraph(7);
        adjacencyMatrixDirectedRawGraph.addVertex("ZERO");
        adjacencyMatrixDirectedRawGraph.addVertex("JEDEN");
        adjacencyMatrixDirectedRawGraph.addVertex("DWA");
        adjacencyMatrixDirectedRawGraph.addVertex("TRZY");
        adjacencyMatrixDirectedRawGraph.addVertex("CZTERY");
        adjacencyMatrixDirectedRawGraph.addVertex("PIĘĆ");
        adjacencyMatrixDirectedRawGraph.addVertex("SZEŚĆ");



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


        Collections_22.depthFirst(adjacencyMatrixDirectedRawGraph);

    }
}

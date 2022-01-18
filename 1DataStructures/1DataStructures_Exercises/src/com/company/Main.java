package com.company;


import com.company.graph.serie1.Collections_19;
import com.company.graph.template.AdjacencyMatrixDirectedRawGraph;
import com.company.linkedList.serie1.Collections_15;
import com.company.linkedList.serie1.Collections_16;
import com.company.linkedList.serie1.Collections_17;

import com.company.linkedList.serie1.Collections_18;
import com.company.linkedList.template.LinkedList;

import java.util.*;

public class Main {

    public static void main(String[] args) {
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


        Collections_19.breadthFirstSearch(adjacencyMatrixDirectedRawGraph);

    }
}

package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Collections_20_DepthFirstSearchInAdjacencyMatrix col20 = new Collections_20_DepthFirstSearchInAdjacencyMatrix(7);
        col20.addVertex("Pierwszy");
        col20.addVertex("Drugi");
        col20.addVertex("Trzeci");
        col20.addVertex("Czwarty");
        col20.addVertex("Piąty");
        col20.addVertex("Szósty");
        col20.addVertex("Siódmyyyy");



        col20.addEdge(0, 1);
        col20.addEdge(1, 0);

        col20.addEdge(0, 2);
        col20.addEdge(2, 0);

        col20.addEdge(2, 3);
        col20.addEdge(3, 2);

        col20.addEdge(2, 4);
        col20.addEdge(4, 2);

        col20.addEdge(3, 5);
        col20.addEdge(5, 3);

        col20.addEdge(1, 6);
        col20.addEdge(6, 1);

        col20.depthFirstSearchInAdjacencyMatrix();
    }


}

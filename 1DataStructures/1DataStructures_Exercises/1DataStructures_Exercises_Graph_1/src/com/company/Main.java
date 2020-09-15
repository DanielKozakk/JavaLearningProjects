package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Collections_22_DepthfirstSearchInAdjacencyList col22 = new Collections_22_DepthfirstSearchInAdjacencyList(7);
        col22.addVertex("Pierwszy");
        col22.addVertex("Drugi");
        col22.addVertex("Trzeci");
        col22.addVertex("Czwarty");
        col22.addVertex("Piąty");
        col22.addVertex("Szósty");
        col22.addVertex("Siódmyyyy");



        col22.addEdge(0, 1);
        col22.addEdge(1, 0);

        col22.addEdge(0, 2);
        col22.addEdge(2, 0);

        col22.addEdge(2, 3);
        col22.addEdge(3, 2);

        col22.addEdge(2, 4);
        col22.addEdge(4, 2);

        col22.addEdge(3, 5);
        col22.addEdge(5, 3);

        col22.addEdge(1, 6);
        col22.addEdge(6, 1);

        col22.depthFirstSearch();
    }


}

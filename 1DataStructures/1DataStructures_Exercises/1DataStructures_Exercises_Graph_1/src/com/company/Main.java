package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Collections_21_BreadthFirstSearchInAdjacencyList col21 = new Collections_21_BreadthFirstSearchInAdjacencyList(7);
        col21.addVertex("Pierwszy");
        col21.addVertex("Drugi");
        col21.addVertex("Trzeci");
        col21.addVertex("Czwarty");
        col21.addVertex("Piąty");
        col21.addVertex("Szósty");
        col21.addVertex("Siódmyyyy");



        col21.addEdge(0, 1);
        col21.addEdge(1, 0);

        col21.addEdge(0, 2);
        col21.addEdge(2, 0);

        col21.addEdge(2, 3);
        col21.addEdge(3, 2);

        col21.addEdge(2, 4);
        col21.addEdge(4, 2);

        col21.addEdge(3, 5);
        col21.addEdge(5, 3);

        col21.addEdge(1, 6);
        col21.addEdge(6, 1);

        col21.breadthFirstSearchInAdjacencyList();
    }


}

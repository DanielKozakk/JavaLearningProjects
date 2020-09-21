package com.company;


import com.company.serie2.Collections_19_ImplementBreadthFirstSearch;
import com.company.serie2.Collections_20_ImplementDepthFirstSearchInAdjacencyMatrix;
import com.company.serie2.Collections_21_ImplementBreadthFirstSearchInAdjacencyList;

public class Main {

    public static void main(String[] args) {


        Collections_21_ImplementBreadthFirstSearchInAdjacencyList col21_2 = new Collections_21_ImplementBreadthFirstSearchInAdjacencyList(7);
        col21_2.addVertex("Pierwszy");
        col21_2.addVertex("Drugi");
        col21_2.addVertex("Trzeci");
        col21_2.addVertex("Czwarty");
        col21_2.addVertex("Piąty");
        col21_2.addVertex("Szósty");
        col21_2.addVertex("Siódmyyyy");



        col21_2.addEdge(0, 1);
        col21_2.addEdge(1, 0);

        col21_2.addEdge(0, 2);
        col21_2.addEdge(2, 0);


        col21_2.addEdge(2, 3);
        col21_2.addEdge(3, 2);

        col21_2.addEdge(2, 4);
        col21_2.addEdge(4, 2);

        col21_2.addEdge(3, 5);
        col21_2.addEdge(5, 3);

        col21_2.addEdge(1, 6);
        col21_2.addEdge(6, 1);

        col21_2.breadthFirstSearchInAdjacencyList();



    }


}

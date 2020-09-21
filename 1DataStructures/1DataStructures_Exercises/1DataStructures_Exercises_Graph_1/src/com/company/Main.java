package com.company;


import com.company.serie2.Collections_19_ImplementBreadthFirstSearch;
import com.company.serie2.Collections_20_ImplementDepthFirstSearchInAdjacencyMatrix;

public class Main {

    public static void main(String[] args) {


        Collections_20_ImplementDepthFirstSearchInAdjacencyMatrix col20_2 = new Collections_20_ImplementDepthFirstSearchInAdjacencyMatrix(7);
        col20_2.addVertex("Pierwszy");
        col20_2.addVertex("Drugi");
        col20_2.addVertex("Trzeci");
        col20_2.addVertex("Czwarty");
        col20_2.addVertex("Piąty");
        col20_2.addVertex("Szósty");
        col20_2.addVertex("Siódmyyyy");
        col20_2.addEdge(0, 1);
        col20_2.addEdge(1, 0);
        col20_2.addEdge(0, 2);
        col20_2.addEdge(2, 0);
        col20_2.addEdge(2, 3);
        col20_2.addEdge(3, 2);
        col20_2.addEdge(2, 4);
        col20_2.addEdge(4, 2);
        col20_2.addEdge(3, 5);
        col20_2.addEdge(5, 3);
        col20_2.addEdge(1, 6);
        col20_2.addEdge(6, 1);

        col20_2.implementDepthFirstSearch();



    }


}

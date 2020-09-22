package com.company;


import com.company.serie2.Collections_19_ImplementBreadthFirstSearch;
import com.company.serie2.Collections_20_ImplementDepthFirstSearchInAdjacencyMatrix;
import com.company.serie2.Collections_21_ImplementBreadthFirstSearchInAdjacencyList;
import com.company.serie2.Collections_22_ImplementDepthFirstSearchInAdjacencyList;

public class Main {

    public static void main(String[] args) {


        Collections_22_ImplementDepthFirstSearchInAdjacencyList col22_2 = new Collections_22_ImplementDepthFirstSearchInAdjacencyList(7);
        col22_2.addVertex("Pierwszy");
        col22_2.addVertex("Drugi");
        col22_2.addVertex("Trzeci");
        col22_2.addVertex("Czwarty");
        col22_2.addVertex("Piąty");
        col22_2.addVertex("Szósty");
        col22_2.addVertex("Siódmyyyy");
        col22_2.addEdge(0, 1);
        col22_2.addEdge(1, 0);
        col22_2.addEdge(0, 2);
        col22_2.addEdge(2, 0);
        col22_2.addEdge(2, 3);
        col22_2.addEdge(3, 2);
        col22_2.addEdge(2, 4);
        col22_2.addEdge(4, 2);
        col22_2.addEdge(3, 5);
        col22_2.addEdge(5, 3);
        col22_2.addEdge(1, 6);
        col22_2.addEdge(6, 1);


        col22_2.depthFirstSearch();
    }


}

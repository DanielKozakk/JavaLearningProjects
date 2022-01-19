package com.company;


import com.company.graph.template.AdjacencyListDirectedRawGraph;
import com.company.graph.serie1.Collections_23;

public class Main {

    public static void main(String[] args) {
        AdjacencyListDirectedRawGraph col23 = new AdjacencyListDirectedRawGraph(8);
        col23.addVertex("Zerowy");
        col23.addVertex("Pierwszy");
        col23.addVertex("Drugi");
        col23.addVertex("Trzeci");
        col23.addVertex("Czwarty");
        col23.addVertex("Piąty");
        col23.addVertex("Szósty");
        col23.addVertex("Siódmy");


        col23.addEdge(0, 1);
        col23.addEdge(1, 0);

        col23.addEdge(0, 2);
        col23.addEdge(2, 0);

        col23.addEdge(1, 2);
        col23.addEdge(2, 1);

        col23.addEdge(3, 2);
        col23.addEdge(2, 3);

        col23.addEdge(4, 2);
        col23.addEdge(2, 4);

        col23.addEdge(3, 5);
        col23.addEdge(5, 3);

        col23.addEdge(1, 7);
        col23.addEdge(7, 1);

        col23.addEdge(1, 6);
        col23.addEdge(6, 1);

        col23.addEdge(7, 6);
        col23.addEdge(6, 7);

        System.out.println(Collections_23.checkIfGraphIsTree(col23));


    }
}

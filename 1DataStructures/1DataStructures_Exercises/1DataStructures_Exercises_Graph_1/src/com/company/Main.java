package com.company;


import com.company.serie2.Collections_19_ImplementBreadthFirstSearch;

public class Main {

    public static void main(String[] args) {

        Collections_19_ImplementBreadthFirstSearch col19_2 = new Collections_19_ImplementBreadthFirstSearch(7);

        col19_2.addVertex("Pierwszy");
        col19_2.addVertex("Drugi");
        col19_2.addVertex("Trzeci");
        col19_2.addVertex("Czwarty");
        col19_2.addVertex("Piąty");
        col19_2.addVertex("Szósty");
        col19_2.addVertex("Siódmyyyy");
        col19_2.addEdge(0, 1);
        col19_2.addEdge(1, 0);
        col19_2.addEdge(0, 2);
        col19_2.addEdge(2, 0);
        col19_2.addEdge(2, 3);
        col19_2.addEdge(3, 2);
        col19_2.addEdge(2, 4);
        col19_2.addEdge(4, 2);
        col19_2.addEdge(3, 5);
        col19_2.addEdge(5, 3);
        col19_2.addEdge(1, 6);
        col19_2.addEdge(6, 1);


    }


}

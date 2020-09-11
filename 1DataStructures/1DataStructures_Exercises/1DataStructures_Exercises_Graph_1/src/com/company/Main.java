package com.company;

public class Main {

    public static void main(String[] args) {

        Collections_19_BreadthFirstSearchInAdjacencyMatrix col19 = new Collections_19_BreadthFirstSearchInAdjacencyMatrix(7);
        col19.addVertex("Pierwszy");
        col19.addVertex("Drugi");
        col19.addVertex("Trzeci");
        col19.addVertex("Czwarty");
        col19.addVertex("Piąty");
        col19.addVertex("Szósty");
        col19.addVertex("Siódmyyyy");

        col19.addEdge(0, 1);
        col19.addEdge(1, 0);

        col19.addEdge(0, 2);
        col19.addEdge(2, 0);

        col19.addEdge(2, 3);
        col19.addEdge(3, 2);

        col19.addEdge(2, 4);
        col19.addEdge(4, 2);

        col19.addEdge(3, 5);
        col19.addEdge(5, 3);

        col19.addEdge(1, 6);
        col19.addEdge(6, 1);

        col19.breadthFirst();
    }


}

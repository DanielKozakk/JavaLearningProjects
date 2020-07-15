package com.company;

public class Main {

    public static void main(String[] args) {

        AdjacencyMatrixGraph g = new AdjacencyMatrixGraph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);

        System.out.print(g.toString());



    }
}

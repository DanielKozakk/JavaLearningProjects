package com.company;

public class Main {

    public static void main(String[] args) {



        AdjacencyListGraphSecondImplementation graph = new AdjacencyListGraphSecondImplementation(3);
        graph.addVertex("Pierwszy");
        graph.addVertex("Drugi");
        graph.addVertex("Pierwszy");

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 0);
        graph.addEdge(2, 0);

        System.out.println(graph.getEdges());

        graph.removeEdge(0,1);

        System.out.println(graph.getEdges());





    }
}

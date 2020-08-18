package com.company;

public class Main {

    public static void main(String[] args) {


        AdjacencyMatrixGraphSecondImplementation graph = new AdjacencyMatrixGraphSecondImplementation(3);

        graph.addVertex();
        graph.addVertex();
        graph.addVertex();

        graph.addEdge(0,1);
        graph.addEdge(0,2);


        System.out.println(graph.getEdges());


    }
}

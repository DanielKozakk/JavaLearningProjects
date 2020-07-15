package com.company;

public class Main {

    public static void main(String[] args) {


        AdjacencyListGraph adjeacencyListGraph = new AdjacencyListGraph(4);

        adjeacencyListGraph.addVertex("A");
        adjeacencyListGraph.addVertex("B");
        adjeacencyListGraph.addVertex("C");
        adjeacencyListGraph.addVertex("D");

        adjeacencyListGraph.addEdge(0, 1);
        adjeacencyListGraph.addEdge(0, 2);
        adjeacencyListGraph.addEdge(2, 3);

        adjeacencyListGraph.showContentWithDepthFirstTraversalAlgorithm();

    }
}

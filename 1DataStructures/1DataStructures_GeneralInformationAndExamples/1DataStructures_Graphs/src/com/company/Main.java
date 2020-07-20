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

//        adjeacencyListGraph.showContentWithDepthFirstTraversalAlgorithm();

        AdjacencyMatrixGraph adjMatrixGraph = new AdjacencyMatrixGraph(4);

        adjMatrixGraph.addVertex("A");
        adjMatrixGraph.addVertex("B");
        adjMatrixGraph.addVertex("C");
        adjMatrixGraph.addVertex("D");

        adjMatrixGraph.addEdge(0,1);
        adjMatrixGraph.addEdge(0,2);
        adjMatrixGraph.addEdge(1,3);

//        System.out.println(adjMatrixGraph.getEdges());

        adjMatrixGraph.showContentWithDepthFirstTraversalAlgorithm();

    }
}

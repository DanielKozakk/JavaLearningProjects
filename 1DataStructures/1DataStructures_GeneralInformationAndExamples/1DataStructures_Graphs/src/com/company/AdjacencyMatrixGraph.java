package com.company;

import java.util.Stack;

public class AdjacencyMatrixGraph {
    private final int numberOfVertecies;
    private final boolean[][] adjMatrix;
    public int verteciesRemains;
    private static int ID = 0;

    private Vertex[] listOfVertex;

    public AdjacencyMatrixGraph(int numberOfVertex) {
        this.numberOfVertecies = numberOfVertex;
        this.verteciesRemains = numberOfVertex;
        adjMatrix = new boolean[numberOfVertecies][numberOfVertecies];
        listOfVertex = new Vertex[numberOfVertecies];
    }

    public void addVertex(Object dataToStore) {

        if (verteciesRemains > 0) {
            Vertex newVertex = new Vertex(ID, dataToStore);
            listOfVertex[ID] = newVertex;
            ID++;
            verteciesRemains--;
        }
    }

    // Add edges
    public void addEdge(Integer i, Integer j) {

        if (listOfVertex[i] != null && listOfVertex[j] != null) {

            adjMatrix[i][j] = true;
            adjMatrix[j][i] = true;
        } else {
            System.out.println("Vertex doesn't exist!");
        }
    }

    // Remove edges
    public void removeEdge(Integer i, Integer j) {
        if (listOfVertex[i] != null && listOfVertex[j] != null) {

            adjMatrix[i][j] = false;
            adjMatrix[j][i] = false;
        }
    }

    // Print the matrix
    public String getEdges() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numberOfVertecies; i++) {
            s.append(i + ": ");
            for (boolean j : adjMatrix[i]) {
                s.append((j ? 1 : 0) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    private class Vertex {
        boolean isVisited = false;
        int id;
        Object dataToStore;
        private Vertex(int id, Object data) {
            this.id = id;
            this.dataToStore = data;
        }
    }

    public void showContentWithDepthFirstTraversalAlgorithm (){

        Stack<Vertex> stack = new Stack<>();
        Vertex searchedVertex = listOfVertex[0];
        System.out.println(searchedVertex.dataToStore);

        searchedVertex.isVisited = true;
        stack.push(searchedVertex);

        while(!stack.isEmpty()){

            for(int i = 0; i < adjMatrix.length; i ++){

                for(int j = 0; j < adjMatrix[i].length ; j ++){

                    if(i != j){
                        if(!listOfVertex[j].isVisited){
                            stack.push(listOfVertex[j]);

                        }
                    }

                }

            }

        }

    }



}

package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AdjacencyMatrixDirectedGraph {

    int graphSize;
    int vertexRemains;
    int currentVertexID = 0;


    public int[][] adjacencyMatrix;
    public Vertex[] verticies;

    AdjacencyMatrixDirectedGraph(Integer graphSize) {
        this.vertexRemains = graphSize;
        this.graphSize = graphSize;
        this.adjacencyMatrix = new int[graphSize][graphSize];
        this.verticies = new Vertex[graphSize];

    }

    private class Vertex {
        int id;
        boolean isVertexVisited = false;
        String name;

        Vertex() {
            this.id = currentVertexID;
            currentVertexID++;
            this.name = String.valueOf(currentVertexID);
        }

        Vertex(String name) {
            this.id = currentVertexID;
            currentVertexID++;

            this.name = name;

        }

        public void setVertexAsVisited() {
            this.isVertexVisited = true;
        }
    }

    public void addVertex(String name) {

        if (vertexRemains > 0) {

            vertexRemains--;
            Vertex vertex;
            if(name.equals("")){
                vertex = new Vertex();
            } else {
                vertex = new Vertex(name);
            }

            verticies[vertex.id] = vertex;

        } else {
            System.out.println("Too much vertex!");
        }
    }

    public void addEdge(int from, int to) {
        adjacencyMatrix[from][to] = 1;
    }

    public void removeEdge(int from, int to) {
        adjacencyMatrix[from][to] = 0;
    }

    public String getVerticies() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < verticies.length; i++) {

            sb.append("ID : " + verticies[i].id + ", ");

        }

        return sb.toString();

    }

    public String getEdges() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < adjacencyMatrix.length; i++) {

            sb.append("ID: " + i + ", Edges: ");

            for (int j = 0; j < adjacencyMatrix[i].length; j++) {

                if (adjacencyMatrix[i][j] != 0) {
                    sb.append(j + ", ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}



package com.company;

import java.util.*;

public class AdjacencyListDirectedRawGraph {

    public int graphSize;
    public int vertexRemains;

    private int VertexID = 0;
    public Vertex[] vertecies;

    public AdjacencyListDirectedRawGraph(int graphSize) {
        this.graphSize = graphSize;
        this.vertexRemains = graphSize;
        vertecies = new Vertex[graphSize];
    }


    public void addVertex(String name) {

        if (vertexRemains > 0) {
            vertexRemains--;
            Vertex newVertex = new Vertex(name);
            vertecies[VertexID] = newVertex;
            VertexID++;
        } else {
            System.out.println("There is no place for next vertex!");
        }

    }

    public void addEdge(int fromID, int toID) {

        if (vertecies[fromID] != null && vertecies[toID] != null) {
            vertecies[fromID].listOfEdges.add(toID);
        }


    }

    public String getVertecies() {

        StringBuilder sb = new StringBuilder();
        for (Vertex vertex : vertecies) {

            sb.append("ID: " + vertex.ID + ", " + "Name: " + vertex.name + "\n");


        }
        return sb.toString();
    }


    protected class Vertex {
        int ID = VertexID;
        String name;
        ArrayList<Integer> listOfEdges = new ArrayList<>();
        boolean isVertexVisited = false;

        Vertex() {
            this.name = String.valueOf(this.ID);
        }

        Vertex(String name) {
            this.name = name;
        }

        public void setVertexAsVisited() {
            this.isVertexVisited = true;
        }
    }


    public String getEdges() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < vertecies.length; i++) {

            sb.append(vertecies[i].name + ": ");

            for (int edge : vertecies[i].listOfEdges) {
                sb.append(edge + ", ");
            }
        }
        return sb.toString();
    }

    public void removeEdge(int from, int to) {

        Vertex vertex = vertecies[from];
        vertex.listOfEdges.remove(to);

    }
}

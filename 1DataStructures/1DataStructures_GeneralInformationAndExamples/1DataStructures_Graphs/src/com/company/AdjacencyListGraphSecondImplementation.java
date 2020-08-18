package com.company;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyListGraphSecondImplementation {

    public int graphSize;
    public int vertexRemains;

    private int VertexID = 0;
    public Vertex[] vertecies;

    public AdjacencyListGraphSecondImplementation(int graphSize) {
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
            Vertex vertex = vertecies[fromID];
            vertex.listOfEdges.add(toID);
        }


    }

    public String getVertecies() {

        StringBuilder sb = new StringBuilder();
        for (Vertex vertex : vertecies) {

            sb.append("ID: " + vertex.ID + ", " + "Name: " + vertex.name + "\n");


        }
        return sb.toString();
    }


    private class Vertex {
        int ID = VertexID;
        String name;
        ArrayList<Integer> listOfEdges = new ArrayList<>();

        Vertex() {
            this.name = String.valueOf(this.ID);
        }

        Vertex(String name) {
            this.name = name;
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

        Vertex vertex=  vertecies[from];
        vertex.listOfEdges.remove(to);

    }




}

package com.company.serie1;

import java.util.ArrayList;

public class AdjacencyListDirectedRawGraph {

    public int graphSize;
    public int vertexRemains;

    private int VertexID = 0;
    public Vertex[] vertices;

    public AdjacencyListDirectedRawGraph(int graphSize) {
        this.graphSize = graphSize;
        this.vertexRemains = graphSize;
        vertices = new Vertex[graphSize];
    }


    public void addVertex(String name) {

        if (vertexRemains > 0) {
            vertexRemains--;
            Vertex newVertex = new Vertex(name);
            vertices[VertexID] = newVertex;
            VertexID++;
        } else {
            System.out.println("There is no place for next vertex!");
        }

    }

    public void addEdge(int fromID, int toID) {

        if (vertices[fromID] != null && vertices[toID] != null) {
            vertices[fromID].listOfEdges.add(toID);
        }


    }

    public String getVertices() {

        StringBuilder sb = new StringBuilder();
        for (Vertex vertex : vertices) {

            sb.append("ID: " + vertex.ID + ", " + "Name: " + vertex.name + "\n");


        }
        return sb.toString();
    }


    public class Vertex {
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

        for (int i = 0; i < vertices.length; i++) {

            sb.append(vertices[i].name + ": ");

            for (int edge : vertices[i].listOfEdges) {
                sb.append(edge + ", ");
            }
        }
        return sb.toString();
    }

    public void removeEdge(int from, int to) {

        Vertex vertex = vertices[from];
        vertex.listOfEdges.remove(to);

    }
}

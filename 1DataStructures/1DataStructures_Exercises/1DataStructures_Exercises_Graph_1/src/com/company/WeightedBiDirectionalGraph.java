package com.company;

import java.util.*;

public class WeightedBiDirectionalGraph {

    public int graphSize;
    public int vertexRemains;

    private int VertexID = 0;
    public Vertex[] vertices;

    public WeightedBiDirectionalGraph(int graphSize) {
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

    public void addEdge(Integer pointAid, Integer pointBid, Integer weight) {

        if (vertices[pointAid] != null && vertices[pointBid] != null) {

            Edge edge1 = new Edge(pointAid, pointBid, weight);
            Edge edge2 = new Edge(pointBid, pointAid, weight);
            vertices[pointAid].addEdge(edge1);
            vertices[pointBid].addEdge(edge2);
        }
    }

    public String getVertices() {

        StringBuilder sb = new StringBuilder();
        for (Vertex vertex : vertices) {
            sb.append("ID: " + vertex.id + ", " + "Name: " + vertex.name + "\n");
        }
        return sb.toString();
    }


    public class Vertex {
        int id = VertexID;
        String name;
        ArrayList<Edge> listOfEdges = new ArrayList<>();
        boolean isVertexVisited = false;

        Vertex() {
            this.name = String.valueOf(this.id);
        }

        Vertex(String name) {
            this.name = name;
        }

        public void setVertexAsVisited() {
            this.isVertexVisited = true;
        }

        private void addEdge(Edge edge) {
            if (!listOfEdges.contains(edge)) {
                listOfEdges.add(edge);
            }
        }
    }

    public class Edge {

        Integer source;
        Integer destination;
        Integer weight;

        Edge(Integer source, Integer destination, Integer weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }


}
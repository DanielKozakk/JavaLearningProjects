package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class WeightedBiDirectionalGraph {

    public int graphSize;
    public int vertexRemains;

    private int VertexID = 0;
    public Vertex[] vertecies;

    public WeightedBiDirectionalGraph(int graphSize) {
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

    public void addEdge(Integer pointAid, Integer pointBid, Integer weight) {

        if (vertecies[pointAid] != null && vertecies[pointBid] != null) {

            Edge edge = new Edge(pointAid, pointBid, weight);
            vertecies[pointAid].addEdge(edge);
            vertecies[pointBid].addEdge(edge);

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
        ArrayList<Edge> listOfEdges = new ArrayList<>();
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
        private  void addEdge(Edge edge){
            listOfEdges.add(edge);
        }
    }

    private class Edge {

        Integer pointA;
        Integer pointB;
        Integer weight;

        Edge(Integer pointA, Integer pointB, Integer weight){
            this.pointA = pointA;
            this.pointB = pointB;
            this.weight = weight;
        }


    }

}

package com.company;

import java.util.*;

public class AdjacencyListGraph {

    public int graphSize;
    public int vertexRemains;

    private int VertexID = 0;
    public Vertex[] vertecies;

    public AdjacencyListGraph(int graphSize) {
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


    private class Vertex {
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

    public void depthFirstTraversalImplementation() {

        Stack<Vertex> visitedVerteciesStack = new Stack<>();

        if (vertecies.length > 0) {
            vertecies[0].setVertexAsVisited();
            System.out.println(vertecies[0].name);
            visitedVerteciesStack.push(vertecies[0]);


            Vertex searchedVertex = vertecies[0];
            while (!visitedVerteciesStack.isEmpty()) {

                boolean isVertexExhausted = true;
                for (int i = 0; i < searchedVertex.listOfEdges.size(); i++) {

                    if (!vertecies[searchedVertex.listOfEdges.get(i)].isVertexVisited) {
                        searchedVertex = vertecies[searchedVertex.listOfEdges.get(i)];
                        System.out.println(searchedVertex.name);
                        isVertexExhausted = false;
                        searchedVertex.setVertexAsVisited();
                        visitedVerteciesStack.push(searchedVertex);
                        break;
                    }
                }

                if (isVertexExhausted) {
                    visitedVerteciesStack.pop();
                    searchedVertex = !visitedVerteciesStack.isEmpty() ? visitedVerteciesStack.peek() : null;
                }
            }
        }
    }

    public void breadthFirstTraversalImplementation() {

        if (vertecies.length > 0) {
            Queue<Vertex> visitedVerteciesQueue = new LinkedList<>();

            Vertex searchedVertex = vertecies[0];
            visitedVerteciesQueue.add(searchedVertex);
            System.out.println(searchedVertex.name);
            searchedVertex.setVertexAsVisited();

            while (!visitedVerteciesQueue.isEmpty()) {


                for (int i = 0; i < searchedVertex.listOfEdges.size(); i++) {

                    Vertex neighbourVertex = vertecies[searchedVertex.listOfEdges.get(i)];
                    if (!neighbourVertex.isVertexVisited) {

                        System.out.println(neighbourVertex.name);
                        neighbourVertex.setVertexAsVisited();
                        visitedVerteciesQueue.add(neighbourVertex);
                    }
                }

                visitedVerteciesQueue.poll();
                searchedVertex = visitedVerteciesQueue.peek();
            }
        }
    }
}

package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AdjacencyMatrixGraph {

    int graphSize;
    int vertexRemains;
    int currentVertexID = 0;


    public int[][] adjacencyMatrix;
    public Vertex[] verticies;

    AdjacencyMatrixGraph(Integer graphSize) {
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
            System.out.println("Too much vertex nigga!");
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

    public void depthFirstTraversalImplementation() {
        if (verticies.length > 0) {

            Stack<Vertex> visitedVertexStack = new Stack<>();
            verticies[0].setVertexAsVisited();

            System.out.println(verticies[0].id);

            visitedVertexStack.push(verticies[0]);

            Integer baseVertexId = 0;

            while (!visitedVertexStack.empty()) {

                boolean isBaseVertexExhausted = true;

                for (int searchedVertexId = 0; searchedVertexId < adjacencyMatrix[baseVertexId].length; searchedVertexId++) {
                    if (baseVertexId != searchedVertexId) {

                        if (!verticies[searchedVertexId].isVertexVisited && adjacencyMatrix[baseVertexId][searchedVertexId] > 0) {

                            System.out.println(verticies[searchedVertexId].id);
                            verticies[searchedVertexId].setVertexAsVisited();
                            visitedVertexStack.push(verticies[searchedVertexId]);
                            baseVertexId = searchedVertexId;
                            isBaseVertexExhausted = false;
                            break;
                        }
                    }

                }

                if (isBaseVertexExhausted) {
                    visitedVertexStack.pop();
                    baseVertexId = !visitedVertexStack.empty() ? visitedVertexStack.peek().id : null;
                }
            }
        }
    }

    public void breadthFirstTraversalImplementation() {

        if (verticies.length > 0) {
            Queue<Vertex> visitedVerteciesQueue = new LinkedList<>();
            Vertex searchedVertex = verticies[0];
            System.out.println(searchedVertex.name);
            searchedVertex.setVertexAsVisited();
            visitedVerteciesQueue.add(searchedVertex);

//            for(int a = 0; a < adjacencyMatrix.length; a ++){
//                System.out.println(Arrays.toString(adjacencyMatrix[a]));
//            }

            while (!visitedVerteciesQueue.isEmpty()) {


                for (int i = 0; i < adjacencyMatrix.length; i++) {


                    for (int j = 0; j < adjacencyMatrix[searchedVertex.id].length; j++) {

                        if(adjacencyMatrix[i][j] > 0 && i != j && !verticies[j].isVertexVisited){
                            Vertex neighbourVertex = verticies[j];
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
}



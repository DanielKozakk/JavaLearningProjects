package com.company;

public class AdjacencyMatrixGraphSecondImplementation {

    int graphSize;
    int vertexRemains;
    int currentVertexID = 0;


    public int[][] adjacencyMatrix;
    public Vertex[] verticies;

    AdjacencyMatrixGraphSecondImplementation(Integer graphSize) {
        this.vertexRemains = graphSize;
        this.graphSize = graphSize;
        this.adjacencyMatrix = new int[graphSize][graphSize];
        this.verticies = new Vertex[graphSize];

    }

    private class Vertex {
        int id;

        Vertex() {
            this.id = currentVertexID;
            currentVertexID++;
        }
    }

    public void addVertex() {

        if (vertexRemains > 0) {

            vertexRemains--;
            Vertex vertex = new Vertex();
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

            for(int j = 0 ; j < adjacencyMatrix[i].length ; j++){

                if(adjacencyMatrix[i][j] != 0){
                    sb.append(j + ", ");
                }



            }
            sb.append("\n");
        }

        return sb.toString();
//        return "heh";

    }


}



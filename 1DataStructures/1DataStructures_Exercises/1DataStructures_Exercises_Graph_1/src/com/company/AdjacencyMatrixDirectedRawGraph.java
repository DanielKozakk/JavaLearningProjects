package com.company;

public class AdjacencyMatrixDirectedRawGraph {

    int graphSize;
    int vertexRemains;
    int currentVertexID = 0;


    public int[][] adjacencyMatrix;
    public Vertex[] vertices;

    public AdjacencyMatrixDirectedRawGraph(Integer graphSize) {
        this.vertexRemains = graphSize;
        this.graphSize = graphSize;
        this.adjacencyMatrix = new int[graphSize][graphSize];
        this.vertices = new Vertex[graphSize];

    }

    public class Vertex {
        private int id;
        private boolean vertexVisited = false;
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
            this.vertexVisited = true;
        }

        public int getId (){
            return this.id;
        }
        public boolean isVertexVisited (){
            return this.vertexVisited;
        }

        public String getName (){
            return this.name;
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

            vertices[vertex.id] = vertex;

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

    public String getVertices() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < vertices.length; i++) {

            sb.append("ID : " + vertices[i].id + ", ");

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



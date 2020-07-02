package com.company;

import java.util.ArrayList;
import java.util.List;

public class MatrixGraph {
    
    public class Vertex {

        public String value;
        public boolean isVisited = false;

        Vertex(String value){
            this.value = value;
        }
    }

    List<Vertex> adjecencyMatrix = new ArrayList<>();
    List<Vertex> listOfVertices = new ArrayList<>();

    private int numberOfVertices = 0;

    public void addVertex(String value){

        Vertex vertex = new Vertex(value);
        listOfVertices.add(vertex);
        numberOfVertices ++;
    }

    public void addEdge(){

    }



}

package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AdjacencyListGraph {

    private final int numberOfVertecies;

    public int verteciesRemains;
    private static int ID = 0;

    private Vertex[] listOfVertex;

    public AdjacencyListGraph(int numberOfVertex) {
        this.numberOfVertecies = numberOfVertex;
        this.verteciesRemains = numberOfVertex;

        listOfVertex = new Vertex[numberOfVertecies];
    }

    public void addVertex(String dataToStore) {

        if (verteciesRemains > 0) {
            Vertex newVertex = new Vertex(ID, dataToStore);
            listOfVertex[ID] = newVertex;
            ID++;
            verteciesRemains--;
        }
    }

    // Add edges
    public void addEdge(Integer i, Integer j) {

        if (listOfVertex[i] != null && listOfVertex[j] != null) {

            if (!listOfVertex[i].adjacencyList.contains(j)) {
                listOfVertex[i].adjacencyList.add(j);
            }

            if (!listOfVertex[j].adjacencyList.contains(i)) {
                listOfVertex[j].adjacencyList.add(i);
            }


        } else {
            System.out.println("Vertex doesn't exist!");
        }
    }

    // Remove edges
    public void removeEdge(Integer i, Integer j) {
        if (listOfVertex[i] != null && listOfVertex[j] != null) {


            listOfVertex[i].adjacencyList.remove(j);
            listOfVertex[j].adjacencyList.remove(i);
        }
    }

    // Print the matrix
    public String getEdges() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numberOfVertecies; i++) {

            s.append(i + ": ");
            s.append(listOfVertex[i].adjacencyList.toString());
            s.append("\n");


        }
        return s.toString();
    }

    private class Vertex {
        boolean isVisited = false;
        int id;
        String dataToStore;

        List<Integer> adjacencyList = new ArrayList<>();

        private Vertex(int id, String data) {
            this.id = id;
            this.dataToStore = data;
        }
    }

    public void showContentWithDepthFirstTraversalAlgorithm() {

        /*

                stack
                searchedVertex = listOfVertesies[0]\
                println searchedVertex content
                stack.push(searchedVertex)

            while(!stack.isEmpty)

             boolean isVertexExploied = true;
                for(int id : searchedVertex)

                    if !listOfVertecies[id].isVisited

                        println its content

                        stack.push (searchedVertex)
                        searchedVertex = listOfVertecies[id]
                        isVertexExploited = false;
                        break;
                }
                if(isVertexExploied)
                    stack.pop
                    if(!stack.isEmpty ) searchedVertex = stack.peek()

            }

         */
        Stack<Vertex> stack = new Stack<>();
        Vertex searchedVertex = listOfVertex[0];
        System.out.println(searchedVertex.dataToStore);
        searchedVertex.isVisited = true;
        stack.push(searchedVertex);


        while (!stack.isEmpty()) {

            boolean shouldVertexBeRemovedFromStack = true;
            for (int id : searchedVertex.adjacencyList) {

                Vertex connectedVertex = listOfVertex[id];
                if (!connectedVertex.isVisited) {
                    System.out.println(listOfVertex[id].dataToStore);
                    stack.push(listOfVertex[id]);
                    connectedVertex.isVisited = true;
                    searchedVertex = listOfVertex[id];
                    shouldVertexBeRemovedFromStack = false;
                    break;
                }
            }
            if (shouldVertexBeRemovedFromStack) {
                stack.pop();
                if (!stack.isEmpty()) searchedVertex = stack.peek();
            }

        }

    }


}

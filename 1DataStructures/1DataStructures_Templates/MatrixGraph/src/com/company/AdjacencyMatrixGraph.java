package com.company;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyMatrixGraph {
    private final int numberOfVertecies;
    private final boolean [][] adjMatrix;


    public AdjacencyMatrixGraph(int numberOfVertex) {
        this.numberOfVertecies = numberOfVertex;
        adjMatrix = new boolean[numberOfVertecies][numberOfVertecies];
    }

    // Add edges
    public void addEdge(int i, int j) {
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }

    // Remove edges
    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }

    // Print the matrix
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numberOfVertecies; i++) {
            s.append(i + ": ");
            for (boolean j : adjMatrix[i]) {
                s.append((j ? 1 : 0) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}

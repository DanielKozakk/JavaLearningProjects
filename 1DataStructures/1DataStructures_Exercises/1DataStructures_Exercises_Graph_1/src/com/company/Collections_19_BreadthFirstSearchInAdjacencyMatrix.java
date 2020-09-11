package com.company;

import java.util.Arrays;
import java.util.List;

public class Collections_19_BreadthFirstSearchInAdjacencyMatrix extends AdjacencyMatrixDirectedRawGraph {

    Collections_19_BreadthFirstSearchInAdjacencyMatrix(Integer graphSize) {
        super(graphSize);
    }

    public void breadthFirst() {

        // 1. zmień na protected



        Vertex searchedVertex = null;

        if (verticies.length > 0) {
            searchedVertex = verticies[0];
        }

        List<Vertex> unvisitedVertex = Arrays.asList(verticies);

        while( searchedVertex != null) {

            System.out.println(searchedVertex.name);

            for (int i = 0; i < adjacencyMatrix[searchedVertex.id].length; i++) {
                Vertex neighbour = verticies[adjacencyMatrix[searchedVertex.id][i]];

            }


        }

    }


}

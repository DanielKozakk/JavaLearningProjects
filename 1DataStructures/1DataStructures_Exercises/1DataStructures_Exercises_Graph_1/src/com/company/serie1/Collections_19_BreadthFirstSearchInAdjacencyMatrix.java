package com.company.serie1;

import com.company.serie1.AdjacencyMatrixDirectedRawGraph;

import java.util.LinkedList;
import java.util.Queue;

public class Collections_19_BreadthFirstSearchInAdjacencyMatrix extends AdjacencyMatrixDirectedRawGraph {

    Collections_19_BreadthFirstSearchInAdjacencyMatrix(Integer graphSize) {
        super(graphSize);



    }


    public void breadthFirstSearch(){

        Queue<Vertex> verteciesQueue = new LinkedList<>();
        Vertex searchedVertex = vertices[0];
        verteciesQueue.add(searchedVertex);

        while(!verteciesQueue.isEmpty()) {
            System.out.println(searchedVertex.id);
            searchedVertex.setVertexAsVisited();
            for (int i = 0; i < adjacencyMatrix[searchedVertex.id].length; i++) {
                int neighbourDistance = adjacencyMatrix[searchedVertex.id][i];
                Vertex neighbourVertex = vertices[i];

                if (neighbourDistance != 0 && !neighbourVertex.isVertexVisited) {
                    verteciesQueue.add(neighbourVertex);
                }
            }
            verteciesQueue.poll();
            if(!verteciesQueue.isEmpty()){
                searchedVertex = verteciesQueue.peek();
            }
        }

    }




}

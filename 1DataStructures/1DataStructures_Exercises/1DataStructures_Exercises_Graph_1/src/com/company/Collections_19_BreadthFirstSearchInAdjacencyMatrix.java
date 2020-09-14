package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Collections_19_BreadthFirstSearchInAdjacencyMatrix extends AdjacencyMatrixDirectedRawGraph {

    Collections_19_BreadthFirstSearchInAdjacencyMatrix(Integer graphSize) {
        super(graphSize);



    }

         /*
                tworzę queue
                ustawiam searchedVertex na vertecies[0]


                robię while dopóki queue nie jest puste
                    wypisuje dane z searchedVertex
                    zapisuję vertex jako visited

                    robię for loop przez adjacencyMatrix[searchedVertex.id] przez sąsiadów

                        jeśli index != null && vertex jest unvisited
                            dodaję go do kolejki

                    end for loop
                     queue.poll()
                     jeśli queue nie jest puste
                        searchedVertex = queue.peek();

         */

    public void breadthFirstSearch(){

        Queue<Vertex> verteciesQueue = new LinkedList<>();
        Vertex searchedVertex = verticies[0];
        verteciesQueue.add(searchedVertex);

        while(!verteciesQueue.isEmpty()) {
            System.out.println(searchedVertex.id);
            searchedVertex.setVertexAsVisited();
            for (int i = 0; i < adjacencyMatrix[searchedVertex.id].length; i++) {

                int neighbourDistance = adjacencyMatrix[searchedVertex.id][i];
                Vertex neighbourVertex = verticies[i];


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

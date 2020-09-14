package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Collections_21_BreadthFirstSearchInAdjacencyList extends AdjacencyListDirectedRawGraph {
    public Collections_21_BreadthFirstSearchInAdjacencyList(int graphSize) {
        super(graphSize);
    }

    public void breadthFirstSearchInAdjacencyList(){

        /*

            searchNode to pierwszy node
            Robię vertexQueue

            dodaję search node do vertexQueue

            while vertexQueue is not empty

                system print out searched
                searched.setAsVisited

                for loop po sąsiadach

                    jeśli nie jest visited

                        dodaję go do queue
                end for loop

                queue.poll();
                jeśli queue nie jest puste

                searchedVertex = queue.peek()


         */

        // dodaj do templatki zmiany

        Vertex searchedVertex = vertices[0];
        Queue<Vertex> vertexQueue = new LinkedList<>();
        vertexQueue.add(searchedVertex);

        while(!vertexQueue.isEmpty()){
            System.out.println(searchedVertex.ID);
            searchedVertex.setVertexAsVisited();
            for(Integer neighbourId : searchedVertex.listOfEdges){
                if(!vertices[neighbourId].isVertexVisited){
                    vertexQueue.add(vertices[neighbourId]);
                }
            }
            vertexQueue.poll();
            if(!vertexQueue.isEmpty()){
                searchedVertex = vertexQueue.peek();
            }
        }

    }
}

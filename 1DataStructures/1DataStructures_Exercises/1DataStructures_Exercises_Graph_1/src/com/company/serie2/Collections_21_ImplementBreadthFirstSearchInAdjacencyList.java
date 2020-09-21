package com.company.serie2;

import com.company.AdjacencyListDirectedRawGraph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Collections_21_ImplementBreadthFirstSearchInAdjacencyList extends AdjacencyListDirectedRawGraph {
    public Collections_21_ImplementBreadthFirstSearchInAdjacencyList(int graphSize) {
        super(graphSize);
    }

    public void breadthFirstSearchInAdjacencyList() {

        /*

                Queue
                searched = pierwszy
                searched do queue

                while queue nie jest puste

                searched systemoutprintln
                set searched as visited

                iteruje po sąsiadach
                    jeśli jest połączenie, nie są visited, nie ma ich w queue
                    dodaj ich do kolejeczki


                 queue.poll
                 jeśli kolejka nie pusta searched = queue. peek
         */

        Queue<Vertex> vertexQueue = new LinkedList<>();
        Vertex searchedVertex = vertices[0];
        vertexQueue.add(searchedVertex);
        while (!vertexQueue.isEmpty()) {
            System.out.println(searchedVertex.getId());
            searchedVertex.setVertexAsVisited();

            for (int i = 0; i < searchedVertex.listOfEdges.size(); i++) {

                Integer neighbourId = searchedVertex.listOfEdges.get(i);
                Vertex neighbour = vertices[neighbourId];

                if(!neighbour.isVertexVisited() && !vertexQueue.contains(neighbour)){
                    vertexQueue.add(neighbour);
                }
            }

            vertexQueue.poll();
            if(!vertexQueue.isEmpty()){
                searchedVertex = vertexQueue.peek();
            }

        }
    }
}



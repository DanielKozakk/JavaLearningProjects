package com.company.serie3;

import com.company.AdjacencyMatrixDirectedRawGraph;

import java.util.LinkedList;
import java.util.Queue;

public class Collections_19_ImplementBreadthFirstSearchInAdjacencyMatrixGraph extends AdjacencyMatrixDirectedRawGraph {

    public Collections_19_ImplementBreadthFirstSearchInAdjacencyMatrixGraph(Integer graphSize) {
        super(graphSize);
    }

    public void breadthFirstSearch(){

        /*

                Tworzę kolejkę unvisited vertices Queue
                Robię search = pierwszyt node

                wile(unvisited is not empty
                    system out wypisuję
                    iteruję po sąsiadach

                        Jeśli sąsiad nie był visited i ni jest w kolejce

                            dodaję sąsiada do kolejki


                    searched.setAsVisiteD()
                    queue.poll
                    if(queue is not empty

                    searched = queue.peek()
         */

        Queue<Vertex> unvisitedVerticies = new LinkedList<>();
        Vertex searched = vertices[0];

        unvisitedVerticies.add(searched);

        while(!unvisitedVerticies.isEmpty()){
            System.out.println(searched.getId());
            for(int i = 0 ; i < adjacencyMatrix[searched.getId()].length ; i ++){

                Vertex neighbour = vertices[i];

                if(adjacencyMatrix[searched.getId()][i] != 0 &&!neighbour.isVertexVisited() && !unvisitedVerticies.contains(neighbour)){
                    unvisitedVerticies.add(neighbour);
                }
            }

            searched.setVertexAsVisited();
            unvisitedVerticies.poll();
            if(!unvisitedVerticies.isEmpty()){
                searched = unvisitedVerticies.peek();
            }
        }
    }
}

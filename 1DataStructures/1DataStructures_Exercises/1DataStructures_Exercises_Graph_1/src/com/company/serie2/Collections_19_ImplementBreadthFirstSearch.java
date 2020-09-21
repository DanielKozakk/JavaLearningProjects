package com.company.serie2;

import com.company.AdjacencyMatrixDirectedRawGraph;

import java.util.LinkedList;
import java.util.Queue;

public class Collections_19_ImplementBreadthFirstSearch extends AdjacencyMatrixDirectedRawGraph {

    public Collections_19_ImplementBreadthFirstSearch(Integer graphSize) {
        super(graphSize);

    }

    /*

            Tworzę vertexQueue
            Robię searched Vertex jako pierwszy
            dodaję go do vertexqueue




            while dopóki vertexqueue nie jest pusty

                Wypisuję value of searched Vertex
                oznaczam go jako odwiedzony

                Iteruję się po sąsiadach vertex Queue

                    Jeśli sąsiad nie jest odwiedzony i nie jest w vertexQueue
                        Dodaję go do kolejki


                zaznaczam searched Jako visited
                robię vertexQueue.poll
                jesli kolejka nie jest pusta to robię sarchedVertex = queue.peek
     */

    public void breadthFirstSearch(){

        Queue<Vertex> vertexQueue = new LinkedList<>();
        Vertex searchedVertex = vertices[0];
        vertexQueue.add(searchedVertex);

        while(!vertexQueue.isEmpty()){
            System.out.println(searchedVertex.getId());
            searchedVertex.setVertexAsVisited();

            for(int i = 0 ; i < adjacencyMatrix[searchedVertex.getId()].length ; i ++){
                Vertex neighbour = vertices[i];
                if(adjacencyMatrix[searchedVertex.getId()][i] != 0 && !neighbour.isVertexVisited() && !vertexQueue.contains(neighbour)){

                    vertexQueue.add(neighbour);

                }

            }

            vertexQueue.poll();
            searchedVertex = vertexQueue.isEmpty() ? null : vertexQueue.peek();
        }
    }


}

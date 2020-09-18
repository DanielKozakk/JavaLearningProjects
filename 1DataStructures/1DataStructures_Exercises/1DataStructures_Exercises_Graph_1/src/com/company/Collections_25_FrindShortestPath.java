package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Collections_25_FrindShortestPath extends WeightedBiDirectionalGraph {
    public Collections_25_FrindShortestPath(int graphSize) {
        super(graphSize);
    }

    public void findShortestPath(int fromId, int toId) {


        /*
                1 - vertex
                2 - kolumna shortest path from source
                3 - kolumna - previous vertex


                Robię ArrayList nieodwiedzonych Vertexów.

               searchedVertex = verticies[0]
               Robię multi-dimensional array - pierwsza długość to ilość vertexów, druga długość to 3


               Iteruję się po sąsiadach searchedVertex
                    jeśli vertex nie był odwiedzony
                        dodaję go do arraylisty
                    endif

                    w mojej multiarray zapisuję :

                    1 : najkrótsza droga od A
                    2: previous vertex przy najkrótszej drodze

               Oznaczam searchedVertex jako visited
               usuwam searchedVertex z visited

               iteruję się po sąsiadach SearchedVertex wybierając następcę takiego, który ma najkrótszy path from source

               Potem wypisuje najkrótszą ścieżkę

               // dodaj zmiany z private na protected w templatce
        */

        ArrayList<Integer> unvisitedVertexIds = new ArrayList<>();

        Vertex searchedVertex = vertices[fromId];

        unvisitedVertexIds.add(searchedVertex.id);

        Integer[][] dijkstraTable = new Integer[vertices.length][2];

        dijkstraTable[searchedVertex.id][0] = 0;
        dijkstraTable[searchedVertex.id][1] = null;



//        System.out.println(Arrays.toString(dijkstraTable.[]));



        while(!unvisitedVertexIds.isEmpty()) {
            Integer bestHeirId = null;
            for (Edge edge : searchedVertex.listOfEdges) {

                Integer idOfNeighbour = edge.destination;

                if (!vertices[idOfNeighbour].isVertexVisited) {
                    unvisitedVertexIds.add(vertices[idOfNeighbour].id);
                }

                Integer currentDistanceBetweenNodes = edge.weight + dijkstraTable[searchedVertex.id][0];

                if (dijkstraTable[idOfNeighbour][0] == null || dijkstraTable[idOfNeighbour][0] > currentDistanceBetweenNodes) {
                    dijkstraTable[idOfNeighbour][0] = currentDistanceBetweenNodes;
                    dijkstraTable[idOfNeighbour][1] = searchedVertex.id;
                }
                if (!vertices[idOfNeighbour].isVertexVisited && (bestHeirId == null || dijkstraTable[idOfNeighbour][0] < dijkstraTable[idOfNeighbour][0])) {
                    bestHeirId = idOfNeighbour;
                }
            }

            searchedVertex.setVertexAsVisited();
            unvisitedVertexIds.remove(searchedVertex.id);

            if(bestHeirId == null){
                break;
            } else {
                searchedVertex = vertices[bestHeirId];
            }


        }

        for(int i = 0; i < dijkstraTable.length ; i ++){
            Integer[] arr = dijkstraTable[i];

            System.out.println("VertexId : " + i);

            for(int j = 0; j < arr.length ; j ++){

                if(j == 0){
                    System.out.println("Najkrótsza droga : " + arr[j]);
                } else {
                    System.out.println("Poprzednik  : " + arr[j]);
                }
            }
        }

        System.out.println("Najkrótsza droga będzie wynosić : " + dijkstraTable[toId][0]);


    }
}

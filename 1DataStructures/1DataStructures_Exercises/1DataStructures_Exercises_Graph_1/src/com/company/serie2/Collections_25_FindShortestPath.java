package com.company.serie2;

import com.company.WeightedBiDirectionalGraph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Collections_25_FindShortestPath extends WeightedBiDirectionalGraph {
    public Collections_25_FindShortestPath(int graphSize) {
        super(graphSize);
    }

    public void findShortestPath(int from, int to) {

        /*

                Robię unvisited Vertex queuee
                searched = verticies [from]

                unvisitedVertexQueue.add(searched)

                // pierwsze to shortest path from A, drugie to previous VertexID

                int [] [] dijkstra = int [graphSize][2]

                dijkstra[searched.Id][0, null]

                while(!queue.isempty)

                    for(iterate thropugh Edges)

                        if(neighbour nie jest visited

                            if(nie jest w qwueue)
                                dodaj do queue

                        shortestPathFromAToSearched = dijkstra[searched.Id][0]
                        shortestPathFromAToNeighbour = dijkstra[neighourId][0]

                         + shortestPathFromAtoSearched

                        if(shortestPathFromAToNeighbour == null){
                            dijkstra[neighourId][0] = shortestPathFromAToSearched + edge.weight

                        } else if( shortestPathFromAToNeighbour > (shortestPathFromAToSearched + edge.weight){
                            dijkstra[neighourId][0] = shortestPathFromAToSearched + edge.weight;
                            dijkstra[neighbourId[1] = searched.Id
                        }



                    searched.setAsvisited
                    queue.poll();
                    if(queue is not empty)

                        searched = peek

         */

        Queue<Vertex> unvisitedVerticiesQueue = new LinkedList<>();
        Vertex searchedVertex = vertices[from];

        unvisitedVerticiesQueue.add(searchedVertex);

        Integer[][] dijkstraTable = new Integer[graphSize][2];
        dijkstraTable[from] = new Integer[]{0, null};

        while(!unvisitedVerticiesQueue.isEmpty()){

            for(int i = 0 ; i < searchedVertex.listOfEdges.size(); i ++){
                Integer neighbourId = searchedVertex.listOfEdges.get(i).destination;
                Integer sourceId = searchedVertex.listOfEdges.get(i).source;
                Integer edgeWeight = searchedVertex.listOfEdges.get(i).weight;
                Vertex neighbour = vertices[neighbourId];

                if(!neighbour.isVertexVisited()){

                    if(!unvisitedVerticiesQueue.contains(neighbour)){
                        unvisitedVerticiesQueue.add(neighbour);
                    }

                    Integer shortestPathFromAToSearched = dijkstraTable[searchedVertex.getId()][0];
                    Integer shortestPathFromAToNeighbour = dijkstraTable[neighbour.getId()][0];

                    int potentialNewShortestWay = shortestPathFromAToSearched + edgeWeight;

                    if(shortestPathFromAToNeighbour == null){
                        dijkstraTable[neighbour.getId()][0] = potentialNewShortestWay;
                        dijkstraTable[neighbour.getId()][1] = searchedVertex.getId();
                    } else if(shortestPathFromAToNeighbour > potentialNewShortestWay){
                        dijkstraTable[neighbour.getId()][0] = potentialNewShortestWay;
                        dijkstraTable[neighbour.getId()][1] = searchedVertex.getId();
                    }
                }
            }

            searchedVertex.setVertexAsVisited();
            unvisitedVerticiesQueue.poll();
            if(!unvisitedVerticiesQueue.isEmpty()){
                searchedVertex = unvisitedVerticiesQueue.peek();
            }
        }

        for(int i = 0 ; i < dijkstraTable.length ; i ++){

            if(i == to){
                System.out.println( "Id : " + i + " - " +  Arrays.toString(dijkstraTable[i]));

            }
        }
    }


}

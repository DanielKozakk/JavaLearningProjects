package com.company.serie3;

import com.company.WeightedBiDirectionalGraph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Collections_25_FindShortestPathBetweenTwoVertices extends WeightedBiDirectionalGraph {
    public Collections_25_FindShortestPathBetweenTwoVertices(int graphSize) {
        super(graphSize);
    }

    public void findShortestPath(int from, int to) {


        /*

        Tworzę unvisitedVerticesQueue
        searched = from
        dodaję do kolejeckzi

        robię hashMapę - <int id, int[]>
        w hashMapie pierwsza wartość to najkrótszta droga do a, druga wartość to poprzedni vertices

        hashMap.put(fromId, new int{0, null}

        while dopóki unvisited nie jest puste

        iteruję się po sąsiadach searchedVertex

            jeśli sąsiad nie jest visited i nie jest w kolejce
            dodaję go do kolejki

            pobieram wartość z hashmapy dla danego noda, następnie liczę, czy nowa ścieżka nie jest najkrótsza


        usuwam vertex z queue
        oznaczam jako visited
        jeśli queue nie jest puste searched = peek

         */

        Queue<Vertex> unvisitedVerticesQueue = new LinkedList<>();
        Vertex searchedVertex = vertices[from];

        unvisitedVerticesQueue.add(searchedVertex);

        HashMap<Integer, Integer[]> dijkstraHashMap = new HashMap<>();
        dijkstraHashMap.put(from, new Integer[]{0, null});

        while (!unvisitedVerticesQueue.isEmpty()) {

            for (int i = 0; i < searchedVertex.listOfEdges.size(); i++) {

                Edge edgeWithNeighbour = searchedVertex.listOfEdges.get(i);
                Vertex neighbour = vertices[edgeWithNeighbour.destination];

                if(!neighbour.isVertexVisited()) unvisitedVerticesQueue.add(neighbour);


                if(!dijkstraHashMap.containsKey(neighbour.getId())){
                    Integer newPath = edgeWithNeighbour.weight + dijkstraHashMap.get(searchedVertex.getId())[0];
                    dijkstraHashMap.put(neighbour.getId(), new Integer[]{newPath, searchedVertex.getId()});
                } else {

                    Integer oldPath = dijkstraHashMap.get(neighbour.getId())[0];
                    Integer newPath = edgeWithNeighbour.weight + dijkstraHashMap.get(searchedVertex.getId())[0];

                    if(oldPath > newPath){
                        dijkstraHashMap.put(neighbour.getId(), new Integer []{newPath, searchedVertex.getId()});
                    }

                }


            }

            searchedVertex.setVertexAsVisited();
            unvisitedVerticesQueue.poll();
            if (!unvisitedVerticesQueue.isEmpty()) {
                searchedVertex = unvisitedVerticesQueue.peek();
            }

        }

        for (Integer key : dijkstraHashMap.keySet()) {
            System.out.println("Key : " + key);
            System.out.println("Shortest Path : " + dijkstraHashMap.get(key)[0]);
            System.out.println("Previous Veretex : " + dijkstraHashMap.get(key)[1]);
            System.out.println(" ");
        }

    }

}

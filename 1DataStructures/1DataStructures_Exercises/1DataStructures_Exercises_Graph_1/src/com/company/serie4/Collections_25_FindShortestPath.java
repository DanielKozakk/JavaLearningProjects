package com.company.serie4;

import com.company.WeightedBiDirectionalGraph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Collections_25_FindShortestPath extends WeightedBiDirectionalGraph {
    public Collections_25_FindShortestPath(int graphSize) {
        super(graphSize);
    }



    /*

            Robi się taką int[graphSize][2]

            pierwszy index to id Node`a
            Drugi element to Shortest Path
            Trzeci element to previousVertex

            Początkowa lokacja jest zapisana jako :

            dijkstratable[0][0] = 0
            dijkstratable[0][1] = null
            z racji tego, że odległość jest zerowa, bo jesteś na miejscu, więc previous vertex jest null

            robię później unvisitedVerticesQueue

            dodaję searched
            następnie iteruję się po sąsiadach
            zapisuje informacje w dijkstraTAble

            a na koniec wywalam searched z unvisited queue

            potem sprawdzam w dijkstra table który wynik jest najtrafniejszy
     */

    public void findShortestPath(int from, int to) {


        Integer[][] dijkstraTable = new Integer[graphSize][2];

        Vertex searched = vertices[from];

        dijkstraTable[from][0] = 0;
        dijkstraTable[from][1] = null;

        Queue<Vertex> unvisitedVerticesQueue = new LinkedList<>();
        unvisitedVerticesQueue.add(searched);

        while (!unvisitedVerticesQueue.isEmpty()) {

            for (Edge edge : searched.listOfEdges) {

                if (!vertices[edge.destination].isVertexVisited()) {
                    unvisitedVerticesQueue.add(vertices[edge.destination]);
                }

                Integer neighbourId = edge.destination;
                if (dijkstraTable[neighbourId][0] == null) {
                    dijkstraTable[neighbourId][0] = edge.weight + dijkstraTable[searched.getId()][0];
                    dijkstraTable[neighbourId][1] = edge.source;
                } else if (dijkstraTable[neighbourId][0] > edge.weight + dijkstraTable[searched.getId()][0]) {
                    dijkstraTable[neighbourId][0] = edge.weight + dijkstraTable[searched.getId()][0];
                    dijkstraTable[neighbourId][1] = edge.source;

                }


            }

            searched.setVertexAsVisited();
            unvisitedVerticesQueue.poll();
            if (!unvisitedVerticesQueue.isEmpty()) {
                searched = unvisitedVerticesQueue.peek();
            }

        }

        for (int i = 0; i < dijkstraTable.length; i++) {
            System.out.println("Id node : " + i);
            System.out.println(Arrays.toString(dijkstraTable[i]));
        }

        System.out.println(Arrays.toString(dijkstraTable[to]));

    }

}

package com.company.graph.serie2;

import com.company.graph.template.WeightedBiDirectionalGraph;
import com.company.graph.template.WeightedBiDirectionalGraph.Edge;
import com.company.graph.template.WeightedBiDirectionalGraph.Vertex;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Collections_25 {

    public static void findShortestPath(WeightedBiDirectionalGraph input, Integer startNodeId, Integer endNodeId) {


        // waga
        // poprzedni node
        Integer[][] dijkstraMatrix = new Integer[input.graphSize][2];
        dijkstraMatrix[startNodeId][0] = 0;
        dijkstraMatrix[startNodeId][1] = startNodeId;

        Queue<Vertex> queue = new LinkedList<>();

        Vertex startNode = input.vertices[startNodeId];
        queue.add(startNode);

        while (!queue.isEmpty()) {

            Vertex searched = queue.poll();

            for (Edge edge : searched.listOfEdges) {
                Integer destinationId = edge.destination;
                Integer sourceId = edge.source;
                Vertex child = input.vertices[destinationId];

                if(dijkstraMatrix[destinationId][0] == null){
                    dijkstraMatrix[destinationId][0] = dijkstraMatrix[sourceId][0] + edge.weight;
                    dijkstraMatrix[destinationId][1] = sourceId;
                } else if(dijkstraMatrix[destinationId][0] > dijkstraMatrix[sourceId][0] + edge.weight){
                    dijkstraMatrix[destinationId][0] = dijkstraMatrix[sourceId][0] + edge.weight;
                    dijkstraMatrix[destinationId][1] = sourceId;
                }
                if(!queue.contains(child) && !child.isVertexVisited()){
                    queue.add(child);
                }

            }
            searched.setVertexAsVisited();
        }

        System.out.println(Arrays.deepToString(dijkstraMatrix));

        /*
        Biorę nodde, dodaję do kolejki
        pobieram z kolejki i robiępętlę, która działa dopóki nie jest pusta

        iteruję się po sąsiadach
        jeśli najkrótsza droga sąsiada + waga vertexu jest mniejsza od zapisanej, to zapisz nową.

         */


    }

}

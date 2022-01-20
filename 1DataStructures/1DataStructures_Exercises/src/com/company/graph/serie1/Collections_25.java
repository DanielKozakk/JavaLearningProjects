package com.company.graph.serie1;

import com.company.graph.template.AdjacencyListDirectedRawGraph;
import com.company.graph.template.WeightedBiDirectionalGraph;
import com.company.graph.template.WeightedBiDirectionalGraph.Edge;
import com.company.graph.template.WeightedBiDirectionalGraph.Vertex;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Collections_25 {

    public static void findShortestPath(WeightedBiDirectionalGraph input, Integer startNodeId, Integer endNodeId) {


        /*

         Zrób tabelę - waga najkrótszej trasy i poprzedni node.

        1. Weź noda początkoweego.
        2. Sprawdź jakich ma sąsiadów, jeśli zapisasna najkrótsza trasa jest dłuższa niż obecna, a node sąsiadujący niie jest startowym to zaktaulizuj dane:
        zmień poprzedniego noda i aktualizuj najkrótszą trasę.
        3. przejdź do następnego sąsiada.
         */

        Integer[][] shortestPathsTable = new Integer[input.graphSize][2];
        // poprzedni node najkrótszej trasy
        shortestPathsTable[startNodeId][0] = 0;
        // najkrótsza trasa
        shortestPathsTable[startNodeId][1] = 0;

        Vertex searchedNode = input.vertices[startNodeId];
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(searchedNode);

        while (!queue.isEmpty()) {

            searchedNode = queue.peek();
            Integer sourceId = searchedNode.getId();
            for (Edge edge : searchedNode.listOfEdges
            ) {
                Integer neighbourId = edge.destination;
                Integer currentShortestPathOfNeighbour = shortestPathsTable[neighbourId][1];

                if (currentShortestPathOfNeighbour == null) {
                    shortestPathsTable[neighbourId][0] = sourceId;
                    shortestPathsTable[neighbourId][1] = edge.weight + shortestPathsTable[sourceId][1];

                } else if (currentShortestPathOfNeighbour > edge.weight + shortestPathsTable[sourceId][1]) {
                    shortestPathsTable[neighbourId][0] = sourceId;
                    shortestPathsTable[neighbourId][1] = edge.weight + shortestPathsTable[sourceId][1];
                }

                if (!queue.contains(input.vertices[edge.destination]) && !input.vertices[edge.destination].isVertexVisited()) {
                    queue.add(input.vertices[edge.destination]);
                }

            }
            searchedNode.setVertexAsVisited();
            queue.poll();
        }
        System.out.println(Arrays.deepToString(shortestPathsTable));
    }

}

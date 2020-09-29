package com.company.serie2;

import com.company.AdjacencyMatrixDirectedRawGraph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Collections_24_CountTheNumberOfEdgesInGraph extends AdjacencyMatrixDirectedRawGraph {


    public Collections_24_CountTheNumberOfEdgesInGraph(Integer graphSize) {
        super(graphSize);
    }

    public void countEdges() {

        /*
                Robię to na zasadzie breadth first

                queue
                searcehd = 1

                queue.add(searched)

                int countNum = 0;

                while(queue.isnotempty)

                    for(iteruje po sąsiadach)

                        jeśli sąsiad nie był visited
                        countNum ++

                    searched.setAsVisited
                    queue.poll
                    if(queue ot empty)
                    searched = queue.peek)
         */

        Queue<Vertex> unvisitedVerticesQueue = new LinkedList<>();
        Vertex searchedVertex = vertices[0];

        unvisitedVerticesQueue.add(searchedVertex);
        int countEdges = 0;

        while (!unvisitedVerticesQueue.isEmpty()) {

            for (int i = 0; i < adjacencyMatrix[searchedVertex.getId()].length; i++) {

                int edge = adjacencyMatrix[searchedVertex.getId()][i];

                Vertex neighbour = vertices[i];
                if(edge != 0 && !neighbour.isVertexVisited()) {
                        countEdges++;
                    if (!unvisitedVerticesQueue.contains(neighbour)){
                        unvisitedVerticesQueue.add(neighbour);
                    }
                }



            }

            searchedVertex.setVertexAsVisited();
            unvisitedVerticesQueue.poll();
            if (!unvisitedVerticesQueue.isEmpty()) {
                searchedVertex = unvisitedVerticesQueue.peek();
            }

        }

        System.out.println(countEdges);

    }


}

package com.company.serie4;

import com.company.WeightedBiDirectionalGraph;

import java.util.LinkedList;
import java.util.Queue;

public class Collections_24_CountTheNumberOfEdgesInAGraph extends WeightedBiDirectionalGraph{
    public Collections_24_CountTheNumberOfEdgesInAGraph(int graphSize) {
        super(graphSize);
    }

    public int countEdges(){

        /*

                Robię breadth first search
                Zapisuję liczbę krawędzi
         */

        Queue<Vertex> unvisitedVerticesQueue = new LinkedList<>();
        Vertex searched = vertices[0];

        int numberOfEdges = 0;

        unvisitedVerticesQueue.add(searched);

        while(!unvisitedVerticesQueue.isEmpty()){

            for(Edge edge : searched.listOfEdges){

                Vertex neighbour = vertices[edge.destination];

                if(!neighbour.isVertexVisited()){
                    numberOfEdges ++;
                }
                if(!neighbour.isVertexVisited() && !unvisitedVerticesQueue.contains(neighbour)){
                    unvisitedVerticesQueue.add(neighbour);
                }

            }
            searched.setVertexAsVisited();
            unvisitedVerticesQueue.poll();
            if(!unvisitedVerticesQueue.isEmpty()){
                searched = unvisitedVerticesQueue.peek();
            }
        }

        return numberOfEdges;
    }


}

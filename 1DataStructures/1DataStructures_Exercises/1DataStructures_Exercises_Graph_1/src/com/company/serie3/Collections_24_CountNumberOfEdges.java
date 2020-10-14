package com.company.serie3;

import com.company.WeightedBiDirectionalGraph;

import java.util.LinkedList;
import java.util.Queue;

public class Collections_24_CountNumberOfEdges extends WeightedBiDirectionalGraph {

    public Collections_24_CountNumberOfEdges(int graphSize) {
        super(graphSize);
    }

    public void countNumberOfEdges() {

        /*

                Bierzesz pierwszy vertex
                robisz unvisited queue
                dodajesz searched

                while dopóki quuee nie puste

                iterujesz po sąsiadach

                    jeśli sąsiad nie visited

                        dodajesz count do liczby edgesów
                queue poll i całe te

         */

        Vertex searched = vertices[0];
        Queue<Vertex> unvisitedVericesQueue = new LinkedList<>();
        unvisitedVericesQueue.add(searched);

        int edgesCount = 0;

        while (!unvisitedVericesQueue.isEmpty()) {
            for (int i = 0; i < searched.listOfEdges.size(); i++) {
                Vertex neighbour = vertices[searched.listOfEdges.get(i).destination];

                if(!unvisitedVericesQueue.contains(neighbour) && !neighbour.isVertexVisited()){
                    unvisitedVericesQueue.add(neighbour);

                }
                if (!neighbour.isVertexVisited()) {
                    edgesCount++;
                }

            }
            searched.setVertexAsVisited();
            unvisitedVericesQueue.poll();
            if (!unvisitedVericesQueue.isEmpty()) {
                searched = unvisitedVericesQueue.peek();
            }
        }

        System.out.println(edgesCount);

    }
}

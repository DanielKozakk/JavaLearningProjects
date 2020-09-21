package com.company.serie1;

import com.company.AdjacencyMatrixDirectedRawGraph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Collections_24_CountTheNumberOfEdgesInGraph extends AdjacencyMatrixDirectedRawGraph {
    Collections_24_CountTheNumberOfEdgesInGraph(Integer graphSize) {
        super(graphSize);
    }

    class Edge {
        int from;
        int to;

        Edge(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }

    public void countEdges() {

        /*

         Robię clasę Edge, która w konstruktorze ma dwa parametry
         Robię listę wszystkich edge,ów
         Robię listę unikalnych edgeów

         Iteruję się przez adjacencyMatrix
            wewnętrzna pętla

                dodaję do wszystkich edgeów


        Iteruję się przez wszystkie edge

          is Edge unique = true;
          Iteruję się przez unikalne edge

            jeśli znajdę Edge z takim samym From i to
                isEdgeUnique = false;
                break;

          jeśli isEdgeunique to dodaję do unikalnych.
         */

        ArrayList<Edge> allEdges = new ArrayList<>();
        ArrayList<Edge> uniqueEdges = new ArrayList<>();

        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                if(adjacencyMatrix[i][j] != 0){
                    allEdges.add(new Edge(i, j));
                }
            }
        }

        for(Edge edge : allEdges){

            boolean isEdgeUnique = true;
            for(Edge uniqueEdge : uniqueEdges){

                if((edge.from == uniqueEdge.from && edge.to == uniqueEdge.to) || (edge.from == uniqueEdge.to && edge.to == uniqueEdge.from)){
                    isEdgeUnique = false;
                    break;
                }
            }
            if(isEdgeUnique){
                uniqueEdges.add(edge);
            }
        }

        for(Edge unique : uniqueEdges){
            System.out.println("From : " + String.valueOf(unique.from) + " To : " + String.valueOf(unique.to));

        }


    }
}

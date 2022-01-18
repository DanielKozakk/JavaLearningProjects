package com.company.graph.serie1;

import com.company.graph.template.AdjacencyMatrixDirectedRawGraph;
import com.company.graph.template.AdjacencyMatrixDirectedRawGraph.Vertex;

import java.util.LinkedList;
import java.util.Queue;

public class Collections_19 {

    /*

AdjacencyMatrixDirectedRawGraph adjacencyMatrixDirectedRawGraph = new AdjacencyMatrixDirectedRawGraph(7);
adjacencyMatrixDirectedRawGraph.addVertex("Pierwszy");
adjacencyMatrixDirectedRawGraph.addVertex("Drugi");
adjacencyMatrixDirectedRawGraph.addVertex("Trzeci");
adjacencyMatrixDirectedRawGraph.addVertex("Czwarty");
adjacencyMatrixDirectedRawGraph.addVertex("Piąty");
adjacencyMatrixDirectedRawGraph.addVertex("Szósty");
adjacencyMatrixDirectedRawGraph.addVertex("Siódmyyyy");



adjacencyMatrixDirectedRawGraph.addEdge(0, 1);
adjacencyMatrixDirectedRawGraph.addEdge(1, 0);
adjacencyMatrixDirectedRawGraph.addEdge(0, 2);
adjacencyMatrixDirectedRawGraph.addEdge(2, 0);
adjacencyMatrixDirectedRawGraph.addEdge(2, 3);
adjacencyMatrixDirectedRawGraph.addEdge(3, 2);
adjacencyMatrixDirectedRawGraph.addEdge(2, 4);
adjacencyMatrixDirectedRawGraph.addEdge(4, 2);
adjacencyMatrixDirectedRawGraph.addEdge(3, 5);
adjacencyMatrixDirectedRawGraph.addEdge(5, 3);
adjacencyMatrixDirectedRawGraph.addEdge(1, 6);
adjacencyMatrixDirectedRawGraph.addEdge(6, 1);

Expected output:
0, 1, 2, 6, 3, 4, 5

     */


    public static void breadthFirstSearch(AdjacencyMatrixDirectedRawGraph input) {

        /**
         biorę pierwszy vertex
         wrzucam go do kolejki

         robię pętlę która działa dopóki kolejka nie jest pusta

         sprawdzam czy searched name jest znalezione
         jeśli nie, to
         ustawiam vertex jako odwiiedzony
         wrzucam sąsiadów do kolejki

         */
        Vertex searchedVertex = input.vertices[0];
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(searchedVertex);

        while (!queue.isEmpty()) {
//            if (searchedVertex.getName().equals(searchedName)) {
//                System.out.println("Vertex has been found!");
//                break;
//            }
            searchedVertex = queue.poll();

            System.out.println(searchedVertex.getId());

            for (int i = 0 ; i < input.adjacencyMatrix[searchedVertex.getId()].length; i++){
                if(input.adjacencyMatrix[searchedVertex.getId()][i] == 1 && !input.vertices[i].isVertexVisited()){
                    queue.add(input.vertices[i]);
                }
            }
            searchedVertex.setVertexAsVisited();


        }
    }
}

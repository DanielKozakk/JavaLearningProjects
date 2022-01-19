package com.company.graph.serie1;

import com.company.graph.template.AdjacencyListDirectedRawGraph;
import com.company.graph.template.AdjacencyListDirectedRawGraph.Vertex;
import com.company.graph.template.AdjacencyMatrixDirectedRawGraph;

import java.util.LinkedList;
import java.util.Queue;

public class Collections_21 {

    /**
      Collections_21_BreadthFirstSearchInAdjacencyList col21 = new Collections_21_BreadthFirstSearchInAdjacencyList(7);
      col21.addVertex("Pierwszy");
      col21.addVertex("Drugi");
      col21.addVertex("Trzeci");
      col21.addVertex("Czwarty");
      col21.addVertex("Piąty");
      col21.addVertex("Szósty");
      col21.addVertex("Siódmyyyy");
      <p>
      <p>
      <p>
      col21.addEdge(0, 1);
      col21.addEdge(1, 0);
      <p>
      col21.addEdge(0, 2);
      col21.addEdge(2, 0);
      <p>
      <p>
      col21.addEdge(2, 3);
      col21.addEdge(3, 2);
      <p>
      col21.addEdge(2, 4);
      col21.addEdge(4, 2);
      <p>
      col21.addEdge(3, 5);
      col21.addEdge(5, 3);
      <p>
      col21.addEdge(1, 6);
      col21.addEdge(6, 1);
      <p>
      col21.breadthFirstSearchInAdjacencyList();
      <p>
      Expected output:
      0, 1, 2, 6, 3, 4, 5
     */

    public static void breadthFirst(AdjacencyListDirectedRawGraph input) {

        /**

         1. Biorę pierwszy elementy wciepuję do kolejki
         2. Pętla whilke dopóki kolejka nie pusta
         3. searched=queue.poll();
         4. Sprawdzam jego sąsiadów, wrzucam ich do kolejki
         5. Oznaczam jako odwiedzony.

         */

        Queue<Vertex> queue = new LinkedList<>();
        queue.add(input.vertices[0]);
        while (!queue.isEmpty()) {
            Vertex searchedElement = queue.poll();
            if (searchedElement.isVertexVisited()) continue;
            for (Integer neighbourId : searchedElement.listOfEdges) {
                if (!input.vertices[neighbourId].isVertexVisited()) {
                    queue.add(input.vertices[neighbourId]);
                }
            }
            System.out.println(searchedElement.getId());
            searchedElement.setVertexAsVisited();
        }

    }
}


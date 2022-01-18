package com.company.graph.serie1;

import com.company.graph.template.AdjacencyMatrixDirectedRawGraph;
import com.company.graph.template.AdjacencyMatrixDirectedRawGraph.Vertex;

import java.util.Stack;

public class Collections_20 {

    /**


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
     0, 1, 6, 2, 3, 5, 4


     */

    public static void depthFirst(AdjacencyMatrixDirectedRawGraph input){


        /**

         PObierma pierwszy z grafu

         dodaję go do stackka
         robię zmienną searchedElement

         robię pętlę dopóki stack nie jest pusty

            searchedElement = stack.pop()

         jeśli searched jest odwiedzony to coontinue

         jeśli nie ma nieodwiedzonych sąsiadów, to ustaw go na odwiedzonego
         jeśli ma nieodwiedzonych to pobierz pierwszego sąsiada i dodaj go do stacka
         */

        Stack<Vertex> stack = new Stack<>();
        stack.add(input.vertices[0]);

        Vertex searched = stack.peek();
        while(!stack.isEmpty()){

            if(!searched.isVertexVisited()){
                System.out.println(searched.getId());
            }
            searched.setVertexAsVisited();

            boolean hasVertexAnyUnvisitedNeighbours = false;
            for(int i = 0 ; i < input.adjacencyMatrix[searched.getId()].length; i++){

                int edge = input.adjacencyMatrix[searched.getId()][i];
                if(edge == 1 && !input.vertices[i].isVertexVisited()){

                    hasVertexAnyUnvisitedNeighbours = true;
                    stack.push(input.vertices[i]);
                    break;
                }
            }
            if(!hasVertexAnyUnvisitedNeighbours) stack.pop();
            if(!stack.isEmpty()) searched = stack.peek();

        }

    }


}

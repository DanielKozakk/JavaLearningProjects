package com.company.graph.serie1;

import com.company.graph.template.AdjacencyListDirectedRawGraph;
import com.company.graph.template.AdjacencyListDirectedRawGraph.Vertex;

import java.util.Stack;

public class Collections_22 {

    /**
     AdjacencyMatrixDirectedRawGraph adjacencyMatrixDirectedRawGraph = new AdjacencyMatrixDirectedRawGraph(7);
     adjacencyMatrixDirectedRawGraph.addVertex("Pierwszy");
     adjacencyMatrixDirectedRawGraph.addVertex("Drugi");
     adjacencyMatrixDirectedRawGraph.addVertex("Trzeci");
     adjacencyMatrixDirectedRawGraph.addVertex("Czwarty");
     adjacencyMatrixDirectedRawGraph.addVertex("Piąty");
     adjacencyMatrixDirectedRawGraph.addVertex("Szósty");
     adjacencyMatrixDirectedRawGraph.addVertex("Siódmyyyy");



     col21.addEdge(0, 1);
     col21.addEdge(1, 0);

     col21.addEdge(0, 2);
     col21.addEdge(2, 0);


     col21.addEdge(2, 3);
     col21.addEdge(3, 2);

     col21.addEdge(2, 4);
     col21.addEdge(4, 2);

     col21.addEdge(3, 5);
     col21.addEdge(5, 3);

     col21.addEdge(1, 6);
     col21.addEdge(6, 1);

     col21.breadthFirstSearchInAdjacencyList();

     Expected output:
     0, 1, 2, 6, 3, 4, 5
     */

    public static void depthFirst(AdjacencyListDirectedRawGraph input){
    /*
        1. pobieram 1 element z grafu
        2. dodjaę do stacka
        3. while dopóki stack nie pusty
        4. robię zmienną searched na stack.peek()
        5. robię flagę do oznaczania, c zy ma nieodwiedzonych sąsiadów
        6. iteruję się po sąsiadach, jeśli jest jakiś nieodwiedzony, to go dodaję i ustawiam flagę, że ma nieodwiedzonych sasiadów
        7. jak nie ma nieodwiedzonych sąsiadów, to stack.pop

    */

        Stack<Vertex> stack = new Stack<>();
        stack.push(input.vertices[0]);

        while(!stack.isEmpty()){
            Vertex searched = stack.peek();
            if(!searched.isVertexVisited()){
                System.out.println(searched.getName());
                searched.setVertexAsVisited();
            }
            boolean hasVertexAnyUnvisitedNeighbour = false;
            for (Integer neighbourId: searched.listOfEdges) {
                Vertex neighbour = input.vertices[neighbourId];
                if(!neighbour.isVertexVisited() && !stack.contains(neighbour)){
                    stack.push(neighbour);
                    hasVertexAnyUnvisitedNeighbour = true;
                }
            }
            if(!hasVertexAnyUnvisitedNeighbour && !stack.isEmpty()){
                stack.pop();
            }
        }

    }
}

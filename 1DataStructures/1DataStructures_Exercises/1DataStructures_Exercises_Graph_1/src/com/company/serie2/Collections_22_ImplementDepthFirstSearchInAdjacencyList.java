package com.company.serie2;

import com.company.AdjacencyListDirectedRawGraph;

import java.util.Stack;

public class Collections_22_ImplementDepthFirstSearchInAdjacencyList extends AdjacencyListDirectedRawGraph {
    public Collections_22_ImplementDepthFirstSearchInAdjacencyList(int graphSize) {
        super(graphSize);
    }
    public void depthFirstSearch(){


        /*

            Robię stack vertex
            Robię searched na pierwszy

            dodaję do stacka

            robię pętlę, sprawdza czy stack nie jest pusty

                jeśli vertex is not visited
                    wypisz wartość

                oznacz jako visited
                zmienna czy vertex is exhausted = true

                idź po sąsiadach

                    jeśli jest sąsiad, który jest nieodwiedzony i nie ma go w stakcu
                    isVertexExhausted = false
                    searched vertex = ten sąsiad
                    break

                jeśli is vertexexhausted

                    robię stack.pop
                    jeśli nie jest pusty to sarched = stack.peek

         */

        Stack<Vertex> verticesStack = new Stack<>();
        Vertex searchedVertex = vertices[0];

        verticesStack.add(searchedVertex);

        while(!verticesStack.isEmpty()){

            if(!searchedVertex.isVertexVisited()){
                System.out.println(searchedVertex.getId());
            }
            searchedVertex.setVertexAsVisited();
            boolean isVertexExhausted = true;
            for(int i = 0 ; i < searchedVertex.listOfEdges.size() ; i++){
                Integer neighbourId = searchedVertex.listOfEdges.get(i);
                Vertex neighbour = vertices[neighbourId];
                if(!neighbour.isVertexVisited() && !verticesStack.contains(neighbour)){
                    verticesStack.add(neighbour);
                    isVertexExhausted =false;
                    searchedVertex = neighbour;
                    break;
                }
            }
            if(isVertexExhausted){
                verticesStack.pop();
                if(!verticesStack.isEmpty()){
                    searchedVertex = verticesStack.peek();
                }
            }

        }


    }
}

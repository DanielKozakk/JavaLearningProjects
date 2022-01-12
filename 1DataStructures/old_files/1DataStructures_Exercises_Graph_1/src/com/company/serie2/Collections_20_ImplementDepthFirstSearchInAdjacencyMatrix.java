package com.company.serie2;

import com.company.AdjacencyMatrixDirectedRawGraph;

import java.util.Stack;

public class Collections_20_ImplementDepthFirstSearchInAdjacencyMatrix extends AdjacencyMatrixDirectedRawGraph {

    public Collections_20_ImplementDepthFirstSearchInAdjacencyMatrix(Integer graphSize) {
        super(graphSize);
    }

    public void implementDepthFirstSearch(){


        /*

                Robię verteciesStack

                robię searched = pierwszy vertex

                dodaję searched do verticiesstack

                while vs nie jest pusty
                    systemout searched
                    searched.setAsVisited()

                    iteruję się po sąsiadach

                        isVertexExhausted = true
                        jeśli sąsiad nie jest odwiedzony i stack go nie zawiera
                            isVertexExhausted = false;
                            dodaj sąsiada do stacku
                            ustaw searched jako tego sąsiada
                            i zrób brejka

                    if(isVertexExhausted)
                             stack.pop
                        jeśli stack nie jest pusty :
                   searchedVertex = stack.peek()
         */

        Stack<Vertex> verticesStack = new Stack<>();
        Vertex searchedVertex = vertices[0];
        verticesStack.add(searchedVertex);

        while(!verticesStack.isEmpty()){

            if(!searchedVertex.isVertexVisited()) System.out.println(searchedVertex.getId());
            searchedVertex.setVertexAsVisited();

            boolean isVertexExhausted = true;

            for(int i = 0; i < adjacencyMatrix[searchedVertex.getId()].length ; i ++){
                Vertex neighbour = vertices[i];
                if(adjacencyMatrix[searchedVertex.getId()][i] != 0 && !neighbour.isVertexVisited() && !verticesStack.contains(neighbour)){
                    verticesStack.add(neighbour);
                    isVertexExhausted=false;
                    searchedVertex = neighbour;
                    break;
                }
            }

            if(isVertexExhausted){
                verticesStack.pop();
                if(!verticesStack.isEmpty()) searchedVertex = verticesStack.peek();
            }
        }

    }

}

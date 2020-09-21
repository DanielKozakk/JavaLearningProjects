package com.company.serie1;

import com.company.AdjacencyMatrixDirectedRawGraph;

import java.util.Stack;

public class Collections_20_DepthFirstSearchInAdjacencyMatrix extends AdjacencyMatrixDirectedRawGraph {

    Collections_20_DepthFirstSearchInAdjacencyMatrix(Integer graphSize) {
        super(graphSize);
    }

    public void depthFirstSearchInAdjacencyMatrix(){

        /*

                Robie stack
                searchedVertex = pierwszy
                dodaję searchedVertex do stacka

                while(stack.isnotempty)
                    jeśli nie jest visited to :
                        wypisuję jego value
                    ustawiam go jako visited

                    boolean isVertexExhausted = true;
                    for( i = 0 ; i < adjacencyMatrix[searchedVertex.id]; i ++

                        if(!vertecies[i].isVertexVisited)

                            isveretxexhausted = false
                            searchedVertex = vertecies[i]
                            stack.add(searchedVertex)
                            break;

                    end for loop

                    jeśli node wyczerpany
                        stack.pop
                        jeśli stack nie pusty to
                            searchedVertex = stack.peek

         */

        Stack<Vertex> vertexStack = new Stack<>();
        Vertex searchedVertex = vertices[0];
        vertexStack.add(searchedVertex);
        while(!vertexStack.isEmpty()){

            if(!searchedVertex.vertexVisited) {
                System.out.println(searchedVertex.id);
            }
            searchedVertex.setVertexAsVisited();

            boolean isVertexExhausted = true;

            for(int i = 0 ; i < adjacencyMatrix[searchedVertex.id].length ; i ++){

                if(adjacencyMatrix[searchedVertex.id][i] != 0 && !vertices[i].vertexVisited){
                    isVertexExhausted = false;
                    searchedVertex = vertices[i];
                    vertexStack.add(searchedVertex);
                    break;
                }
            }
            if(isVertexExhausted){
                vertexStack.pop();
                if(!vertexStack.isEmpty()){
                    searchedVertex = vertexStack.peek();
                }
            }

        }

    }
}

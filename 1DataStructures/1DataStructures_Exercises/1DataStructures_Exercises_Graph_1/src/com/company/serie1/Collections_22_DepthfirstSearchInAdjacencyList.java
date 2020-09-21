package com.company.serie1;

import com.company.AdjacencyListDirectedRawGraph;

import java.util.Stack;

public class Collections_22_DepthfirstSearchInAdjacencyList extends AdjacencyListDirectedRawGraph {


    public Collections_22_DepthfirstSearchInAdjacencyList(int graphSize) {
        super(graphSize);
    }

    public void depthFirstSearch() {

        /*

        Robię verticiesStack
        Robię searchedVertex jako pierwszy
        dodaję searched do stacka

        while stack nie jest pusty

            wypisuję wartość searchedStack
            oznaczam jako visited
            robię bool czy jest on exhausted

            for loop poprzez sąsiadów

                jeśli sąsiad nie jest visited

                    exhausted = false
                    searched verex = sąsiad
            endforloop

            if isexhausted

                stack.pop
                if !stack.isEmpty

                    searched = stack.peek
         */

        Stack<Vertex> stack = new Stack<>();
        Vertex searchedVertex = vertices[0];
        stack.add(searchedVertex);
        searchedVertex.setVertexAsVisited();
        System.out.println(searchedVertex.ID);

        while(!stack.isEmpty()){



            if(!searchedVertex.isVertexVisited){
                System.out.println(searchedVertex.ID);
                stack.add(searchedVertex);
            }
            searchedVertex.setVertexAsVisited();

            boolean isVertexExhausted = true;

            for(Integer neighbourId : searchedVertex.listOfEdges){


                if(!vertices[neighbourId].isVertexVisited){
                    isVertexExhausted=false;
                    searchedVertex = vertices[neighbourId];
                    break;
                }
            }
            if(isVertexExhausted){
                stack.pop();
                if(!stack.isEmpty()){
                    searchedVertex=stack.peek();
                }
            }
        }

    }
}

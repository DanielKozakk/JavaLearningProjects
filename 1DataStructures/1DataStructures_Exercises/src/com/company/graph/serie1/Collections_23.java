package com.company.graph.serie1;

import com.company.graph.template.AdjacencyListDirectedRawGraph;
import com.company.graph.template.AdjacencyListDirectedRawGraph.Vertex;

import java.util.Objects;

public class Collections_23 {

    /**
     * AdjacencyListDirectedRawGraph col23 = new AdjacencyListDirectedRawGraph(7);
     * col23.addVertex("Zerowy");
     * col23.addVertex("Pierwszy");
     * col23.addVertex("Drugi");
     * col23.addVertex("Trzeci");
     * col23.addVertex("Czwarty");
     * col23.addVertex("Piąty");
     * col23.addVertex("Szósty");
     * <p>
     * col23.addEdge(0, 1);
     * col23.addEdge(1, 0);
     * <p>
     * col23.addEdge(0, 2);
     * col23.addEdge(2, 0);
     * <p>
     * <p>
     * col23.addEdge(1,6);
     * col23.addEdge(6,1);
     * <p>
     * col23.addEdge(2,3);
     * col23.addEdge(3,2);
     * <p>
     * col23.addEdge(2,4);
     * col23.addEdge(4,2);
     * <p>
     * col23.addEdge(5,3);
     * col23.addEdge(3,5);
     */
    public static boolean checkIfGraphIsTree(AdjacencyListDirectedRawGraph input) {

        if (!undirectedDFS(1, -1, input)) {
            return false;
        }
        for (Vertex vertex : input.vertices
        ) {
            if (!vertex.isVertexVisited()) {
                return false;
            }
        }
        return true;
    }

    private static boolean undirectedDFS(Integer searchedNodeId, Integer parentOfSearchedNode, AdjacencyListDirectedRawGraph input) {
        Vertex searchedNode = input.vertices[searchedNodeId];
        if (searchedNode.isVertexVisited()) {
            return false;
        }
        searchedNode.setVertexAsVisited();
        for (Integer childId : searchedNode.listOfEdges
        ) {
            if(!Objects.equals(childId, parentOfSearchedNode)){
                boolean result = undirectedDFS(childId, searchedNodeId, input);
                if(!result){
                    return false;
                }
            }
        }
        return true;
    }
}

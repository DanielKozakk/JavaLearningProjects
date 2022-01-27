package com.company.graph.serie2;

import com.company.graph.template.AdjacencyListDirectedRawGraph;
import com.company.graph.template.AdjacencyListDirectedRawGraph.Vertex;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Collections_23 {

    /**
     AdjacencyListDirectedRawGraph col23 = new AdjacencyListDirectedRawGraph(7);
     col23.addVertex("Zerowy");
     col23.addVertex("Pierwszy");
     col23.addVertex("Drugi");
     col23.addVertex("Trzeci");
     col23.addVertex("Czwarty");
     col23.addVertex("Piąty");
     col23.addVertex("Szósty");

     col23.addEdge(0, 1);
     col23.addEdge(1, 0);

     col23.addEdge(0, 2);
     col23.addEdge(2, 0);


     col23.addEdge(1,6);
     col23.addEdge(6,1);

     col23.addEdge(2,3);
     col23.addEdge(3,2);

     col23.addEdge(2,4);
     col23.addEdge(4,2);

     col23.addEdge(5,3);
     col23.addEdge(3,5);

     * @param input
     */
    public static void checkIfGraphIsTree(AdjacencyListDirectedRawGraph input){

        /*

        Dodaję pierwszego node do kolejki.
        Iteruję się po dzieciach i je też dodaję do kolejki.
        Oznaczam node jako odwiedzony.
        Wywalam go z kolejki
        searched = queue.poll();

         */

        boolean isGraphTree = true;

        Queue<Vertex> queue = new LinkedList<>();
        Vertex firstVertex = input.vertices[0];
        queue.add(firstVertex);
        firstVertex.setVertexAsVisited();

        List<Integer> parentList = new ArrayList<>();

        outer: while(!queue.isEmpty()){
            Vertex parent = queue.poll();
            parentList.add(parent.getId());

            for(Integer childId: parent.listOfEdges ){
               Vertex child = input.vertices[childId];
               if(parentList.contains(childId)){
                   continue;
               } else
               if(child.isVertexVisited()){
                   System.out.println("Graph!");
                   isGraphTree = false;
                   break outer;
               } else {
                   child.setVertexAsVisited();
                   queue.add(child);
               }
            }
        }

        if(isGraphTree) {
            System.out.println("Tree!");
        }
    }
}

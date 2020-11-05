package com.company;


import com.company.serie3.*;
import com.company.serie4.Collections_23_CheckIfGraphIsATree;
import com.company.serie4.Collections_24_CountTheNumberOfEdgesInAGraph;
import com.company.serie4.Collections_25_FindShortestPath;

public class Main {

    public static void main(String[] args) {

        Collections_24_CountTheNumberOfEdgesInAGraph col24 = new Collections_24_CountTheNumberOfEdgesInAGraph(5);


        col24.addVertex("A");//0
        col24.addVertex("B");//1
        col24.addVertex("C");//2
        col24.addVertex("D");//3
        col24.addVertex("E");//4

        col24.addEdge(0, 1, 6);
        col24.addEdge(0, 3, 1);
        col24.addEdge(1, 3, 2);
        col24.addEdge(1, 4, 2);
        col24.addEdge(1, 2, 5);
        col24.addEdge(2, 4, 5);
        col24.addEdge(3, 4, 1);

        System.out.println(col24.countEdges());

    }


}

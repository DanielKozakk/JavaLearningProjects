package com.company;



import com.company.graph.serie2.Collections_23;
import com.company.graph.serie2.Collections_25;
import com.company.graph.template.AdjacencyListDirectedRawGraph;
import com.company.graph.template.WeightedBiDirectionalGraph;
import com.company.linkedList.template.LinkedList;
import com.company.linkedList.template.LinkedList.Node;

import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        WeightedBiDirectionalGraph col25 = new WeightedBiDirectionalGraph(5);


        col25.addVertex("A");//0
        col25.addVertex("B");//1
        col25.addVertex("C");//2
        col25.addVertex("D");//3
        col25.addVertex("E");//4

        col25.addEdge(0, 1, 6);
        col25.addEdge(0, 3, 1);
        col25.addEdge(1, 3, 2);
        col25.addEdge(1, 4, 2);
        col25.addEdge(1, 2, 5);
        col25.addEdge(2, 4, 5);
        col25.addEdge(3, 4, 1);



        Collections_25.findShortestPath(col25, 0, 2);
    }
}

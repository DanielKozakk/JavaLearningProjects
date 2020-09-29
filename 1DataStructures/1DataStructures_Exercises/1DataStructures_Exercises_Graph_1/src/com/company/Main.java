package com.company;


import com.company.serie2.*;

public class Main {

    public static void main(String[] args) {


        Collections_24_CountTheNumberOfEdgesInGraph col24 = new Collections_24_CountTheNumberOfEdgesInGraph(5);
        col24.addVertex("A");
        col24.addVertex("B");
        col24.addVertex("C");
        col24.addVertex("D");
        col24.addVertex("E");

        col24.addEdge(0, 1);
        col24.addEdge(1, 0);


        col24.addEdge(0, 3);
        col24.addEdge(3, 0);

        col24.addEdge(1, 3);
        col24.addEdge(3, 1);


        col24.addEdge(1,4);
        col24.addEdge(4,1);

        col24.addEdge(1,2);
        col24.addEdge(2,1);

        col24.addEdge(2,4);
        col24.addEdge(4,2);

        col24.addEdge(3,4);
        col24.addEdge(4,3);

        col24.countEdges();

    }


}

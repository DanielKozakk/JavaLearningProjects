package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Collections_24_CountTheNumberOfEdgesInGraph col24 = new Collections_24_CountTheNumberOfEdgesInGraph(7);
        col24.addVertex("Zerowy");
        col24.addVertex("Pierwszy");
        col24.addVertex("Drugi");
        col24.addVertex("Trzeci");
        col24.addVertex("Czwarty");
        col24.addVertex("Piąty");
        col24.addVertex("Szósty");

        col24.addEdge(0, 1);
        col24.addEdge(1, 0);

        col24.addEdge(0, 2);
        col24.addEdge(2, 0);


        col24.addEdge(1,6);
        col24.addEdge(6,1);

        col24.addEdge(2,3);
        col24.addEdge(3,2);

        col24.addEdge(2,4);
        col24.addEdge(4,2);

        col24.addEdge(5,3);
        col24.addEdge(3,5);


//        col24.countEdges();


//
//        System.out.println(col24.getEdges());
//
        Collections_24_CountTheNumberOfEdgesInGraph col24_2 = new Collections_24_CountTheNumberOfEdgesInGraph(8);
        col24_2.addVertex("Zerowy");
        col24_2.addVertex("Pierwszy");
        col24_2.addVertex("Drugi");
        col24_2.addVertex("Trzeci");
        col24_2.addVertex("Czwarty");
        col24_2.addVertex("Piąty");
        col24_2.addVertex("Szósty");


        col24_2.addEdge(0, 1);
        col24_2.addEdge(1, 0);

        col24_2.addEdge(0, 2);
        col24_2.addEdge(2, 0);

        col24_2.addEdge(1, 2);
        col24_2.addEdge(2, 1);

        col24_2.addEdge(3, 2);
        col24_2.addEdge(2, 3);

        col24_2.addEdge(4, 2);
        col24_2.addEdge(2, 4);

        col24_2.addEdge(3, 5);
        col24_2.addEdge(5, 3);

        col24_2.addEdge(1, 7);
        col24_2.addEdge(7, 1);

        col24_2.addEdge(1, 6);
        col24_2.addEdge(6, 1);

        col24_2.addEdge(7, 6);
        col24_2.addEdge(6, 7);

        col24_2.countEdges();




    }


}

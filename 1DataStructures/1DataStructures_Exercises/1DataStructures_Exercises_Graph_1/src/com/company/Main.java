package com.company;


import com.company.serie3.*;

public class Main {

    public static void main(String[] args) {

        Collections_25_FindShortestPathBetweenTwoVertices col25 = new Collections_25_FindShortestPathBetweenTwoVertices(5);


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

        col25.findShortestPath(0,2);

    }


}

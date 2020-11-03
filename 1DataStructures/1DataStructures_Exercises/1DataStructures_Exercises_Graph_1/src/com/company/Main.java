package com.company;


import com.company.serie3.*;
import com.company.serie4.Collections_23_CheckIfGraphIsATree;

public class Main {

    public static void main(String[] args) {

        Collections_23_CheckIfGraphIsATree col23_4 = new Collections_23_CheckIfGraphIsATree(8);
        col23_4.addVertex("Zerowy");
        col23_4.addVertex("Pierwszy");
        col23_4.addVertex("Drugi");
        col23_4.addVertex("Trzeci");
        col23_4.addVertex("Czwarty");
        col23_4.addVertex("Piąty");
        col23_4.addVertex("Szósty");
        col23_4.addVertex("Siódmy");


        col23_4.addEdge(0, 1);
        col23_4.addEdge(1, 0);

        col23_4.addEdge(0, 2);
        col23_4.addEdge(2, 0);

        col23_4.addEdge(1, 2);
        col23_4.addEdge(2, 1);

        col23_4.addEdge(3, 2);
        col23_4.addEdge(2, 3);

        col23_4.addEdge(4, 2);
        col23_4.addEdge(2, 4);

        col23_4.addEdge(3, 5);
        col23_4.addEdge(5, 3);

        col23_4.addEdge(1, 7);
        col23_4.addEdge(7, 1);

        col23_4.addEdge(1, 6);
        col23_4.addEdge(6, 1);

        col23_4.addEdge(7, 6);
        col23_4.addEdge(6, 7);

        System.out.println(col23_4.checkIfGraphIsATree());

        Collections_23_CheckIfGraphIsATree col23_4_2 = new Collections_23_CheckIfGraphIsATree(7);
        col23_4_2.addVertex("Zerowy");
        col23_4_2.addVertex("Pierwszy");
        col23_4_2.addVertex("Drugi");
        col23_4_2.addVertex("Trzeci");
        col23_4_2.addVertex("Czwarty");
        col23_4_2.addVertex("Piąty");
        col23_4_2.addVertex("Szósty");

        col23_4_2.addEdge(0, 1);
        col23_4_2.addEdge(1, 0);

        col23_4_2.addEdge(0, 2);
        col23_4_2.addEdge(2, 0);


        col23_4_2.addEdge(1,6);
        col23_4_2.addEdge(6,1);

        col23_4_2.addEdge(2,3);
        col23_4_2.addEdge(3,2);

        col23_4_2.addEdge(2,4);
        col23_4_2.addEdge(4,2);

        col23_4_2.addEdge(5,3);
        col23_4_2.addEdge(3,5);
        System.out.println(col23_4_2.checkIfGraphIsATree());

    }


}

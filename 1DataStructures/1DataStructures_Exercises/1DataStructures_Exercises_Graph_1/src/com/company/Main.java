package com.company;


import com.company.serie2.*;

public class Main {

    public static void main(String[] args) {


        Collections_23_CheckIfGraphIsATreeOrNot col23 = new Collections_23_CheckIfGraphIsATreeOrNot(7);
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


        Collections_23_CheckIfGraphIsATreeOrNot col23_2 = new Collections_23_CheckIfGraphIsATreeOrNot(7);
        col23_2.addVertex("Zerowy");
        col23_2.addVertex("Pierwszy");
        col23_2.addVertex("Drugi");
        col23_2.addVertex("Trzeci");
        col23_2.addVertex("Czwarty");
        col23_2.addVertex("Piąty");
        col23_2.addVertex("Szósty");


        col23_2.addEdge(0, 1);
        col23_2.addEdge(1, 0);

        col23_2.addEdge(0, 2);
        col23_2.addEdge(2, 0);

        col23_2.addEdge(1, 2);
        col23_2.addEdge(2, 1);

        col23_2.addEdge(3, 2);
        col23_2.addEdge(2, 3);

        col23_2.addEdge(4, 2);
        col23_2.addEdge(2, 4);

        col23_2.addEdge(3, 5);
        col23_2.addEdge(5, 3);

        col23_2.addEdge(1, 7);
        col23_2.addEdge(7, 1);

        col23_2.addEdge(1, 6);
        col23_2.addEdge(6, 1);

        col23_2.addEdge(7, 6);
        col23_2.addEdge(6, 7);

    }


}

package com.company;

import com.company.serie1.*;

public class Main {

    public static void main(String[] args) {

        Collections_30_FindAncestorsOfNode col30 = new Collections_30_FindAncestorsOfNode(100);
        col30.insert(111);
        col30.insert(78);
        col30.insert(90);
        col30.insert(60);
        col30.insert(50);

        col30.printAncestors(50);


    }
}

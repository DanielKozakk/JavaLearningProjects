package com.company;

import com.company.serie2.*;

public class Main {

    public static void main(String[] args) {



        Collections_30_FindAncestors col28 = new Collections_30_FindAncestors();

        col28.insert(100);
        col28.insert(111);
        col28.insert(78);
        col28.insert(90);
        col28.insert(60);
        col28.insert(50);


        System.out.println(col28.findAncestorsOfGivenNode(50).toString());

    }
}

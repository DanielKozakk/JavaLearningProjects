package com.company;

import com.company.serie1.Collections_26_ImplementBinarySearchTree;
import com.company.serie2.*;

public class Main {

    public static void main(String[] args) {

        Collections_26_ImplementBinarySearchTree col26 = new Collections_26_ImplementBinarySearchTree(10);
        col26.insert(15);
        col26.insert(5);
        col26.insert(8);
        col26.insert(7);
        col26.insert(4);
        col26.insert(12);
        col26.insert(16);

        System.out.println(col26.contains(163));



    }
}

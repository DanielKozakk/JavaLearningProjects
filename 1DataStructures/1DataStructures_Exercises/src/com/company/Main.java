package com.company;


import com.company.binarySearchTree.serie1.Collections_26_BinarySearchTree;
import com.company.binarySearchTree.serie1.Collections_29;
import com.company.binarySearchTree.serie1.Collections_30;

public class Main {

    public static void main(String[] args) {

        Collections_26_BinarySearchTree col26 = new Collections_26_BinarySearchTree();

        col26.insert(100);
        col26.insert(111);
        col26.insert(78);
        col26.insert(90);
        col26.insert(60);
        col26.insert(50);

        Collections_30.findAncestorsOfANode(col26, 90);


    }
}

package com.company;

import com.company.serie1.Collections_26_ImplementBinarySearchTree;
import com.company.serie1.Collections_27_FindHeightOfABinaryTree;
import com.company.serie1.Collections_28_FindKthMaximumValueInTrie;
import com.company.serie1.Collections_29_FindNodesAtKDistance;

public class Main {

    public static void main(String[] args) {

        Collections_29_FindNodesAtKDistance col29 = new Collections_29_FindNodesAtKDistance(10);

        col29.insert(15);
        col29.insert(5);
        col29.insert(8);
        col29.insert(7);
        col29.insert(4);
        col29.insert(12);
        col29.insert(16);

        col29.findNodesAtKDistance(3);


    }
}

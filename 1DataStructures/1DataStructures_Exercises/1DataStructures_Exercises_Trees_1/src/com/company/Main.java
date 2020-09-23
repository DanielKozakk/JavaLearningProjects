package com.company;

import com.company.serie1.Collections_26_ImplementBinarySearchTree;
import com.company.serie1.Collections_27_FindHeightOfABinaryTree;

public class Main {

    public static void main(String[] args) {

        Collections_27_FindHeightOfABinaryTree col27 = new Collections_27_FindHeightOfABinaryTree(10);

        col27.insert(15);
        col27.insert(5);
        col27.insert(8);
        col27.insert(7);
        col27.insert(4);
        col27.insert(12);
        col27.insert(16);

        col27.insert(17);
        col27.insert(18);

        col27.findHeight();

    }
}

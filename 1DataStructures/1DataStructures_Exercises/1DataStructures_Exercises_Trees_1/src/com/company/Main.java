package com.company;

import com.company.serie4.Collections_26_ImplementSearchBinaryTree;

public class Main {

    public static void main(String[] args) {

        Collections_26_ImplementSearchBinaryTree col26 = new Collections_26_ImplementSearchBinaryTree(10);

        col26.insert(15);
        col26.insert(5);
        col26.insert(8);
        col26.insert(7);
        col26.insert(4);
        col26.insert(12);
        col26.insert(16);

col26.insertInOrder();

    }
}

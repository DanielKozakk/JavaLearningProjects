package com.company;

import com.company.serie2.*;
import com.company.serie4.Collections_26_SearchBinaryTree;

public class Main {

    public static void main(String[] args) {




        Collections_26_SearchBinaryTree col26 = new Collections_26_SearchBinaryTree(10);

        col26.insert(15);
        col26.insert(5);
        col26.insert(8);
        col26.insert(7);
        col26.insert(4);
        col26.insert(12);
        col26.insert(16);

        col26.printInOrder();

        System.out.println(col26.contains(5121));


    }
}

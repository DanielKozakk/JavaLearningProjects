package com.company;


import com.company.binarySearchTree.serie1.Collections_26_BinarySearchTree;
import com.company.binarySearchTree.serie1.Collections_29;
import com.company.binarySearchTree.serie1.Collections_30;
import com.company.prefixTree.serie1.Collections_31_PrefixTree;
import com.company.prefixTree.serie1.Collections_32;
import com.company.prefixTree.serie1.Collections_33;

public class Main {

    public static void main(String[] args) {

        Collections_33 col31 = new Collections_33();

        col31.addDefinition("ara", "stwor człekopodobny");
        col31.addDefinition("ary", "stwor malopodobny");

        System.out.println(col31.getDefinition("ara"));
    }
}

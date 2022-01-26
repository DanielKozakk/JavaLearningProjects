package com.company;


import com.company.binarySearchTree.serie1.Collections_26_BinarySearchTree;
import com.company.binarySearchTree.serie1.Collections_29;
import com.company.binarySearchTree.serie1.Collections_30;
import com.company.prefixTree.serie1.Collections_31_PrefixTree;
import com.company.prefixTree.serie1.Collections_32;
import com.company.prefixTree.serie1.Collections_33;
import com.company.prefixTree.serie1.Collections_34_T9;
import com.company.prefixTree.template.Collections_35;

public class Main {

    public static void main(String[] args) {

        Collections_31_PrefixTree col31 = new Collections_31_PrefixTree();

        col31.addWord("abc");
        col31.addWord("sradogara");
        col31.addWord("atwojstary");
        col31.addWord("itakdalej");

        System.out.println(Collections_35.countWords(col31));

    }
}

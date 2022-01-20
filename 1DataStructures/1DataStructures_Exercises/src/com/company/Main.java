package com.company;


import com.company.binarySearchTree.serie1.Collections_26_BinarySearchTree;
import com.company.graph.serie1.Collections_25;
import com.company.graph.template.AdjacencyListDirectedRawGraph;
import com.company.graph.serie1.Collections_23;
import com.company.graph.template.WeightedBiDirectionalGraph;

public class Main {

    public static void main(String[] args) {

        Collections_26_BinarySearchTree col26 = new Collections_26_BinarySearchTree();

        col26.insert(10);
        col26.insert(15);
        col26.insert(5);
        col26.insert(8);
        col26.insert(7);
        col26.insert(4);
        col26.insert(12);
        col26.insert(16);

        col26.printInOrder();
    }
}

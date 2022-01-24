package com.company.binarySearchTree.serie1;

import com.company.binarySearchTree.serie1.Collections_26_BinarySearchTree.Node;

import java.util.Objects;

public class Collections_30 {

    /*

            Collections_26_BinarySearchTree col26 = new Collections_26_BinarySearchTree();

        col26.insert(100);
        col26.insert(111);
        col26.insert(78);
        col26.insert(90);
        col26.insert(60);
        col26.insert(50);


     */


    public static void findAncestorsOfANode(Collections_26_BinarySearchTree bst, Integer value) {

        /*

        Jeśli node nie jest key to go wypisz
        jeśli key jest większy to idź prawo, mniejszy w lewoo
        działaj dopóki searched nie jest key

         */
        printAncestors(bst.firstNode, value);

    }

    private static void printAncestors( Node searchedNode, Integer key) {

        if(Objects.equals(searchedNode.getValue(), key)){
            return;
        }
        System.out.println(searchedNode.getValue());
        if(key > searchedNode.getValue() && searchedNode.getRightChild() != null){
            printAncestors( searchedNode.getRightChild(), key);
        }
        if(key < searchedNode.getValue() && searchedNode.getLeftChild() != null){
            printAncestors(searchedNode.getLeftChild(), key);
        }
    }

}

package com.company.binarySearchTree.serie1;

import com.company.binarySearchTree.serie1.Collections_26_BinarySearchTree.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Collections_28 {

    public static void kthMaximumElement(Collections_26_BinarySearchTree binarySearchTree, int k){


        Stack<Integer> list = new Stack<>();

        getNodesInOrder(binarySearchTree.firstNode, list);
        System.out.println(list);


        for(int i = 0; i < k; i++){
            list.pop();
        }
        System.out.println(list.peek());

    }

    private static void getNodesInOrder(Node node, Stack<Integer> allValues){
        if(node.getLeftChild() != null && !node.getLeftChild().isNodeVisited()){
            getNodesInOrder(node.getLeftChild(), allValues);
        }

        allValues.push(node.getValue());
        node.setNodeAsVisited();

        if(node.getRightChild() != null && !node.getRightChild().isNodeVisited()){
            getNodesInOrder(node.getRightChild(), allValues);
        }
    }
}

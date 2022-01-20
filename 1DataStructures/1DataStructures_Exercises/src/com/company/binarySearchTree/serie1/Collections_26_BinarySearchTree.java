package com.company.binarySearchTree.serie1;


//        col26.insert(15);
//        col26.insert(5);
//        col26.insert(8);
//        col26.insert(7);
//        col26.insert(4);
//        col26.insert(12);
//        col26.insert(16);
//
//
//        Następnie print in order powinien pokazać :
//
//        4, 5, 7, 8 ,10 , 12, 15, 16

import java.util.Objects;

public class Collections_26_BinarySearchTree {

//    insert, contains, printInOrder(left,root,right)

    Node firstNode = null;

    public void insert(Integer valueOfNewNode) {
        insert(this.firstNode, valueOfNewNode);
    }

    private void insert(Node node, Integer valueOfNewNode) {
        if (this.firstNode == null) {
            this.firstNode = new Node(valueOfNewNode);
        } else if (node.getValue() < valueOfNewNode) {

            if (node.getRightChild() == null) {
                node.setRightChild(new Node(valueOfNewNode));
            } else {
                insert(node.getRightChild(), valueOfNewNode);
            }
        } else {
            if (node.getLeftChild() == null) {
                node.setLeftChild(new Node(valueOfNewNode));
            } else {
                insert(node.getLeftChild(), valueOfNewNode);
            }
        }
    }

    public boolean contains(Integer value){
        return contains(firstNode, value);
    }
    private boolean contains(Node node, Integer value){
        if(Objects.equals(node.getValue(), value)){
            return true;
        } else if (node.getValue() < value){

            if(node.getRightChild() != null){
                return contains(node.getRightChild(), value);
            } else {
                return false;
            }
        } else {
            if(node.getLeftChild() != null){
                return contains(node.getLeftChild(), value);
            } else {
                return false;
            }
        }
    }

    public void printInOrder(){
        System.out.println("heh");
        printInOrder(this.firstNode);
    }

    private void printInOrder(Node node){

        if(node.getLeftChild() != null){
            printInOrder(node.getLeftChild());
        }

        System.out.println(node.getValue());

        if(node.getRightChild() != null){
            printInOrder(node.getRightChild());
        }
    }

    private class Node {
        private Integer value;
        private Node leftChild = null;
        private Node rightChild = null;

        public Node(Integer value) {
            this.value = value;
        }

        public Integer getValue() {
            return value;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }
    }

}


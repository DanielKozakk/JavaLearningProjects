package com.company.serie2;

import com.company.serie1.Collections_26_ImplementBinarySearchTree;

public class Collections_26_SearchBinaryTree {

    protected Node root = null;

    class Node {

        int data;
        Node left, right;
        boolean isNodeVisited = false;


        private Node(int data) {
            this.data = data;

        }

        public int getData() {
            return this.data;
        }

        protected Node getLeft() {
            return this.left;
        }

        protected Node getRight() {
            return this.right;
        }

        protected void setNodeAsVisited(){this.isNodeVisited = true;}

    }



    public void insert(int dataToInsert) {
        if (root == null) {
            root = new Node(dataToInsert);
        } else {
            insert(root, dataToInsert);
        }
    }

    private void insert(Node node, int dataToInsert) {

        if(dataToInsert > node.getData()) {
            if(node.right == null){
                node.right = new Node(dataToInsert);
            } else {
                insert(node.right, dataToInsert);
            }
        } else {
            if(node.left == null){
                node.left = new Node(dataToInsert);
            } else {
                insert(node.left, dataToInsert);
            }
        }
    }

    public void printInOrder() {
        printInOrder(root);
    }

    private void printInOrder(Node node) {
        if (node.getLeft() != null) {
            printInOrder(node.getLeft());
        }
        System.out.println(node.getData());
        if (node.getRight() != null) {
            printInOrder(node.getRight());
        }
    }

    public boolean contains(int data) {
        return contains(data, root);
    }

    private boolean contains(int data, Node node) {

        if (node.getData() == data) {
            return true;
        }

        if (data > node.getData()) {

            if (node.getRight() == null) {
                return false;
            } else {
                return contains(data, node.getRight());
            }

        } else {
            if (node.getLeft() == null) {
                return false;
            } else {
                return contains(data, node.getLeft());
            }
        }

    }

}



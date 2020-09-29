package com.company.serie2;

public class Collections_26_SearchBinaryTree {

    private Node root = null;

    class Node {

        int data;
        Node left, right;

        private Node(int data) {
            this.data = data;

        }

        public int getData() {
            return this.data;
        }

        private Node getLeft() {
            return this.left;
        }

        private Node getRight() {
            return this.right;
        }
    }

    public void insert(int dataToInsert) {
        if (root == null) {
            root = new Node(dataToInsert);
        } else {
            insert(root, dataToInsert);
        }
    }

    private void insert(Node node, int dataToInsert) {
        if (dataToInsert > node.getData()) {
            insert(node.right, dataToInsert);
        } else if (dataToInsert <= node.getData()) {
            insert(node.left, dataToInsert);
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



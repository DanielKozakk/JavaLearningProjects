package com.company.serie3;

import java.util.Stack;

public class Collections_26_SearchBinaryTree {


    Collections_26_SearchBinaryTree left, right;
    boolean isNodeVisited;
    Integer data;

    public Collections_26_SearchBinaryTree(int data) {
        this.data = data;
    }

    public void insert(int data) {

        if (data <= this.data) {
            if (this.left == null) {
                this.left = new Collections_26_SearchBinaryTree(data);
            } else {
                left.insert(data);
            }
        } else {
            if (this.right == null) {
                this.right = new Collections_26_SearchBinaryTree(data);
            } else {
                right.insert(data);
            }

        }
    }

    public void printInOrder() {
        if (this.left != null) {
            this.left.printInOrder();
        }
        System.out.println(this.data);
        if (this.right != null) {
            this.right.printInOrder();
        }
    }

    public boolean contains(int data) {

        if (this.data == data) {
            return true;
        }

        if (this.data <= data) {
            if (this.left != null) {
                return this.left.contains(data);
            } else {
                return false;
            }
        } else {
            if (this.right != null) {
                return this.right.contains(data);
            } else {
                return false;
            }
        }
    }


}

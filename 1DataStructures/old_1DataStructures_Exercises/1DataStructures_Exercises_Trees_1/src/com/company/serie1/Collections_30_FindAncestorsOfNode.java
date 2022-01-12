package com.company.serie1;

import java.util.ArrayList;
import java.util.Arrays;

public class Collections_30_FindAncestorsOfNode {


    Collections_30_FindAncestorsOfNode left, right;
    int data;

    public Collections_30_FindAncestorsOfNode(int data) {
        this.data = data;
    }

    public Collections_30_FindAncestorsOfNode getLeft() {
        return this.left;
    }

    public int getData() {
        return this.data;
    }

    public void insert(int dataToInsert) {
        if (dataToInsert <= this.data) {
            if (this.left == null) {
                this.left = new Collections_30_FindAncestorsOfNode(dataToInsert);
            } else {
                this.left.insert(dataToInsert);
            }
        } else {
            if (this.right == null) {
                this.right = new Collections_30_FindAncestorsOfNode(dataToInsert);
            } else {
                this.right.insert(dataToInsert);
            }
        }
    }

    public void printAncestors (int dataToFind) {
        ArrayList<Integer> al = new ArrayList<>();
        printAncestors(dataToFind,al);
    }
    private boolean printAncestors(int dataToFind, ArrayList<Integer> ancestors) {

        if (dataToFind == this.data) {
            System.out.println(ancestors.toString());
            return true;
        } else if (dataToFind <= this.data) {
            if (this.left == null) {
                return false;
            } else {
                ancestors.add(this.getData());
                return this.left.printAncestors(dataToFind, ancestors);
            }

        } else {
            if (this.right == null) {
                return false;
            } else {
                ancestors.add(this.getData());
                return this.right.printAncestors(dataToFind, ancestors);

            }

        }
    }

    public void printInOrder() {
        if (this.left != null) {
            this.left.printInOrder();
        }
        System.out.println(this.getData());
        if (this.right != null) {
            this.right.printInOrder();
        }
    }




}

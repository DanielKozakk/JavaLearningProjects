package com.company.serie1;

public class Collections_26_ImplementBinarySearchTree {

    Collections_26_ImplementBinarySearchTree left, right;
    int data;

    public Collections_26_ImplementBinarySearchTree(int data) {
        this.data = data;
    }

    public Collections_26_ImplementBinarySearchTree getLeft() {
        return this.left;
    }

    public int getData() {
        return this.data;
    }

    public void insert(int dataToInsert) {
        if (dataToInsert <= this.data) {
            if (this.left == null) {
                this.left = new Collections_26_ImplementBinarySearchTree(dataToInsert);
            } else {
                this.left.insert(dataToInsert);
            }
        } else {
            if (this.right == null) {
                this.right = new Collections_26_ImplementBinarySearchTree(dataToInsert);
            } else {
                this.right.insert(dataToInsert);
            }
        }
    }

    public boolean contains(int dataToFind) {

        if (dataToFind == this.data) {
            return true;
        } else if (dataToFind <= this.data) {
            if (this.left == null) {
                return false;
            } else {
                return this.left.contains(dataToFind);
            }

        } else {
            if (this.right == null) {
                return false;
            } else {
                return this.right.contains(dataToFind);

            }

        }

    }

    public void printInOrder(){

        if(this.left != null){
            this.left.printInOrder();
        }

        System.out.println(this.getData());

        if(this.right != null){
            this.right.printInOrder();
        }

    }

}

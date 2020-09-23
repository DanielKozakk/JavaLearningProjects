package com.company.serie1;

import java.util.Stack;

public class Collections_27_FindHeightOfABinaryTree {


    Collections_27_FindHeightOfABinaryTree left, right;
    int data;
    boolean isNodeVisited = false;

    public Collections_27_FindHeightOfABinaryTree(int data) {
        this.data = data;
    }

    public Collections_27_FindHeightOfABinaryTree getLeft() {
        return this.left;
    }

    public int getData() {
        return this.data;
    }

    Stack<Collections_27_FindHeightOfABinaryTree> col27Stack = new Stack<>();

    int maxSizeOfStack = 1;

    public int findHeight() {

        Collections_27_FindHeightOfABinaryTree searchedNode = this;
        col27Stack.add(searchedNode);

        if (searchedNode.left == null && searchedNode.right == null) {
            return 1;
        }

        while (!col27Stack.isEmpty()) {


            boolean isNodeExhausted = true;


            if (searchedNode.left != null && !searchedNode.left.isNodeVisited) {

                searchedNode = searchedNode.left;
                col27Stack.add(searchedNode);
                isNodeExhausted = false;


            } else if (searchedNode.right != null && !searchedNode.right.isNodeVisited) {

                searchedNode = searchedNode.right;
                col27Stack.add(searchedNode);
                isNodeExhausted = false;

            }


            if (!col27Stack.isEmpty() && col27Stack.size() > maxSizeOfStack) {
                maxSizeOfStack = col27Stack.size();
            }

            if (isNodeExhausted) {
                searchedNode.isNodeVisited = true;
                col27Stack.pop();
                if (!col27Stack.isEmpty()) {
                    searchedNode = col27Stack.peek();
                }
            }

        }
        System.out.println(maxSizeOfStack);
        return maxSizeOfStack;

    }


    public void insert(int dataToInsert) {
        if (dataToInsert <= this.data) {
            if (this.left == null) {
                this.left = new Collections_27_FindHeightOfABinaryTree(dataToInsert);
            } else {
                this.left.insert(dataToInsert);
            }
        } else {
            if (this.right == null) {
                this.right = new Collections_27_FindHeightOfABinaryTree(dataToInsert);
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

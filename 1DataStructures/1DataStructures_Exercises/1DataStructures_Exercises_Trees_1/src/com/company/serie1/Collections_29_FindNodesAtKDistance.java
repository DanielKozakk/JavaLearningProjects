package com.company.serie1;

import java.util.Collection;
import java.util.Stack;

public class Collections_29_FindNodesAtKDistance {

    Collections_29_FindNodesAtKDistance left, right;
    int data;
    boolean isNodeVisited = false;

    public Collections_29_FindNodesAtKDistance(int data) {
        this.data = data;
    }

    public Collections_29_FindNodesAtKDistance getLeft() {
        return this.left;
    }

    public int getData() {
        return this.data;
    }

    public void insert(int dataToInsert) {
        if (dataToInsert <= this.data) {
            if (this.left == null) {
                this.left = new Collections_29_FindNodesAtKDistance(dataToInsert);
            } else {
                this.left.insert(dataToInsert);
            }
        } else {
            if (this.right == null) {
                this.right = new Collections_29_FindNodesAtKDistance(dataToInsert);
            } else {
                this.right.insert(dataToInsert);
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

    public void findNodesAtKDistance(int k){

        /*

                Robię stack
                searched ustawiam jako this

                while

                    jeśli left nie jest nullem i nie jest odwiedzone to

                        searched = left

                    else jeśli right nie jest nullem i nie jest odwiedziony to

                        searched = right

                   else
                        oznacz searched jako visited
                        stack.pop
                        searched = stack.peek



         */

        Stack<Collections_29_FindNodesAtKDistance> nodeStack = new Stack<>();
        var searchedNode = this;
        nodeStack.add(searchedNode);

        int level = 0;

        while(!nodeStack.isEmpty()){

            if(searchedNode.left != null && !searchedNode.left.isNodeVisited){
                searchedNode = searchedNode.left;
                nodeStack.add(searchedNode);
                level ++;

                if(level == k){
                    System.out.println(searchedNode.data);
                }

            } else if(searchedNode.right != null && !searchedNode.right.isNodeVisited){
                searchedNode = searchedNode.right;
                nodeStack.add(searchedNode);
                level ++;
                if(level == k){
                    System.out.println(searchedNode.data);
                }
            } else {
                searchedNode.isNodeVisited = true;
                nodeStack.pop();
                level --;
                searchedNode = !nodeStack.isEmpty() ? nodeStack.peek() : null;
            }




        }

    }
}

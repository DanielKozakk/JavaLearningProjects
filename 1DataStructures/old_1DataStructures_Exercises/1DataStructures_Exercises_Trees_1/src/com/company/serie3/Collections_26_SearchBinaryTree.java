package com.company.serie3;

import java.util.LinkedList;
import java.util.Queue;
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

    public void setNodeAsVisited(){
        this.isNodeVisited = true;
    }

    public int findKthMaximumValue(int k ){
        /*

                Wartości te muszą być posortowane.
                Robię to za pomocą dwóch stacków.
                Robie też univistedStackQueue
                iteruje się breadthFirst
         */

        Queue<Collections_26_SearchBinaryTree> unvisitedNodes = new LinkedList<>();
        Collections_26_SearchBinaryTree searched = this;
        unvisitedNodes.add(searched);

        Stack<Integer> firstStack = new Stack<>();

        Stack<Integer> tmpStack = new Stack<>();



        while(!unvisitedNodes.isEmpty()) {
            if (searched.left != null && !searched.left.isNodeVisited) {
                unvisitedNodes.add(searched.left);
            }

            if (searched.right != null && !searched.right.isNodeVisited) {
                unvisitedNodes.add(searched.right);
            }

            if(firstStack.isEmpty()) {
                firstStack.add(searched.data);
            } else if(firstStack.peek() < searched.data){
                firstStack.add(searched.data);
            } else {


                while(!firstStack.isEmpty() && firstStack.peek() > searched.data){
                    tmpStack.add(firstStack.pop());
                }
                firstStack.add(searched.data);
                while(!tmpStack.isEmpty()){
                    firstStack.add(tmpStack.pop());
                }

            }

            searched.setNodeAsVisited();
            unvisitedNodes.poll();
            if (!unvisitedNodes.isEmpty()) {
                searched = unvisitedNodes.peek();
            }
        }

//        System.out.println(firstStack.toString());

        for(int i = k - 1; i > 0; i--){
            firstStack.pop();
        }
        System.out.println(firstStack.peek());

        return k;
    }



}

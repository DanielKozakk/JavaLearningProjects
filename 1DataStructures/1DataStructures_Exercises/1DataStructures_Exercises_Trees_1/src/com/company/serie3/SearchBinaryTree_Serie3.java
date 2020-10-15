package com.company.serie3;

import com.company.SearchBinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SearchBinaryTree_Serie3 {

    SearchBinaryTree_Serie3 left, right;
    boolean isNodeVisited;
    Integer data;

    public SearchBinaryTree_Serie3(int data) {
        this.data = data;
    }

    public void setNodeAsVisited() {
        this.isNodeVisited = true;
    }

    public void insert(int data) {

        if (data <= this.data) {
            if (this.left == null) {
                this.left = new SearchBinaryTree_Serie3(data);
            } else {
                left.insert(data);
            }
        } else {
            if (this.right == null) {
                this.right = new SearchBinaryTree_Serie3(data);
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

    public void Collections_28_FindKthMaximumValue(int k) {

        /*

                Robię unvisitedQueue

                Robię pierwszyStack
                Robię drugi stack

                searched ustawiam jako this

                pętla, dopóki unvisitedQueue nbie jest puste

                iteruje się po sądiadach,

                    jeśli sąsiad nie visited i nie null
                    dodaję godo queue
                    dodaję go do pierwszego stacka, robię całe te sortowanie


               queue.poll
               if queue nie jest puste to i tak dalej...
         */

        Queue<SearchBinaryTree_Serie3> unvisitedNodesQueue = new LinkedList<>();

        Stack<SearchBinaryTree_Serie3> firstStack = new Stack<>();
        Stack<SearchBinaryTree_Serie3> secondStack = new Stack<>();

        SearchBinaryTree_Serie3 searched = this;

        unvisitedNodesQueue.add(searched);



        while (!unvisitedNodesQueue.isEmpty()) {

            if (searched.left != null && !searched.left.isNodeVisited) {
                unvisitedNodesQueue.add(searched.left);
            }
            if (searched.right != null && !searched.right.isNodeVisited) {
                unvisitedNodesQueue.add(searched.right);
            }

            if(firstStack.isEmpty() ) {
                firstStack.add(searched);
            } else if(firstStack.peek().data <= searched.data){
                firstStack.add(searched);
            } else {
                while(!firstStack.isEmpty() && firstStack.peek().data > searched.data){
                    secondStack.add(firstStack.pop());
                }
                firstStack.add(searched);
                while(!secondStack.isEmpty()){
                    firstStack.add(secondStack.pop());
                }
            }

            searched.setNodeAsVisited();
            unvisitedNodesQueue.poll();

            if (!unvisitedNodesQueue.isEmpty()) searched = unvisitedNodesQueue.peek();
        }


        Integer kthValue = null;
        for(int i = 0; i < k ; i++){
            kthValue = firstStack.pop().data;
        }
        System.out.println(kthValue);


    }

}

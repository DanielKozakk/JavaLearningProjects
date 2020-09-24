package com.company.serie1;

import java.util.Stack;

public class Collections_28_FindKthMaximumValueInTrie {

    public static int size = 1;
    Collections_28_FindKthMaximumValueInTrie left, right;
    int data;
    boolean isNodeVisited = false;


    public Collections_28_FindKthMaximumValueInTrie(int data) {
        this.data = data;
    }

    public Collections_28_FindKthMaximumValueInTrie getLeft() {
        return this.left;
    }

    public int getData() {
        return this.data;
    }

    public void insert(int dataToInsert) {

        if (dataToInsert <= this.data) {
            if (this.left == null) {
                this.left = new Collections_28_FindKthMaximumValueInTrie(dataToInsert);
                size++;
            } else {
                this.left.insert(dataToInsert);
            }
        } else {
            if (this.right == null) {
                this.right = new Collections_28_FindKthMaximumValueInTrie(dataToInsert);
                size++;
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

    private void addInOrder(Stack<Integer> stack) {

        if (this.right != null) {
            this.right.addInOrder(stack);
        }


        stack.add(this.getData());

        if (this.left != null) {
            this.left.addInOrder(stack);
        }
    }

    public void findKthMinimumValue(int k) {

        Stack<Integer> firstStack = new Stack<>();
        Stack<Integer> secondStack = new Stack<>();

        this.addInOrder(secondStack);

        firstStack.add(secondStack.pop());

        while (firstStack.size() < Collections_28_FindKthMaximumValueInTrie.size) {

            Integer valueToCompare = !secondStack.isEmpty() ? secondStack.pop() : null;

            if (valueToCompare != null && !firstStack.isEmpty() && firstStack.peek() > valueToCompare) {


                while (!firstStack.isEmpty() && firstStack.peek() > valueToCompare) {
                    secondStack.add(firstStack.pop());
                }

                firstStack.add(valueToCompare);


            } else if (valueToCompare != null) {
                firstStack.add(valueToCompare);
            }

        }


        for (; k > 0; k--) {

            if(k == 1){
                System.out.println(firstStack.pop());
            } else {
                firstStack.pop();
            }


        }


    }

}



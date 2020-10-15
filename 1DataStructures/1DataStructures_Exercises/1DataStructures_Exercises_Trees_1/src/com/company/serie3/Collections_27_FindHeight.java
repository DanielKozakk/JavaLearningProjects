package com.company.serie3;

import java.util.Stack;

public class Collections_27_FindHeight {
    Collections_27_FindHeight left, right;
    boolean isNodeVisited;
    Integer data;

    public Collections_27_FindHeight(int data) {
        this.data = data;
    }

    public void insert(int data) {

        if (data <= this.data) {
            if (this.left == null) {
                this.left = new Collections_27_FindHeight(data);
            } else {
                left.insert(data);
            }
        } else {
            if (this.right == null) {
                this.right = new Collections_27_FindHeight(data);
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

    /*
            Robię stack
            Następnie searched = this

            maxLevel = 1
            currentLevel = 1

            pętlaa while dopóki stack nie pusty

            if(searched.left != null && notVisited)

                currentLevel++;
                searched = searched.left
               if(currentLevel > maxLevel) max level = current level
                continue

            if(searched.right != null && notVisited)
                currentLevel++;
                searched = searched.left
                if(currentLevel > maxLevel) max level = current level
                continue

             searched.setAsVisited
             stack.pop
             currentLevel --;
             if stack nie pusty to searched = stack.peek();


     */

    public void getHeight() {
        Stack<Collections_27_FindHeight> unvisitedStack = new Stack<>();
        Collections_27_FindHeight searched = this;

        unvisitedStack.add(searched);

        Integer maxLevel = 1;
        Integer currentLevel = 1;

        while (!unvisitedStack.isEmpty()) {
            if (searched.left != null && !searched.left.isNodeVisited) {
                currentLevel++;
                searched = searched.left;
                if (currentLevel > maxLevel) {
                    maxLevel = currentLevel;
                }
                continue;
            }
            if (searched.right != null && !searched.right.isNodeVisited) {
                currentLevel++;
                searched = searched.right;
                if (currentLevel > maxLevel) {
                    maxLevel = currentLevel;
                }
                continue;
            }

            searched.isNodeVisited = true;
            unvisitedStack.pop();
            if(!unvisitedStack.isEmpty()){
                searched = unvisitedStack.peek();
            }
        }

        System.out.println(maxLevel);
    }
}

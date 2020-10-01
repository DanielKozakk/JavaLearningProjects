package com.company.serie2;

import com.company.serie2.Collections_26_SearchBinaryTree;

import java.util.Stack;

public class Collections_28_FindKthMaximumValueInABinarySearchTree extends Collections_26_SearchBinaryTree {


    public void findKthMaximumValue(int k) {

        /*

            Stack unvisitedStack

            Stack firstSortingStack
            Stack secondSortingStack

            searched = root
            unvisitedStack.add(searched)

            while(unvisitedStack.isnotEmpty)

                if(searched.left != null && !searched.left.isVisited
                    searched = searched.left
                    unvisited.add(searched)
                    break;
                else  if(searched.right != null && !searched.right.isVisited
                    searched = searched.right
                    unvisited.add(searched)
                    break;
                else {

                    searched.setAsVisited

                    if(firstSortingStack.isEmpty){

                        firstSorting.add(searched)

                    } else if (firstSrotingPeek < searched){

                        firstSorting.add(searched)
                    } else if (firstSrotingPeek > searched){

                        while(!firstSortingpeek.isEmpty && firstSorting.peek() > searched

                            secondSorting.add(firstSorting.pop)

                        firstSorting.add(searched)

                        while(!secondSorting.isEmpty)

                            firstSorting.add(second.pop())

                    }


                    unvisited.pop
                    jeśli umnvisitednie pusty to saerched = unvisited.peeek
                }
         */

        Stack<Node> unvisitedNodesStack = new Stack<>();

        Stack<Node> firstSortingStack = new Stack<>();
        Stack<Node> secondSortingStack = new Stack<>();

        Node searched = root;
        unvisitedNodesStack.add(searched);

        while (!unvisitedNodesStack.isEmpty()) {

            if (searched.getLeft() != null && !searched.getLeft().isNodeVisited) {
                searched = searched.getLeft();
                unvisitedNodesStack.add(searched);
                continue;
            } else if (searched.getRight() != null && !searched.getRight().isNodeVisited) {
                searched = searched.getRight();
                unvisitedNodesStack.add(searched);
                continue;
            } else {

                searched.setNodeAsVisited();

                if (firstSortingStack.isEmpty()) {
                    firstSortingStack.add(searched);
                } else if (firstSortingStack.peek().getData() < searched.getData()) {
                    firstSortingStack.add(searched);
                } else if (firstSortingStack.peek().getData() > searched.getData()) {

                    while(!firstSortingStack.isEmpty() && firstSortingStack.peek().getData() > searched.getData()){
                        secondSortingStack.add(firstSortingStack.pop());
                    }

                    firstSortingStack.add(searched);

                    while(!secondSortingStack.isEmpty()){
                        firstSortingStack.add(secondSortingStack.pop());
                    }

                }

                unvisitedNodesStack.pop();
                if(!unvisitedNodesStack.isEmpty()){
                    searched = unvisitedNodesStack.peek();
                }
            }
        }


        for(int i = 0 ; i < k; i ++){
            firstSortingStack.pop();
        }
        Node kthElement = firstSortingStack.peek();
        System.out.println(kthElement.getData());

    }

}

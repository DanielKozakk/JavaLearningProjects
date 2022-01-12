package com.company.serie2;

import com.company.serie2.Collections_26_SearchBinaryTree;

import java.util.ArrayList;
import java.util.Stack;

public class Collections_29_FindNodesAtKDistanceFromTheRoot extends Collections_26_SearchBinaryTree {

    public void findNodesAtKDistance(int k) {

        /*
                Robię searched = root;
                unvisitedstackeritcies = stack

                unvisitedStack.add(searched)

                level = 0;
                ArrayList nodesAtLevel = arraylist
                while(stack.is note mepty

                    if(level = k and nodesAtLevel.doesnt contain searched)

                        add nodes At level

                    if(searched.left != null && is not visited
                        stack.add(searched.left
                        searched = searched.left
                        level ++
                        continue

                       if(searched.right != null && is not visited
                        stack.add(searched.right
                        searched = searched.right
                        level ++
                        continue

                   searched.setAsVisited();
                   stack.pop
                   levle --
                   if(stack.is not empty)
                    searched = stack.peek()
         */

        Node searchedNode = root;
        Stack<Node> unvisitedStackVerticies = new Stack<>();
        unvisitedStackVerticies.add(searchedNode);
        int level = 0;
        ArrayList<Node> nodesAtKLevel = new ArrayList<>();
        while (!unvisitedStackVerticies.isEmpty()) {
            if (level == k && !nodesAtKLevel.contains(searchedNode)) {
                nodesAtKLevel.add(searchedNode);
            }
            if (searchedNode.getLeft() != null && !searchedNode.getLeft().isNodeVisited) {
                searchedNode = searchedNode.getLeft();
                unvisitedStackVerticies.add(searchedNode);
                level++;
                continue;
            }
            if (searchedNode.getRight() != null && !searchedNode.getRight().isNodeVisited) {
                searchedNode = searchedNode.getRight();
                unvisitedStackVerticies.add(searchedNode);
                level++;
                continue;
            }

            searchedNode.setNodeAsVisited();
            unvisitedStackVerticies.pop();
            level--;
            if (!unvisitedStackVerticies.isEmpty()) {
                searchedNode = unvisitedStackVerticies.peek();
            }
        }

        for(Node node  : nodesAtKLevel){
            System.out.println(node.getData());
        }
    }


}

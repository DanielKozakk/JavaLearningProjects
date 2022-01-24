package com.company.binarySearchTree.serie1;

import com.company.binarySearchTree.serie1.Collections_26_BinarySearchTree.Node;

import java.util.Stack;

public class Collections_27 {

    public static void findHeight(Collections_26_BinarySearchTree binarySearchTree){

        /**

         1. Robię stack, dodaję do niego pierwszego noda
         2. Robię zmienną searched i ustawiam na peek stacka
         3. robię zapis najwyższego stacka jako peek.size
         3. robię pętlę while, która działa dopóki stack nie jest pusty.
         4. jeśli searched nie ma żadnych nieodwiedzonych dzieci, to ustawiam go jako visited i robię

         */

        Stack<Node> stack = new Stack<>();
        Node searched = binarySearchTree.firstNode;
        stack.add(searched);
        Integer highestStackSize = stack.size();

        while(!stack.isEmpty()){
            searched = stack.peek();

            if(stack.size() > highestStackSize){
                highestStackSize = stack.size();
            }
            if(searched.getRightChild() != null && !searched.getRightChild().isNodeVisited()){
                stack.push(searched.getRightChild());
                continue;
            }
            if(searched.getLeftChild() != null && !searched.getLeftChild().isNodeVisited()){
                stack.push(searched.getLeftChild());
                continue;
            }
                searched.setNodeAsVisited();
                stack.pop();
        }

        System.out.println(highestStackSize);
    }
}

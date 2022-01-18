package com.company.linkedList.serie1;

import com.company.linkedList.template.LinkedList;

import java.util.Stack;

public class Collections_17 extends LinkedList {

    public void returnNthNodeFromTheEnd(int n){

        /*
         Iteruję się po nodach, dodaję je do stacka
         potem robię popów tyle co n.

         */
        Stack <Node> nodeStack = new Stack<>();
        Node searchedNode = getFirstElement();

        while(searchedNode != null){
            nodeStack.add(searchedNode);
            searchedNode = searchedNode.getNext();
        }


        for(int i = 0; i < n; i++){
            searchedNode = nodeStack.pop();
        }
        System.out.println(searchedNode.getData());

    }

}

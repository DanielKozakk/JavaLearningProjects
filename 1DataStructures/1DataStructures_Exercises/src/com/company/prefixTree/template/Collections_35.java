package com.company.prefixTree.template;

import com.company.prefixTree.serie1.Collections_31_PrefixTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Collections_35 extends Collections_31_PrefixTree {

    public static int countWords(Collections_31_PrefixTree input){

        int counter = 0;

        Queue<Node> queue = new LinkedList<>();
        Node searched = input.getHead();
        queue.add(searched);

        while(!queue.isEmpty()) {
            for (Node node : searched.getChildren()) {
                queue.add(node);
            }
            if(searched.isEndOfWord()){
                counter ++;
            }
            queue.poll();
            searched = queue.peek();
        }
        return counter;
    }
}

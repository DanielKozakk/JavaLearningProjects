package com.company.prefixTree.serie1;

import com.company.prefixTree.serie1.Collections_31_PrefixTree.Node;

public class Collections_32 {


    public static void printAllWords(Collections_31_PrefixTree pt){
        printRecursive(pt.getHead(), "");
    }

    private static void printRecursive(Node node, String partial){
        for(Node searchedNode : node.getChildren()){

            if (searchedNode.isEndOfWord()){
                System.out.println(partial + searchedNode.getLetter());
            }
            printRecursive(searchedNode, partial + searchedNode.getLetter());
        }
    }
}

package com.company;

import com.company.serie1.Collections_34_BuildT9Dictionary;
import com.company.serie2.Collections_32_PrintAllWordsStoredInPrefixTree;

public class Main {

    public static void main(String[] args) {
//
//       Collections_34_BuildT9Dictionary t9 = new Collections_34_BuildT9Dictionary();
//
//       t9.addWordToDictionary("seks");
//       t9.addWordToDictionary("rejs");
//
//
//        // tutaj trzeba coś zmienic
//       System.out.println(t9.getWordsByNumericInput("7357").toString());

//       char ch = (char) Collections_32_PrintAllWordsStoredInPrefixTree.turnIndexToNode(99);

        Collections_32_PrintAllWordsStoredInPrefixTree col32 = new Collections_32_PrintAllWordsStoredInPrefixTree();
        col32.add("abrakadabra");
        col32.add("abrakachuj");
        col32.printAllWords();
    }
}

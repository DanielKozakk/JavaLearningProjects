package com.company;

import com.company.serie1.Collections_31_ImplementPrefixTree;
import com.company.serie1.Collections_32_PrintAllWordsStoredInPrefixTree;

public class Main {

    public static void main(String[] args) {

        Collections_32_PrintAllWordsStoredInPrefixTree col32 = new Collections_32_PrintAllWordsStoredInPrefixTree();

        col32.add("majeranek");
        col32.add("maj");
        col32.add("chujel");

        col32.printAllWords();


    }
}

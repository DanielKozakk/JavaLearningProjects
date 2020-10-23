package com.company;


import com.company.serie3.Collections_32_PrintAllWordsStoredInPrefixTree;
import com.company.serie3.Collections_35_CountTotalNumberOfWordsInPrefixTree;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Collections_32_PrintAllWordsStoredInPrefixTree col32 = new Collections_32_PrintAllWordsStoredInPrefixTree();
        col32.add("pierwszy");
        col32.add("pierwsz");
        col32.add("drugi");



        col32.printAllWords();

    }
}

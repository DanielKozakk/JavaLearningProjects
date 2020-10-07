package com.company;

import com.company.serie1.Collections_34_BuildT9Dictionary;
import com.company.serie2.Collections_31_PrefixTreeImplementation;
import com.company.serie2.Collections_32_PrintAllWordsStoredInPrefixTree;

public class Main {

    public static void main(String[] args) {

        Collections_31_PrefixTreeImplementation col31_s2 = new Collections_31_PrefixTreeImplementation();

        col31_s2.addWord("chuj");
        col31_s2.addWord("dupa");

        System.out.println(col31_s2.contains("chuj"));
        System.out.println(col31_s2.contains("chuja"));

    }
}

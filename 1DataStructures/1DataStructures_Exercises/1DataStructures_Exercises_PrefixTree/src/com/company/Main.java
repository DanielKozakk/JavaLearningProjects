package com.company;


import com.company.serie3.Collections_32_PrintAllWordsStoredInPrefixTree;
import com.company.serie3.Collections_35_CountTotalNumberOfWordsInPrefixTree;
import com.company.serie4.Serie4_Col31_PrefixTree;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Serie4_Col31_PrefixTree col31 = new Serie4_Col31_PrefixTree();
        col31.addWord("Pierwszy");
        col31.addWord("Pierwsza");

        System.out.println(col31.contains("Pierwsza"));


    }
}

package com.company;


import com.company.serie1.Collections_33_ImplementDictionaryUsingTrie;
import com.company.serie3.Collections_32_PrintAllWordsStoredInPrefixTree;
import com.company.serie3.Collections_35_CountTotalNumberOfWordsInPrefixTree;
import com.company.serie4.Collections_33_DictionaryWithPrefixTree;
import com.company.serie4.Serie4_Col31_PrefixTree;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Collections_33_DictionaryWithPrefixTree col33 = new Collections_33_DictionaryWithPrefixTree();

        col33.addDefinition("chuj", "męski człon");
        col33.addDefinition("chujek", "zawród");

        System.out.println(col33.getDefinition("chujek"));


    }
}

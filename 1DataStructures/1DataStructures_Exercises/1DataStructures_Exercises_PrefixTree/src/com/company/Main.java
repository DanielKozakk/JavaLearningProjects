package com.company;

import com.company.serie1.Collections_31_ImplementPrefixTree;
import com.company.serie1.Collections_32_PrintAllWordsStoredInPrefixTree;
import com.company.serie1.Collections_33_FormWordsFromADictionaryUsingPrefixTree;

public class Main {

    public static void main(String[] args) {

        Collections_33_FormWordsFromADictionaryUsingPrefixTree col33 = new Collections_33_FormWordsFromADictionaryUsingPrefixTree();

        col33.add("ma", "Gatunek ptaka z rodziny ruchowatych");
        col33.add("m", "Miesiąc przed kwietniem.");
       String def = col33.findDefinition("majeranek");
       String def2 = col33.findDefinition("maj");

       System.out.println(def);
       System.out.println(def2);

    }
}

package com.company;

import com.company.serie1.Collections_34_BuildT9Dictionary;
import com.company.serie2.Collections_31_PrefixTreeImplementation;
import com.company.serie2.Collections_32_PrintAllWordsStoredInPrefixTree;
import com.company.serie2.Collections_33_ImplementADictionaryUsingPrefixTree;
import com.company.serie2.Collections_35_CountTotalWordInPrefixTree;

public class Main {

    public static void main(String[] args) {


        Collections_33_ImplementADictionaryUsingPrefixTree col33 = new Collections_33_ImplementADictionaryUsingPrefixTree();
        col33.add("chuj" , "meskiczlon");
        col33.add("chuje" , "meskiczlonek");
        System.out.println(col33.getDefinitionOfWord("chuje"));
    }
}

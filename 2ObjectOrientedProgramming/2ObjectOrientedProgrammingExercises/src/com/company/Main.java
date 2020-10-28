package com.company;

import com.company.prefixtries.counting.PrefixTreeCountingTotalNumberOfWords;
import com.company.prefixtries.mainimplementation.PrefixTree;

public class Main {

    public static void main(String[] args) {

        PrefixTreeCountingTotalNumberOfWords countingPrefix = PrefixTreeCountingTotalNumberOfWords.createNewPrefixTree();
        countingPrefix.addWord("h");
        countingPrefix.addWord("a");

        System.out.println(countingPrefix.countWords());

    }
}

package com.company;

import com.company.prefixtries.mainimplementation.PrefixTreeCountingTotalNumberOfWords;

public class Main {

    public static void main(String[] args) {


        PrefixTreeCountingTotalNumberOfWords count = PrefixTreeCountingTotalNumberOfWords.createNewPrefixTreeCountingTotalNumberOfWords();

        count.addWord("hehe");
        count.addWord("heha");
        count.addWord("Twojastara tytytyty zapierdala tuytytyty");
        count.addWord("Twojastara tytytyty zapierdala tuytytyty i chuj");

        System.out.println(count.count());
    }
}

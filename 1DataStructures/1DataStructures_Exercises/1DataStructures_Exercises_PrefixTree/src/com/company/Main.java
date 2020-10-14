package com.company;


import com.company.serie2.Collections_34_BuildT9Dictionary;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Collections_34_BuildT9Dictionary col33 = new Collections_34_BuildT9Dictionary();

        col33.addWord("rejs");
        col33.addWord("seks");
        col33.addWord("pejs");



        ArrayList<String> words = col33.getWords("7357");
//
        for(String word : words){
            System.out.println(word);
        }


    }
}

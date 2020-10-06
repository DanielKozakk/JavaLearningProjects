package com.company;

import com.company.serie1.Collections_34_BuildT9Dictionary;

public class Main {

    public static void main(String[] args) {

       Collections_34_BuildT9Dictionary t9 = new Collections_34_BuildT9Dictionary();

       t9.addWordToDictionary("abc");
       t9.addWordToDictionary("cba");


//       System.out.println(t9.isDictionaryContainsAWord("abc"));


//       t9.getWordsByNumericInput("222");

//       System.out.println(t9.getWordsByNumericInput("222").toString());

        System.out.println(t9.isDictionaryContainsAWord("aba"));
    }
}

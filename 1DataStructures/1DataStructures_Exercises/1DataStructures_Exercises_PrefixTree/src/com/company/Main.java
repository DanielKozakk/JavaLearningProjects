package com.company;

import com.company.serie1.Collections_34_BuildT9Dictionary;

public class Main {

    public static void main(String[] args) {

       Collections_34_BuildT9Dictionary t9 = new Collections_34_BuildT9Dictionary();

       t9.addWordToDictionary("seks");
       t9.addWordToDictionary("rejs");


        // tutaj trzeba coś zmienic
       System.out.println(t9.getWordsByNumericInput("7357").toString());

    }
}

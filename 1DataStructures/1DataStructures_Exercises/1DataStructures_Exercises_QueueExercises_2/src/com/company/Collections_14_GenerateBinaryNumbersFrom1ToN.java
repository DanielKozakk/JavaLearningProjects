package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Collections_14_GenerateBinaryNumbersFrom1ToN {

    public static void generateBinaryNumber (int n){


        /*

            NA papierze:
            outputArrayList

            binaryQueue

            1. Dodaj 1 do kolejki

            while(n <= outputArrayList.)
            2. Zrób liczbę binaryQueue.peek() + "0" i dodaj ją do binaryQueue
            3. Zrób liczbę binaryQueue.peek() + "1" i dodaj ją do binaryQueue

            4. outputArrayList.add(binaryQueue.poll())

            PSEUDOKOD

            List<Object> outputArrayList
            Queue<Object> outputQueue

            outputQueue.add("1")

            while(n <= outputArrayList.size())

                binaryQueue.add(binaryQueue.peek() + "0")
                binaryQueue.add(binaryQueue.peek() + "1")

                outputArrayList.add(binaryQueue.poll())

         */

        List<String> outputArrayList = new ArrayList<>();
        Queue<String> binaryQueue = new LinkedList<>();
        binaryQueue.add("1");
        while(n >= outputArrayList.size()){

            binaryQueue.add(binaryQueue.peek() + "0");
            binaryQueue.add(binaryQueue.peek() + "1");

            outputArrayList.add(binaryQueue.poll());

        }
        System.out.println(outputArrayList.toString());
    }

}

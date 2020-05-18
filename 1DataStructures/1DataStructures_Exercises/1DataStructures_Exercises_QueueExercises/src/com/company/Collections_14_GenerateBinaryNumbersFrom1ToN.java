package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Collections_14_GenerateBinaryNumbersFrom1ToN {


    List<String> generateBinnaryQueue(int numbersToGenerate) {

        List<String> outputList = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();


        queue.add("1");


        for (int i = 1; i <= numbersToGenerate; i++) {
            String x = queue.poll();
            String y = x + "0";
            String z = x + "1";
            queue.add(y);
            queue.add(z);
            outputList.add(x);
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
        }

        System.out.println(outputList.toString());
        return outputList;
    }

}



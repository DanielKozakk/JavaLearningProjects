package com.company;


import com.company.array.serie2.Collections_4;
import com.company.queue.serie1.Collections_13;
import com.company.stack.serie_2.Collections_12;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> initQueue = new LinkedList<>();
        List<Integer> initList = Arrays.asList(10,20,30,40,50,60,70,80,90,100);
        initQueue.addAll(initList);

        Collections_13 col13 = new Collections_13();
        col13.reverseFirstKElementsInQueue(initQueue, 2);

    }
}

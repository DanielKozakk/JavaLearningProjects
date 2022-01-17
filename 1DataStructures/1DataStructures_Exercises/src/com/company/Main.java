package com.company;

import com.company.array.serie_1.Collections_8;
import com.company.stack.serie_1.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> initList = Arrays.asList(10,20,30,40,50,60,70,80,90,100);
        Queue<Integer> initQueue = new LinkedList<>(initList);

        Collections_13 col13 = new Collections_13();
        col13.reverseFirstKElementsInQueue(initQueue, 4);


    }
}

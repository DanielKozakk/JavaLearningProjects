package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Collections_13_ReverseFirstKElementsOfAQueue col13 = new Collections_13_ReverseFirstKElementsOfAQueue();
//        col13.reverseFirstKElement();

//        Input : Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
//        Input : Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

        Queue<Integer> input1 = new LinkedList();

        input1.add(10);
        input1.add(20);
        input1.add(30);
        input1.add(40);
        input1.add(50);
        input1.add(60);
        input1.add(70);
        input1.add(80);
        input1.add(90);
        input1.add(100);

//        col13.reverseFirstKElement(10, input1);

        Collections_14_GenerateBinaryNumbersFrom1ToNUsingQueue col14 = new Collections_14_GenerateBinaryNumbersFrom1ToNUsingQueue();
        col14.generate(1);
    }

}

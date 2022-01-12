package com.company;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {


    public static void main(String[] args) {
// [10, 20, 30, 40, 50, 60,
//            70, 80, 90, 100

//        Queue<Integer> queueToTest = new LinkedList<>();
//        queueToTest.add(10);
//        queueToTest.add(20);
//        queueToTest.add(30);
//        queueToTest.add(40);
//        queueToTest.add(50);
//        queueToTest.add(60);
//        queueToTest.add(70);
//        queueToTest.add(80);
//        queueToTest.add(90);
//        queueToTest.add(100);
//
//        Collections_13_ReverseFirstKElementsInQueue exmp = new Collections_13_ReverseFirstKElementsInQueue(queueToTest, 9);
//        System.out.println(exmp.reverseQueue().toString());

        Collections_14_GenerateBinaryNumbersFrom1ToN generateBinnary = new Collections_14_GenerateBinaryNumbersFrom1ToN();
        String x = generateBinnary.generateBinnaryQueue(2).toString();
        System.out.println(x);

    }



}

package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Collections_13_ReverseFirstNElementsOfQueue a = new Collections_13_ReverseFirstNElementsOfQueue();
        a.reverseFirstKElements(prepareDataForCollections13(), 10);

    }

    public static Queue<Object> prepareDataForCollections13(){
        Queue<Object> outputQueue = new LinkedList<>();

        outputQueue.add(10);
        outputQueue.add(20);
        outputQueue.add(30);
        outputQueue.add(40);
        outputQueue.add(50);
        outputQueue.add(60);
        outputQueue.add(70);
        outputQueue.add(80);
        outputQueue.add(90);
        outputQueue.add(100);
        return outputQueue;
    }
}


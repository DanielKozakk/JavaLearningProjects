package com.company;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();
        queue.add("Bangalore");

        queue.add("Ishfaq");
        queue.add("Ramzan");
        queue.add("Nagoo");

//        System.out.println("Linked List Queue is:" + queue);
//        System.out.println("Linked List Queue Peek is :" + queue.peek());
//
//        queue.poll();
//        System.out.println("Linked List Queue after remove is:"+ queue);

        // this element will be sorted?
        Queue<Integer> queuenew = new PriorityQueue<Integer>();

        queuenew.add(2);
        queuenew.add(3);
        queuenew.add(1);
        queuenew.add(0);
        queuenew.add(4);

        System.out.println("Priority Queue is:"+ queuenew);
        System.out.println("Priority Queue Peek is :"+queuenew.peek());
        queuenew.poll();
        System.out.println("Priority Queue is:"+ queuenew);


    }
}

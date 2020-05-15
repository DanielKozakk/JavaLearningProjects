package com.company;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {


    public static void main(String[] args) {

        StackFromQueue stack = new StackFromQueue();

        stack.push(2);
        stack.push(3);


//        System.out.println(stack.pop());
        stack.push(323);
        stack.push(324);
        stack.push(325);
        stack.push(326);



        stack.showElements();

        System.out.println("To Peck : " + stack.peek());

    }


}

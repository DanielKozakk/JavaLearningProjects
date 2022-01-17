package com.company;

import com.company.array.serie_1.Collections_8;
import com.company.stack.serie_1.Collections_10;
import com.company.stack.serie_1.Collections_11;
import com.company.stack.serie_1.Collections_9;
import com.company.stack.serie_1.Collections_12_StackUsingQueue;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {


        Collections_12_StackUsingQueue<Integer> a = new Collections_12_StackUsingQueue<>();

        a.push(2);
        a.print();


        a.push(3);
        a.print();

        a.push(4);
        a.print();
        a.pop();
        System.out.println(a.peek());

//        a.push(4);
//        a.push(5);




    }
}

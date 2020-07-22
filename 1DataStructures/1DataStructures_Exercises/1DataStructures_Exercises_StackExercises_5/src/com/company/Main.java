package com.company;

import java.util.Collection;
import java.util.Stack;

public class Main {

    //Input : [34, 3, 31, 98, 92, 23] Output : [3, 23, 31, 34, 92, 98] Input : [3, 5, 1, 4, 2, 8] Output : [1, 2, 3, 4, 5, 8]

    public static void main(String[] args) {

        Stack<Integer> stack_1 = new Stack<>();
        stack_1.push(34);
        stack_1.push(3);
        stack_1.push(31);
        stack_1.push(98);
        stack_1.push(92);
        stack_1.push(23);

        Stack<Integer> stack_2 = new Stack<>();
        stack_2.push(3);
        stack_2.push(5);
        stack_2.push(1);
        stack_2.push(4);
        stack_2.push(2);
        stack_2.push(8);

        Collections_10_SortStackUsingAnotherStack col10 = new Collections_10_SortStackUsingAnotherStack();
        col10.sort(stack_2);
    }
}

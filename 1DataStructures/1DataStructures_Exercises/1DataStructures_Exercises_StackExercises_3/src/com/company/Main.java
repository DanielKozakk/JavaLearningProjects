package com.company;

import java.util.Collection;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {


        String toEvaluate = "10 2 8 * + 3 -";
//        String toEvaluate = "+ - * 5 *";
        Collections_9_EvaluatePostfixExpressionUsingAStack col9 = new Collections_9_EvaluatePostfixExpressionUsingAStack();
//        col9.evaluate(toEvaluate);
//         [34, 3, 31, 98, 92, 23]

        Stack<Integer> stackToSort_1 = new Stack<>();
        stackToSort_1.push(34);
        stackToSort_1.push(3);
        stackToSort_1.push(31);
        stackToSort_1.push(98);
        stackToSort_1.push(92);
        stackToSort_1.push(23);

//        [3, 5, 1, 4, 2, 8]

        Stack<Integer> stackToSort_2 = new Stack<>();
        stackToSort_2.push(3);
        stackToSort_2.push(5);
        stackToSort_2.push(1);
        stackToSort_2.push(4);
        stackToSort_2.push(2);
        stackToSort_2.push(8);

        Collections_10_SortAStackUsingTemporaryStack col10 = new Collections_10_SortAStackUsingTemporaryStack();
        col10.sort(stackToSort_2);


    }
}

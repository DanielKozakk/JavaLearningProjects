package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Collections_9_EvaluatePostfixExpression evaluator = new Collections_9_EvaluatePostfixExpression("10 2 8 * + 3 -");
//        Collections_9_EvaluatePostfixExpression evaluator = new Collections_9_EvaluatePostfixExpression("10 2 -");
//        Collections_9_EvaluatePostfixExpression evaluator = new Collections_9_EvaluatePostfixExpression("10");
//        System.out.println(evaluator.evaluateExpression());

        Collections_10_SortStackUsingAnotherTempStack sortownik = new Collections_10_SortStackUsingAnotherTempStack();
        sortownik.sort(prepareCollections10Data());

    }

    public static Stack<Integer>  prepareCollections10Data(){

        //    Input : [34, 3, 31, 98, 92, 23] Output : [3, 23, 31, 34, 92, 98] Input : [3, 5, 1, 4, 2, 8] Output : [1, 2, 3, 4, 5, 8]
        Stack<Integer> inputStack1 = new Stack<Integer>();
        inputStack1.add(34);
        inputStack1.add(3);
        inputStack1.add(31);
        inputStack1.add(98);
        inputStack1.add(92);
        inputStack1.add(23);

        Stack<Integer> inputStack2 = new Stack<Integer>();

        inputStack2.add(3);
        inputStack2.add(5);
        inputStack2.add(1);
        inputStack2.add(4);
        inputStack2.add(2);
        inputStack2.add(8);

        return inputStack2;
    }


}

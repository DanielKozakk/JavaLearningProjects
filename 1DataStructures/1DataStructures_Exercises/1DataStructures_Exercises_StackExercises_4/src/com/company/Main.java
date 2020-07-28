package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
//[34, 3, 31, 98, 92, 23]

        Collections_10_SortStackUsingTemporaryStack col10 = new Collections_10_SortStackUsingTemporaryStack();
        Stack<Integer> inputStack = new Stack<>();
        inputStack.push(34);
        inputStack.push(3);
        inputStack.push(31);
        inputStack.push(98);
        inputStack.push(92);
        inputStack.push(1);
        inputStack.push(23);

//        col10.sortingStack(inputStack);

        String postfixExpression = "10 2 8 * + 3 -";
        Collections_9_EvaluatePostfixExpressionUsingAStack col9 = new Collections_9_EvaluatePostfixExpressionUsingAStack();
        col9.evaluate(postfixExpression);



    }
}

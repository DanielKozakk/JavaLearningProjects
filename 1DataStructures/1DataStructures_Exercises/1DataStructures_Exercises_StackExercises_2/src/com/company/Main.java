package com.company;

public class Main {

    public static void main(String[] args) {

        Collections_9_EvaluatePostfixExpression evaluator = new Collections_9_EvaluatePostfixExpression("10 2 8 * + 3 -");
//        Collections_9_EvaluatePostfixExpression evaluator = new Collections_9_EvaluatePostfixExpression("10 2 -");
//        Collections_9_EvaluatePostfixExpression evaluator = new Collections_9_EvaluatePostfixExpression("10");
        System.out.println(evaluator.evaluateExpression());

    }


}

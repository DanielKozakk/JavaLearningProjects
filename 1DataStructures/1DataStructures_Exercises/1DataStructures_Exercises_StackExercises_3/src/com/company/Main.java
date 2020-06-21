package com.company;

public class Main {

    public static void main(String[] args) {


        String toEvaluate = "10 2 8 * + 3 -";
//        String toEvaluate = "+ - * 5 *";
        Collections_9_EvaluatePostfixExpressionUsingAStack col9 = new Collections_9_EvaluatePostfixExpressionUsingAStack();
        col9.evaluate(toEvaluate);

    }
}

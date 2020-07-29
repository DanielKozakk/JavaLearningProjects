package com.company;

public class Main {

    public static void main(String[] args) {

        String toEvaluate = "10 2 8 * + 3 -";

        Collections_9_EvaluatePostfixExpressionUsingAStack col9 = new Collections_9_EvaluatePostfixExpressionUsingAStack();

        String input_1 = "[()]{}{[()()]()}";
        String input_2 = "[(])";

        Collections_11_CheckForBalancedParanthesesInAnExpression col11 = new Collections_11_CheckForBalancedParanthesesInAnExpression();
//        System.out.println(col11.checkForBalanced(input_2));

        Collections_12_ImplementUsingQueue<Integer> col12 = new Collections_12_ImplementUsingQueue<>();

        col12.push(1);
        col12.push(2);
//        col12.push(3);

        System.out.println(col12.size());

    }


}


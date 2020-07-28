package com.company;

public class Main {

    public static void main(String[] args) {


        String toEvaluate = "10 2 8 * + 3 -";
//        String toEvaluate = "+ - * 5 *";
        Collections_9_EvaluatePostfixExpressionUsingAStack col9 = new Collections_9_EvaluatePostfixExpressionUsingAStack();
//        col9.evaluate(toEvaluate);


//        Input: exp = “[()]{}{[()()]()}”
//        Output: Balanced




//        Input: exp = “[(])”
//        Output: Not Balanced


        String input_1 = "[()]{}{[()()]()}";
        String input_2 = "[(])";

        Collections_11_CheckForBalancedParanthesesInAnExpression col11 = new Collections_11_CheckForBalancedParanthesesInAnExpression();
        System.out.println(col11.checkForBalanced(input_2));


    }
}

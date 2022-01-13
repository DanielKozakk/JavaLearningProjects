package com.company.stack.serie_1;

import java.util.Stack;

public class Collections_9 {


    /**
     * Input: 10 2 8 * + 3 -
     * String [] expression = {"10", "2", "8", "*", "+", "3", "-"}
     * Output : 23
     */

    public static void evaluatePostfixExpression(String[] input) {

        /**
         * Robię expression stack, który jest pusty.
         * Dodaję do niego pierwszy element inputu.
         *
         * Robię pętlę while, która działa, do póki sstack nie jest pusty
         *
         * Jeśli element to liczba, dodaję go do stacka.
         * Jeśli wyrażenie arytmetyczne, pobieram dwie ostatnie liczby, wykonuje działanie, dodaję wynik do stacka.
         */

        Stack<String> expressionStack = new Stack<>();
        expressionStack.add(input[0]);

        int i = 1;
        while (i < input.length) {

            String element = input[i];


            int firstNumber;
            int secondNumber;
            int finalNumber;
            switch (element) {
                case "+":
                    secondNumber = Integer.parseInt(expressionStack.pop());
                    firstNumber = Integer.parseInt(expressionStack.pop());
                    finalNumber = firstNumber + secondNumber;
                    expressionStack.add(String.valueOf(finalNumber));
                    break;
                case "-":
                    secondNumber = Integer.parseInt(expressionStack.pop());
                    firstNumber = Integer.parseInt(expressionStack.pop());

                    finalNumber = firstNumber - secondNumber;
                    expressionStack.add(String.valueOf(finalNumber));
                    break;
                case "*":
                    secondNumber = Integer.parseInt(expressionStack.pop());
                    firstNumber = Integer.parseInt(expressionStack.pop());

                    finalNumber = firstNumber * secondNumber;
                    expressionStack.add(String.valueOf(finalNumber));
                    break;
                case "/":
                    secondNumber = Integer.parseInt(expressionStack.pop());
                    firstNumber = Integer.parseInt(expressionStack.pop());

                    finalNumber = firstNumber / secondNumber;
                    expressionStack.add(String.valueOf(finalNumber));
                    break;
                default:
                    expressionStack.add(element);
            }
            i ++;
        }
        System.out.println(expressionStack);
    }


}

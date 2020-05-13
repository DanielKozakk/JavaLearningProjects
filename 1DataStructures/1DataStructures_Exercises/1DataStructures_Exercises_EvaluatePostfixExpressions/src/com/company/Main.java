package com.company;

import java.lang.invoke.WrongMethodTypeException;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(evaluatePostFixExpression("10 2 8 * + 3 -"));
//        System.out.println(evaluatePostFixExpression("10 2 -"));
    }

    static public int evaluatePostFixExpression(String expressionToEvaluate) {

        int lengthOfExpression = expressionToEvaluate.length();
        Stack<String> stackExpression = new Stack<String>();
        List<String> operatorsList = Arrays.asList(new String[]{"+", "-", "*", "/"});




        StringBuilder stringToAdd = new StringBuilder();

        for (int i = 0; i < lengthOfExpression; i++) {
            char ch = expressionToEvaluate.charAt(i);
//            System.out.println("to jest ch : " + String.valueOf(ch));

            if (String.valueOf(ch).equals(" ")){
                if(stringToAdd.length() != 0 ) stackExpression.push(stringToAdd.toString());

//                System.out.println("To jest stack expression : ");
//                System.out.println(stackExpression.toString());

                // reset stringToAdd StringBulider
                stringToAdd = new StringBuilder("");

            }
            else if (operatorsList.contains(String.valueOf(ch))) {

//                System.out.println("To jest ch: ");
//                System.out.println(String.valueOf(ch));
//                System.out.println("To jest PEEK: ");
//                System.out.println(stackExpression.peek());
                System.out.println("To jest stack expression : ");
                System.out.println(stackExpression.toString());

                int firstNumber = Integer.parseInt(stackExpression.pop());
                int secondNumber = Integer.parseInt(stackExpression.pop());


                switch (String.valueOf(ch)){
                    case ("+"):
                        stackExpression.push(String.valueOf(firstNumber + secondNumber));
                        break;
                    case ("-"):
                        stackExpression.push(String.valueOf( secondNumber - firstNumber));
                        break;
                    case ("*"):
                        stackExpression.push(String.valueOf(firstNumber * secondNumber));
                        break;
                    case ("/"):
                        stackExpression.push(String.valueOf(secondNumber / firstNumber ));
                        break;
                    default:
                            throw new IllegalArgumentException("You need to use among numbers and math operators.");
                }

            } else {

                stringToAdd.append(ch);
//
            }


        }

//        Integer.parseInt(stackExpression.peek());

        return Integer.parseInt(stackExpression.peek());

    }
}

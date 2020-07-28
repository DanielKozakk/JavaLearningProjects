package com.company;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Collections_9_EvaluatePostfixExpressionUsingAStack {

    public void evaluate(String inputExpression) {

        /*
        Input: 10 2 8 * + 3 -
        Output : 23
         */

        /*


        Tworzę stackObliczeniowy
        Tworzę StringBuldier

        Iteruje się przez znaki w inputExpression

            Jeśli natrafię na liczbę 
                stringBuldier.append(sign)

            jeśli natrafię na spację
                A poprzedni znak to liczba
                    stackObliczeniowy.push(sign)
                    stringBuldier = new StringBUldier()


            Jeśli natrafię na znak specjalny

                drugaLiczba = stackObliczeniowy.pop()
                pierwszaLiczba = stackObliczeniowy.pop()

                Zrób tutaj jakieś obliczenia
                Dodaj wynik do stackuObliczeniowego

         */

        Stack<Integer> coutingStack = new Stack<>();
        StringBuilder stringBuldier = new StringBuilder();

        Pattern digitsPattern = Pattern.compile("[0-9]");
        Pattern specialSignsPattern = Pattern.compile("[+/*-]");

        for (int i = 0; i < inputExpression.length(); i++){
            String c = String.valueOf(inputExpression.charAt(i));



            if(digitsPattern.matcher(c).find()){
                stringBuldier.append(c);
            } else if (c.equals(" ") ){
                String previousChar = String.valueOf(inputExpression.charAt(i - 1));
                if(digitsPattern.matcher(previousChar).find()){
                    coutingStack.push(Integer.parseInt(stringBuldier.toString()));
                    stringBuldier = new StringBuilder();
                }

            } else if (specialSignsPattern.matcher(c).find()){
                Integer secondNumber = coutingStack.pop();
                Integer firstNumber = coutingStack.pop();

                Integer numberToAdd = null;
                switch (c){
                    case "+" :
                        numberToAdd = firstNumber + secondNumber;
                        break;
                    case "-" :
                        numberToAdd = firstNumber - secondNumber;

                        break;
                    case "*" :
                        numberToAdd = firstNumber * secondNumber;

                        break;
                    case "/" :
                        numberToAdd = firstNumber / secondNumber;
                        break;
                }

                coutingStack.push(numberToAdd);

            }





        }


        System.out.println(coutingStack.peek());
    }
}

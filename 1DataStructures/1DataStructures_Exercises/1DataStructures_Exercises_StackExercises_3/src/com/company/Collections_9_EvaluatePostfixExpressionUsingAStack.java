package com.company;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Collections_9_EvaluatePostfixExpressionUsingAStack {


//    "10 2 8 * + 3 -"
    /*
    NA PAPPIERZE:

    iteruje się przez wszystkie ch w inputString

    jeśli natrafiam na spację,
    to sprawdzam czy poprzedni znak jest specjalny, jeśli tak to continue

    jeśli nie to dodaję powstały string z string buldiera do evaluateStack, a potem erestuję buldier stack

    jeśli natrafiam na znak specjalny, to robię dwa razy pop, wykonuję akcję, wrzucam spowrotem do evaluateStack

    jeśli natrafiam na liczbę, dodaję jej wartość do string buldiera



     */
//String toEvaluate = "10 2 8 * + 3 -";


    int evaluate(String inputExpression) {

        String specialSignsPattern = "[+\\-*/]";
        Pattern checkRegex = Pattern.compile(specialSignsPattern);
        StringBuilder stringBuilder = new StringBuilder();
        Stack<Integer> outputStack = new Stack<>();


        for (int i = 0; i < inputExpression.length(); i++) {


            String ch = String.valueOf(inputExpression.charAt(i));

            if (ch.equals(" ")) {

                String previousSign = String.valueOf(inputExpression.charAt(i - 1));
                Matcher matcher = checkRegex.matcher(previousSign);

                if (matcher.find()) {
                    if (matcher.group().length() != 0) {
                        System.out.println("Poprzedni znak to znak specjalny a obecny to spacja w indeksie  " + i);
                        continue;
                    }
                } else {
                    outputStack.push(Integer.parseInt(stringBuilder.toString()));
                    stringBuilder = new StringBuilder();
                }
            } else if(checkRegex.matcher(ch).find()){

//                System.out.println("output stack : "+outputStack.toString());
                Integer secondNumber = outputStack.pop();
                Integer firstNumber = outputStack.pop();

                Integer outputNumber = switch (ch) {
                    case "+" -> firstNumber + secondNumber;
                    case "-" -> firstNumber - secondNumber;
                    case "*" -> firstNumber * secondNumber;
                    case "/" -> firstNumber / secondNumber;
                    default -> 0;
                };

                outputStack.push(outputNumber);
            } else {
                System.out.println("Zadziałałem i dodałem liczbę " + ch);
                stringBuilder.append(ch);
                System.out.println("teraz string buldier to : " + stringBuilder.toString());

            }

        }

        System.out.println(outputStack.toString());

        return 0;
    }

}


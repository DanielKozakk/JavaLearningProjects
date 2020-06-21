package com.company;

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


    int evaluate(String inputExpression) {

        String specialSignsPattern = "[+\\-*/]";
        Pattern checkRegex = Pattern.compile(specialSignsPattern);

        for (int i = 0; i < inputExpression.length(); i++) {

            String ch = String.valueOf(inputExpression.charAt(i));
            StringBuilder stringBuilder = new StringBuilder();

            if (ch.equals(" ")) {

                String previousSign = String.valueOf(inputExpression.charAt(i - 1));
                Matcher matcher = checkRegex.matcher(previousSign);

                while (matcher.find()) {
                    if (matcher.group().length() != 0) {
                        System.out.println(matcher.group().trim());
                    }
                }
            }
        }
        return 0;
    }

}


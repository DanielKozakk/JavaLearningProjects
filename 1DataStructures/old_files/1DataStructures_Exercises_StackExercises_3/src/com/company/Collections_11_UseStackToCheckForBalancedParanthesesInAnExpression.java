package com.company;

import java.util.Stack;

public class Collections_11_UseStackToCheckForBalancedParanthesesInAnExpression {

    public boolean checkForBalance(String inputString) {

//        Input: exp = “[()]{}{[()()]()}”
//        Input: exp = “[(])”


        /*

            Iteruje się po znakach w stringu
            Jeśłi natrafię na otwierający, dodaję go do stacka
            Jeśli natrafię na zamykająćy, to tworzę zmienną, która będzie odpowiadała otwierającemu
            następnie robię ze stacka pop, porównuję, jeśli nie są takie same, to zwracam false, jeśli są takie same, to iteruje się dalej
            W wyniku zwracam czy stack jest pusty.
         */

        Stack<String> outputStack = new Stack<>();

        for (int i = 0; i < inputString.length(); i++) {
            String c = String.valueOf(inputString.charAt(i));


            switch (c) {
                case "{":
                case "(":
                case "[":
                    outputStack.push(c);
                    break;
                case "}":
                    if (!outputStack.peek().equals("{")) {
                        return false;
                    } else {
                        outputStack.pop();

                    }
                    break;
                case "]":
                    if (!outputStack.peek().equals("[")) {
                        outputStack.pop();
                        return false;
                    } else {
                        outputStack.pop();

                    }
                    break;
                case ")":
                    if (!outputStack.peek().equals("(")) {
                        outputStack.pop();
                        return false;
                    } else {
                        outputStack.pop();

                    }
                    break;
            }
        }

        System.out.println(outputStack);

        return outputStack.empty();
    }

}

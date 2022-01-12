package com.company;

import java.util.Stack;

public class Collections_11_CheckForBalancedParentheses {


    public boolean checkForBalance(String inputExpression) {
    /*
            Na PAPIERZE:

            Tworzę expression Stack

            Iteruję się po inputExpression

            Jeśli znajdę nawias otwierający
                dodaję go do expressionStack
            else jeśli znajdę nawias zamykający
                robię zmienną z  expressionStack.pop

                sprawdzam typ - jeśli otwierający odpowiada zamykającemu, to przehcodżę dalej
                jeśli nie, zwracam false

            jeśli stack nie jest pusty
                zwracam false

            zwracam true
     */

        /*
            PSEUDOKOD:

            expressionStack = new Stack<String>

            for( int i = 0, i < inputLength, i ++){

                jeśli charat i to nawias otwierający
                    dodaj go do stacka
                jeśli chartat to nawias zamykający

                    sprawdź czy expressionStack.pop() != changeCloseToOpenParantheese
                        return false

            }

            if !expressionStack.isEmpety
                return false

            return true

        changeCloseToOpenParantheese(String paranthe){

            switch ( paranthe
                case ]
                    return [
                    break
               ... .. . .. . .
        }
        */

        Stack<String> expressionStack = new Stack<String>();

        for (int i = 0; i < inputExpression.length(); i++) {

            String ch = String.valueOf(inputExpression.charAt(i));

            if (ch.equals("[") || ch.equals("(") || ch.equals("{")) {
                expressionStack.push(ch);
            } else {
                String lastCharacter = expressionStack.pop();
                if (!lastCharacter.equals(turnCloseToOpen(ch))) {
                    return false;
                }
            }
        }

        return expressionStack.isEmpty();
    }

    private String turnCloseToOpen(String parenthes) {
        return switch (parenthes) {
            case "]" -> "[";
            case "}" -> "{";
            case ")" -> "(";
            default -> null;
        };
    }
}


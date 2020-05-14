package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {

    public static int[] integersToPushToStack = {34, 3, 31, 98, 92, 23};
    public static int[] secondIntegersToPushToStack = {3, 5, 1, 4, 2, 8};
    public static Stack<Integer> firstInputStack = new Stack<>();
    public static Stack<Integer> secondInputStack = new Stack<>();


    public static void main(String[] args) {
//        System.out.println(collections9_evaluatePostFixExpression("10 2 8 * + 3 -"));

        for (int integer : integersToPushToStack) {
            firstInputStack.push(integer);
        }
        for (int integer : secondIntegersToPushToStack) {
            secondInputStack.push(integer);
        }
//        collections10_sortStackUsingTemporaryStack(secondInputStack);
        System.out.println(collections11_checkForBalanceOfParentheses("[(])"));

    }


    static public boolean collections11_checkForBalanceOfParentheses(String inputString) {
        /*
                NA PAPIERZE:
                Mam se jakąś tam sekwencję nawiasów typu []{}{{(())}}{[]}[{()}]
                Robię sobie funkcję pomocniczną, która będzie konsumowała string i zwracała string
                ] -> [
                } -> {
                ) -> (

                Iteruję się znaki w stringu.
                Jeśli znajdę tam znak otwierający, to dodaję go do stacka
                Jeśli znajdę tam znak zamyakjący, to służy on jako input do pomocniczej funkcji, następnie robię sprawdzanie dwóch znaków, jeśli się nie zgadzają no to nawiasy nie są zbalansowane.
                Jeśli stak nie jest pusty na koniec, to znaczy że sekwencja jest niezbalansowana.
         */
        Stack<String> outputStack = new Stack<>();
        int inputLength = inputString.length();

        for (int i = 0; i < inputLength; i++) {

            String ch = String.valueOf(inputString.charAt(i));
            switch (ch){
                case "{":
                case "[":
                case "(":
                    outputStack.push(ch);
                    break;
                case "}":
                case "]":
                case ")":
                    if(outputStack.empty()){
                        return false;
                    }
                    String lastSignFromStack = outputStack.pop();

                    if (!collections11_utilityFunctionThatChecksparentheses(ch).equals(lastSignFromStack)){
                         return false;
                    }
            }
        }

        if(!outputStack.empty()){
            return false;
        }
        return true;
    }

    static public String collections11_utilityFunctionThatChecksparentheses(String paranthes) {

        switch (paranthes) {
            case "}":
                return "{";
            case "]":
                return "[";
            case ")":
                return "(";
            default:
                throw new IllegalArgumentException();
        }

    }

    static public void collections10_sortStackUsingTemporaryStack(Stack<Integer> inputStack) {
        final int inputStackSize = inputStack.size();

        Stack<Integer> temporaryStack = new Stack<>();
        int elementsRemainIndex = inputStackSize;


        Integer smallestElement = null;

        while (elementsRemainIndex > 0) {

            for (int element : inputStack) {


                // initialization of smallestElemenet
                if (smallestElement == null) {
                    if (!temporaryStack.empty() && element > temporaryStack.peek()) {
                        smallestElement = element;
                    } else if (temporaryStack.empty()) {
                        smallestElement = element;
                    }
                }

                // compare smallest to current element
                if (smallestElement != null) {

                    if (!temporaryStack.empty() && temporaryStack.peek() < element && element < smallestElement) {
                        smallestElement = element;
                    } else if (temporaryStack.empty() && element < smallestElement) {
                        smallestElement = element;
                    }
                }

            }

            temporaryStack.push(smallestElement);
            smallestElement = null;
            elementsRemainIndex--;

        }

        System.out.println("Staczek:");
        System.out.println(temporaryStack.toString());


    }


    static public int collections9_evaluatePostFixExpression(String expressionToEvaluate) {

        int lengthOfExpression = expressionToEvaluate.length();
        Stack<String> stackExpression = new Stack<String>();
        List<String> operatorsList = Arrays.asList(new String[]{"+", "-", "*", "/"});


        StringBuilder stringToAdd = new StringBuilder();

        for (int i = 0; i < lengthOfExpression; i++) {
            char ch = expressionToEvaluate.charAt(i);
//            System.out.println("to jest ch : " + String.valueOf(ch));

            if (String.valueOf(ch).equals(" ")) {
                if (stringToAdd.length() != 0) stackExpression.push(stringToAdd.toString());

//                System.out.println("To jest stack expression : ");
//                System.out.println(stackExpression.toString());

                // reset stringToAdd StringBulider
                stringToAdd = new StringBuilder("");

            } else if (operatorsList.contains(String.valueOf(ch))) {

//                System.out.println("To jest ch: ");
//                System.out.println(String.valueOf(ch));
//                System.out.println("To jest PEEK: ");
//                System.out.println(stackExpression.peek());
//                System.out.println("To jest stack expression : ");
//                System.out.println(stackExpression.toString());

                int firstNumber = Integer.parseInt(stackExpression.pop());
                int secondNumber = Integer.parseInt(stackExpression.pop());


                switch (String.valueOf(ch)) {
                    case ("+"):
                        stackExpression.push(String.valueOf(firstNumber + secondNumber));
                        break;
                    case ("-"):
                        stackExpression.push(String.valueOf(secondNumber - firstNumber));
                        break;
                    case ("*"):
                        stackExpression.push(String.valueOf(firstNumber * secondNumber));
                        break;
                    case ("/"):
                        stackExpression.push(String.valueOf(secondNumber / firstNumber));
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

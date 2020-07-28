package com.company;

import java.util.Stack;

public class Collections_11_CheckForBalancedParanthesesInAnExpression {

    public boolean checkForBalanced(String input){

//        Input: exp = “[()]{}{[()()]()}”
//        Output: Balanced


//        Input: exp = “[(])”
//        Output: Not Balanced

        /*

                Iteruje się przez elementy Stringa
                Jak natrafię na nawias otwierający, dodaję go do stacka
                Jak natrafię na nawias zamykający, to sprawdzam, czy pop odpowiada nawiasowi
                Jeśli nie, to przerywam pętlę i robię że jest nie zbalansowany

                Na koniec sprawdzam, zwracam, czy stack jest pusty

         */

        Stack<String> outputStack = new Stack<>();
        boolean isStackBalanced = true;

        for(int i = 0; i < input.length(); i ++ ){

            String ch = String.valueOf(input.charAt(i));

            switch (ch){
                case "{":
                case "(":
                case "[":
                    outputStack.push(ch);
                    break;

                case ")":
                    if(!outputStack.pop().equals("(")){
                        isStackBalanced = false;
                    }
                    break;
                case "]":
                    if(!outputStack.pop().equals("[")){
                        isStackBalanced = false;
                    }
                    break;
                case "}":
                    if(!outputStack.pop().equals("{")){
                        isStackBalanced = false;
                    }
                    break;
            }

            if(!isStackBalanced) return isStackBalanced;

        }

        return outputStack.isEmpty();


    }
}

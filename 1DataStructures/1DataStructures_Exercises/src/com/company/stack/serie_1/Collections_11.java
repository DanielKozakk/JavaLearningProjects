package com.company.stack.serie_1;

import java.util.Stack;

public class Collections_11 {

    /**
     * Input:

     String firstInput = "[()]{}{[()()]()}";
     Output: Balanced


     Input:

     String secondInput = “[(])”;

     Output: Not Balanced

     */

    public static void checkParenthesesBalance(String input){


        /**
         *
         * Iteruje sie
         * Jak znajde otwierający, to dodaję do stacka
         * jak znajdę zamykający to sprawdzam ostatni element jaki był - jesli nie pasuje to wypisuje not balanced
         * jak pasuje, to robię pop
         *
         */


        Stack<Character> stack = new Stack<>();
        loop: for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);

            Character popped;
            switch(c){
                case '(':
                case '[':
                case '{':
                    stack.add(c);
                    break;
                case ')':
                     popped = stack.pop();
                    if(!popped.equals('(')){
                        System.out.println("Not Balanced");
                    }
                    break loop;
                case ']':
                     popped = stack.pop();
                    if(!popped.equals('[')){
                        System.out.println("Not Balanced");
                        break loop;
                    }
                    break;
                case '}':
                     popped = stack.pop();
                    if(!popped.equals('{')){
                        System.out.println("Not Balanced");
                    }
                    break loop;
            }
        }
        if(stack.isEmpty()){
            System.out.println("Balanced");
        }

    }
}

package com.company.stack.serie_1;

import javax.management.StandardEmitterMBean;
import java.util.Stack;

public class Collections_10 {

    /**
     * Input:

     Stack<Integer> firstInitStack = new Stack<>();
     List<Integer> intList = Arrays.asList(34, 3, 31, 98, 92, 93);
     firstInitStack.addAll(intList);

     * Output :
     * [3, 23, 31, 34, 92, 98]

     * Input:

     Stack<Integer> secondInitStack = new Stack<>();
     List<Integer> intList2 = Arrays.asList(3, 5, 1, 4, 2, 8);
     secondInitStack.addAll(intList2);

     * Output :
     * [1, 2, 3, 4, 5, 8]
     */

    public static void sortStackUsingATemporaryStack(Stack<Integer> input){
        Stack<Integer> temporaryStack = new Stack<>();

        /**
         *
         *
         * dodaj pierwszą wartość z imputa do temporaryStacka.
         *
         * zrób pętlę while. .. dopóki input value nie jest puste.
         *
         * sprawdź head na inpucie, sprawdź czy ostatni element z tmpStack jest mniejszy, jeśli tak, dodaj wartość do tmpStack, robiąd popa
         * jeśli nie, to zrób pop nan tmp stack, dodaj wartość do inputa, a iterowaną wartoóść weź i dodaj do tmpStack.
         */

        temporaryStack.add(input.pop());
        while(!input.isEmpty()){

            if(input.peek() >= temporaryStack.peek()){
                temporaryStack.add(input.pop());
            } else {

                // na ten moment szczyt z input jest mniejszy 'np 1' niż tmp 'np 5'
                int value = input.pop();

                while(!temporaryStack.isEmpty() && temporaryStack.peek() > value ){
                    input.add(temporaryStack.pop());
                }
                temporaryStack.add(value);
            }
        }

        System.out.println(temporaryStack);
    }
}

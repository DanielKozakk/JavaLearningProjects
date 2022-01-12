package com.company;

import java.util.Stack;

public class Collections_10_SortStackUsingAnotherTempStack {


//    Input : [34, 3, 31, 98, 92, 23] Output : [3, 23, 31, 34, 92, 98] Input : [3, 5, 1, 4, 2, 8] Output : [1, 2, 3, 4, 5, 8]


    public static void sort(Stack<Integer> inputStack) {



        /*
                NA PAPIERZE:

                mam inputStack oraz tmpStack

                zapisuję rozmiar inputStackSize
                Tworzę inputStackIndex = inputStackSize;

                tworzę pętlę while, której warunkiem jest to, że i > 0

                    robię zmienną smallestReminded, ustawiam ją jako null

                    tworzę w srodku pętlę for loop która iteruje się przez wszystkie elementy inputStack


                        jeżeli stack jest pusty,

                            jeżeli smallestReminded jesst null
                                ustaw obecną liczbę jako smallest Reminded
                            else if currentNumber jest mniejszy niż smallest Reminded
                                ustaw obecną liczbę jako smallestReminded

                        else

                               jeśli smallestReminded jest null a element iterowany jest większy niż tmpStack.peek
                                    zapisz liczbę jako smallestReminded
                               jeśli nie jest nullem, element iterowany jest mniejszy niż smallestRemind ale większy niż tmp.peek
                                    zapisz liczbę jako smallestReminded
                    dodaj smallestReminded do tmpStack
                    i --;
         */

        /*
                PSEUDOKOD:

                tmpStack = new Stack<Integer>

                int inputStackSize = inputStack.size();
                int inputStackIndex = inputStackSize;



                while(i > 0)

                    smallestReminded = null
                    for(currentNumber : stack)

                        if tmpStack.size() == 0
                            if smallestReminded == null
                                smallestReminded = currentNumber
                            else if ( currentNumber < smallestReminded)
                                smallestReminded = currentNumber
                         else
                             if (smallestReminded == null && currentNumber > tmpStack.peek)
                                smallestRemindend = currentNumber
                             else if (currentElemenet < smallestRemind && currentElement > tmpStack.peek)
                                smallestRemindend = currentNumber
                    end loop
                    tmpStakc.push(smallestReminded)
                    i --;
         */

        Stack<Integer> tmpStack = new Stack<>();

        int inputStackIndex = inputStack.size();

        while (inputStackIndex > 0) {
            Integer smallestReminded = null;
            for (Integer currentElement : inputStack) {
                if(!tmpStack.empty()){

                    if(smallestReminded == null && currentElement > tmpStack.peek()){
                        smallestReminded = currentElement;
                    } else if(currentElement > tmpStack.peek() && currentElement < smallestReminded){
                        smallestReminded = currentElement;
                    }
                }
                else{

                    if (smallestReminded == null) {
                        smallestReminded = currentElement;
                    } else if (currentElement < smallestReminded) {
                        smallestReminded = currentElement;
                    }
                }
            }
            tmpStack.push(smallestReminded);
            inputStackIndex --;
        }
        System.out.println(tmpStack.toString());

    }

}

package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Collections_12_ImplementStackFromQueue {

    static Queue<Integer> q1 = new LinkedList<Integer>();
    static Queue<Integer> q2 = new LinkedList<Integer>();


    // stack has push, pop, isEmpty, peek methods

    public void push(int elementToPush) {
        q1.add(elementToPush);
        q2 = reverseQueue(q1);
    }



    public int pop(){

        int elementToReturn = q2.poll();
        q1 = reverseQueue(q2);
        return elementToReturn;
    }

    public void showElements() {

        for (int element : q2) {
            System.out.println("Showing elements : " + element);

        }
    }

    public boolean isEmpty(){
        return q2.isEmpty();
    }

    public Integer peek(){
        return q1.peek();
    }






    private Queue<Integer> reverseQueue(Queue <Integer> arrayToReverse){
        LinkedList<Integer> tmpQueue = new LinkedList<>();

        int desireableElementIndex = arrayToReverse.size();
        int currentIndex = 1;

        while (desireableElementIndex > 0) {
            for (int element : arrayToReverse) {

                if (currentIndex == desireableElementIndex) {
                    tmpQueue.add(element);
                    desireableElementIndex--;
                    currentIndex = 1;
                    break;
                }
                currentIndex++;
            }
        }
        return tmpQueue;
    }
}
/// TUTAJ SĄ WSZELKIE NOTATKI DOTYCZĄCE PISANIA TEJ KLASY

        /*

                PUSH METHOD!!!
                NA PAPIERZE:



                robię
                StackFromQueue stackFromQueue = new StackFromQueue();

                w środku dwie kolejki - q1 i q2
                Pierwsza będzie zachowywała elementy jako normalna kolejka.
                Druga będzie to odwrócona kolejka pierwsza.

                metoda push, która ma parametr elementToPush

                3- elementToPush
                q1.add(3);

                // załóżmy że q1 wygląda jak Rear -> 3,2,1 <- head.

                // chce se wziąć element z końca
                desireableElementIndex = q1.size();

                // obecny index
                elementIndex = 1;

                while(desireableElementIndex > 0)

                    for loop element in q1

                        if(elementIndex == desireableElementIndex){

                            q2.add(element) // w tym wypadku 3.
                            desireableElementIndex --;
                            elementIndex = 0;
                            break;

                        }

                        elementIndex++
         */

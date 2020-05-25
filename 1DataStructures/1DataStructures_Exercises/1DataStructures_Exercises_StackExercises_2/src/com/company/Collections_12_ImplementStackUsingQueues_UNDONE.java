package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Collections_12_ImplementStackUsingQueues_UNDONE {



    /*
            NA PAPIERZE:
            Funkcje do zaimplementowania:
            push
            peek
            empty
            pop

            Będę używał dwóch kolejek. Jedna z nich będzie przechowywała normalną kolejność elementów, druga będzie przechowywać odwróconą kolejność.

            Push

            Jest to dodanie elementu do pierwszej kolejki, a następnie zrobienie drugiej na podstawie pierwszej poprzez odwrócenie kolejności.

            Peek - to jest peek z odwróconej kolejki

            Emty - wiadomix

            Pop - Dequeue z odwróconej kolejki, następnie stworzenie pierwszej kolejki na podstawie odwrócenia odwróconej.

            PSEUDOKOD:


            firstQueue
            secondQueue

            push(Object element){

                secondQueue.push(element)




            }



     */

    private static Queue<Object> q1 = new LinkedList<>();
    private static Queue<Object> q2 = new LinkedList<>();



    /*


     */

    static void push(Object x)
    {

        // Push x first in empty q2
        q2.add(x);

        // Push all the remaining
        // elements in q1 to q2.
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }

        // swap the names of two queues
        Queue<Object> q = q1;
        q1 = q2;
        q2 = q;


    }

    static void pop()
    {

        // if no elements are there in q1
        if (q1.isEmpty())
            return;
        q1.remove();
    }

    static void toStringi(){
        System.out.println(q1.toString());
    }



}



package com.company;

import java.util.Queue;
import java.util.Stack;

public class Collections_13_ReverseFirstKElementsInQueue {

    Queue<? extends Integer> queue;
    int numberOfElementsToReverse;

/*
    Input : Q = [10, 20, 30, 40, 50, 60,
            70, 80, 90, 100]
    k = 5
    Output : Q = [50, 40, 30, 20, 10, 60,
            70, 80, 90, 100]


    NA PAPIERZE:

        Robię sobie pętlę, która przechodzi przez pierwsze k elementów, następnie robię pop czy tam poll i dodaję elementy do Stacka.
        Wtedy w mojej zostaje [60,70,80,90,100]
        W stacku mam [10,20,30,40,50]
        Tworzę nową kolejkę, w której najpierw dodaję elementy stacka - 50,40,30,20,10, a potem elementy ze starej kolejki - 60,70,80,90,100


 */

    public Collections_13_ReverseFirstKElementsInQueue(Queue<? extends Integer> queue, int elementsToReverse) {
        this.queue = queue;
        this.numberOfElementsToReverse = elementsToReverse;
    }

    public Queue<?> reverseQueue() {
        Stack<? extends Integer> tmpStack = new Stack<>();
        int i = 1;
        for (Object o : queue) {

            if (i <= numberOfElementsToReverse) {
                tmpStack.push(queue.poll());
            }
        }
    }


}

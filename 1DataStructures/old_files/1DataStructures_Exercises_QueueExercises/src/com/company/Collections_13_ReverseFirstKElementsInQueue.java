package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Collections_13_ReverseFirstKElementsInQueue<T> {

    Queue<T> inputQueue;
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

    public Collections_13_ReverseFirstKElementsInQueue(Queue<T> inputQueue, int elementsToReverse) {
        this.inputQueue = inputQueue;
        this.numberOfElementsToReverse = elementsToReverse;
    }

    public Queue<?> reverseQueue() {
        Stack<T> tmpStack = new Stack<>();
        Queue<T> outputQueue = new LinkedList<>();
        int i = 1;

        while (i <= numberOfElementsToReverse) {
            tmpStack.push(inputQueue.poll());
            i++;
        }


        while(!tmpStack.isEmpty()){
            outputQueue.add(tmpStack.pop());
        }

        while (!inputQueue.isEmpty()) {
            outputQueue.add(inputQueue.poll());
        }

//        System.out.println(outputQueue.toString());
        return outputQueue;

    }


}

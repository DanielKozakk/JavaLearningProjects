package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Collections_13_ReverseFirstNElementsOfQueue {

    /*
    Given an integer k and a queue of integers, we need to reverse the order of the first k elements of the queue, leaving the other elements in the same relative order.

    Only following standard operations are allowed on queue.

    enqueue(x) : Add an item x to rear of queue
    dequeue() : Remove an item from front of queue
    size() : Returns number of elements in queue.
    front() : Finds front item.
    Input : Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100] k = 5 Output : Q = [50, 40, 30, 20, 10, 60, 70, 80, 90, 100]
    Input : Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100] k = 4 Output : Q = [40, 30, 20, 10, 50, 60, 70, 80, 90, 100]
    */

    /*
            Na papierze:

            tworzę tmpStack
            robię pętlę elementsToReverse > 0

                robię tmpStack push inputQueue.dequeue
                elementsToReverse --;

            robię outputQueue
            pętlą while która działa dopóki stack nie jest pusty
                outputQueue.add = tmpStack.pop

            pętla while która działa, dopóki inputQueue niejest pusta
                outputQueue.add(inputQueue.poll)

                return outputQueue
     */

    /*
            PSEUDOKOD:

            Stack<Object> tmpStack = new Stack<Object>
            LinkedList<Object> outputQueue = new LinkedList<Object>

            while(elementsToReverse > 0)
                tmpStack.push(inputQueue.poll)
                elementsToReverse --;

            while(!tmpstack.isEmpty())
                outputQueue.add(tmpStack.pop())
             while(!inputQueue.isEmpty())
                outputQueue.add(inputQueue.poll())

            return outputQueue
     */
//
    public void reverseFirstKElements(Queue<Object> inputQueue, int k){

        Stack<Object> tmpStack = new Stack<>();
        Queue<Object> outputQueue = new LinkedList<>();

        while (k > 0){
            tmpStack.push(inputQueue.poll());
            k--;
        }

        while(!tmpStack.isEmpty()){
            outputQueue.add(tmpStack.pop());
        }
        while(!inputQueue.isEmpty()){
            outputQueue.add(inputQueue.poll());
        }

        System.out.println(outputQueue.toString());

    }

}

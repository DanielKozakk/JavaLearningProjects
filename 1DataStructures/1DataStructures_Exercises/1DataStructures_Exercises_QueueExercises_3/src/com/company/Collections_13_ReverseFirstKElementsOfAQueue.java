package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Collections_13_ReverseFirstKElementsOfAQueue {


    public void reverseFirstKElement(int k, Queue<Integer> inputQueue){


        // Only following standard operations are allowed on queue.
        //
        //enqueue(x) : Add an item x to rear of queue
        //dequeue() : Remove an item from front of queue
        //size() : Returns number of elements in queue.
        //front() : Finds front item.

        //        Input : Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
        //        k4
        //        Output : Q = [40, 30, 20, 10, 50, 60, 70, 80, 90, 100]

        /*

            robię index i
            robię tmp Stack
            iteruje się przez elementy z listy

                jeśli i <= k

                    tmpStack.push(inputQueue.poll)
            i ++
            robię outputQueue
            while(!tmpStack.empty)
                outputQueue.add(tmpStack.pop)

            while(!inputQueue.empty)

                outputQueue.add(inputQueue.poll)
         */

        int i = 1;
        Stack<Integer> tmpStack = new Stack<>();
        while(true){
            if(i <= k){
                tmpStack.push(inputQueue.poll());
                i ++;
            } else {
                break;
            }
        }
        Queue<Integer> outputQueue = new LinkedList<>();
        while(!tmpStack.empty()){
            outputQueue.add(tmpStack.pop());
        }
        while (!inputQueue.isEmpty()){
            outputQueue.add(inputQueue.poll());
        }

        System.out.println(outputQueue);
    }


}

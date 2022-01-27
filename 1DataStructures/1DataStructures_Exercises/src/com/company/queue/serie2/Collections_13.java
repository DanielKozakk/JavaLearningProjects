package com.company.queue.serie2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Collections_13 {

    /**

     Only following standard operations are allowed on queue.

     enqueue(x) : Add an item x to rear of queue
     dequeue() : Remove an item from front of queue
     size() : Returns number of elements in queue.
     front() : Finds front item.

     Input:

     Queue<Integer> initQueue = new LinkedList<>();
     List<Integer> initList = Arrays.asList(10,20,30,40,50,60,70,80,90,100);
     initQueue.addAll(initList);

     Output :
     K= 5
     Q = [50, 40, 30, 20, 10, 60, 70, 80, 90, 100]


     Input:
     Queue<Integer> initQueue2 = new LinkedList<>();
     List<Integer> initList2 = Arrays.asList(10,20,30,40,50,60,70,80,90,100);
     initQueue.addAll(initList2);

     Output :
     K= 4
     Q = [40, 30, 20, 10, 50, 60, 70, 80, 90, 100]
     */

    public void reverseFirstKElementsInQueue(Queue<Integer> queue, int k){

        /*
            1. Dodaję pierwsze k elementów do stacka. [10, 20,30,40]
            2. Iteruję się dopóki stack nie pusty, dodaję je do nowej kolejki ze stacka. Następnie dodaję resztę elementów ze starej kolejki.

         */
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < k ; i++){
            stack.push(queue.poll());
        }

        Queue<Integer> newQueue = new LinkedList<>();
        while(!stack.isEmpty()){
            newQueue.add(stack.pop());
        }
        newQueue.addAll(queue);
        System.out.println(newQueue);

    }
}

package com.company.stack.serie_1;

import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Collections_13{

    /**

     Only following standard operations are allowed on queue.

     enqueue(x) : Add an item x to rear of queue
     dequeue() : Remove an item from front of queue
     size() : Returns number of elements in queue.
     front() : Finds front item.
     Additional Stack

     Input:

     List<Integer> initList = Arrays.asList(10,20,30,40,50,60,70,80,90,100);
     Queue<Integer> initQueue = new LinkedList<>(initList);

     Output :
     K= 5
     Q = [50, 40, 30, 20, 10, 60, 70, 80, 90, 100]


     Input:
     List<Integer> initList2 = Arrays.asList(10,20,30,40,50,60,70,80,90,100);
     Queue<Integer> initQueue2 = new LinkedList<>(initList2);

     Output :
     K= 4
     Q = [40, 30, 20, 10, 50, 60, 70, 80, 90, 100]
     */


    public void reverseFirstKElementsInQueue(Queue<Integer> queue, int k){

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i <k; i++){
            stack.push(queue.poll());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        for(int j = 0; j < queue.size() - k; j++){
            queue.add(queue.poll());
        }

        System.out.println(queue);
    }
}




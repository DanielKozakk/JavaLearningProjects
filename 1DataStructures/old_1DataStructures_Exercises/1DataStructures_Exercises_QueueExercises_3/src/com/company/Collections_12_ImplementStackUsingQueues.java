package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Collections_12_ImplementStackUsingQueues <T>{

//    A stack can be implemented using two queues.
//
//    pop
//            push
//    peek
//            size

    Queue<T> firstQueue = new LinkedList<>();
    Queue<T> secondQueue = new LinkedList<>();


    public int getSize(){
        return firstQueue.size();
    }

    public T peek (){
        return firstQueue.peek();
    }

    public void push(T elementToPush){

        secondQueue.add(elementToPush);

        while(!firstQueue.isEmpty()){
            secondQueue.add(firstQueue.poll());
        }
        firstQueue = secondQueue;
        secondQueue = new LinkedList<>();

    }

    public void pop (){

        firstQueue.poll();
    }



}

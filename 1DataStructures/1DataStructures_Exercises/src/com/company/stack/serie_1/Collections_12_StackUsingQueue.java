package com.company.stack.serie_1;

import java.util.LinkedList;
import java.util.Queue;

public class Collections_12_StackUsingQueue<T> {

    Queue<T> firstQueue = new LinkedList<>();

    public void push(T value){

        Queue<T> secondQueue = new LinkedList<>();

        while(!firstQueue.isEmpty()){
            secondQueue.add(firstQueue.poll());
        }
        firstQueue.add(value);
        firstQueue.addAll(secondQueue);

    }
    public T pop(){
        Queue<T> secondQueue = new LinkedList<>();

        return firstQueue.poll();
    }

    public T peek (){
        return firstQueue.peek();
    }

    /**
     *
     * (!)(2)(#)  / sklep
     *
     * push (O)
     *
     * (#)(2)(!) - do second
     *
     * (O)
     *
     * @return
     */

    public int size(){
        return firstQueue.size();
    }

    public void print(){
        System.out.println(firstQueue);
    }
}

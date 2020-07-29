package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Collections_12_ImplementUsingQueue <E>   {

    Queue<E> queue1 = new LinkedList<>();
    Queue<E> queue2 = new LinkedList<>();

    public void push(E elementToAdd){

        queue2.add(elementToAdd);

        while(!queue1.isEmpty()){
            queue2.add(queue1.poll());
        }

        queue1 = queue2;
        queue2 = new LinkedList<>();
    }

    public E pop(){
        return queue1.poll();
    }

    public E peek(){
        return queue1.peek();
    }

    public int size(){
        return queue1.size();
    }

}

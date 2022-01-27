package com.company.stack.serie_2;

import java.util.LinkedList;
import java.util.Queue;

public class Collections_12 {

    Queue<Integer> queue = new LinkedList<>();

    public void push(Integer value){

        Queue<Integer> tmpQueue = new LinkedList<>();
        while(!queue.isEmpty()){
            tmpQueue.add(queue.poll());
        }
        queue.add(value);
        queue.addAll(tmpQueue);
    }

    public Integer pop(){
        return queue.poll();
    }
    public Integer peek(){
        return queue.peek();
    }
    public Integer size(){
        return queue.size();
    }
}

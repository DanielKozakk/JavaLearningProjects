package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Collections_12_ImplementStackUsingQueues {


    Queue<Object> q1 = new LinkedList();
    Queue<Object> q2 = new LinkedList();

    public Object pop (){

        return q1.poll();
    }

    public void push (Object obj){

        q2.add(obj);

        while(!q1.isEmpty()){

            q2.add(q1.poll());
        }

        Queue<Object> newQueue = new LinkedList<>();
        q1 = q2;
        q2 = newQueue;
    }
    public int size (){
        return q1.size();
    }

    public Object peek(){
        return q1.peek();
    }


}

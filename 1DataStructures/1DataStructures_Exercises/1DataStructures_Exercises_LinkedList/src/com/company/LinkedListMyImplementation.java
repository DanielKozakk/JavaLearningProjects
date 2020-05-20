package com.company;

public class LinkedListMyImplementation <T> {

     Node head;

     class Node {
        T data;
        Node next;

        Node (T data){
            this.data = data;
            next=null;
        }
    }



}

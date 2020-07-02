package com.company;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {


        LinkedList_Template ll = new LinkedList_Template();
        ll.insertAtHead(4);
        ll.insertAtHead(3);
        ll.insertAtHead(2);
        ll.insertAtHead(1);

        Collections_15_ReverseALiknedList col15 = new Collections_15_ReverseALiknedList();

        ll.printLinkedList();
//        col15.reverseALinkedList(ll);
    }
}

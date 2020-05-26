package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList_Template linkedListToReverse = new LinkedList_Template();
        linkedListToReverse.insertAtEnd("A");
        linkedListToReverse.insertAtEnd("B");
        linkedListToReverse.insertAtEnd("C");
        linkedListToReverse.insertAtEnd("D");
        linkedListToReverse.insertAtEnd("E");
        linkedListToReverse.insertAtEnd("h");

        Collections_15_ReverseLinkedList reversion = new Collections_15_ReverseLinkedList(linkedListToReverse);
//        System.out.println(reversion.reverseLinkedList().getFirstElement().getData());
        reversion.showReverseLinkedList();

        Collections_16_DetectLoopInLinkedList col16 = new Collections_16_DetectLoopInLinkedList();
        System.out.println(col16.detectLoop());

    }
}

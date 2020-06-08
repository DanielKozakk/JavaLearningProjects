package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList_Template linkedListToReverse = new LinkedList_Template();
        linkedListToReverse.insertAtEnd("1");
        linkedListToReverse.insertAtEnd("B");
        linkedListToReverse.insertAtEnd("B");
        linkedListToReverse.insertAtEnd("B");
        linkedListToReverse.insertAtEnd("B");
        linkedListToReverse.insertAtEnd("C");

//        Collections_18_RemoveDuplicatesFromLinkedList.removeDuplicates(linkedListToReverse);

        Collections_15_ReverseLinkedList col15 = new Collections_15_ReverseLinkedList(linkedListToReverse);

        


    }
}

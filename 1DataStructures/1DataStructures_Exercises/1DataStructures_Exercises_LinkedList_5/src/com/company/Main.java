package com.company;

public class Main {

    public static void main(String[] args) {

        LinkedListTemplate input = new LinkedListTemplate();


        input.insertAtEnd(21);
        input.insertAtEnd(43);
        input.insertAtEnd(41);
        input.insertAtEnd(21);
        input.insertAtEnd(12);
        input.insertAtEnd(11);
        input.insertAtEnd(12);


        Collections_18_RemoveDuplicatesFromALinkedList col18 = new Collections_18_RemoveDuplicatesFromALinkedList();
        col18.removeDuplicates(input);
    }
}

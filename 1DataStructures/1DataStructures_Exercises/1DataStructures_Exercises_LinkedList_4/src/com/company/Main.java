package com.company;

public class Main {

    public static void main(String[] args) {

    LinkedListTemplate<Integer> inputLinkedList = new LinkedListTemplate<>();
    inputLinkedList.insertAtEnd(1);
    inputLinkedList.insertAtEnd(2);
    inputLinkedList.insertAtEnd(3);
    inputLinkedList.insertAtEnd(4);
    inputLinkedList.insertAtEnd(5);



    Collections_15_ReverseALinkedList<Integer> collections_15_reverseALinkedList = new Collections_15_ReverseALinkedList<>();

//    collections_15_reverseALinkedList.reverse(inputLinkedList);
    Collections_17_ReturnNthElementFromEndOfLinkedList col17 = new Collections_17_ReturnNthElementFromEndOfLinkedList();
    col17.returnNthElemenbt(5, inputLinkedList);
    }
}

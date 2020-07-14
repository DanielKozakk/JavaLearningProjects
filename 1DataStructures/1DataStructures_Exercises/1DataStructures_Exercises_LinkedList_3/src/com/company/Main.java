package com.company;

public class Main {

    public static void main(String[] args) {


        LinkedList_Template ll = new LinkedList_Template();
        ll.insertAtHead(4);
        ll.insertAtHead(3);
        ll.insertAtHead(2);
        ll.insertAtHead(1);

        Collections_15_ReverseALiknedList col15 = new Collections_15_ReverseALiknedList();

        Collections_17_ReturnNthElementFromTheEndLinkedList col17 = new Collections_17_ReturnNthElementFromTheEndLinkedList();

//        col17.returnNthElement(4, ll);


//        12->11->12->21->41->43->21
//        12->11->21->41->43


        LinkedList_Template<Integer> ll2 = new LinkedList_Template();

        ll2.insertAtEnd(1);
        ll2.insertAtEnd(2);

        ll2.insertAtEnd(12);
        ll2.insertAtEnd(11);
        ll2.insertAtEnd(12);
        ll2.insertAtEnd(21);
        ll2.insertAtEnd(41);
        ll2.insertAtEnd(43);
        ll2.insertAtEnd(21);

        Collections_18_RemoveDuplicatesFromALinkedList col18 = new Collections_18_RemoveDuplicatesFromALinkedList();

        col18.removeDuplicates(ll2);


    }
}

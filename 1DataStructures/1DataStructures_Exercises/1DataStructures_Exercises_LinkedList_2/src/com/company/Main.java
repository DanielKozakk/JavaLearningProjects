package com.company;

public class Main {

    public static void main(String[] args) {


        LinkedList_Template<String> ll = new LinkedList_Template();

        ll.insertAtEnd("fierst");
        ll.insertAtEnd("second");
        ll.insertAtEnd("third");
        ll.insertAtEnd("forth");
        ll.insertAtEnd("fifth");

        LinkedList_Template<Integer> ll2 = new LinkedList_Template<Integer>();

        ll2.insertAtEnd( 1);
//        ll2.insertAtEnd( 1);
//        ll2.insertAtEnd( 2);
//        ll2.insertAtEnd( 3);
        ll2.insertAtEnd( 4);
        ll2.insertAtEnd( 4);


//        Collections_15_ReverseALinkedList reversionClass = new Collections_15_ReverseALinkedList();
//        reversionClass.reverseLinkedList(ll);
//
//        Collections_17_ReturnNthNodeFromTheEnd col17 = new Collections_17_ReturnNthNodeFromTheEnd();
//        col17.returnNth(4, ll);

        Collections_18_RemoveDuplicatesFromLinkedList col18 = new Collections_18_RemoveDuplicatesFromLinkedList();
        col18.removeDuplicates(ll2);


    }
}

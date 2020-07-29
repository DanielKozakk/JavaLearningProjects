package com.company;

public class Collections_15_ReverseALinkedList<E> {

    public void reverse(LinkedListTemplate<E> inputLinkedList) {

        /*
            na papierze:

            1->2->3->4->NULL

            1->NULL, 2->3->4
            2->1->NULL, 3->4

            prev = null
            curr = first
            next = first.getNext


            iteracje pętli while:


         */

        LinkedListTemplate<E>.Node prev = null;
        LinkedListTemplate<E>.Node curr = inputLinkedList.getFirstElement();
        LinkedListTemplate<E>.Node next = curr != null ? curr.getNext() : null;



        while(curr != null){

            /*
            1->2->3->4->NULL

            1->NULL, 2->3->4
            2->1->NULL, 3->4

             */


            curr.setNext(prev);

               // 1->NULL


            prev = curr;
            // prev = 1;
            curr = next;
            // curr = 2
            next = curr != null ? curr.getNext() : null;
            // next = 3
            if(curr == null) inputLinkedList.setHead(prev);







        }

        inputLinkedList.printLinkedList();

    }

}

package com.company;

public class Collections_15_ReverseALiknedList {

    /*
        Input: Head of following linked list
        1->2->3->4->NULL
        Output: Linked list should be changed to,
        4->3->2->1->NULL


        prev = null
        currentElement = getFirstElement // 1


        Iteracja:
        #1

        current.setNext(prev)
        // 1->NULL
        prev = current // 1
        current = current.getNext // 2

        #2
         current.setNext(prev)
        //2->1->NULL
        prev = current // 2
        current = currentGetNExt //
     */

    public void reverseALinkedList(LinkedList_Template input){

        LinkedList_Template.Node prev = null;
        LinkedList_Template.Node current = input.getFirstElement();
        LinkedList_Template.Node next = null;

        while(current != null){

            next = current != null? current.getNext() : null;
            current.setNext(prev);
            prev = current;

            if(next == null){
                input.setHead(current);
            }
            current = next;


        }



        input.printLinkedList();

    }


}

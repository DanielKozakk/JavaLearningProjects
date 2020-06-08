package com.company;

import java.util.Stack;

public class Collections_15_ReverseALinkedList {


    public static LinkedList_Template reverseLinkedList (LinkedList_Template inputLinkedList){



//        Input: Head of following linked list
//        1->2->3->4->NULL
//        Output: Linked list should be changed to,
//        4->3->2->1->NULL

        /*
                NA PAPIERZE:

                tmpStack = new Stack();

                Tworzę zmienną prev, której przypisuję wartość NULL.

                Tworzę wartość current której przypisuje pierwszy element listy, czyli 1
                Tworzę wartość next, której przypisuje current.nextElement(), czyli 2


                while(current != null)
                1 iteracja:

                current.setNext = prev()
                // czyli 1 ma nextElement null

                outputlinkedList.add current
                // czyli dodaję 1 -> do stacka

                prev = current {3}
                current = next{4}

                jeśli current nie równe null
                    next = current.getNext(); {4}
                else
                    next = null


                potem dodaję elementy ze stacka robiąc insertAtEnd na linkedLiście
         */

        /*
        PSEUDOKOD:


                Node prev = null;
                Node curr = ll.getHead();
                Node next = curr.getNext();

                while(curr != null)
                    current.setNext = prev
                    outputStack.push  current

                    prev = curr
                    current = next

                    if(curr != null)
                        next = curr.getNext
                    else
                        next = null

                    while(!outputStack.isEmpty)
                        outputLinkedList.insertAtEnd(outputStack.pop)

         */

        LinkedList_Template.Node prev = null;
        LinkedList_Template.Node curr = inputLinkedList.getFirstElement();

        LinkedList_Template.Node next = curr != null? curr.getNext() : null;

        Stack<Object> tmpStack = new Stack<>();

        while (curr != null){

            curr.setNext(prev);
            tmpStack.push(curr);

            prev = curr;
            curr = next;
            next = curr != null ? curr.getNext() : null;

        }

        LinkedList_Template outputLinkedList = new LinkedList_Template();
        while(!tmpStack.isEmpty()){
            outputLinkedList.insertAtEnd(tmpStack.pop());

        }
        return outputLinkedList;

    }

}

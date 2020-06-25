package com.company;

import java.util.LinkedList;

public class Collections_18_RemoveDuplicatesFromLinkedList {


//    For example if the linked list is 12->11->12->21->41->43->21 then removeDuplicates() should convert the list to 12->11->21->41->43.

    public void removeDuplicates(LinkedList_Template inputLinkedList) {


        /*
            papier:



            baseElemenet = getFirstElement;

            prev = getFirstElement()
            curr = prev.getNext.
            next = curr.getNext();

            Iteruję się brute force po elementach

             first loop, while baseElement != null

                second loop while curr != null

                    if baseElement.getData is equal to curr.getData
                            prev.setNext(next)


              12->11->12->12->21->41->43->21
         */


        LinkedList_Template.Node baseElement = inputLinkedList.getFirstElement();

        LinkedList_Template.Node prev = baseElement;
        LinkedList_Template.Node elementToCompare = baseElement.getNext();
        LinkedList_Template.Node next = elementToCompare.getNext();



        System.out.println(inputLinkedList.getSize());

    }

}




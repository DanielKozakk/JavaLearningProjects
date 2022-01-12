package com.company;

import java.util.LinkedList;

public class Collections_18_RemoveDuplicatesFromLinkedList {


//    For example if the linked list is 12->11->12->21->41->43->21 then removeDuplicates() should convert the list to 12->11->21->41->43.

    public void removeDuplicates(LinkedList_Template inputLinkedList) {


        /*
            papier:

            firstSearchedElement to pierwszy element inputLinkedList

            previousElement = firstSearchedElement;
            secondSearchedElement = firstSearchedElement.getNext
            nextElement = secondSearchedElement.getNext();

            robię pętlę while, w której warunkiem jest to, że firstSearchedElement nie jest null

                robię wewnętrzną pętlę while, w której warunkiem jest to, że secondSearchedElement nie jest null

                jeśli firstSearchedElement.getData.equals(secondSearchedElement.getDAta())

                      previousElement.setNext(nextElement);
                      seconSearchedElement = nextElement
                      nextElement = secondSearchedElement != null? secondSearchedElement.getNext() : null;

                      continue

                previousElement = secondSearchedElement
                secondSearchedElemenet = nextElement
                nextElement = secondSearchedElement.getNExt();

             fistSearchedElement = firstSearchedElement.getNext
             secondSearchedElement = firstSearchedElement.getNext
         */

        LinkedList_Template.Node firstSearchedElement = inputLinkedList.getFirstElement();

        LinkedList_Template.Node previousElement = firstSearchedElement;
        LinkedList_Template.Node secondSearchedElement = firstSearchedElement.getNext();
        LinkedList_Template.Node nextElement = secondSearchedElement != null ? secondSearchedElement.getNext() : null;



        while(firstSearchedElement != null){

//            System.out.println("To jest firstSearchedElement : " + firstSearchedElement.getData());

            while(secondSearchedElement != null){

                if(firstSearchedElement.getData().equals(secondSearchedElement.getData())){
                    previousElement.setNext(nextElement);

                } else {
                    previousElement = secondSearchedElement;
                }
                secondSearchedElement = nextElement;
                nextElement = secondSearchedElement != null ? secondSearchedElement.getNext() : null;
            }
            firstSearchedElement = firstSearchedElement.getNext();

            previousElement = firstSearchedElement;
            secondSearchedElement = firstSearchedElement != null ? firstSearchedElement.getNext() : null;
            nextElement = secondSearchedElement != null ? secondSearchedElement.getNext() : null;

            System.out.println("");
        }
        inputLinkedList.printLinkedList();
    }




}




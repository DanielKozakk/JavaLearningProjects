package com.company.linkedList.serie1;

import com.company.linkedList.template.LinkedList;

import java.util.Queue;

public class Collections_18 extends LinkedList {

    /**
     Collections_18 input1 = new Collections_18();
     input1.insertAtEnd(12);
     input1.insertAtEnd(11);
     input1.insertAtEnd(12);
     input1.insertAtEnd(21);
     input1.insertAtEnd(41);
     input1.insertAtEnd(43);
     input1.insertAtEnd(21);

     */

    public void removeDuplicates(){

        /*

         Robisz cztery zmienne:
        searchedElement = getFirstElement

         previous = searchedElement
         current = previous.getNext();
         next = current.getNext();

         Robię pętlę while, która działa, dopóki searchedElement nie jest nullem.

         sprawdzam, czy current element ma takie same data jak searchedElement.
         Jeśli tak, to previous.setNext(next)

         */

        Node searchedElement =  getFirstElement();
        Node previousElement = searchedElement;
        Node currentElement = previousElement.getNext();
        Node nextElement = currentElement.getNext();

        while(searchedElement != null){
            if(currentElement != null && currentElement.getData().equals(searchedElement.getData())){
                previousElement.setNext(nextElement);
            } else {
                previousElement = currentElement;
            }

            currentElement = nextElement;
            if(currentElement != null) nextElement = currentElement.getNext();
            if(currentElement == null) {
                searchedElement = searchedElement.getNext();
                previousElement = searchedElement;
                if(previousElement != null) currentElement = previousElement.getNext();
                if(currentElement !=null) nextElement = currentElement.getNext();
            }
        }

    }

}

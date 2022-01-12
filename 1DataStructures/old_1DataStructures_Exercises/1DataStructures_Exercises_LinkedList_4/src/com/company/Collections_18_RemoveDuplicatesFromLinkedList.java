package com.company;

public class Collections_18_RemoveDuplicatesFromLinkedList {

    public void remove(LinkedListTemplate inputLinkedList){


        /*

            1->2->3->5->5->2

            searchedElement = getFirstelement

            prev = getfirst (1)
            current = prev.getNext(2)
            next = current.getNext(3)


        while searchedElement != null

            while(curr != null)
                if(searched == current)
                    prev.setNext(next)

                    curr = next
                    next = curr.getNext

                else

                    prev = curr
                    curr = next
                    next = curr.getNext
             }


            searchedElement = searchedElement.getNext();
            prev = searchedElement
            curr = prev.getNext
            next = curr.getNext();

         */

        LinkedListTemplate.Node searchedElement = inputLinkedList.getFirstElement();
        LinkedListTemplate.Node prev = searchedElement;
        LinkedListTemplate.Node curr = searchedElement.getNext();
        LinkedListTemplate.Node next = curr.getNext();

        while(searchedElement != null){
            while(curr != null){
                if(searchedElement.getData().equals(curr.getData())){
                    prev.setNext(next);
                    curr = next;
                    next = curr != null ? curr.getNext() : null;
                } else {
                    prev = curr;
                    curr = next;
                    next = curr != null ? curr.getNext() : null;
                }
            }

            searchedElement = searchedElement.getNext();
            prev = searchedElement;
            curr = prev != null? prev.getNext() : null;
            next = curr != null? curr.getNext() : null;
        }

        inputLinkedList.printLinkedList();

    }

}

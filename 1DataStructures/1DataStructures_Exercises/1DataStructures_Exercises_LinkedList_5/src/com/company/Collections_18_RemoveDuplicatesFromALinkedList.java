package com.company;

public class Collections_18_RemoveDuplicatesFromALinkedList {

    /*

            Na papierze:

            Robię zmienną searched element
            Robię zmienne:
            prev = searchedElement
            curr = prev.getNext
            next = curr.getNext

            pętlą while, która działa dopóki searrched element nie jest null

                pętla while która działa, dopóki curr nie jest null

                    jeśli curr.getContent == searched element.getContent
                        prev.setNext(next)
                    else
                        prev = curr
                        curr = next
                        
                        next = curr.getNext
                
                prev = searchedElement
                searchedElement = searcedElement.getNext();
                curr = searchedElement
                
                next = curr.getNext()
     */

    public void removeDuplicates(LinkedListTemplate inputLinkedList){

        LinkedListTemplate.Node searchedElement = inputLinkedList.getFirstElement();
        LinkedListTemplate.Node prev = inputLinkedList.getFirstElement();
        LinkedListTemplate.Node curr = prev != null ? prev.getNext() : null;
        LinkedListTemplate.Node next = curr != null ? curr.getNext() : null;

        while(searchedElement != null){

            while(curr != null){

                if(curr.getData().equals(searchedElement.getData())){
                    prev.setNext(next);
                } else {
                    prev = curr;
                }

                curr = next;
                next = curr != null ? curr.getNext() : null;
            }


            searchedElement = searchedElement.getNext();
            prev = searchedElement;
            curr = prev != null ? prev.getNext() : null;
            next = curr != null ? curr.getNext() : null;
        }

        inputLinkedList.printLinkedList();
    }

}

package com.company;

public class Collections_18_RemoveDuplicatesFromALinkedList {


    public void removeDuplicates(LinkedList_Template <Integer> inputLinkedList){


        /*
            For example if the linked list is 12->11->12->21->41->43->21 then removeDuplicates() should convert the list to 12->11->21->41->43.


                prev =  inputLinkedList.getFirstElement
                if(prev != null ) curr = getFirstElement.getNext
                if(curr != null) next = curr.getNext

                compareableElement = inputLinkedList.getFirstElement

                Pierwsza pętla while, która będzie działać dopóki compareable nie jest null

                        druga pętla, która działa, dopóki curr nie jest null

                            jeśi compareableElement == curr

                                prev.setNext(next)
                                curr = next

                                if(curr != null)
                                    next = curr.getNext

                            else

                               prev = curr
                               curr = next

                               if curr != null
                                    next = curr.getNext

                compareableElement = compareAbleelement.getNExt()
         */

        LinkedList_Template.Node prev = inputLinkedList.getFirstElement();
        LinkedList_Template.Node curr = (prev !=null ) ? prev.getNext() : null;
        LinkedList_Template.Node next = (curr !=null ) ? curr.getNext() : null;

        LinkedList_Template.Node compareableElement = inputLinkedList.getFirstElement();



        while(compareableElement != null){

            while(curr != null){

                if(curr.getData().equals(compareableElement.getData())){
                    prev.setNext(next);
                    curr = next;

                    if(curr != null) next = curr.getNext();

                } else {
                    prev = curr;
                    curr = next;

                    if (curr != null) next = curr.getNext();
                }

            }

            compareableElement = compareableElement.getNext();
            prev = compareableElement;
            curr = (prev != null ) ? prev.getNext() : null;
            next = (curr != null ) ? curr.getNext() : null;

        }

        inputLinkedList.printLinkedList();

    }
}

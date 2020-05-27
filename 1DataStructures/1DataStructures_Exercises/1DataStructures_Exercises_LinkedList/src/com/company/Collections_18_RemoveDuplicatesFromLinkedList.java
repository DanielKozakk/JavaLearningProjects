package com.company;

public class Collections_18_RemoveDuplicatesFromLinkedList {

    public static void removeDuplicates(LinkedList_Template linkedList){


        LinkedList_Template.Node searchedElement = linkedList.getFirstElement();

        while(searchedElement != null){

            searchedElement = searchedElement.getNext();

        }

    }
}

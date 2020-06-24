package com.company;

public class Collections_17_ReturnNthNodeFromTheEnd {

    public static void returnNth(int nth, LinkedList_Template inputLinkedList) {

        /*
            NA PAPIERZE:

            Biorę nth element, odejmuję go od size of linked list.
            Następnie iteruję się przez wszystkie elementy, licząc je, i zwracam element z odpowiednim indeksem.
         */

        LinkedList_Template.Node nthElement = null;

        int inputLinkedListSize = 0;

        LinkedList_Template.Node searchedElement = inputLinkedList.getFirstElement();

        while(searchedElement != null){
            inputLinkedListSize ++;
            searchedElement = searchedElement.getNext();
        }

        int indexOfSearchedElement = inputLinkedListSize - nth;


        searchedElement = inputLinkedList.getFirstElement();
        for(int i = 1; i < inputLinkedListSize ; i ++){

            searchedElement = searchedElement.getNext();
            if(i == indexOfSearchedElement) {
                nthElement = searchedElement;
            }
        }

        if(nthElement != null){
            System.out.println(nthElement.getData());

        }

    }

}
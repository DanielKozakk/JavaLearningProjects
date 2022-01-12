package com.company;

public class Collections_17_ReturnNthNodeFromTheEndInALinkedList {


    public static void returnNthElement(LinkedList_Template linkedList, int n){

        LinkedList_Template.Node searchedElement = linkedList.getFirstElement();

        int sizeOfLinkedList = 0;

        while(searchedElement != null){

            sizeOfLinkedList ++;
            searchedElement = searchedElement.getNext();
        }


        int indexOfElement = sizeOfLinkedList - n;
        searchedElement = linkedList.getFirstElement();
        int i = 0;

        while(searchedElement != null){

            if(i == indexOfElement){
                System.out.println(n + "th element : " + searchedElement.getData());
            }
            i ++;
            searchedElement = searchedElement.getNext();
        }
    }
}

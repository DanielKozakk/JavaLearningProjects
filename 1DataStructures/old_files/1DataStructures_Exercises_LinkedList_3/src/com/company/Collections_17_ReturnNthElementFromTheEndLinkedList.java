package com.company;

public class Collections_17_ReturnNthElementFromTheEndLinkedList {

    public void returnNthElement(int n, LinkedList_Template ll) {

        /*

                Mam taką linkedList:

                1->2->3->4->NULL

                no to pobieram pierwszy
                iteruje się aż szukany będzie null
                zapisuję index
                potem wyliczam porządany ze wzoru length - n
                iteruje się jeszcze raz i zwracam

         */

        LinkedList_Template.Node node = ll.getFirstElement();

        int size = ll.getSize() + 1;
        int desiredElement = size - n;
        int i = 1;

        LinkedList_Template.Node searchedElement = ll.getFirstElement();
        while(searchedElement != null ){

            if(i == desiredElement){
                System.out.println(searchedElement.getData());
            }
            i ++;

            searchedElement = searchedElement.getNext();

        }



    }


}

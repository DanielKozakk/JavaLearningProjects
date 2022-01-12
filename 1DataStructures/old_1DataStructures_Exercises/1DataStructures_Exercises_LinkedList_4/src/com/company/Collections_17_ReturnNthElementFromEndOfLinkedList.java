package com.company;

public class Collections_17_ReturnNthElementFromEndOfLinkedList {

    public void returnNthElemenbt(int n, LinkedListTemplate inputLinkedList) {

        /*

            Zamierzam to zrobić tak, że :

            iteruje się, zapisuje ile jest size
            potem iteruje się jeszcze raz


         */

        LinkedListTemplate.Node counted = inputLinkedList.getFirstElement();

        int desiredIndex = inputLinkedList.getSize() + 1 - n;

        int i = 0;
        while(counted != null){
            i++;
            if(i == desiredIndex){
                System.out.println(counted.getData());
            }

            counted = counted.getNext();

        }
    }

}

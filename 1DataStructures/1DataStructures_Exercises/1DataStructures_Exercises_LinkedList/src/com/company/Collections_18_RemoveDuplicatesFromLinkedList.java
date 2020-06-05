package com.company;

public class Collections_18_RemoveDuplicatesFromLinkedList {

    public static void removeDuplicates(LinkedList_Template linkedList) {

        LinkedList_Template.Node searchedElemenet = linkedList.getFirstElement();

        LinkedList_Template.Node prevNode = null;
        LinkedList_Template.Node currNode = linkedList.getFirstElement();
        LinkedList_Template.Node nextNode = currNode.getNext();

        //12->11->12->21->41->43->21
        while (searchedElemenet != null) {

            System.out.println("searched element : " + searchedElemenet.getData());

            while (currNode != null) {

                if (currNode.equals(searchedElemenet)) {
                    prevNode = currNode;
                    currNode = nextNode;
                    nextNode = currNode != null ? currNode.getNext() : null;
                    continue;
                }

                if (currNode.getData().equals(searchedElemenet.getData())) {

                    prevNode.setNext(nextNode);
                    currNode = nextNode;
                    nextNode = currNode != null ? currNode.getNext() : null;

                } else {

                    prevNode = currNode;
                    currNode = nextNode;
                    nextNode = currNode != null ? currNode.getNext() : null;
                }
            }
            prevNode = null;
            currNode = linkedList.getFirstElement();

            nextNode = currNode != null ? currNode.getNext() : null;

            searchedElemenet = searchedElemenet.getNext();
        }


        linkedList.printLinkedList();

    }

}

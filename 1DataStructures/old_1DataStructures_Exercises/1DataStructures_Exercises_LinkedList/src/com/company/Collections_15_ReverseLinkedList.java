package com.company;

public class Collections_15_ReverseLinkedList {

    private LinkedList_Template inputLinkedList;

    public LinkedList_Template.Node firstElement = null;

    Collections_15_ReverseLinkedList (LinkedList_Template linkedList){
        this.inputLinkedList = linkedList;
    }

    /*
    Input: Head of following linked list
    1->2->3->4->NULL
    Output: Linked list should be changed to,
    4->3->2->1->NULL

    Input: Head of following linked list
    1->2->3->4->5->NULL
    Output: Linked list should be changed to,
    5->4->3->2->1->NULL

    Input: NULL
    Output: NULL

    Input: 1->NULL
    Output: 1->NULL
     */


    private void reverse() {

        /*
        INPUT:
        1->2->3->NULL

        A    1->NULL 2->3->NULL
        B    2->1->NULL 3->NULL
        C    3->2->1->NULL

        ////////////////////////////////////////////

        prev = null
        curr = head {1}
        next = curr.getNext {2}

        LOOP:

        // A ITERATION
        curr{1}.setNext(prev){NULL}
        prev = curr{1}
        curr = next{2}
        next = curr.getNext(){3}

        // B ITERATION
        curr{2}.setNext(prev){1}
        prev = curr{2}
        curr = next{3}
        next = curr.getNext(){NULL}

        // C ITERATION

        curr{3}.setNext(prev){2}
        prev = curr{3}
        curr = next{null}
        next = curr.getNext(){NULL}
         */


        LinkedList_Template.Node prev = null;
        LinkedList_Template.Node curr = inputLinkedList.getFirstElement();

        LinkedList_Template.Node next = curr.getNext();

        while(curr != null){
            curr.setNext(prev);
            prev = curr;
            curr = next;

            if(curr != null){
                next = curr.getNext();
            }
        }
        firstElement = prev;

    }

    public void showReverseLinkedList (){

        reverse();

        StringBuilder stringBuilder = new StringBuilder();
        LinkedList_Template.Node searchedElement = firstElement;

        while(searchedElement != null){
            stringBuilder.append(searchedElement.getData()).append(" ");
            searchedElement = searchedElement.getNext();
        }
        System.out.println(stringBuilder.toString());
    }
}

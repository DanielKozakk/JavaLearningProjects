package com.company;

public class Main {

    public static void main(String[] args) {


        LinkedList_Template ll = new LinkedList_Template();

        ll.insertAtEnd("ABC");
        ll.insertAtEnd(2);


        LinkedList_Template reversed = Collections_15_ReverseALinkedList.reverseLinkedList(ll);
        LinkedList_Template.Node element = reversed.getFirstElement();


        while(element != null){

            System.out.println(element.getData().toString());
            element = element.getNext();

        }




    }
}

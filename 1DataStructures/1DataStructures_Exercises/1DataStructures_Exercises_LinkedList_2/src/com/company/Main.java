package com.company;

public class Main {

    public static void main(String[] args) {


        LinkedList_Template<String> ll = new LinkedList_Template();

        ll.insertAtEnd("ABC");
        ll.insertAtEnd("asc");

        System.out.println(ll.toString());

//        LinkedList_Template<String> reversed = Collections_15_ReverseALinkedList.reverseLinkedList(ll);
//        LinkedList_Template.Node element = reversed.getFirstElement();


//        while(element != null){
//
//            System.out.println(element.getData().toString());
//            element = element.getNext();
//
//        }






    }
}

package com.company;

public class Main {

    public static void main(String[] args) {


        LinkedList_Template<String> ll = new LinkedList_Template();

        ll.insertAtEnd("fierst");
        ll.insertAtEnd("second");
        ll.insertAtEnd("third");
        ll.insertAtEnd("forth");
        ll.insertAtEnd("fifth");

        Collections_15_ReverseALinkedList reversionClass = new Collections_15_ReverseALinkedList();
        reversionClass.reverseLinkedList(ll);

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

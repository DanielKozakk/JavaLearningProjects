package com.company;

public class Main {

    public static void main(String[] args) {

        Collections_13_ReverseFirstKElementsOfAQueue col13 = new Collections_13_ReverseFirstKElementsOfAQueue();
//        col13.reverseFirstKElement();

//        Input : Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
//        Input : Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

        LinkedList_Template input1 = new LinkedList_Template();

        input1.insertAtHead(10);
        input1.insertAtHead(20);
        input1.insertAtHead(30);
        input1.insertAtHead(40);
        input1.insertAtHead(50);
        input1.insertAtHead(60);
        input1.insertAtHead(70);
        input1.insertAtHead(80);
        input1.insertAtHead(90);
        input1.insertAtHead(100);

        col13.reverseFirstKElement(2, input1);

    }

}

package com.company;



import com.company.linkedList.template.LinkedList;
import com.company.linkedList.template.LinkedList.Node;

import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.insertAtEnd(1);
        Node second = ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);


        Node lastElement = ll.findLastElement();
        lastElement.setNext(second);

    }
}

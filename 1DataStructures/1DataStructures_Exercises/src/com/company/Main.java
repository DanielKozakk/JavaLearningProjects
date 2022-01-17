package com.company;


import com.company.linkedList.serie1.Collections_15;
import com.company.linkedList.template.LinkedList;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        LinkedList input1 = new LinkedList();
        input1.insertAtEnd(1);
        input1.insertAtEnd(2);
        input1.insertAtEnd(3);
        input1.insertAtEnd(4);

        Collections_15.reverseLinkedList(input1);

        LinkedList input2 = new LinkedList();
        input2.insertAtEnd(1);

//        com.company.linkedList.template.LinkedList input3 = new LinkedList();


    }
}

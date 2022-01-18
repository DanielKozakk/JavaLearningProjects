package com.company;


import com.company.linkedList.serie1.Collections_15;
import com.company.linkedList.serie1.Collections_16;
import com.company.linkedList.serie1.Collections_17;
import com.company.linkedList.template.Collections_18;
import com.company.linkedList.template.LinkedList;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Collections_18 input1 = new Collections_18();
        input1.insertAtEnd(12);
        input1.insertAtEnd(11);
        input1.insertAtEnd(12);
        input1.insertAtEnd(21);
        input1.insertAtEnd(41);
        input1.insertAtEnd(43);
        input1.insertAtEnd(21);

        input1.printLinkedList();
    }
}

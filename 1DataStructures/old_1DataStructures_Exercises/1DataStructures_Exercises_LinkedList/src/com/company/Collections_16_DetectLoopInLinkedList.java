package com.company;

import java.util.HashSet;

public class Collections_16_DetectLoopInLinkedList extends LinkedList_Template {

    private LinkedList_Template.Node head = null;

    private void createLoopedLinkedList() {

        Node fifthNode = new Node("E", null);
        Node forthNode = new Node("D", fifthNode);
        Node thirdNode = new Node("C", forthNode);
        Node secondNode = new Node("B", thirdNode);
        Node headNode = new Node("A", secondNode);

        fifthNode.setNext(secondNode);

        this.head = headNode;
    }


    boolean detectLoop() {

        createLoopedLinkedList();
        HashSet<Node> s = new HashSet<Node>();
        while (head != null) {
            // If we have already has this node
            // in hashmap it means their is a cycle
            // (Because you we encountering the
            // node second time).
            if (s.contains(head))
                return true;

            // If we are seeing the node for
            // the first time, insert it in hash
            s.add(head);

            head = head.getNext();
        }
        return false;
    }
}
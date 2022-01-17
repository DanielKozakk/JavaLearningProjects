package com.company.linkedList.serie1;

import com.company.linkedList.template.LinkedList;

import java.util.Stack;

public class Collections_15 extends LinkedList {


    /*


Input: Head of following linked list
1->2->3->4->NULL


        LinkedList input1 = new LinkedList();
        input1.insertAtEnd(1);
        input1.insertAtEnd(2);
        input1.insertAtEnd(3);
        input1.insertAtEnd(4);

Output: Linked list should be changed to,
4->3->2->1->NULL

Input: Head of following linked list
1->2->3->4->5->NULL
Output: Linked list should be changed to,
5->4->3->2->1->NULL

Input: NULL
        LinkedList input3 = new LinkedList();

Output: NULL

Input: 1->NULL
        LinkedList input2 = new LinkedList();
        input2.insertAtEnd(1);

Output: 1->NULL


     */

    public static void reverseLinkedList(LinkedList linkedList) {

        Stack<Node> helperStack = new Stack<Node>();

        Node node = linkedList.getFirstElement();
        while(node != null){

            helperStack.push(node);
            node = node.getNext();
        }

        LinkedList newLinkedList = new LinkedList();
        while(!helperStack.isEmpty()){
                Node oldNode = helperStack.pop();
                newLinkedList.insertAtEnd(oldNode.getData());
        }


        newLinkedList.printLinkedList();
    }

}

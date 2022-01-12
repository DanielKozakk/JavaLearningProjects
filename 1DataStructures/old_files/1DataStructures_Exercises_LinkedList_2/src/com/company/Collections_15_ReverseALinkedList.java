package com.company;

import java.util.Stack;
import com.company.LinkedList_Template.Node;

public class Collections_15_ReverseALinkedList {


    public void reverseLinkedList (LinkedList_Template inputLinkedList){

        /*
                PAPIER:

                Input: Head of following linked list
                1->2->3->4->NULL
                Output: Linked list should be changed to,
                4->3->2->1->NULL

                Mam trzy wskaźniki :

                prev = null;
                curr = head; {1}
                next = head.getNext {2}

                Robię pętlę while (curr != null)

                curr.setNext(prev)

                //   1->NULL 2->3->4->NULL

                prev = curr;
                curr = next
                if (curr != null ) next = curr.getNext; else next = null;

                // 2 iteracja:

                    prev {1}
                    curr {2}
                    next {3}
                }
         */

        Node prev = null;
        Node curr = inputLinkedList.getFirstElement();
        Node next = curr.getNext();


        Stack<Node> tmpStakc = new Stack<>();

        while(curr != null){



            curr.setNext(prev);

            tmpStakc.push(curr);

            prev = curr;
            curr = next;
            next = curr != null ? curr.getNext() : null;


        }

        LinkedList_Template outputTemplateLinketList = new LinkedList_Template();
        while(!tmpStakc.isEmpty()){
            outputTemplateLinketList.insertAtEnd(tmpStakc.pop().getData());
        }

        outputTemplateLinketList.printLinkedList();

//        System.out.println("This is whole inputLinkedList after reversion : " + ;

    }


}

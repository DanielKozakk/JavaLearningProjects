package com.company.binarySearchTree.serie1;

import com.company.binarySearchTree.serie1.Collections_26_BinarySearchTree;
import com.company.binarySearchTree.serie1.Collections_26_BinarySearchTree.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Collections_29 {

    public static void findNodesAtKDistanceFromTheRoot(Collections_26_BinarySearchTree binarySearchTree, int searchedLevel) {

        /**

         Robię queue, wrzucam tam HashMap <Node, Integer>
         potem while dopóki queue nie puste, wrzucam dzieci i nadaję im poziom większy.

         */
        ArrayList<Integer> valuesOnKLevel = new ArrayList<>();

        Queue<HashMap<Node, Integer>> queue = new LinkedList<>();
        HashMap<Node, Integer> firstHashMap = new HashMap<>();
        firstHashMap.put(binarySearchTree.getFirstNode(), 0);
        queue.add(firstHashMap);

         while  (!queue.isEmpty()) {

            HashMap<Node, Integer> searchedNodeAndLevel = queue.poll();

            Integer newLevel = null;
            for (Node node : searchedNodeAndLevel.keySet()
            ) {
                if(newLevel == null){
                    newLevel = searchedNodeAndLevel.get(node) + 1;
                }
//                if(newLevel == searchedLevel){
//                    System.out.println(node.getValue());
//                }

                if(node.getLeftChild() != null){
                    HashMap<Node, Integer> hm = new HashMap<>();
                    hm.put(node.getLeftChild(), newLevel);
                    queue.add(hm);
                    if(newLevel == searchedLevel){
                        System.out.println(node.getLeftChild().getValue());
                    }
                }
                if(node.getRightChild() != null){
                    HashMap<Node, Integer> hm = new HashMap<>();
                    hm.put(node.getRightChild(), newLevel);
                    queue.add(hm);
                    if(newLevel == searchedLevel){
                        System.out.println(node.getRightChild().getValue());
                    }
                }
            }

        }
    }
}

package com.company.serie2;

import com.company.serie1.Collections_26_ImplementBinarySearchTree;

import java.util.Stack;

public class Collections_27_FindTheHeightOfABinaryTree extends Collections_26_ImplementBinarySearchTree {

    Node root = null;

    public Collections_27_FindTheHeightOfABinaryTree(int data) {
        super(data);
        this.root = new Node(data);
    }

    class Node {

        int data;
        Node left, right;
        boolean wasNodeVisited = false;

        private Node(int data) {
            this.data = data;

        }

        public void setNodeAsVisited() {
            this.wasNodeVisited = true;
        }

        public boolean isNodeVisited() {
            return this.wasNodeVisited;
        }

        public int getData() {
            return this.data;
        }

        private Node getLeft() {
            return this.left;
        }

        private Node getRight() {
            return this.right;
        }
    }

    public void insert(int dataToInsert) {
        if (root == null) {
            root = new Node(dataToInsert);
        } else {
            insert(root, dataToInsert);
        }
    }

    private void insert(Node node, int dataToInsert) {

        if(dataToInsert > node.getData()) {
            if(node.right == null){
                node.right = new Node(dataToInsert);
            } else {
                insert(node.right, dataToInsert);
            }
        } else {
            if(node.left == null){
                node.left = new Node(dataToInsert);
            } else {
                insert(node.left, dataToInsert);
            }
        }
    }

    public void findHeight() {


        /*

               Robię nodesStack
               Searched = root

               deepestHeight = 0
               level = 0;


            dodaję searched do stacka
                Pętla while dopóki nodesStack nie pusty

                boolean isNodeExhausted
                    Iteruję się po sąsiadach
                        Jeśli sąsiad nie był visited
                        searched = sąsiad
                        deepestHeight ++;
                        isNodeExhausted = false;
                        break;
                if(isNodeExhausted)
                    stack.pop
                    deepestHeight --;
                    ifStack is not empty searched = stack.peek();

         */

        Stack<Node> nodesStack = new Stack<>();
        Node searched = root;
        int deepestHeight = 0;
        int level = 0;

        nodesStack.add(searched);
        while (!nodesStack.isEmpty()) {

            if (searched.left != null && !searched.left.isNodeVisited()) {
                searched = searched.left;
                nodesStack.add(searched);
                level++;

                if (deepestHeight < level) {
                    deepestHeight = level;
                }

            } else if (searched.right != null && !searched.right.isNodeVisited()) {
                searched = searched.right;
                nodesStack.add(searched);
                level++;

                if (deepestHeight < level) {
                    deepestHeight = level;
                }

            } else {
                searched.setNodeAsVisited();
                nodesStack.pop();
                level --;
                if(!nodesStack.isEmpty()){
                    searched = nodesStack.peek();
                }
            }
        }

        System.out.println(deepestHeight);
    }
}

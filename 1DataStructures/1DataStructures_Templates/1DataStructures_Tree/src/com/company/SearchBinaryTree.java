package com.company;

public class SearchBinaryTree {

    public Node root = null;

    private class Node {

        public Node left = null;
        public Node right = null;
        public int data;

        public Node(int data) {
            this.data = data;
        }
    }



    public void insert(int value ) {
        findPlaceToInsert(root, value);
    }

    private void findPlaceToInsert(Node startingPoint, int value){
        Node newNode = new Node(value);
                if (root != null) {
            if(value <= startingPoint.data){
                if(startingPoint.left == null){
                    startingPoint.left = newNode;
                } else {
                    findPlaceToInsert(startingPoint.left, value);
                }
            } else {
                if(startingPoint.right == null){
                    startingPoint.right = newNode;
                } else {
                    findPlaceToInsert(startingPoint.right, value);
                }
            }
        } else {
            root = newNode;
            findPlaceToInsert( root, value);
        }
    }


    public boolean contains(int value){
        return findNextNode(root, value);
    }

    private boolean findNextNode (Node searchedVertex, int value){
        if(searchedVertex.data == value){
            return true;
        } else if (value < searchedVertex.data){
            if(searchedVertex.left == null){
                return false;
            } else {
                return findNextNode(searchedVertex.left, value);
            }
        } else {
            if(searchedVertex.right == null){
                return false;
            } else {
                return findNextNode(searchedVertex.right, value);
            }
        }
    }

    public void printInOrder(){
        print(root);
    }

    private void print(Node printedNode){
        if(printedNode.left != null){
            print(printedNode.left);
        }

        System.out.println("Data z current node: " + printedNode.data);

        int rightData = printedNode.right == null ? 0 : printedNode.data;
        int leftData = printedNode.left == null ? 0 : printedNode.data;

        System.out.println("Data z current node - left : " + leftData + ", right: " + rightData);


        if(printedNode.right != null){
            print(printedNode.right);
        }
    }
}

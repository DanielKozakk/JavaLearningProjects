package com.company;

import java.util.ArrayList;
import java.util.List;

public class Node {


    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value <= data) {
            if (this.left == null) {
                this.left = new Node(value);
            } else {
                left.insert(value);
            }

        } else {
            if (this.right == null) {
                Node newNode = new Node(value);
                this.right = new Node(value);

            } else {
                right.insert(value);
            }
        }
    }

    public boolean contains(int value) {

        if (value == data) {
            return true;
        } else if (value < data) {

            if(this.left == null){
                return false;
            } else {
                 return this.left.contains(value);
            }

        } else {

            if(this.right == null){
                return false;
            } else {
                return this.right.contains(value);
            }
        }
    }

    public void printInOrder(){

        if(left != null){
            left.printInOrder();
        }
        System.out.println(data);
        if(right != null){
            right.printInOrder();
        }
    }

}

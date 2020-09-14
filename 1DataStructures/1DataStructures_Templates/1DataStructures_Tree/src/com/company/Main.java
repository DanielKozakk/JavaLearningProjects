package com.company;

public class Main {

    public static void main(String[] args) {


        Node node = new Node(100);

        node.insert(101);
        node.insert(10);

        System.out.println(node.contains(10));


    }
}

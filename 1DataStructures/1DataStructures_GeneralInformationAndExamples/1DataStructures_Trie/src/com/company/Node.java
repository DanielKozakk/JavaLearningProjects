package com.company;

// that's my implementation
public class Node {

    private static int NUMBER_OF_CHARACTERS = 26;
    Node[] children = new Node[NUMBER_OF_CHARACTERS];

    private static int getCharIndex(char c) {
        return c - 'a';
    }

    private Node getNode(char c) {
        return children[getCharIndex(c)];
    }

    private void setNode (char c){
        children[getCharIndex(c)] = new Node();
    }

    private



}

package com.company;

// that's my implementation
public class Node {

    private static int NUMBER_OF_CHARACTERS = 26;
    Node[] children = new Node[NUMBER_OF_CHARACTERS];
    boolean isNodeEndOfWord = false;

    public Node(boolean isNodeEndOfWord) {
        this.isNodeEndOfWord = isNodeEndOfWord;
    }

    int size = 0;

    private static int getCharIndex(char c) {
        return c - 'a';
    }

    private Node getNode(char c) {
        return children[getCharIndex(c)];
    }

    private void setNode(char c, Node node) {
        children[getCharIndex(c)] = node;

    }

    public void add(String stringToAdd) {
        add(stringToAdd, 0);
    }

    private void add(String stringToAdd, int index) {

        size++;

        if (index == stringToAdd.length()) {
            return;
        }

        char current = stringToAdd.charAt(index);

        Node child;

        if (index + 1 == stringToAdd.length()) {
            child = new Node(true);
        } else {
            child = new Node(false);
        }

        setNode(current, child);

        child.add(stringToAdd, index + 1);

    }


}

package com.company;

public class NodeFromCoderRank {

    private static int NUMBER_OF_CHARACTERS = 26;
    NodeFromCoderRank[] children = new NodeFromCoderRank[NUMBER_OF_CHARACTERS];

    int size = 0;

    public static int getCharIndex(char c) {
        return c - 'a';
    }

    private NodeFromCoderRank getNode(char c) {
        return children[getCharIndex(c)];
    }

    private void setNode(char c, NodeFromCoderRank node) {
        children[getCharIndex(c)] = node;
    }

    public void add(String s) {
        add(s, 0);
    }

    private void add(String s, int index) {
        size++;
        if (index == s.length()) return;

        char current = s.charAt(index);

        int charCod = getCharIndex(current);
        NodeFromCoderRank child = getNode(current);

        if (child == null) {
            child = new NodeFromCoderRank();
            setNode(current, child);
        }

        child.add(s, index + 1);

    }

    public int findCount(String s, int index) {
        if (index == s.length()) {
            return size;
        }
        NodeFromCoderRank child = getNode(s.charAt(index));
        if (child == null) {
            return 0;
        }
        return child.findCount(s, index + 1);
    }

}
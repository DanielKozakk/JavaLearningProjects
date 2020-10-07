package com.company;

public class PrefixTree {

    public static int NUMBER_OF_LETTERS = 26;
    public static int getCharIndex(char ch) {
        return ch - 'a';
    }

    private boolean isNodeEndOfWord = false;
    public boolean isNodeVisited = false;

    public PrefixTree[] children = new PrefixTree[NUMBER_OF_LETTERS];


    public PrefixTree(){}
    public PrefixTree(boolean isItEndOfWord) {
        this.isNodeEndOfWord = isItEndOfWord;
    }


    
    public void setNodeAsEndOfWord (){
        isNodeEndOfWord = true;
    }

    public boolean isNodeEndOfWord(){
        return this.isNodeEndOfWord;
    }

    public void setNodeAsVisited() {
        this.isNodeVisited = true;
    }


    public PrefixTree getNode(char ch) {
        return children[getCharIndex(ch)];
    }

    public void setNode(char ch, PrefixTree node) {
        children[getCharIndex(ch)] = node;
    }

    public void add(String string) {
        add(string, 0);
    }

    private void add(String string, int index) {

        if (string.length() == index) {
            return;
        }
        boolean isItEndOfWord = index + 1 == string.length();


        char ch = string.charAt(index);
        int chIndex = getCharIndex(ch);

        PrefixTree child = children[chIndex];

        if (children[chIndex] == null) {
            child = new PrefixTree(isItEndOfWord);
            setNode(ch, child);
        } else if (isItEndOfWord && children[chIndex] != null) {
            children[chIndex].setNodeAsEndOfWord();
        }

        child.add(string, index + 1);

    }


    public boolean contains(String s) {
        return contains(s, 0);
    }

    private boolean contains(String s, int index) {

        if (s.length() < index) {
            return false;
        }

        if (s.length() - 1 == index) {
            return true;
        }

        char currentChar = s.charAt(index);

        PrefixTree child = getNode(currentChar);

        if (child == null) {
            return false;
        }


        return child.contains(s, index + 1);

    }


}

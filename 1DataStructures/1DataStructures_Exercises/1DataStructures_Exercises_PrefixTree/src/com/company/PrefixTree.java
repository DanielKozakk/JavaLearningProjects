package com.company;

import java.util.HashMap;

public class PrefixTree {

    private boolean isNodeEndOfWord = false;

    protected String wholeWord = null;

    public boolean isNodeVisited = false;

    public HashMap<Character, PrefixTree> children = new HashMap<>();


    public PrefixTree() {
    }

    protected PrefixTree(boolean isItEndOfWord) {
        this.isNodeEndOfWord = isItEndOfWord;
    }

    public void setWholeWord(String wholeWord){
        this.wholeWord = wholeWord;
    }
    public String getWholeWord(){
        return this.wholeWord;
    }
    public void setNodeAsEndOfWord() {
        isNodeEndOfWord = true;
    }

    public boolean isNodeEndOfWord() {
        return this.isNodeEndOfWord;
    }

    public void setNodeAsVisited() {
        this.isNodeVisited = true;
    }


    public PrefixTree getNode(char ch) {
        return children.get(ch);
    }

    public void setNode(char ch, PrefixTree node) {

        children.put(ch, node);

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


        PrefixTree child = children.get(ch);

        if (child == null) {
            child = new PrefixTree(isItEndOfWord);

            if(isItEndOfWord) child.setWholeWord(string);

            setNode(ch, child);
        } else if (isItEndOfWord) {
            child.setWholeWord(string);
            child.setNodeAsEndOfWord();
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

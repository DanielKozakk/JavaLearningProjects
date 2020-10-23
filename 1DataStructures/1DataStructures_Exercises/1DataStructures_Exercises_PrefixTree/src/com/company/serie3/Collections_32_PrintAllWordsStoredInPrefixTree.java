package com.company.serie3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Collections_32_PrintAllWordsStoredInPrefixTree {

    private boolean isNodeEndOfWord = false;

    protected String wholeWord = null;

    public boolean isNodeVisited = false;

    public HashMap<Character, Collections_32_PrintAllWordsStoredInPrefixTree> children = new HashMap<>();


    public Collections_32_PrintAllWordsStoredInPrefixTree() {
    }

    protected Collections_32_PrintAllWordsStoredInPrefixTree(boolean isItEndOfWord) {
        this.isNodeEndOfWord = isItEndOfWord;
    }

    public void setWholeWord(String wholeWord) {
        this.wholeWord = wholeWord;
    }

    public String getWholeWord() {
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


    public Collections_32_PrintAllWordsStoredInPrefixTree getNode(char ch) {
        return children.get(ch);
    }

    public void setNode(char ch, Collections_32_PrintAllWordsStoredInPrefixTree node) {

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


        Collections_32_PrintAllWordsStoredInPrefixTree child = children.get(ch);

        if (child == null) {
            child = new Collections_32_PrintAllWordsStoredInPrefixTree(isItEndOfWord);

            if (isItEndOfWord) child.setWholeWord(string);

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

        Collections_32_PrintAllWordsStoredInPrefixTree child = getNode(currentChar);

        if (child == null) {
            return false;
        }
        return child.contains(s, index + 1);
    }

    public void printAllWords() {

        /*

                Robię breadth first search
                jeśli node jest końcem słowa, to go wypisuję

         */


        Queue<Collections_32_PrintAllWordsStoredInPrefixTree> unvisitedNodes = new LinkedList<>();
        Collections_32_PrintAllWordsStoredInPrefixTree searched = this;

        unvisitedNodes.add(searched);

        while(!unvisitedNodes.isEmpty()) {
            for (Collections_32_PrintAllWordsStoredInPrefixTree value : searched.children.values()) {
                if (value.isNodeEndOfWord) {
                    System.out.println(value.getWholeWord());
                }

                if(!value.isNodeVisited && !unvisitedNodes.contains(value)){
                    unvisitedNodes.add(value);
                }
            }

            searched.setNodeAsVisited();
            unvisitedNodes.poll();
            if(!unvisitedNodes.isEmpty()){
                searched = unvisitedNodes.peek();
            }
        }


    }


}

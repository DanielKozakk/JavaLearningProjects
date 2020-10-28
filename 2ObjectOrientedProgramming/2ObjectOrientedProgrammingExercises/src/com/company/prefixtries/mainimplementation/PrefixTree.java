package com.company.prefixtries.mainimplementation;

import com.company.prefixtries.AbstractPrefixTree;

import java.util.HashMap;

public class PrefixTree extends AbstractPrefixTree {

    protected int field = 2;

    protected int getField(){
        return field;
    }

    protected PrefixTree(HashMap<Character, ? extends AbstractPrefixTree> children) {
        super(children, null);
    }

    protected PrefixTree(HashMap<Character, ? extends AbstractPrefixTree> children, Character character) {
        super(children, character);
    }

    private static PrefixTree initializeChildPrefixTree(Character character) {
        HashMap<Character, ? extends AbstractPrefixTree> children = new HashMap<>();
        return new PrefixTree(children, character);
    }

    public static PrefixTree createNewPrefixTree() {
        HashMap<Character, ? extends AbstractPrefixTree> children = new HashMap<>();
        return new PrefixTree(children, null);
    }

    @Override
    public void addWord(String word) {
        add(word, 0);
    }

    private void add(String word, int index) {
        if (word.length() == index) {
            return;
        }

        boolean isCharEndOfWord = word.length() == index + 1;
        char ch = word.charAt(index);

        PrefixTree child = (PrefixTree) getNode(ch);
        if (child == null) {
            child = initializeChildPrefixTree(ch);
            if (isCharEndOfWord) {
                child.setNodeAsEndOfWord();
                child.addWordToListOfWholeWords(word);
            }
        } else if (isCharEndOfWord) {
            child.setNodeAsEndOfWord();
            child.addWordToListOfWholeWords(word);
        }

        setNode(child);

        child.add(word, index + 1);
    }

    @Override
    public boolean contains(String word) {
        return contains(word, 0);
    }

    private boolean contains(String word, int index) {
        if(index == word.length()){
            return false;
        }

        Character ch = word.charAt(index);
        PrefixTree child = (PrefixTree) getNode(ch);

        if(child == null){
            return  false;
        }

        if(index + 1 == word.length()){
            return true;
        } else {
            return child.contains(word, index + 1);
        }

    }

    @Override
    protected boolean isNodeVisited() {
        return super.isNodeVisited();
    }

    @Override
    protected boolean isNodeEndOfWord() {
        return super.isNodeEndOfWord();
    }

}
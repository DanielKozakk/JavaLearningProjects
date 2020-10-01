package com.company.serie1;

import java.util.Arrays;
import java.util.Collection;

import static com.company.serie1.Collections_31_ImplementPrefixTree.getCharIndex;

public class Collections_33_FormWordsFromADictionaryUsingPrefixTree extends Collections_31_ImplementPrefixTree {

    private String definition;
    public Collections_33_FormWordsFromADictionaryUsingPrefixTree[] children = new Collections_33_FormWordsFromADictionaryUsingPrefixTree[NUMBER_OF_LETTERS];

    public Collections_33_FormWordsFromADictionaryUsingPrefixTree() {
//        super();
    }

    private Collections_33_FormWordsFromADictionaryUsingPrefixTree(boolean isItEndOfWord) {
        super(isItEndOfWord);
    }

    public Collections_33_FormWordsFromADictionaryUsingPrefixTree(boolean isItEndOfWord, String definition) {
        super(isItEndOfWord);
        this.definition = definition;
    }

    public void add(String wordToAdd, String definitionToAdd) {
        add(wordToAdd, definitionToAdd, 0);
    }

    private String getDefinition() {
        return this.definition;
    }


    public String findDefinition(String s) {

        if (contains(s, 0)) {
            Collections_33_FormWordsFromADictionaryUsingPrefixTree desireableNode = findDefinition(s, 0);
            return desireableNode.getDefinition();
        } else {
            return "There is no such word in dictionary!";
        }

    }

    protected void changeDefinition(String definition) {
        this.definition = definition;
    }

    public void setNode(char ch, Collections_33_FormWordsFromADictionaryUsingPrefixTree node) {
        children[getCharIndex(ch)] = node;
    }

    private void add(String wordToAdd, String definitionToAdd, int index) {
//System.out.println(Arrays.toString(children));

        if (wordToAdd.length() == index) {
            return;
        }
        boolean isItEndOfWord = index + 1 == wordToAdd.length();


        char ch = wordToAdd.charAt(index);
        int chIndex = getCharIndex(ch);


        Collections_33_FormWordsFromADictionaryUsingPrefixTree child = children[chIndex];

        if (children[chIndex] == null) {
            if (isItEndOfWord) {
                child = new Collections_33_FormWordsFromADictionaryUsingPrefixTree(isItEndOfWord, definitionToAdd);
            } else {
                child = new Collections_33_FormWordsFromADictionaryUsingPrefixTree(isItEndOfWord);
            }
            setNode(ch, child);
        } else if (isItEndOfWord && children[chIndex] != null) {
            children[chIndex].setNodeAsEndOfWord();
            children[chIndex].changeDefinition(definitionToAdd);

        }

        child.add(wordToAdd, definitionToAdd, index + 1);

    }


    private boolean contains(String s, int index) {

        if (s.length() < index) {
            return false;
        } else if (s.length() - 1 == index) {
            return true;
        }


        char currentChar = s.charAt(index);
        Collections_33_FormWordsFromADictionaryUsingPrefixTree child = (Collections_33_FormWordsFromADictionaryUsingPrefixTree) getNode(currentChar);

        if (child == null) {
            return false;
        } else {
            return child.contains(s, index + 1);
        }
    }

    private Collections_33_FormWordsFromADictionaryUsingPrefixTree findDefinition(String s, int index) {

        char currentChar = s.charAt(index);
        Collections_33_FormWordsFromADictionaryUsingPrefixTree child = (Collections_33_FormWordsFromADictionaryUsingPrefixTree) getNode(currentChar);
        if (s.length() - 1 == index) {
            return (Collections_33_FormWordsFromADictionaryUsingPrefixTree) getNode(currentChar);
        } else {
            return child.findDefinition(s, index + 1);
        }


    }

}

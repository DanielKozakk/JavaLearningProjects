package com.company.serie4;

import java.util.ArrayList;
import java.util.HashMap;

public class Collections_33_DictionaryWithPrefixTree {

    private HashMap<Character, Collections_33_DictionaryWithPrefixTree> children = new HashMap<>();
    private boolean isNodeEndOfWord = false;
    private HashMap<String, String> definitions = null;
    private boolean isNodeVisited = false;

    public Collections_33_DictionaryWithPrefixTree() {
    }

    private Collections_33_DictionaryWithPrefixTree(String wordToAdd, String definitionToAdd) {
        if (definitions == null) {
            definitions = new HashMap<>();
        }
        definitions.put(wordToAdd,definitionToAdd);
        isNodeEndOfWord = true;
    }

    private void addNewDefinition(String wordToAdd, String definitionToAdd) {
        if (definitions == null) {
            definitions = new HashMap<>();
        }
        definitions.put(wordToAdd,definitionToAdd);
        isNodeEndOfWord = true;
    }

    private void addChildToHashMapChildren(Character ch) {
        if (!children.containsKey(ch)) {
            children.put(ch, new Collections_33_DictionaryWithPrefixTree());
        }
    }

    private void addChildToHashMapChildren(Character ch, String wordToAttach, String definition) {
        Collections_33_DictionaryWithPrefixTree child = children.get(ch);
        if (child == null) {
            children.put(ch, new Collections_33_DictionaryWithPrefixTree(wordToAttach, definition));
        } else {
            child.addNewDefinition(wordToAttach, definition);
        }

    }

    private boolean isNodeVisited() {
        return isNodeVisited;
    }

    private void setNodeVisited(boolean nodeVisited) {
        isNodeVisited = nodeVisited;
    }

    private boolean isNodeEndOfWord() {
        return isNodeEndOfWord;
    }

    private void setNodeEndOfWord(boolean nodeEndOfWord) {
        isNodeEndOfWord = nodeEndOfWord;
    }

//    private ArrayList<String> getWholeWords() {
//        return wholeWords;
//    }

    public void addDefinition(String word, String definition){
        addWord(word, definition, 0);
    }

    private void addWord(String word, String definition , int index){

        Character ch = word.charAt(index);

        if(word.length() == index + 1){
            addChildToHashMapChildren(ch, word, definition);
            return;
        } else {
            addChildToHashMapChildren(ch);
        }
        Collections_33_DictionaryWithPrefixTree child = children.get(ch);
        child.addWord(word, definition, index + 1);
    }

    public boolean contains(String s){
        return contains(s, 0);
    }
    private boolean contains(String s , int index){

        if(s.length() == index) return false;

        Character ch = s.charAt(index);
        Collections_33_DictionaryWithPrefixTree child = children.get(ch);

        if(child == null){
            return false;
        } else {
            if(child.isNodeEndOfWord()){
                return child.definitions.containsKey(s);

            } else {
                return child.contains(s, index + 1 );
            }
        }
    }


    public String getDefinition(String word){
        return getDefinition(word, 0);
    }

    private String getDefinition(String word, int index){
        if(word.length() == index) return null;

        Character ch = word.charAt(index);

        Collections_33_DictionaryWithPrefixTree child = this.children.get(ch);

        if(child == null){
            return null;
        } else if(child.isNodeEndOfWord() && word.length() == index + 1 ){
            return child.definitions.get(word);
        } else {
            return child.getDefinition(word, index + 1);
        }
    }


}

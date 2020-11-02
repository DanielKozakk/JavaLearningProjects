package com.company.prefixtries.mainimplementation;

import com.company.prefixtries.IPrefixTree;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class AbstractPrefixTree implements IPrefixTree {



    private boolean isNodeEndOfWord = false;


    private boolean isNodeVisited = false;
    private ArrayList<String> listOfWholeWords = null;



    public HashMap<Character, ? extends AbstractPrefixTree> getChildren() {
        return children;
    }

    private Character character;

    private HashMap<Character, ? extends AbstractPrefixTree> children;

    protected AbstractPrefixTree(HashMap<Character, ? extends AbstractPrefixTree> children, Character character) {
        this.children = children;
        this.character = character;
    }

    protected void setNode(AbstractPrefixTree node) {

        HashMap<Character, AbstractPrefixTree> tmpHashMap = new HashMap<>();
        tmpHashMap.put(node.getCharacter(), node);

        for (Character character : children.keySet()) {
            tmpHashMap.put(character, children.get(character));
        }
        children = tmpHashMap;
    }

    private Character getCharacter() {
        return this.character;
    }

    protected void addWordToListOfWholeWords(String word) {
        if (listOfWholeWords == null) {
            listOfWholeWords = new ArrayList<>();
        }
        listOfWholeWords.add(word);
    }

    protected IPrefixTree getNode(Character ch) {
        return children.get(ch);
    }

    void setNodeAsVisited(){
        isNodeVisited = true;
    }

    void setNodeAsEndOfWord(){
        isNodeEndOfWord = true;
    }

    boolean isNodeVisited() {
        return isNodeVisited;
    }

    boolean isNodeEndOfWord() {
        return isNodeEndOfWord;
    }

    public ArrayList<String> getListOfWholeWords() {

        return listOfWholeWords;
    }

}

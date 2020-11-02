package com.company.prefixtries.mainimplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class PrefixTreeCountingTotalNumberOfWords extends PrefixTree {


    private PrefixTreeCountingTotalNumberOfWords(HashMap<Character, ? extends AbstractPrefixTree> children) {
        super(children, null);
    }

    private PrefixTreeCountingTotalNumberOfWords(HashMap<Character, ? extends AbstractPrefixTree> children, Character character) {
        super(children, character);
    }

    private static PrefixTreeCountingTotalNumberOfWords initializeChildPrefixTreeCountingTotalNumberOfWords(Character character) {
        HashMap<Character, ? extends AbstractPrefixTree> children = new HashMap<>();
        return new PrefixTreeCountingTotalNumberOfWords(children, character);
    }

    public static PrefixTreeCountingTotalNumberOfWords createNewPrefixTreeCountingTotalNumberOfWords() {
        HashMap<Character, ? extends AbstractPrefixTree> children = new HashMap<>();
        return new PrefixTreeCountingTotalNumberOfWords(children, null);
    }

    public int count(){

        AbstractPrefixTree searched = this;
        Queue<AbstractPrefixTree> unvisitedNodes = new LinkedList<>();

        unvisitedNodes.add(searched);
        int numberOfWords = 0;

        while(!unvisitedNodes.isEmpty()){

            for(AbstractPrefixTree child : searched.getChildren().values()){

                if(!unvisitedNodes.contains(child) && !child.isNodeVisited()) {

                    unvisitedNodes.add(child);
                }

                if(child.getListOfWholeWords() != null){
                    numberOfWords += child.getListOfWholeWords().size();
                }
            }

            searched.setNodeAsVisited();
            unvisitedNodes.poll();
            if(!unvisitedNodes.isEmpty()){
                searched = unvisitedNodes.peek();
            }
        }

        return numberOfWords;
    }
}

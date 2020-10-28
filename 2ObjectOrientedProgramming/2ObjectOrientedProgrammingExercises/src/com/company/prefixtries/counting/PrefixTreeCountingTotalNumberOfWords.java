package com.company.prefixtries.counting;

import com.company.prefixtries.AbstractPrefixTree;
import com.company.prefixtries.mainimplementation.PrefixTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class PrefixTreeCountingTotalNumberOfWords extends PrefixTree {

    private static PrefixTreeCountingTotalNumberOfWords initializeChildPrefixTree(Character character) {
        HashMap<Character, ? extends AbstractPrefixTree> children = new HashMap<>();
        return new PrefixTreeCountingTotalNumberOfWords(children, character);
    }

    public static PrefixTreeCountingTotalNumberOfWords createNewPrefixTree() {
        HashMap<Character, ? extends AbstractPrefixTree> children = new HashMap<>();
        return new PrefixTreeCountingTotalNumberOfWords(children, null);
    }

    private PrefixTreeCountingTotalNumberOfWords(HashMap<Character, ? extends AbstractPrefixTree> children) {
        super(children);
    }

    private PrefixTreeCountingTotalNumberOfWords(HashMap<Character, ? extends AbstractPrefixTree> children, Character character) {
        super(children, character);
    }

    public int countWords() {

        return countWords(new ArrayList<>(), new LinkedList<>(), this);
    }

    private int countWords(ArrayList<String> listOfWords, Queue<PrefixTreeCountingTotalNumberOfWords> unvisitedQueue, PrefixTree searched) {

//        if (!searched.isNodeVisited()) {
//            unvisitedQueue.add(this);
//
//            if (this.getListOfWholeWords() != null) {
//                listOfWords.addAll(getListOfWholeWords());
//            }
//            searched.setNodeAsVisited();
//        }

        for (AbstractPrefixTree child : getChildren().values()) {

            PrefixTreeCountingTotalNumberOfWords countingPrefixTree = null;

            if(child instanceof PrefixTree){
                System.out.println("chuj");
                countingPrefixTree = (PrefixTreeCountingTotalNumberOfWords) child;
            }

            if (!unvisitedQueue.contains(countingPrefixTree) && countingPrefixTree != null) {
                    unvisitedQueue.add(countingPrefixTree);


            }
        }


        unvisitedQueue.poll();

        if (!unvisitedQueue.isEmpty()) {
            searched = unvisitedQueue.peek();
            return countWords(listOfWords, unvisitedQueue, searched);
        } else {
            return listOfWords.size();
        }

    }
}

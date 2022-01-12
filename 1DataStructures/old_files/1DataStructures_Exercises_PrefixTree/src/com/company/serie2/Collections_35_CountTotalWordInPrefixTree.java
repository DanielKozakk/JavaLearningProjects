package com.company.serie2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Collections_35_CountTotalWordInPrefixTree  extends Collections_31_PrefixTreeImplementation{

    HashMap<Character, Collections_35_CountTotalWordInPrefixTree> childrenHashMap = new HashMap<>();
    public Character charOfNode;
    boolean isNodeVisited = false;
    boolean isNodeEndOfWord = false;


    Collections_35_CountTotalWordInPrefixTree(Character charOfNode, boolean isCharEndOfNode) {
        this.charOfNode = charOfNode;
        this.isNodeEndOfWord = isCharEndOfNode;
    }



    public Collections_35_CountTotalWordInPrefixTree() {
    }

    private void addChildToChildrenHashMap(Collections_35_CountTotalWordInPrefixTree node) {
        childrenHashMap.put(node.charOfNode , node);
    }

    public void setNodeAsEndOfWord (){
        this.isNodeEndOfWord = true;
    }
    public boolean isNodeEndOfWord (){
        return this.isNodeEndOfWord;
    }

    public void addWord(String string) {
        addWord(string, 0);
    }

    private void addWord(String s, int index) {
        if (s.length() == index) {
            return;
        }
        boolean isCharEndOfWord = s.length() == index +1;
        char ch = s.charAt(index);

        Collections_35_CountTotalWordInPrefixTree child = childrenHashMap.get(ch);

        if (child == null) {

            child = new Collections_35_CountTotalWordInPrefixTree(ch, isCharEndOfWord);
            addChildToChildrenHashMap(child);
        } else if(isNodeEndOfWord) {
            child = new Collections_35_CountTotalWordInPrefixTree(ch, isCharEndOfWord);
            addChildToChildrenHashMap(child);
        }

        child.addWord(s, index + 1);
    }

    public boolean contains(String word) {
        return contains(word, 0);
    }

    private boolean contains(String word, int index) {

        char ch;

        try {
            ch = word.charAt(index);
        } catch (StringIndexOutOfBoundsException e) {
            return false;
        }

        Collections_35_CountTotalWordInPrefixTree child = childrenHashMap.get(ch);

        if(child == null){
            return false;
        } else if(word.length() == index + 1){
            return true;
        } else {
            return child.contains(word, index +1);
        }
    }

    public int countTotalWords(){

        ArrayList<Collections_35_CountTotalWordInPrefixTree> allNodes = new ArrayList<>();
        Queue<Collections_35_CountTotalWordInPrefixTree> unvisitedNodesQueue = new LinkedList<>();

        Collections_35_CountTotalWordInPrefixTree searched = this;

        unvisitedNodesQueue.add(searched);

        while(!unvisitedNodesQueue.isEmpty()){

            for(Character charChild : searched.childrenHashMap.keySet()){
                Collections_35_CountTotalWordInPrefixTree child = searched.childrenHashMap.get(charChild);
                if(!child.isNodeVisited && !unvisitedNodesQueue.contains(child)){
                    unvisitedNodesQueue.add(child);
                    allNodes.add(child);
                }
            }
            unvisitedNodesQueue.poll();
            if(!unvisitedNodesQueue.isEmpty()){
                searched = unvisitedNodesQueue.peek();
            }
        }

        int totalWords = 0;
        for(Collections_35_CountTotalWordInPrefixTree node : allNodes){
            if(node.isNodeEndOfWord()){
                totalWords ++;
            }
        }
        return totalWords;

    }
}

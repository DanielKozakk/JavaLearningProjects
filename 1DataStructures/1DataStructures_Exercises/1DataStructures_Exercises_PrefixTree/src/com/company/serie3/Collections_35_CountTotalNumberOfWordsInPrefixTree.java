package com.company.serie3;


import java.util.*;

public class Collections_35_CountTotalNumberOfWordsInPrefixTree {

        private boolean isNodeEndOfWord = false;

    protected String wholeWord = null;

    public boolean isNodeVisited = false;

    public HashMap<Character, Collections_35_CountTotalNumberOfWordsInPrefixTree> children = new HashMap<>();


    public Collections_35_CountTotalNumberOfWordsInPrefixTree() {
    }

    protected Collections_35_CountTotalNumberOfWordsInPrefixTree(boolean isItEndOfWord) {
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


    public Collections_35_CountTotalNumberOfWordsInPrefixTree getNode(char ch) {
        return children.get(ch);
    }

    public void setNode(char ch, Collections_35_CountTotalNumberOfWordsInPrefixTree node) {

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


        Collections_35_CountTotalNumberOfWordsInPrefixTree child = children.get(ch);

        if (child == null) {
            child = new Collections_35_CountTotalNumberOfWordsInPrefixTree(isItEndOfWord);

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

        Collections_35_CountTotalNumberOfWordsInPrefixTree child = getNode(currentChar);

        if (child == null) {
            return false;
        }


        return child.contains(s, index + 1);

    }

    /*
            Total count of words :

            wholeWrodsArrayList

            Robię kolejeczkę
            Nody dodaje by breadth fierst search do kolejki
            Jeśli node jest końcem słowa to również do arraylisty dodaje, jeśli go tam jeszcze nie ma.

     */

    public void totalCountOfWords() {

        ArrayList<String> wholeWordsList = new ArrayList<>();
        Queue<Collections_35_CountTotalNumberOfWordsInPrefixTree> unvisitedNodes = new LinkedList<>();

        Collections_35_CountTotalNumberOfWordsInPrefixTree searched = this;

        unvisitedNodes.add(searched);

        while (!unvisitedNodes.isEmpty()) {

            for (Character character : searched.children.keySet()) {

                Collections_35_CountTotalNumberOfWordsInPrefixTree child = searched.children.get(character);

                    if (!child.isNodeVisited) {
                        unvisitedNodes.add(child);
                    }

                    if (child.isNodeEndOfWord() && !wholeWordsList.contains(child)) {
                        wholeWordsList.add(child.getWholeWord());
                    }



            }
            searched.setNodeAsVisited();
            unvisitedNodes.poll();
            if(!unvisitedNodes.isEmpty()) searched = unvisitedNodes.peek();
        }

        System.out.println(wholeWordsList.size());

    }




}

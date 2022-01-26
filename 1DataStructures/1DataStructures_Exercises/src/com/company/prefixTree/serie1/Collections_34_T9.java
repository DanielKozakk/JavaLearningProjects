package com.company.prefixTree.serie1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Collections_34_T9 {

    private HashMap<Character, Integer> charToNumberLetter = new HashMap<>();

    public Collections_34_T9() {

        charToNumberLetter.put('a', 2);
        charToNumberLetter.put('b', 2);
        charToNumberLetter.put('c', 2);
        charToNumberLetter.put('d', 3);
        charToNumberLetter.put('e', 3);
        charToNumberLetter.put('f', 3);
        charToNumberLetter.put('g', 4);
        charToNumberLetter.put('h', 4);
        charToNumberLetter.put('i', 4);
        charToNumberLetter.put('j', 5);
        charToNumberLetter.put('k', 5);
        charToNumberLetter.put('l', 5);
        charToNumberLetter.put('m', 6);
        charToNumberLetter.put('n', 6);
        charToNumberLetter.put('o', 6);
        charToNumberLetter.put('p', 7);
        charToNumberLetter.put('q', 7);
        charToNumberLetter.put('r', 7);
        charToNumberLetter.put('s', 7);
        charToNumberLetter.put('t', 8);
        charToNumberLetter.put('u', 8);
        charToNumberLetter.put('v', 8);
        charToNumberLetter.put('w', 9);
        charToNumberLetter.put('x', 9);
        charToNumberLetter.put('y', 9);
        charToNumberLetter.put('z', 9);
    }

    private Node head = new Node(null);

    class Node {

        Integer number;
        List<Node> numericChildren = new ArrayList<>();
        List<String> wordsList = new ArrayList<>();

        public Node(Integer number) {
            this.number = number;
        }

        private void addWordToWordList(String word ){
            wordsList.add(word);
        }

        public Node addChild(Integer number){
            Node child = getChild(number);
            if(child != null){
                return child;
            }  else {
                Node newNode = new Node(number);
                numericChildren.add(newNode);
                return newNode;
            }
        }
        public Node getChild(Integer number){
            Node child = null;
            for (Node node: numericChildren) {
                if(node.getNumber().equals(number)){
                    child = node;
                    break;
                }
            }
            return child;
        }

        public boolean containsWord(String word){
            return wordsList.contains(word);
        }
        public Integer getNumber() {
            return number;
        }
    }

    public void addWord(String word){

        Node searchedNode = head;
        for (int i = 0 ; i < word.length(); i ++){
            char character = word.charAt(i);
            int numberRelatedToChar = charToNumberLetter.get(character);

            searchedNode = searchedNode.addChild(numberRelatedToChar);
            if(i + 1 == word.length()){
                searchedNode.addWordToWordList(word);
            }
        }
    }

    public boolean isWordExist(String word){
        Node searchedNode = head;

        for (int i = 0 ; i < word.length(); i ++){
            char character = word.charAt(i);
            int numberRelatedToChar = charToNumberLetter.get(character);

            Node child = searchedNode.getChild(numberRelatedToChar);

            if(child != null && i + 1 == word.length()){
                return child.containsWord(word);
            } else if(child != null){
                searchedNode = child;
            } else {
                return false;
            }
        }
        return false;
    }

    public List<String> getWordsByNumericInput(String input){
        List<String> result = new ArrayList<>();

        Node searchedNode = head;

        for(int i = 0 ; i < input.length() ; i ++){
            Integer numericValue = Integer.parseInt(String.valueOf(input.charAt(i)));

            Node child = searchedNode.getChild(numericValue);

            if(child != null && i + 1 == input.length()){
                result = child.wordsList;
            } else if(child != null){
                searchedNode = child;
            } else {
                break;
            }
        }
        return result;
    }

}

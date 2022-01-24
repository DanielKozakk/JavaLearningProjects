package com.company.prefixTree.serie1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Collections_31_PrefixTree {

    private Node head = new Node("");

    public Node getHead() {
        return head;
    }

    class Node {

        private boolean endOfWord = false;
        private String letter;
        private List<Node> children = new ArrayList<>();

        Node(String letter) {
            this.letter = letter;
        }

        Node(char letter) {
            this.letter = Character.toString(letter);
        }

        public List<Node> getChildren() {
            return children;
        }

        public String getLetter() {
            return letter;
        }

        public Node getChildWithLetter(char ch) {
            for (Node node : children
            ) {
                if (Objects.equals(node.getLetter(), Character.toString(ch))) {
                    return node;
                }
            }
            return null;
        }

        public void addChildren(Node node) {
            children.add(node);
        }
        public void setAsEndOfWord(){
            this.endOfWord = true;
        }

        public boolean isEndOfWord() {
            return endOfWord;
        }
    }
    public void addWord(String word) {
        Node searchedNode = head;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            Node newNode = new Node(ch);
            searchedNode.addChildren(newNode);
            searchedNode = newNode;

            if(i == word.length() - 1){
                newNode.setAsEndOfWord();
            }
        }
    }
    public boolean contains(String word) {
        Node searchedNode = head;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            searchedNode = searchedNode.getChildWithLetter(ch);
            if (searchedNode == null) {
                return false;
            }
            if(i == word.length() - 1 && !searchedNode.isEndOfWord()){
                return false;
            }
        }
        return true;
    }
}

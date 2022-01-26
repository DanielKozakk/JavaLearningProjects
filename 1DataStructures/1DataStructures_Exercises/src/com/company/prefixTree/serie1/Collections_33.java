package com.company.prefixTree.serie1;

import java.util.*;

public class Collections_33 {

    private Node head = new Node("");

    public Node getHead() {
        return head;
    }

    class Node {

        private boolean endOfWord = false;
        private String letter;
        private List<Node> children = new ArrayList<>();
        private HashMap<String, String> definitions = new HashMap<>();

        Node(String letter) {
            this.letter = letter;
        }

        Node(char letter) {
            this.letter = Character.toString(letter);
        }

        public void addDefinition(String word, String definition) {
            definitions.put(word, definition);
        }

        public String getDefinition(String word) {
            return definitions.get(word);
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

        public void setAsEndOfWord() {
            this.endOfWord = true;
        }

        public boolean isEndOfWord() {
            return endOfWord;
        }
    }

    public void addDefinition(String word, String definition) {

        Node searchedNode = head;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            Node newNode = new Node(ch);
            if(searchedNode.getChildWithLetter(ch) == null) {
                searchedNode.addChildren(newNode);
                searchedNode = newNode;

            } else {
                searchedNode = searchedNode.getChildWithLetter(ch);
            }

            if (i == word.length() - 1) {
                newNode.setAsEndOfWord();
                newNode.addDefinition(word, definition);
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
            if (i == word.length() - 1 && !searchedNode.isEndOfWord()) {
                return false;
            }
        }
        return true;
    }

    public String getDefinition(String word) {
        Node searchedNode = head;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            searchedNode = searchedNode.getChildWithLetter(ch);
            if (searchedNode == null) {
                return null;
            }
            if (i == word.length() - 1 && !searchedNode.isEndOfWord()) {
                return null;
            } else if (i == word.length() - 1 && searchedNode.isEndOfWord()) {
                return searchedNode.getDefinition(word);
            }
        }
        return null;
    }
}

//package com.company.serie1;
//
//public class Collections_33_ImplementDictionaryUsingTrie extends Collections_31_ImplementPrefixTree {
//
//    private String definition;
//    public Collections_33_ImplementDictionaryUsingTrie[] children = new Collections_33_ImplementDictionaryUsingTrie[NUMBER_OF_LETTERS];
//
//    public static int getCharIndex(char ch) {
//        return ch - 'a';
//    }
//
//    public Collections_33_ImplementDictionaryUsingTrie() {
////        super();
//    }
//
//    private Collections_33_ImplementDictionaryUsingTrie(boolean isItEndOfWord) {
//        super(isItEndOfWord);
//    }
//
//    public Collections_33_ImplementDictionaryUsingTrie(boolean isItEndOfWord, String definition) {
//        super(isItEndOfWord);
//        this.definition = definition;
//    }
//
//    public void add(String wordToAdd, String definitionToAdd) {
//        add(wordToAdd, definitionToAdd, 0);
//    }
//
//    private String getDefinition() {
//        return this.definition;
//    }
//
//
//    public String findDefinition(String s) {
//
//        if (isDictionaryContainsWord(s, 0)) {
//            Collections_33_ImplementDictionaryUsingTrie desireableNode = findDefinition(s, 0);
//            return desireableNode.getDefinition();
//        } else {
//            return "There is no such word in dictionary!";
//        }
//
//    }
//
//    protected void changeDefinition(String definition) {
//        this.definition = definition;
//    }
//
//    public void setNode(char ch, Collections_33_ImplementDictionaryUsingTrie node) {
//        children[getCharIndex(ch)] = node;
//    }
//
//    public Collections_33_ImplementDictionaryUsingTrie getNode(char ch) {
//        return children[getCharIndex(ch)];
//    }
//
//    private void add(String wordToAdd, String definitionToAdd, int index) {
////System.out.println(Arrays.toString(children));
//
//        if (wordToAdd.length() == index) {
//            return;
//        }
//        boolean isItEndOfWord = index + 1 == wordToAdd.length();
//
//
//        char ch = wordToAdd.charAt(index);
//        int chIndex = getCharIndex(ch);
//
//
//        Collections_33_ImplementDictionaryUsingTrie child = children[chIndex];
//
//        if (children[chIndex] == null) {
//            if (isItEndOfWord) {
//                child = new Collections_33_ImplementDictionaryUsingTrie(isItEndOfWord, definitionToAdd);
//            } else {
//                child = new Collections_33_ImplementDictionaryUsingTrie(isItEndOfWord);
//            }
//            setNode(ch, child);
//        } else if (isItEndOfWord && children[chIndex] != null) {
//            children[chIndex].setNodeAsEndOfWord();
//            children[chIndex].changeDefinition(definitionToAdd);
//
//        }
//
//        child.add(wordToAdd, definitionToAdd, index + 1);
//
//    }
//
//    public boolean isDictionaryContainsWord(String s) {
//        return isDictionaryContainsWord(s, 0);
//    }
//
//    private boolean isDictionaryContainsWord(String s, int index) {
//
//
//        char currentChar;
//        // Sprawdza czy index nie jest poza scopem string`a
//        try {
//            currentChar = s.charAt(index);
//        } catch (StringIndexOutOfBoundsException e) {
//            return false;
//        }
//
//        // Jeśli index nei jest poza scopem stringa, to sprawdza, czy taki node istnieje.
//        Collections_33_ImplementDictionaryUsingTrie child = getNode(currentChar);
//        if (child == null) {
//            return false;
//        }
//
//        if (s.length() == index + 1) {
//
//            if (child.isNodeEndOfWord()) {
//                return true;
//            } else {
//                return false;
//            }
//        } else {
//            return child.isDictionaryContainsWord(s, index + 1);
//        }
//    }
//
//    private Collections_33_ImplementDictionaryUsingTrie findDefinition(String s, int index) {
//
//        char currentChar = s.charAt(index);
//        Collections_33_ImplementDictionaryUsingTrie child = getNode(currentChar);
//        if (s.length() - 1 == index) {
//            return getNode(currentChar);
//        } else {
//            return child.findDefinition(s, index + 1);
//        }
//
//    }
//
//}

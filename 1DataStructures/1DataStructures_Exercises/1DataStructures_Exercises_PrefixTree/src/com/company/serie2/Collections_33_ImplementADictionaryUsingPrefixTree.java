package com.company.serie2;



public class Collections_33_ImplementADictionaryUsingPrefixTree {

    public static int NUMBER_OF_LETTERS = 26;
    public static int getCharIndex(char ch) {
        return ch - 'a';
    }

    private boolean isNodeEndOfWord = false;
    public boolean isNodeVisited = false;
    String definition = null;

    public Collections_33_ImplementADictionaryUsingPrefixTree[] children = new Collections_33_ImplementADictionaryUsingPrefixTree[NUMBER_OF_LETTERS];


    public Collections_33_ImplementADictionaryUsingPrefixTree(){}
    public Collections_33_ImplementADictionaryUsingPrefixTree(boolean isItEndOfWord) {
        this.isNodeEndOfWord = isItEndOfWord;
    }
    public Collections_33_ImplementADictionaryUsingPrefixTree(boolean isItEndOfWord, String definition) {
        this.isNodeEndOfWord = isItEndOfWord;
        this.definition = definition;
    }


    private void setDefinition(String def){
        this.definition = def;
    }
    private String getDefinition (){
        return this.definition;
    }

    public void setNodeAsEndOfWord (){
        isNodeEndOfWord = true;
    }

    public boolean isNodeEndOfWord(){
        return this.isNodeEndOfWord;
    }

    public void setNodeAsVisited() {
        this.isNodeVisited = true;
    }


    private Collections_33_ImplementADictionaryUsingPrefixTree getNode(char ch) {
        return children[getCharIndex(ch)];
    }

    public void setNode(char ch, Collections_33_ImplementADictionaryUsingPrefixTree node) {
        children[getCharIndex(ch)] = node;
    }

    public void add(String word, String definition) {
        add(word, 0, definition);
    }

    private void add(String string, int index, String definition) {

        if (string.length() == index) {
            return;
        }
        boolean isItEndOfWord = index + 1 == string.length();


        char ch = string.charAt(index);
        int chIndex = getCharIndex(ch);

        Collections_33_ImplementADictionaryUsingPrefixTree child = children[chIndex];

        if (child == null) {
            if(isItEndOfWord) {
                child = new Collections_33_ImplementADictionaryUsingPrefixTree(isItEndOfWord, definition);
            } else {
                child = new Collections_33_ImplementADictionaryUsingPrefixTree(isItEndOfWord);
            }
            setNode(ch, child);
        } else if (isItEndOfWord ) {
            child.setNodeAsEndOfWord();
            child.setDefinition(definition);
        }

        child.add(string, index + 1, definition);

    }

    public String getDefinitionOfWord (String word){
        if(contains(word)){
            return getDefinitionOfWord(word, 0);
        } else {
            return null;
        }
    }

    private String getDefinitionOfWord(String word, int index){
        char ch = word.charAt(index);
        Collections_33_ImplementADictionaryUsingPrefixTree child = getNode(ch);
        if(child.isNodeEndOfWord && word.length() == index +1){

            return child.getDefinition();

        } else {
           return child.getDefinitionOfWord(word, index +1);
        }
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

        Collections_33_ImplementADictionaryUsingPrefixTree child = getNode(currentChar);

        if (child == null) {
            return false;
        }
        return child.contains(s, index + 1);

    }


}

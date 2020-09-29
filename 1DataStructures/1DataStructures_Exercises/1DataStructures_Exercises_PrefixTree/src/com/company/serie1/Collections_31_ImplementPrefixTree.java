package com.company.serie1;

public class Collections_31_ImplementPrefixTree {

    public static int NUMBER_OF_LETTERS = 26;
    public static Collections_31_ImplementPrefixTree [] children = new Collections_31_ImplementPrefixTree[NUMBER_OF_LETTERS];
    public static int getCharIndex (char ch) {
        return ch - 'a';
    }

    public Collections_31_ImplementPrefixTree(){
    }

    public Collections_31_ImplementPrefixTree(boolean isItEndOfWord){
        this.isNodeEndOfWord = isItEndOfWord;
    }

    public boolean isNodeEndOfWord = false;
    public int size;

    public Collections_31_ImplementPrefixTree getNode (char ch){
        return children[getCharIndex(ch)];
    }

    public void setNode (char ch, Collections_31_ImplementPrefixTree node){
        children[getCharIndex(ch)] = node;
    }

    public void add(String string){
        add(string, 0);
    }


    private void add(String string, int index){

        if(string.length() == index){
            return;
        }
        boolean isItEndOfWord  = index + 1 == string.length();


        char ch = string.charAt(index);
        int chIndex = getCharIndex(ch);

        Collections_31_ImplementPrefixTree child = children[chIndex];

        if(children[chIndex] == null){
            child = new Collections_31_ImplementPrefixTree(isItEndOfWord);
            setNode(ch, child);
        }


        child.add(string, index + 1);

    }



}

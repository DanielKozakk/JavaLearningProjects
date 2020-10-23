package com.company.serie4;

import java.util.ArrayList;
import java.util.HashMap;

public class Serie4_Col31_PrefixTree {

    /*



        zmienna oznaczająca dzieci V
        funkcja do dodawania dzieci V
        zmienna oznaczjaąca czy node jest visited V

        zmienna oznaczająca czy node jest końcem słowa V
        zmienna zawierająca całe słowa V

    */

    /*
        Konstruktor :

        Pierwszy konstruktor pusty do inicjalizacji V
        Drugi konstruktor uzupełnia isNodeEndOfWord V


*/
    private HashMap<Character, Serie4_Col31_PrefixTree> children = new HashMap<>();
    private boolean isNodeEndOfWord = false;
    private ArrayList<String> wholeWords = null;
    private boolean isNodeVisited = false;



    public Serie4_Col31_PrefixTree() {
    }

    private Serie4_Col31_PrefixTree(String wordToAdd) {
        if (wholeWords == null) {
            wholeWords = new ArrayList<>();
        }
        wholeWords.add(wordToAdd);
        isNodeEndOfWord = true;
    }

    private void addWholeWords(String wordToAdd) {
        if (wholeWords == null) {
            wholeWords = new ArrayList<String>();
        }
        wholeWords.add(wordToAdd);
        isNodeEndOfWord = true;
    }
    /*

            Funkcja do dodawania dzieci :
            sprawdza czy dana litera już istnieje
            jeśli tak i dziecko ma być końcem słowa, to dodaję nowe wholeWords
            jeśli nie to tworzy nowe dziecko

     */

    private void addChildToHashMapChildren(Character ch) {
        if (!children.containsKey(ch)) {
            children.put(ch, new Serie4_Col31_PrefixTree());
        }
    }

    private void addChildToHashMapChildren(Character ch, String wordToAttach) {
        Serie4_Col31_PrefixTree child = children.get(ch);
        if (child == null) {
            children.put(ch, new Serie4_Col31_PrefixTree(wordToAttach));
        } else {
            child.addWholeWords(wordToAttach);
        }

    }





    private boolean isNodeVisited() {
        return isNodeVisited;
    }

    private void setNodeVisited(boolean nodeVisited) {
        isNodeVisited = nodeVisited;
    }

    private boolean isNodeEndOfWord() {
        return isNodeEndOfWord;
    }

    private void setNodeEndOfWord(boolean nodeEndOfWord) {
        isNodeEndOfWord = nodeEndOfWord;
    }

    private ArrayList<String> getWholeWords() {
        return wholeWords;
    }

    /*
             Wish list :

            Funkcja do dodawania słów :

                robię function overloading

                    jedna funkcja będzie iteracyjna biorąca całe słowo do dodania, index




     */

    public void addWord(String s){
        addWord(s, 0);
    }

    private void addWord(String s, int index){

        Character ch = s.charAt(index);

        if(s.length() == index + 1){
            addChildToHashMapChildren(ch, s);
            return;
        } else {
            addChildToHashMapChildren(ch);
        }
        Serie4_Col31_PrefixTree child = children.get(ch);
        child.addWord(s, index + 1);
    }

    /*
                funkcja do contains :


     */

    public boolean contains(String s){
        return contains(s, 0);
    }
    private boolean contains(String s , int index){

        if(s.length() == index) return false;

        Character ch = s.charAt(index);
        Serie4_Col31_PrefixTree child = children.get(ch);

        if(child == null){
            return false;
        } else {
            if(child.isNodeEndOfWord()){
                boolean childCOntainsSearchedWord = false;
                for(String word : child.getWholeWords()){
                    if(word.equals(s)){
                        childCOntainsSearchedWord = true;
                        break;
                    }
                }
                return childCOntainsSearchedWord;
            } else {
                return child.contains(s, index + 1 );
            }
        }
    }

}

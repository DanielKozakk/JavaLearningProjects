package com.company.serie1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Collections_34_BuildT9Dictionary {

    /*
        1. Używam numerów do reprezentowania naciśnięć klawiszy w słowniku od 2 do 9.

        2. Signature:
        String -> String
        albo
        Integer -> String

        Purpose Statement:

        To imitacja słownika w starym telefonie komórkowym, każdemu przyciskowi z przypisanym jedną cyfrą odpowiada 3 lub 4 litery.
        Wybierając 326435 otrzymam imię Daniel

        Header :

        input : 326435
        output : "Daniel"

        input : 87296454
        output : trawniki

        public String searchWord(String input){
            ...
            return output
        }

        4.

        Wish list :

            - Wyższa warstwa abstrakcji odpowiadająca klawiszom
            - Niższa warstwa abstrakcji odpowiadająca literom przypisanym do klawiszy

            - funkcje do dodawania wyrazów do słownika
                - zmiana liter na cyfry

            - funkcja odczytywania wyrazów ze słownika


        5.
        Code !

     */

    private static final HashMap<Character, Integer> characterToKeyNumberMap = new HashMap<>();
    private static final HashMap<Integer, ArrayList<Character>> keyNumberToCharactersListMap = new HashMap<>();
    private static final HashMap<Integer, Integer> keyNumberToChildrenIndexMap = new HashMap<>();

    static {
        characterToKeyNumberMap.put('a', 2);
        characterToKeyNumberMap.put('b', 2);
        characterToKeyNumberMap.put('c', 2);
        characterToKeyNumberMap.put('d', 3);
        characterToKeyNumberMap.put('e', 3);
        characterToKeyNumberMap.put('f', 3);
        characterToKeyNumberMap.put('g', 4);
        characterToKeyNumberMap.put('h', 4);
        characterToKeyNumberMap.put('i', 4);
        characterToKeyNumberMap.put('j', 5);
        characterToKeyNumberMap.put('k', 5);
        characterToKeyNumberMap.put('l', 5);
        characterToKeyNumberMap.put('m', 6);
        characterToKeyNumberMap.put('n', 6);
        characterToKeyNumberMap.put('o', 6);
        characterToKeyNumberMap.put('p', 7);
        characterToKeyNumberMap.put('q', 7);
        characterToKeyNumberMap.put('r', 7);
        characterToKeyNumberMap.put('s', 7);
        characterToKeyNumberMap.put('t', 8);
        characterToKeyNumberMap.put('u', 8);
        characterToKeyNumberMap.put('v', 8);
        characterToKeyNumberMap.put('w', 9);
        characterToKeyNumberMap.put('x', 9);
        characterToKeyNumberMap.put('y', 9);
        characterToKeyNumberMap.put('z', 9);

        keyNumberToCharactersListMap.put(2, new ArrayList<>() {

            {
                add('a');
                add('b');
                add('c');
            }
        });
        keyNumberToCharactersListMap.put(3, new ArrayList<>() {

            {
                add('d');
                add('e');
                add('f');
            }
        });
        keyNumberToCharactersListMap.put(4, new ArrayList<>() {

            {
                add('g');
                add('h');
                add('i');
            }
        });
        keyNumberToCharactersListMap.put(5, new ArrayList<>() {

            {
                add('j');
                add('k');
                add('l');
            }
        });
        keyNumberToCharactersListMap.put(6, new ArrayList<>() {

            {
                add('m');
                add('n');
                add('o');
            }
        });
        keyNumberToCharactersListMap.put(7, new ArrayList<>() {

            {
                add('p');
                add('q');
                add('r');
                add('s');
            }
        });
        keyNumberToCharactersListMap.put(8, new ArrayList<>() {

            {
                add('t');
                add('u');
                add('v');
            }
        });
        keyNumberToCharactersListMap.put(9, new ArrayList<>() {

            {
                add('w');
                add('x');
                add('y');
                add('z');
            }
        });

        // first is the key, second is the index
        keyNumberToChildrenIndexMap.put(2, 0);
        keyNumberToChildrenIndexMap.put(3, 1);
        keyNumberToChildrenIndexMap.put(4, 2);
        keyNumberToChildrenIndexMap.put(5, 3);
        keyNumberToChildrenIndexMap.put(6, 4);
        keyNumberToChildrenIndexMap.put(7, 5);
        keyNumberToChildrenIndexMap.put(8, 6);
        keyNumberToChildrenIndexMap.put(9, 7);
    }

    public static Integer turnCharacterToKeyNumber(char ch) {
        return characterToKeyNumberMap.get(ch);
    }

    public static List<Character> turnKeyNumberToCharactersList(Integer keyNumber) {
        return keyNumberToCharactersListMap.get(keyNumber);
    }

    public static int turnKeyNumberToChildrenIndexMap(Integer keyNumber) {
        return keyNumberToChildrenIndexMap.get(keyNumber);
    }

    private final static int NUMBER_OF_KEYS = 8;

    private Collections_34_BuildT9Dictionary[] children = new Collections_34_BuildT9Dictionary[NUMBER_OF_KEYS];

    private Integer keyNumber = null;
    private ArrayList<Letter> lettersList = new ArrayList<>();

    public Collections_34_BuildT9Dictionary() {
    }

    public Collections_34_BuildT9Dictionary(Character character) {
        this.keyNumber = turnCharacterToKeyNumber(character);
        addLetterToLettersList(new Letter(character));
    }


    private Integer getKeyNumber() {
        return this.keyNumber;
    }

    private Collections_34_BuildT9Dictionary getChildByLetter(char ch) {
        Integer keyNumber = turnCharacterToKeyNumber(ch);
        int indexInArray = turnKeyNumberToChildrenIndexMap(keyNumber);
        return children[indexInArray];
    }

    private void setChild(Collections_34_BuildT9Dictionary newKey) {

        children[turnKeyNumberToChildrenIndexMap(newKey.getKeyNumber())] = newKey;
    }

    private void addLetterToLettersList(Letter letter) {
        if (!this.lettersList.contains(letter)) {
            this.lettersList.add(letter);
        }
    }
    private boolean checkIfCharacterIsEndOfWord(Character character){

        boolean isLetterEndOfWord = false;
        for(Letter letterToCheck : lettersList){
            if(letterToCheck.letter == character){
                isLetterEndOfWord = letterToCheck.isLetterEndOfWord;
            }
        }
        return isLetterEndOfWord;
    }

    public void addWordToDictionary(String s) {
        addWordToDictionary(s, 0);
    }

    private void addWordToDictionary(String s, int index) {
        if (s.length() == index) return;

        boolean isCharacterEndOfWord = s.length() - 1 == index;

        Character ch = s.charAt(index);
        Collections_34_BuildT9Dictionary child = this.getChildByLetter(ch);
        if (child == null) {
            child = new Collections_34_BuildT9Dictionary(ch);
            this.setChild(child);
        }

        child.addLetterToLettersList(new Letter(ch, isCharacterEndOfWord));

        child.addWordToDictionary(s, index + 1);
    }

    public boolean isDictionaryContainsAWord(String s) {
        return isDictionaryContainsAWord(s, 0, false);
    }

    private boolean isDictionaryContainsAWord(String s, int index, boolean isCharacterEndOfWord) {

        if(s.length() == index && isCharacterEndOfWord){
            return true;
        }

        Character ch;
        Collections_34_BuildT9Dictionary child;

        try {
            ch = s.charAt(index);
            child = this.getChildByLetter(ch);
        } catch (StringIndexOutOfBoundsException e) {
            return false;
        }
        if (child == null) {
            return false;
        } else {

            return child.isDictionaryContainsAWord(s, index + 1, child.checkIfCharacterIsEndOfWord(ch));
        }

    }

    private class Letter {
        boolean isLetterEndOfWord = false;
        Character letter;

        Letter(Character letter) {
            this.letter = letter;
        }

        Letter(Character letter, boolean isLetterEndOfWord) {
            this.letter = letter;
            this.isLetterEndOfWord = isLetterEndOfWord;
        }
    }

}

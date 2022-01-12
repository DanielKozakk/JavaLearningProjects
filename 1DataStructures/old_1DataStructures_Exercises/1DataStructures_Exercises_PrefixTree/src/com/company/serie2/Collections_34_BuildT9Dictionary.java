package com.company.serie2;

import java.util.ArrayList;
import java.util.HashMap;

public class Collections_34_BuildT9Dictionary {

    /*
       Collections_34_BuildT9 zawiera listę numerów, które sa przypisane
       Do każdego numeru jest dodana lista letterów,
       każdy letter zawiera literę, flagę czy jest końcem słowa, definicję

       Jeśli użytkownik doda słowo : dupa


       1. musi nastąpić konwersja na liczby - 3872 - DONE
       2. Do każdej liczby musi być dodana konkretna litera - DONE
       3. do końcowej litery musi być dodany cały wyraz - DONE

       Użytkownik wpisuje np. 55272 - chce uzyskać rezultaty
       1. Sprawdzam litery z tych cyfr
       2. Robię jakiś mechanizm, który mi wypisze wszystkie możliwe kombinacje
       3. Na przykład klasa, klapa, klara
     */
    public static HashMap<Character, Integer> charToNumberKeyMap;

    static {
        charToNumberKeyMap = new HashMap<>();
        charToNumberKeyMap.put('a', 2);
        charToNumberKeyMap.put('b', 2);
        charToNumberKeyMap.put('c', 2);

        charToNumberKeyMap.put('d', 3);
        charToNumberKeyMap.put('e', 3);
        charToNumberKeyMap.put('f', 3);

        charToNumberKeyMap.put('g', 4);
        charToNumberKeyMap.put('h', 4);
        charToNumberKeyMap.put('i', 4);

        charToNumberKeyMap.put('j', 5);
        charToNumberKeyMap.put('k', 5);
        charToNumberKeyMap.put('l', 5);

        charToNumberKeyMap.put('m', 6);
        charToNumberKeyMap.put('n', 6);
        charToNumberKeyMap.put('o', 6);

        charToNumberKeyMap.put('p', 7);
        charToNumberKeyMap.put('q', 7);
        charToNumberKeyMap.put('r', 7);
        charToNumberKeyMap.put('s', 7);

        charToNumberKeyMap.put('t', 8);
        charToNumberKeyMap.put('u', 8);
        charToNumberKeyMap.put('v', 8);

        charToNumberKeyMap.put('w', 9);
        charToNumberKeyMap.put('x', 9);
        charToNumberKeyMap.put('y', 9);
        charToNumberKeyMap.put('z', 9);
    }

    Integer number;
    HashMap<Character, Letter> listOfLetters = new HashMap<Character, Letter>();
    HashMap<Integer, Collections_34_BuildT9Dictionary> numberChildren = new HashMap<>();

    public Collections_34_BuildT9Dictionary() {
    }

    Collections_34_BuildT9Dictionary(Integer number) {
        this.number = number;
    }

    public ArrayList<String> getWords(String numberString) {
        return getWords(numberString, 0, new ArrayList<>());
    }

    private ArrayList<String> getWords(String numberString, int index, ArrayList<String> listOfWholeWords) {

        int number = Character.getNumericValue(numberString.charAt(index));

        Collections_34_BuildT9Dictionary child = this.numberChildren.get(number);
        if (child == null) {
            return new ArrayList<String>();
        }


        if (numberString.length() == index + 1) {

            for (Character character : child.listOfLetters.keySet()) {
                Letter letter = child.listOfLetters.get(character);
                if (letter.isLetterEndOfWord) {

                    for (String wholeWord : letter.wholeWordsList) {
                        listOfWholeWords.add(wholeWord);
                    }

                }
            }

            return listOfWholeWords;
        } else {
            return child.getWords(numberString, index + 1, listOfWholeWords);
        }
    }

    public void addWord(String string) {
        addWord(string, 0);
    }

    private void addWord(String word, Integer index) {

        if (word.length() == index) {
            return;
        }

        char character = word.charAt(index);
        Integer keyNumber = charToNumberKeyMap.get(character);

        Collections_34_BuildT9Dictionary childNumber = this.numberChildren.get(keyNumber);
        if (childNumber == null) {
            childNumber = new Collections_34_BuildT9Dictionary(keyNumber);

            this.numberChildren.put(keyNumber, childNumber);

        }

        if (word.length() - 1 == index) {
            childNumber.updateListOfLetters(character, word);
        } else {
            childNumber.updateListOfLetters(character, null);

        }
        childNumber.addWord(word, index + 1);
    }


    private void updateListOfLetters(Character character, String wholeWord) {

        Letter child = listOfLetters.get(character);
        if (child == null) {

            child = new Letter(character, wholeWord);

            if (wholeWord != null) {
                child.setAsEndOfWord();
            }

            listOfLetters.put(character, child);
        } else if (wholeWord != null) {
            child.setAsEndOfWord();
            child.addWholeWord(wholeWord);
        }
    }

    class Letter {

        Character character;
        Boolean isLetterEndOfWord = false;
        ArrayList<String> wholeWordsList = new ArrayList<>();

        Letter(Character character) {
            this.character = character;
        }

        Letter(Character character, String wholeWord) {
            this.character = character;
            if (wholeWord != null) {
                this.wholeWordsList.add(wholeWord);
            }
        }

        public void setAsEndOfWord() {
            this.isLetterEndOfWord = true;
        }

        public void addWholeWord(String def) {
            wholeWordsList.add(def);
        }

        public Character getCharacter() {
            return this.character;
        }
    }
}

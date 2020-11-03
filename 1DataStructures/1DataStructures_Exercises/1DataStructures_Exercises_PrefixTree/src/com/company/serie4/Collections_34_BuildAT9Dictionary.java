package com.company.serie4;

import java.util.*;

public class Collections_34_BuildAT9Dictionary {

    public static HashMap<Character, Integer> letterToNumberMap = new HashMap<>();
    public static HashMap<Integer, List<Character>> numberToLetterMap = new HashMap<>();

    static {
        letterToNumberMap.put('a', 2);
        letterToNumberMap.put('b', 2);
        letterToNumberMap.put('c', 2);

        letterToNumberMap.put('d', 3);
        letterToNumberMap.put('e', 3);
        letterToNumberMap.put('f', 3);

        letterToNumberMap.put('g', 4);
        letterToNumberMap.put('h', 4);
        letterToNumberMap.put('i', 4);

        letterToNumberMap.put('j', 5);
        letterToNumberMap.put('k', 5);
        letterToNumberMap.put('l', 5);

        letterToNumberMap.put('m', 6);
        letterToNumberMap.put('n', 6);
        letterToNumberMap.put('o', 6);

        letterToNumberMap.put('p', 7);
        letterToNumberMap.put('q', 7);
        letterToNumberMap.put('r', 7);
        letterToNumberMap.put('s', 7);

        letterToNumberMap.put('t', 8);
        letterToNumberMap.put('u', 8);
        letterToNumberMap.put('v', 8);

        letterToNumberMap.put('w', 9);
        letterToNumberMap.put('x', 9);
        letterToNumberMap.put('y', 9);
        letterToNumberMap.put('z', 9);


    }

    static {

        List<Character> secondArrayList = new ArrayList<>();
        secondArrayList.add('a');
        secondArrayList.add('b');
        secondArrayList.add('c');
        numberToLetterMap.put(2, secondArrayList);

        List<Character> thirdArrayList = new ArrayList<>();
        thirdArrayList.add('d');
        thirdArrayList.add('e');
        thirdArrayList.add('f');
        numberToLetterMap.put(3, thirdArrayList);

        List<Character> forthArrayList = new ArrayList<>();
        forthArrayList.add('g');
        forthArrayList.add('h');
        forthArrayList.add('i');
        numberToLetterMap.put(4, forthArrayList);

        List<Character> fifthArrayList = new ArrayList<>();
        fifthArrayList.add('j');
        fifthArrayList.add('k');
        fifthArrayList.add('l');
        numberToLetterMap.put(5, fifthArrayList);

        List<Character> sixthArrayList = new ArrayList<>();
        sixthArrayList.add('m');
        sixthArrayList.add('n');
        sixthArrayList.add('o');
        numberToLetterMap.put(6, sixthArrayList);

        List<Character> seventhArrayList = new ArrayList<>();
        seventhArrayList.add('p');
        seventhArrayList.add('q');
        seventhArrayList.add('r');
        seventhArrayList.add('s');
        numberToLetterMap.put(7, seventhArrayList);

        List<Character> eighthArrayList = new ArrayList<>();
        eighthArrayList.add('t');
        eighthArrayList.add('u');
        eighthArrayList.add('v');
        numberToLetterMap.put(8, eighthArrayList);

        List<Character> ninthArrayList = new ArrayList<>();
        ninthArrayList.add('w');
        ninthArrayList.add('x');
        ninthArrayList.add('y');
        ninthArrayList.add('z');
        numberToLetterMap.put(9, ninthArrayList);

    }

    Integer numberOfField;


    HashMap<Integer, Collections_34_BuildAT9Dictionary> numberChildren = new HashMap<>();
    List<Letter> arrayOfLetters = new ArrayList<>();

    private Collections_34_BuildAT9Dictionary(Integer numberOfField) {

        this.numberOfField = numberOfField;
    }

    public Collections_34_BuildAT9Dictionary() {
    }

    public void add(String word) {
        add(word, 0);
    }

    private void add(String word, int index) {

        if (index == word.length()) {
            return;
        }
        Character ch = word.charAt(index);

        Collections_34_BuildAT9Dictionary searchedChild = numberChildren.get(letterToNumberMap.get(ch));

        if (searchedChild == null) {
            searchedChild = new Collections_34_BuildAT9Dictionary(letterToNumberMap.get(ch));
            numberChildren.put(letterToNumberMap.get(ch), searchedChild);
        }


        Letter letterChild = null;

        for (Letter letter : searchedChild.arrayOfLetters) {
            if (letter.getCharacter() == ch) {
                letterChild = letter;
                break;
            }
        }

        if (letterChild == null) {
            letterChild = new Letter(ch);
            searchedChild.arrayOfLetters.add(letterChild);
        }

        if (index + 1 == word.length()) {
            letterChild.setLetterAsEndOfWord();
            letterChild.addWholeWord(word);
        }


        searchedChild.add(word, index + 1);

    }

    public Set<String> searchWord(String numbers){
        return searchWord(numbers, 0);
    }

    private Set<String> searchWord(String numbers, int index){

        if(numbers.length() == index){
            return null;
        }

        Integer number = Character.getNumericValue(numbers.charAt(index));

        Collections_34_BuildAT9Dictionary child = numberChildren.get(number);
        if(child == null){
            return null;
        } else if(numbers.length() == index + 1){
            HashSet<String> wordsFromLetters = new HashSet<>();
            for(Letter letter: child.arrayOfLetters){
                if(letter.getListOfWholeWords() != null){
                    wordsFromLetters.addAll(letter.getListOfWholeWords());
                }
            }

            for(String word : wordsFromLetters){
                System.out.println(word);
            }
            return wordsFromLetters;
        } else {
            return child.searchWord(numbers, index + 1 );
        }
    }


    private class Letter {
        public Character getCharacter() {
            return character;
        }

        Character character;

        boolean isLetterEndOfWord;
        ArrayList<String> listOfWholeWords;

        public boolean isLetterEndOfWord() {
            return isLetterEndOfWord;
        }

        public void setLetterAsEndOfWord() {
            isLetterEndOfWord = true;
        }

        public ArrayList<String> getListOfWholeWords() {
            return listOfWholeWords;
        }

        public void addWholeWord(String word) {

            if (listOfWholeWords == null) {
                listOfWholeWords = new ArrayList<>();
            }

            listOfWholeWords.add(word);
        }

        Letter(Character character) {

            this.character = character;
        }

    }

}

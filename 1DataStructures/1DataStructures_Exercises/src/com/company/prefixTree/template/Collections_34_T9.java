package com.company.prefixTree.template;

import java.util.HashMap;

public class Collections_34_T9 {

    private HashMap<Integer, Character[]> numberToCharMap = new HashMap<>();
    private HashMap<Character, Integer> charToNumberLetter = new HashMap<>();

    Collections_34_T9(){
        Character[] two = {'a', 'b', 'c'};
        Character[] three = {'d', 'e', 'f'};
        Character[] four = {'g', 'h', 'i'};
        Character[] five = {'j', 'k', 'l'};
        Character[] six = {'m', 'n', 'o'};
        Character[] seven = {'p', 'q', 'r', 's'};
        Character[] eight = {'t', 'u', 'v'};
        Character[] nine = {'w', 'x', 'y', 'z'};

        numberToCharMap.put(2, two);
        numberToCharMap.put(3, three );
        numberToCharMap.put(4, four );
        numberToCharMap.put(5, five);
        numberToCharMap.put(6, six);
        numberToCharMap.put(7, seven);
        numberToCharMap.put(8, eight);
        numberToCharMap.put(9, nine);

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

    public void addWord(String word){

    }

    public boolean contains(String word){
        return false;
    }

    public String getWordByNumericInput(String input){
        return "";
    }


}

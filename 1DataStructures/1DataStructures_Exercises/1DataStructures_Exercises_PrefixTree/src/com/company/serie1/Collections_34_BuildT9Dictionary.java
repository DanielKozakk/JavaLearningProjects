package com.company.serie1;

import java.lang.reflect.Array;
import java.util.ArrayList;

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

            - Wyższa warstwa abstrakcji odpowiadająca klawiszom - done
            - Niższa warstwa abstrakcji odpowiadająca literom przypisanym do klawiszy - done

            - funkcje do dodawania wyrazów do słownika
                - zmiana liter na cyfry

            - funkcja odczytywania wyrazów ze słownika


        5.
        Code !

     */

    public static final int NUMBER_OF_KEYS = 8;

    public static Key[] keyList = new Key[8];

    public Collections_34_BuildT9Dictionary() {

        initializeKeys();
    }

    public static int getCharIndex(char ch) {
        return ch;
    }


    public void addWord(String s) {

//        for(int i = 0 ; i < s.length(); i++){
//
//        }


    }

    public Integer turnCharacterToKey(char ch) {
        for (Key key : keyList) {
            if (key.lettersList.contains(new Letter(ch))) {
                System.out.println("contains!" + key.getKeyNumber());
            }
        }
        return 2;
    }


    class Key {
        private Integer keyNumber;
        private ArrayList<Letter> lettersList;

        private ArrayList<Key> children = new ArrayList<>();

        public Key(Integer key, ArrayList<Letter> lettersList) {
            this.keyNumber = key;
            this.lettersList = lettersList;
        }

        public Integer getKeyNumber() {
            return this.keyNumber;
        }
        public ArrayList<Letter> getArrayList (){
            return this.lettersList;
        }
        public ArrayList<Key> getChildren (){
            return this.children;
        }
    }

    class Letter {
        String letter;

        public Letter(char letter) {
            this.letter = String.valueOf(letter);
        }
    }

    private void initializeKeys() {
        ArrayList<Letter> two = new ArrayList<Letter>() {
            {
                add(new Letter('a'));
                add(new Letter('b'));
                add(new Letter('c'));

            }
        };
        ArrayList<Letter> three = new ArrayList<Letter>() {
            {
                add(new Letter('d'));
                add(new Letter('e'));
                add(new Letter('f'));

            }
        };
        ArrayList<Letter> four = new ArrayList<Letter>() {
            {
                add(new Letter('g'));
                add(new Letter('h'));
                add(new Letter('i'));

            }
        };
        ArrayList<Letter> five = new ArrayList<Letter>() {
            {
                add(new Letter('j'));
                add(new Letter('k'));
                add(new Letter('l'));

            }
        };
        ArrayList<Letter> six = new ArrayList<Letter>() {
            {
                add(new Letter('m'));
                add(new Letter('n'));
                add(new Letter('o'));

            }
        };
        ArrayList<Letter> seven = new ArrayList<Letter>() {
            {
                add(new Letter('p'));
                add(new Letter('q'));
                add(new Letter('r'));
                add(new Letter('s'));

            }
        };
        ArrayList<Letter> eight = new ArrayList<Letter>() {
            {
                add(new Letter('t'));
                add(new Letter('u'));
                add(new Letter('v'));

            }
        };
        ArrayList<Letter> nine = new ArrayList<Letter>() {
            {
                add(new Letter('w'));
                add(new Letter('x'));
                add(new Letter('y'));
                add(new Letter('z'));

            }
        };

        keyList[0] = new Key(2, two);
        keyList[1] = new Key(3, three);
        keyList[2] = new Key(4, four);
        keyList[3] = new Key(5, five);
        keyList[4] = new Key(6, six);
        keyList[5] = new Key(7, seven);
        keyList[6] = new Key(8, eight);
        keyList[7] = new Key(9, nine);

    }


}

package com.my.exercises;

public class VarArgs {

    public static int sumVarArgsInts (int...args){
        int wynik = 0;

        for (int arg : args) {
            wynik += arg;
        }
        return  wynik;
    }

}

package com.company;

import com.company.sumazrekurencja.Rekurencja;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        var input = new ArrayList<Integer>();
        input.add(2);
        input.add(3);
        input.add(22);
        input.add(22222);
        input.add(22);

        System.out.println(Rekurencja.highestNumber(input));

    }
}

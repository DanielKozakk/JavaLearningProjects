package com.company;

import com.company.sumazrekurencja.Rekurencja;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> listToSorting = new ArrayList<>();
        listToSorting.add(2);
        listToSorting.add(25);
        listToSorting.add(1);
        listToSorting.add(100);
        listToSorting.add(59);
        listToSorting.add(6);
        listToSorting.add(4);
        listToSorting.add(120);
        listToSorting.add(-1);

        var lista = Rekurencja.quickSort(listToSorting);
        System.out.println(lista);

    }
}

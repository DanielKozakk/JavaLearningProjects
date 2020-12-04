package com.company;

import com.company.sumazrekurencja.Rekurencja;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


        Map<String, Integer> hm = new HashMap<>();

        hm.put("Radiohead", 156);
        hm.put("Kishore Kumar", 141);
        hm.put("The Black Keys", 35);
        hm.put("Neutral Milk Hotel", 94);
        hm.put("Beck", 88);
        hm.put("The Strokes", 61);
        hm.put("Wilko",111);

    }
}

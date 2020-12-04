package com.company;

import com.company.serie1.Algorithms_1_BinarySearch;
import com.company.serie1.Algorithms_2_SelectionSort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();

        hm.put("Radiohead", 156);
        hm.put("Kishore Kumar", 141);
        hm.put("The Black Keys", 35);
        hm.put("Neutral Milk Hotel", 94);
        hm.put("Beck", 88);
        hm.put("The Strokes", 61);
        hm.put("Wilko",111);

        List<String> sorted = Algorithms_2_SelectionSort.selectionSort(hm);

        for(String name : sorted){

            System.out.println(name);
        }

    }


}

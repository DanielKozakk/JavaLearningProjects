package com.company.serie3;

import java.util.*;

public class Algorithms_2 {

/*

Map<String, Integer> hm = new HashMap<>();

hm.put("Radiohead", 156);
hm.put("Kishore Kumar", 141);
hm.put("The Black Keys", 35);
hm.put("Neutral Milk Hotel", 94);
hm.put("Beck", 88);
hm.put("The Strokes", 61);
hm.put("Wilko",111);




 */
    public static void selectionSort(Map<String, Integer> input ){

        Queue<String> queue = new LinkedList<>();

        Integer mostView = 0;
        String mostViewBandName = "";

        while(!input.isEmpty()) {
            for (String band : input.keySet()) {
                if(input.get(band) > mostView){
                    mostView = input.get(band);
                    mostViewBandName = band;
                }
            }

            mostView = 0;
            queue.add(mostViewBandName);
            input.remove(mostViewBandName);
        }
        System.out.println(queue);
    }
}

package com.company.serie2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Collections_36_FindSymmetricPairsInAnArray {

    public void findPairs(int[][] input){

        /*
                dodaj 2 minuty 40 sekund

                Iteruję się przez tablicę, potem przez drugą
                dodaję pierwszą wartość jako key do hashMapy drugą jako value

                potem iteruję się po kejach
                sprawdzam czy value z danego key`a występuje również jako key
                Jeśli tak, dodaję parę do arraylisty

         */

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int [] outer : input){
                hm.put(outer[0], outer[1]);
        }
        ArrayList<Integer []> pairs = new ArrayList<>();

        for(Integer key : hm.keySet()){
            Integer value = hm.get(key);
            if(hm.containsKey(value)){
                pairs.add(new Integer[]{key, value});
            }
        }

        for(Integer [] pairArray: pairs){
            System.out.println(Arrays.toString(pairArray));
        }
    }
}

package com.company.serie1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Algorithms_2_SelectionSort {

    public static List<String> selectionSort(Map<String, Integer> inputHm){
        List<String> outputHashMap = new ArrayList<>();
        while(!inputHm.isEmpty()){

            Integer mostPopularBandViewsThatRemainInInput = null;
            String mostPopularBandNameRemainInInput = null;

            for(String bandName : inputHm.keySet()){
                if(mostPopularBandViewsThatRemainInInput == null ){

                    mostPopularBandViewsThatRemainInInput = inputHm.get(bandName);
                    mostPopularBandNameRemainInInput = bandName;
                } else if(inputHm.get(bandName) > mostPopularBandViewsThatRemainInInput){

                    mostPopularBandViewsThatRemainInInput = inputHm.get(bandName);
                    mostPopularBandNameRemainInInput = bandName;
                }
            }

            outputHashMap.add(mostPopularBandNameRemainInInput + " " + mostPopularBandViewsThatRemainInInput );
            inputHm.remove(mostPopularBandNameRemainInInput);
        }
        return outputHashMap;
    }
}

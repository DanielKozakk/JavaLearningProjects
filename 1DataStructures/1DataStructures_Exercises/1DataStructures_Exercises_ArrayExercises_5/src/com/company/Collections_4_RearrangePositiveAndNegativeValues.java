package com.company;

import java.util.ArrayList;
import java.util.List;

public class Collections_4_RearrangePositiveAndNegativeValues {

    public void rearange(int[] inputArray) {


        /*

                iteruje się po elementach inputarray
                dodaję pozytywne do arrayList
                dodaję negatywne do arrayList

                potem robię nową arraylist
                iteruje się przez nią, dopóki arrayListpositive nie jest puste i arraylistnegative nie jest puste
                zaznaczam przy tym index
                jeśli jest parzysty to dodaję z positivbe
                jeśli nieparzysty to z negative

                opróżniam na końcu resztę z positive i negative


         */


        List<Integer> positiveArrayList = new ArrayList<>();
        List<Integer> negativeArrayList = new ArrayList<>();

        for(int e : inputArray){
            if(e < 0){
                negativeArrayList.add( e);
            } else {
                positiveArrayList.add(e);
            }
        }

        List<Integer> outputArrayList = new ArrayList<>();
        int index = 0;
        int positiveIndex = 0;
        int negativeIndex = 0;


        while(outputArrayList.size() < inputArray.length && positiveIndex < positiveArrayList.size() && negativeIndex < negativeArrayList.size()) {
            if (index % 2 == 0) {
                outputArrayList.add(positiveArrayList.get(positiveIndex));
                positiveIndex++;
            } else {
                outputArrayList.add(negativeArrayList.get(negativeIndex));
                negativeIndex++;
            }
            index ++;
        }

        while(positiveIndex < positiveArrayList.size()){
            outputArrayList.add(positiveArrayList.get(positiveIndex));
            positiveIndex ++;
        }
        while(negativeIndex < negativeArrayList.size()){
            outputArrayList.add(negativeArrayList.get(negativeIndex));
            negativeIndex ++;
        }

        System.out.println(outputArrayList.toString());
    }

}

package com.company.array.serie_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections_3 {
    public static void mergeTwoSortedArrays(int[] firstArray, int [] secondArray) {
        /*
        * 1. Robię dwa indeksy - odpowiadające długości tablicy
        * 2. Robię pętlę while, która działa dopóki indeks jest mniejszy niż długość powiązanej tablicy.
        * 3. Porównuję elementy, jeśli coś jest mniejsze od drugiego, to dodaje do nowej tablicy, zwiekszam ten indeks.
        * 4. Poza pętlą robię ify - jeśli indeks jest mniejszy niż długość tablicy, to dodaje pozostałe elementy do nowej tablicy.
        *
         */

        int i = 0;
        int j = 0;

        List<Integer> outputList = new ArrayList<>();


        while (i < firstArray.length && j < secondArray.length){


            if(firstArray[i] < secondArray[j]){
                outputList.add(firstArray[i]);
                i ++;
            } else if (firstArray[i] > secondArray[j]){
                outputList.add(secondArray[j]);
                j++;
            } else {
                outputList.add(firstArray[i]);
                outputList.add(secondArray[j]);
                i ++;
                j ++;
            }
        }
            for(;i < firstArray.length; i ++){
                outputList.add(firstArray[i]);
            }

            for(;j < secondArray.length; j ++){
                outputList.add(secondArray[j]);
            }

        Integer [] outputArray = new Integer[firstArray.length + secondArray.length];
        outputList.toArray(outputArray);

        System.out.println(Arrays.toString(outputArray));
    }
}

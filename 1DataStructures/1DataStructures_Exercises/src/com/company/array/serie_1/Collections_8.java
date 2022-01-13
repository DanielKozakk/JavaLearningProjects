package com.company.array.serie_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collections_8 {

    /*
    * Input:
    * int[] firstArray = {1, 3, 4, 5, 7};
    * int[] secondArray = {2, 3, 5, 6};
    *
    * Output : Union : {1, 2, 3, 4, 5, 6, 7}
         Intersection : {3, 5}
    *
     * int[] thirdArray = {2, 5, 6};
     * int[] forthArray = {4, 6, 8, 10};
     *
     * Output : Union : {2, 4, 5, 6, 8, 10}
         Intersection : {6}

     *
     */
    public static void unionAndIntersection(int[] firstArray, int[] secondArray){


        /**
         * Robię outtputArrayList
         * robię pętlę while, której warunkiem jest to, że działa, dopóki, nie ma tyle samo elementów co dwie arrayki
         * robię indeksy dla dwóch tablic, dodaję do outputArrayList, zwiększam odpowiedni indeks.
         * Robię ify sprawdzające czy indeks jest mniejszy niż odpowiadająca tablica, jeśli tak, to dodaję element z drugiej tablicy, zwiększając jej indeks.

         union - zagnieżdżona pętla

         */

        HashSet<Integer> intersectionArrayList = new HashSet<Integer>();

        int i = 0;
        int j = 0;

        while(i < firstArray.length || j < secondArray.length ){

            if(i >= firstArray.length){
                intersectionArrayList.add(secondArray[j]);
                j++;
                continue;
            }
            if(j >= secondArray.length){
                intersectionArrayList.add(firstArray[i]);
                i ++;
                continue;
            }

            if(firstArray[i] < secondArray[j]){
                intersectionArrayList.add(firstArray[i]);
                i ++;
            } else if (firstArray[i] > secondArray[j]){
                intersectionArrayList.add(secondArray[j]);
                j ++;
            } else {
                intersectionArrayList.add(firstArray[i]);
                intersectionArrayList.add(secondArray[j]);
                i++;
                j++;
            }
        }

        System.out.println(intersectionArrayList);

        Set<Integer> unionSet = new HashSet<>();

        for (int firstIndex = 0 ; firstIndex < firstArray.length ; firstIndex++ ){

            for(int secondIndex = 0 ; secondIndex < secondArray.length; secondIndex++){
                if(firstArray[firstIndex] == secondArray[secondIndex]){
                    unionSet.add(firstArray[firstIndex]);
                    break;
                }
            }
        }

        System.out.println(unionSet);
    }
}

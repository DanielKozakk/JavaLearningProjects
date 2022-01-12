package com.company;

import java.util.ArrayList;
import java.util.List;

public class Collections_8_UnionAndIntersection {
//    Input : arr1[] = {1, 3, 4, 5, 7}
//    arr2[] = {2, 3, 5, 6}
//    Output :
//
//    Union : {1, 2, 3, 4, 5, 6, 7}
//    Intersection : {3, 5}
//
//    Input : arr1[] = {2, 5, 6}
//    arr2[] = {4, 6, 8, 10}
//    Output : Union : {2, 4, 5, 6, 8, 10}
//    Intersection : {6}


    public static void intersectionAndUnion(int[] inputArray1, int[] inputArray2) {

        /*
                na papierze intersection

                robięoutputArrayList

                iteruje się przez jedną tablicę
                    iteruję się przez drugą tablicę

                        jeśli elementy są takie same, dodaj do intersectionArrayList

                na papierze union:

                robię dwa wskaźniki :
                j
                i
                robię outputArrayLIst

                while(i < inputArray1.length && j < iinputArray2.length)
                    jeśli element i jest mniejszy
                        dodaj do intersectionOutputArrayList
                        i ++

                    jeśli element j jest mniejszy
                        dodaj do intersectionOutputArrayList
                        j++

                    jeśli elementy są równe
                    dodaj i intersectionOutputArrayList
                    i ++
                    j++


                while(i < inputArray1.length)
                    intersectionOutputArrayList.add(inputArray1[i])

                          while(j < inputArray2.length)
                    intersectionOutputArrayList.add(inputArray2[j])

         */

        int inputArrayLength1 = inputArray1.length;
        int inputArrayLength2 = inputArray2.length;

        List<Integer> intersectionOutputArrayList = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i < inputArrayLength1){
            while(j < inputArrayLength2){

//                System.out.println(inputArray2[j]);

                if(inputArray1[i] == inputArray2[j]){

                    intersectionOutputArrayList.add(inputArray1[i]);
                    break;
                }
                j ++;
            }
            j = 0;
            i++;
        }

        i = 0;
        j = 0;

        List<Integer> unionOutputArrayList = new ArrayList<>();

        while(i < inputArrayLength1 && j < inputArrayLength2){
            if( inputArray1[i] < inputArray2[j]){
                unionOutputArrayList.add(inputArray1[i]);
                i++;
            } else if (inputArray2[j] < inputArray1[i]){
                unionOutputArrayList.add(inputArray2[j]);
                j++;
            } else {
                unionOutputArrayList.add(inputArray1[i]);
                i++;
                j++;
            }
        }

        while (i < inputArrayLength1){
            unionOutputArrayList.add(inputArray1[i]);
            i++;
        }

        while(j < inputArrayLength2){

            unionOutputArrayList.add(inputArray2[j]);
            j++;
        }

        System.out.println(unionOutputArrayList.toString());

//        System.out.println(intersectionOutputArrayList.toString());

    }


}


package com.company;

import java.util.ArrayList;
import java.util.List;

public class Collections_3_MergeTwoSortedArrays {

    /*

            Mam inputArray1
            Mam inputArray2

            Tworzę wskaźnik i = 0
            Tworzę wskaźnik j = 0
            Robię outputArrayList

            Robię pętlę while, która będzie miała takie warunki:
            i < inputArray1.size
            j < inputArray2.size

            Jeśli element inputArray1[i] jest mniejszy od inputArray2[j]
                dodaj inputArray1[i] do arraylisty
                i++

            Jeśli element inputArray2[j] jest mniejszy od inputArray1[i]
                dodaj inputArray2[j] do arraylisty
                j ++


            jeśli są równe to dodaj pierwszy

                i++
                j ++


            Robię następnie dwie pętle, każda z nich ma po jednym z warunków z poprzedniej while

            loguję outputArrayList
     */

    /*
            int [] inputArr1
            int [] inputArr2

            i = 0
            j = 0
            outputArrayList

            while i <input1Lenght and j < input2Length

                if input1[i] < input2[j]
                    outputArrayList.add(input1[i]
                    i ++
                else if ..
                                         outputArrayList.add(input2[j]
                                          j ++
                else
                                            outputArrayList.add(input1[i]
                                            i++
                                            j++

                 while i <input1Lenght
                 outputArray add input1 i
                 i ++

                 while j <input2Lenght
                 outputArray add input2 j
                 j++

                 print outputArray

     */

    public static void mergeTwoSortedArrays(int[] inputArray1, int[] inputArray2) {
        int i = 0, j = 0;
        List<Integer> outputArrayList = new ArrayList<>();

        while (i < inputArray1.length && j < inputArray2.length) {

            if (inputArray1[i] < inputArray2[j]) {
                outputArrayList.add(inputArray1[i]);
                i++;
            } else if (inputArray1[i] > inputArray2[j]) {
                outputArrayList.add(inputArray2[j]);
                j++;
            } else {
                outputArrayList.add(inputArray1[i]);
                i++;
                j++;
            }
        }

        while (i < inputArray1.length){
            outputArrayList.add(inputArray1[i]);
            i++;
        }
        while (j < inputArray2.length){
            outputArrayList.add(inputArray2[j]);
            j++;
        }

        System.out.println(outputArrayList.toString());

    }

}



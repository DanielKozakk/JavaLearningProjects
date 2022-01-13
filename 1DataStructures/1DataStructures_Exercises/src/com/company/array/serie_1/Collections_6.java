package com.company.array.serie_1;

import java.util.ArrayList;
import java.util.List;

public class Collections_6 {

    /*
    * Input:
    * String[] strArray1 = {"abc1", "def1", "mno1", "xyz1", "pqr1", "xyz1", "def1"};
    *

    *
     */
    public static void findDuplicateElements(String[] inputArray){

        List<String> outputList = new ArrayList<>();

        for (int i = 0 ; i < inputArray.length ; i++){

            for(int j = 0 ; j < inputArray.length ; j ++){

                if(i != j && inputArray[i].equals(inputArray[j])){
                    outputList.add(inputArray[i]);
                }
            }
        }

        System.out.println(outputList);
    }
}

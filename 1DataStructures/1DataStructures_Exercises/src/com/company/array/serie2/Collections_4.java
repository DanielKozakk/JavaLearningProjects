package com.company.array.serie2;

import java.util.Arrays;

public class Collections_4 {
    /*
     * Input:
     * int [] firstArray = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
     * Output:
     * [9, -7, 8, -3, 5, -1, 2, 4, 6]
     *
     */
    public static void rearrangePositiveAndNegativeValuesInArray(int[] inputArray){

        for(int i = 0, j = inputArray.length - 1 ; i != j ; i ++){

            if(inputArray[i] < 0){
                int temporaryValue = inputArray[j];
                inputArray[j] = inputArray[i];
                inputArray[i] = temporaryValue;
                j --;
            }
        }

        for(int index = 0, secondIndex = inputArray.length- 1; index < secondIndex; index++){

            if(index % 2 == 1){
                int tmp = inputArray[index];
                inputArray[index] = inputArray[secondIndex];
                inputArray[secondIndex] = tmp;
                secondIndex --;
            }

        }

        System.out.println(Arrays.toString(inputArray));
    }
}

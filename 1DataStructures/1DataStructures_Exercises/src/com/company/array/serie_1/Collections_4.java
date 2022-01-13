package com.company.array.serie_1;

import java.util.Arrays;

public class Collections_4 {

    /*
     * Input:
     *
     */
    public static void rearrangePositiveAndNegativeValuesInArray(int[] inputArray) {

        Integer lastNegativeNumberIndex = null;
        Integer lastPositiveNumberIndex = null;

        for (int i = 0; i < inputArray.length; i++) {
            boolean valueGreaterOrEqualsToZero = inputArray[i] >= 0;
            boolean isEven = i % 2 == 0;

            if(isEven && valueGreaterOrEqualsToZero && lastNegativeNumberIndex != null){
                swapElements(inputArray, i, lastNegativeNumberIndex);

            }

            if (!isEven && valueGreaterOrEqualsToZero && lastNegativeNumberIndex != null) {

                int tmpValue = inputArray[i];
                inputArray[i] = inputArray[lastNegativeNumberIndex];
                inputArray[lastNegativeNumberIndex] = tmpValue;
                lastNegativeNumberIndex = null;

            } else if(isEven && !valueGreaterOrEqualsToZero && lastPositiveNumberIndex != null){
                int tmpValue = inputArray[i];
                inputArray[i] = inputArray[lastPositiveNumberIndex];
                inputArray[lastPositiveNumberIndex] = tmpValue;
                lastPositiveNumberIndex = null;
            }
            else if (!isEven && valueGreaterOrEqualsToZero && lastPositiveNumberIndex == null) {
                lastPositiveNumberIndex = i;

            } else if (isEven && !valueGreaterOrEqualsToZero && lastNegativeNumberIndex == null) {
                lastNegativeNumberIndex = i;
            }
        }

        System.out.println(Arrays.toString(inputArray));
    }

    private static int [] swapElements(int [] inputArray, int firstIndex, int secondIndex){

        int tmpValue = inputArray[firstIndex];
        inputArray[firstIndex] = inputArray[secondIndex];
        inputArray[secondIndex] = tmpValue;
        return inputArray;
    }
}

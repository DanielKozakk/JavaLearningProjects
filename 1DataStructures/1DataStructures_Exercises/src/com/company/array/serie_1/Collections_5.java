package com.company.array.serie_1;

import java.util.Arrays;

public class Collections_5 {


    /*
     * Input:
     * int [] firstArray = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
     * Output:
     * [9, -7, 8, -3, 5, -1, 2, 4, 6]
     *
     */
    public static void reverseArray(String[] inputArray){

        /**
         * Robię dwa indeksy, jeden na początku, drugi na końcu.
         * Iteruję się po elementach tablicy, robię zamianę elementów.
         * Pierwszy indeks zwiększam, drugi zmniejszam.
         * Pętla while działa, dopóki pierwszy jest mniejszy, niż drugi.
         */

        int startIndex = 0;
        int endIndex = inputArray.length - 1;

        while(startIndex < endIndex){

            String tmpValue = inputArray[startIndex];
            inputArray[startIndex]= inputArray[endIndex];
            inputArray[endIndex]= tmpValue;

            startIndex ++;
            endIndex --;
        }
        System.out.println(Arrays.toString(inputArray));

    }


}

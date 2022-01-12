package com.company.array.serie_1;

import java.util.stream.StreamSupport;

public class Collections_2 {


    /*
     * 1. Zrób pustą zmienną
     * 2. Zrób pętlę zewnętrzną - iterującą się po wszystkich elementach
     * 3. Druga taka sama też po wszystkich w środku pierwszej.
     * 4. Sprawdzaj po kolei, czy element występuje drugi raz.
     *
     */

    public static void firstNonRepeatingElement(int[] inputArray) {

        Integer firstNonRepeatedElement = null;
        for (int i = 0; i < inputArray.length ; i ++
        ) {
            boolean repeated = false;
            for (int j = 0; j < inputArray.length ; j ++){
                if(i == j){
                    continue;
                }
                if(inputArray[i] == inputArray[j]){
                    repeated = true;
                    break;
                }
            }
            if(!repeated){
                firstNonRepeatedElement = inputArray[i];
                break;
            }
        }
        System.out.println(firstNonRepeatedElement);

    }
}

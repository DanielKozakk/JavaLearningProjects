package com.company;

import java.util.Arrays;

public class Collections_4_RearrangePositiveAndNegativeNumbers {


    //For example, if the input array is [-1, 2, -3, 4, 5, 6, -7, 8, 9], then the output should be [9, -7, 8, -3, 5, -1, 2, 4, 6]

    /*

             Tworzę sobie zmienną positive.

            iteruję się przez tablice ze wskaźnikiem i


                jeśli element jest większy od zera to dodaję index do positive jeśli positive to null

                jeśli element jest mniejszy od zera i positive nie jest nullem

                int tmp;

                tmp = inputArray[positive]
                inputArray[positive] = inputArray[i]
                inputArray[i] = tmp

                positive ++;



            [-1, 2, -3, 4, 5, 6, -2, -5, 1, 5]

            #1
            i = 0
            positive = null

            #2
            i = 1
            positive = 1

            #3
            i = 2
            positive =2

            [-1, -3, 2, 4, 5, 6, -2, -5, 1, 5]

            #4
            i = 3
            positive = 2

             #4
            i = 3
            positive = 2

             #5
            i = 5
            positive = 2

            #6
            i = 6; inputArr[i] to -2


            [-1, -3,-2, 4, 5, 6, 2 , -5, 1, 5]
            positive = 3

            #7
            i = 7
            positive = 3

            [-1, -3,-2, -5, 5, 6, 2 ,4 , 1, 5]

             positive = 4

            // naprzemiennianie

            tworzę jeden indeks jeden to i = 0
            positive

            while ( positive < inputArr.length && inputArr[i] > 0)
            jeśli i to liczba nieparzysta
            tmp
            inutArr[i]

            to inputArr[i] = inputArr[positive]
            j ++
            i++;

            #1

            [-1, -3,-2, -5, 5, 6, 2 ,4 , 1, 5]

            i = 0
            i ++

            #2
            i = 1

            tmp = inputarr [i]
            inputArr[i] = inputArr[positive]
            positive ++ {5}
            i ++
     */

    public static void rearrangePositiveAndNegativeNumbers(int[] inputArr){

        Integer positiveIndex = null;

        for (int i = 0; i < inputArr.length; i++){

            if(inputArr[i] > 0 && positiveIndex == null){
                positiveIndex = i;
            } else if(0 > inputArr[i] && positiveIndex != null){
                int tmp = inputArr[positiveIndex];
                inputArr[positiveIndex] = inputArr[i];
                inputArr[i] = tmp;

                positiveIndex ++;
            }
        }

        int i = 0;


        while(positiveIndex < inputArr.length && inputArr[i] < 0){

            if(i % 2 > 0){
                int tmp = inputArr[i];
                inputArr[i] = inputArr[positiveIndex];
                inputArr[positiveIndex] = tmp;
                positiveIndex++;
            }
            i++;
        }

        System.out.println(Arrays.toString(inputArr));
/*
        [-1, -1, -1, -1, -1, -2, -1, -1, 2, 2, 2, 2, 2, 3, 2]

*/



    }
}

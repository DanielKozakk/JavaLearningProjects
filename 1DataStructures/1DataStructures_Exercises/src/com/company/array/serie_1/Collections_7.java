package com.company.array.serie_1;

public class Collections_7 {

    /*
    * Input:
    * int[] firstArray = {-21, 522, -36321, 45, 544, 6, -2427, -12128, 9};
    *

    *
     */
    public static void getSmallestAndLargestNumberInArray(int[] inputArray){

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int element: inputArray
             ) {

            if(element < smallest) smallest = element;
            if(element > largest) largest = element;

        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}

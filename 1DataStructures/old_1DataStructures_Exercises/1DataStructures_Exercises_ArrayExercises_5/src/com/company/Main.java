package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        int[] inputArray = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
//
//        Collections_4_RearrangePositiveAndNegativeValues col4 = new Collections_4_RearrangePositiveAndNegativeValues();
//        col4.rearange(inputArray);
        int[] inputArray = {1,2 ,3, 4};


        Collections_5_ReverseArray col5 = new Collections_5_ReverseArray();
        System.out.println(Arrays.toString(col5.reverseRecursive(inputArray, 0)));
//        col5.reverseArray1();


    }
}

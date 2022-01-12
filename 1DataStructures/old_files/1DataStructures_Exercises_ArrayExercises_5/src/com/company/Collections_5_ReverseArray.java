package com.company;

import java.util.Arrays;

public class Collections_5_ReverseArray {

    public void reverseArray1(){
        int[] inputArray = {1,2 ,3, 4};
        int arrayCenter = inputArray.length / 2;

        for(int i = 0; i < arrayCenter; i++){

            int lastIndex = inputArray.length-1;
            int reserve = inputArray[i];

            inputArray[i] = inputArray[lastIndex-i];
            inputArray[lastIndex-i] = reserve;
        }

        System.out.println(Arrays.toString(inputArray));
    }

    public int [] reverseRecursive(int [] inputArray, int i){

        if (i < inputArray.length /2 ){
            return inputArray;
        }

        int lastIndex = inputArray.length/2 -1;
        int reserve = inputArray[i];
        inputArray[i] = inputArray[lastIndex - i];
        inputArray[lastIndex - i ] = reserve;
        i++;
        return reverseRecursive(inputArray, i);
    }

}

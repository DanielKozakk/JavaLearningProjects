package com.company;

public class BinarySearch {

    public static boolean binarySearch(int element, int[] array) {


        int low = 0;
        int high = array.length -1 ;

        int mid;
        while(low <= high){
            mid = low + high;
            int guess = array[mid];

            if(guess == element){
                return true;
            }

            if(guess > element){
                high = mid -1;
            } else {
                low = mid +1;
            }
        }
        return false;



    }



}

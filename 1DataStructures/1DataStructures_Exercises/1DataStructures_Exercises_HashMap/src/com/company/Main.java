package com.company;

import com.company.serie1.Collections_36_FindSymmetricPairsInAnArray;
import com.company.serie1.Collections_37_FindIfAnArrayIsASubsetOfAnotherArray;

public class Main {

    public static void main(String[] args) {


       int[] first = new int[]{11,1,13,21,3,7};
       int[] second = new int[]{11,3,7,1,5};

        Collections_37_FindIfAnArrayIsASubsetOfAnotherArray col37 = new Collections_37_FindIfAnArrayIsASubsetOfAnotherArray();
        boolean result = col37.findIfSecondArrayIsASubsetOfFirst(first,second);
        System.out.println(result);


    }
}

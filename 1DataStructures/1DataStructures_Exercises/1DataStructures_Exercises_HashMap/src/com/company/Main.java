package com.company;

import com.company.serie1.Collections_36_FindSymmetricPairsInAnArray;
import com.company.serie1.Collections_37_FindIfAnArrayIsASubsetOfAnotherArray;
import com.company.serie1.Collections_38_CheckIfGivenArrayIsDisjoint;

public class Main {

    public static void main(String[] args) {


       int[] first = new int[]{11,1,13,21,3,7};
       int[] second = new int[]{7345};

        Collections_38_CheckIfGivenArrayIsDisjoint col38 = new Collections_38_CheckIfGivenArrayIsDisjoint();
        col38.checkIfArraysAreDisjoint(first,second);

    }
}

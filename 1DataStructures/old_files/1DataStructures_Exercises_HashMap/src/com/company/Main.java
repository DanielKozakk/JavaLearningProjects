package com.company;

import com.company.serie1.Collections_37_FindIfAnArrayIsASubsetOfAnotherArray;
import com.company.serie1.Collections_38_CheckIfGivenArrayIsDisjoint;
import com.company.serie2.Collections_36_FindSymmetricPairsInAnArray;

public class Main {

    public static void main(String[] args) {

        int[][] inputFor36 = {{11, 20}, {30, 40}, {5, 10}, {40, 30}, {10, 5}};


        Collections_36_FindSymmetricPairsInAnArray col36 = new Collections_36_FindSymmetricPairsInAnArray();
        col36.findPairs(inputFor36);
    }
}

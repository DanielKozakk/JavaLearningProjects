package com.company;

import com.company.serie1.Collections_36_FindSymmetricPairsInAnArray;

public class Main {

    public static void main(String[] args) {


        int[][] inputFor36 = new int [5][2];

        inputFor36[0] = new int[]{11, 20};
        inputFor36[1] = new int[]{30, 40};
        inputFor36[2] = new int[]{5, 10};
        inputFor36[3] = new int[]{40, 30};
        inputFor36[4] = new int[]{10, 5};

        Collections_36_FindSymmetricPairsInAnArray col36 = new Collections_36_FindSymmetricPairsInAnArray();
        col36.findSymmetricPairs(inputFor36);

    }
}

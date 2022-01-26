package com.company.array.serie_1;

public class Collections_36 {

    /*

            int[][] input = {{11, 20}, {30, 40}, {5, 10}, {40, 30}, {10, 5}};

        Output: Following pairs have symmetric pairs
        (30, 40)
        (5, 10)

     */
    public static void findSymmetricPairs(int [][] input){

        for (int i = 0 ; i < input.length ; i++ ) {

            int j = i;
            for(; j < input.length;  j++){
                if(i == j) continue;

                int[] firstPair = input[i];
                int[] secondPair = input[j];

                if(firstPair[0] == secondPair[1] && firstPair[1] == secondPair[0]){
                    System.out.println("(" + firstPair[0] + ", " + firstPair[1] + ")");
                }

            }

        }
    }
}

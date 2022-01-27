package com.company.array.serie_1;

public class Collections_38 {


    public static void haveArraysGotCommonElement(int [] first, int[] second){

        boolean hasCommonElement = false;
        outer: for(int i = 0; i < first.length; i++){

            for(int j = 0; j < second.length; j++){

                if(first[i] == second[j]){
                    System.out.println("Has common element");
                    hasCommonElement = true;
                    break outer;
                }
            }
        }

        if(!hasCommonElement)
        {
            System.out.println("doesn't have common element");
        }

    }

}

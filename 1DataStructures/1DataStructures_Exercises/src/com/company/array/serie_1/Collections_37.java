package com.company.array.serie_1;

public class Collections_37 {

    public static void isSubset(int [] first, int [] second){

        boolean subsetStatus = true;
        for(int i = 0 ; i < second.length ; i ++){

            boolean subset = false;
            for(int j = 0 ; j < first.length; j ++){

                if(second[i] == first[j]){
                    subset = true;
                    break;
                }
            }
            if(!subset){
                System.out.println("Not a subset");
                subsetStatus = false;
                break;
            }
        }
        if(subsetStatus){
            System.out.println("subset");
        }
    }
}

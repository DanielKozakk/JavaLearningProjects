package com.company.serie1;

import java.util.HashSet;

public class Collections_38_CheckIfGivenArrayIsDisjoint {

    public void checkIfArraysAreDisjoint(int [] first, int [] second){

        HashSet<Integer> hs = new HashSet<>();
        for(int firstInteger : first){
            hs.add(firstInteger);
        }

        boolean areArrayDisjoint = true;
        for(int secondInteger : second){
            if(hs.contains(secondInteger)){
                areArrayDisjoint = false;
                break;
            }
        }

        System.out.println(areArrayDisjoint);




    }
}

package com.company.serie1;

import java.util.HashMap;
import java.util.HashSet;

public class Collections_37_FindIfAnArrayIsASubsetOfAnotherArray {


    public boolean findIfSecondArrayIsASubsetOfFirst(int[] first, int[] second) {

        HashSet<Integer> hm = new HashSet<>();

        for(int integer : first){
            hm.add(integer);
        }

        boolean isSecondSubset = true;
        for(Integer integerInSecondArr : second){
            if(!hm.contains(integerInSecondArr)){
                isSecondSubset = false;
                break;
            }
        }

        return isSecondSubset;
    }
}

package com.company.simplesum;

import java.util.List;

public class SimpleRecursiveSum {

    public int recursiveSum(List<Integer> list){

        if (list.size() <= 1){
            return list.get(0);
        }
        Integer firstElement = list.get(0);
        list.remove(0);
        return firstElement + recursiveSum(list);
    }

}

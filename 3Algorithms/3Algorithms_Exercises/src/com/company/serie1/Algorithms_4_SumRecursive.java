package com.company.serie1;

import java.util.List;

public class Algorithms_4_SumRecursive {

    public int sum (List<Integer> input){
        return sum(input, 0);
    }

    private int sum(List<Integer> input, int index){
        if(index == input.size()) return 0;
        return input.get(index) + sum(input, index + 1);
    }
}

package com.company.serie3;

import java.util.List;

public class Algorithms_4 {

    public static Integer sum(int[] numbers) {
        return sum(numbers, 0, 0);
    }

    private static Integer sum(int[] numbers, Integer index, Integer result) {

        if(index == numbers.length){
            return result;
        }
        Integer newResult = result + numbers[index];
        return sum(numbers,++index , newResult);
    }
}

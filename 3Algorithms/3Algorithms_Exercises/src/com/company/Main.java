package com.company;



import com.company.serie3.Algorithms_4;
import com.company.serie3.Algorithms_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        List<Integer> input = new ArrayList<>();
        input.add(0);
        input.add(2);
        input.add(24512);
        input.add(245112);
        input.add(5);
        input.add(7);
        input.add(103);
        input.add(123);

        List<Integer> newList = Algorithms_5.quickSort(input);
        System.out.println(newList);
    }



}

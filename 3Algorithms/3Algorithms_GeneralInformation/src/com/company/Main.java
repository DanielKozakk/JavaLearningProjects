package com.company;

import com.company.simplesum.SimpleRecursiveSum;
import com.company.sumazrekurencja.Rekurencja;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        SimpleRecursiveSum srs = new SimpleRecursiveSum();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int sum = srs.recursiveSum(list);

        System.out.println(sum);
    }
}

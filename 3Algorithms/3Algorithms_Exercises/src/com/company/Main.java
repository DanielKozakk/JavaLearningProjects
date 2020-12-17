package com.company;

import com.company.serie1.Algorithms_1_BinarySearch;
import com.company.serie1.Algorithms_2_SelectionSort;
import com.company.serie1.Algorithms_3_RecursiveFactorial;
import com.company.serie1.Algorithms_4_SumRecursive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        List<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(5);
        inputList.add(8);
        inputList.add(10);

        Algorithms_4_SumRecursive alg4 = new Algorithms_4_SumRecursive();

        int suma = alg4.sum(inputList);
        System.out.println(suma);

    }


}

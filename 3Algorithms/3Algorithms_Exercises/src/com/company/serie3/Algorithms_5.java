package com.company.serie3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Algorithms_5 {

    public static List<Integer> quickSort(List<Integer> input) {


        if (input.size() < 2) {
            return input;
        }

        if (input.size() == 2) {

            Integer firstElement = input.get(0);
            Integer secondElement = input.get(1);
            input.clear();
            if (firstElement <= secondElement) {
                input.add(0, firstElement);
                input.add(1, secondElement);
            } else {
                input.add(0, secondElement);
                input.add(1, firstElement);
            }
        } else {

            int pivot = input.size() / 2;

            List<Integer> leftSublist = quickSort(input.subList(0, pivot - 1 ));
            List<Integer> rightSublist = quickSort(input.subList(pivot + 1, input.size()));

            List<Integer> newList = new ArrayList<>();
            newList.addAll(leftSublist);
            newList.addAll(rightSublist);
            return newList;
        }

        return input;
    }


}

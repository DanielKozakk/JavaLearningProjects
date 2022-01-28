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

            List<Integer> leftSublist = new ArrayList<>();
            List<Integer> rightSublist = new ArrayList<>();

            for (int i = 0 ; i < input.size(); i++) {
                if(pivot == i) continue;
                Integer element = input.get(i);
                Integer pivotElement = input.get(pivot);
                if(pivotElement >= element ){
                    leftSublist.add(element);
                } else {
                    rightSublist.add(element);
                }
            }

            List<Integer> newList = new ArrayList<>();
            newList.addAll(quickSort(leftSublist));
            newList.add(input.get(pivot));
            newList.addAll(quickSort(rightSublist));
            return newList;
        }

        return input;
    }


}

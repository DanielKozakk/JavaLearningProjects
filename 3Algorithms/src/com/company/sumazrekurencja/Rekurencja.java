package com.company.sumazrekurencja;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Rekurencja {

    public static int sumRecursive(List<Integer> list) {

        if (list.size() == 0) {
            return 0;
        } else {

            var newList = new ArrayList<>(List.copyOf(list));
            newList.remove(0);

            return list.get(0) + sumRecursive(newList);
        }
    }

    public static int highestNumber(List<Integer> list) {

        if (list.size() == 1) {
            return list.get(0);
        }
        var newList = new ArrayList<>(List.copyOf(list));

        if (newList.get(0) >= newList.get(newList.size() - 1)) {
            newList.remove(newList.size() - 1);
        } else {
            newList.remove(0);
        }
        return highestNumber(newList);
    }

    public static List<Integer> quickSort(List<Integer> list) {


        if (list.size() < 2) {
            return list;
        } else if (list.size() == 2) {

            Integer first = list.get(0);
            Integer second = list.get(1);
            var twoSortedElements = new ArrayList<Integer>();

            if (first > second) {
                twoSortedElements.add(second);
                twoSortedElements.add(first);
            }
            return twoSortedElements;
        } else {

            Integer pivot = list.get(0);

            ArrayList<Integer> smallerOrEqual = new ArrayList<>();
            ArrayList<Integer> greater = new ArrayList<>();

            for (Integer element : list) {
                if(!element.equals(pivot)) {
                    if (element <= pivot) {
                        smallerOrEqual.add(element);
                    } else {
                        greater.add(element);
                    }
                }
            }

            var firstPart = quickSort(smallerOrEqual);
            firstPart.add(pivot);
            var secondPart= quickSort(greater);
            firstPart.addAll(secondPart);
            return firstPart;

        }


    }

}

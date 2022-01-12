package com.company.quicksort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSort {

    public List<Integer> quickSort(List<Integer> listToSort) {
        if (listToSort.size() < 2) {
            return listToSort;
        } else if (listToSort.size() == 2 && listToSort.get(0) > listToSort.get(1)) {
            return quickSort(new ArrayList<>() {{
                add(listToSort.get(1));
                add(listToSort.get(0));
            }});
        } else {
            int pivotIndex = listToSort.size() / 2;
            Integer pivot = listToSort.get(pivotIndex);
            List<Integer> smallerThanPivot = new ArrayList<>();
            List<Integer> greaterThanPivot = new ArrayList<>();

            for(int i = 0; i < listToSort.size(); i++){
                Integer element = listToSort.get(i);
                if(i == pivotIndex){
                    continue;
                }
                if (element > pivot) {
                    greaterThanPivot.add(element);
                } else {
                    smallerThanPivot.add(element);
                }
            }
            List<Integer> pivotList = new ArrayList<>();
            pivotList.add(listToSort.get(pivotIndex));

            return Stream.of(quickSort(smallerThanPivot), pivotList, quickSort(greaterThanPivot))
                    .flatMap(x -> x.stream())
                    .collect(Collectors.toList());
        }
    }
}

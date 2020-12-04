package com.company.serie1;

import java.util.List;

public class Algorithms_1_BinarySearch {

    public static boolean binarySearch(List<Integer> input, int searched) {

        int maxSize = input.size();

        int nextIndex = (int) Math.floor(maxSize / 2);

        Integer nextElement = input.get(nextIndex);

        if (input.size() == 1 && nextElement != searched) {

            return false;
        }

        if (searched > nextElement) {
            return binarySearch(input.subList(nextIndex, maxSize), searched);
        } else if (searched < nextElement) {
            return binarySearch(input.subList(0, nextIndex), searched);
        } else {

            return true;
        }
    }

}

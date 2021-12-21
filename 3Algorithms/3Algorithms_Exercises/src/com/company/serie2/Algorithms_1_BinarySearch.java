package com.company.serie2;

import java.util.ArrayList;
import java.util.List;

public class Algorithms_1_BinarySearch {
    public Integer binarySearch(int searchedNumber) {
        List<Integer> sortedArrayList = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);
            add(9);
        }};

        int high = sortedArrayList.size() -1;
        int low = 0;

        while(high >= low){

            int mid = (high + low) /2;
            int guess = sortedArrayList.get(mid);
            if(guess == searchedNumber){
                return mid;
            }
            if(searchedNumber > guess){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;

    }
}

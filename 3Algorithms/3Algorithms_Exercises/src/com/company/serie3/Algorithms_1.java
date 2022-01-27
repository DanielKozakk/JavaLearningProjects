package com.company.serie3;

import java.util.List;
import java.util.Objects;

public class Algorithms_1 {


    public static void binarySearch(List<Integer> input, Integer aimValue) {

        int min = 0;
        int max = input.size() - 1;

        int searchedIndex = input.size() / 2;

        boolean numberHasBeenFound = false;
        while(min < max){

            Integer comparedValue = input.get(searchedIndex);

            if(Objects.equals(comparedValue, aimValue)){
                numberHasBeenFound = true;
                System.out.println("Number has ben found!");
                break;
            } else if(comparedValue >= aimValue){
                max = searchedIndex - 1;
            } else {
                min = searchedIndex + 1;

            }
            searchedIndex =  (max + min) /2 ;

        }
        if(!numberHasBeenFound){
            System.out.println("There is no such a number!");
        }

    }
}

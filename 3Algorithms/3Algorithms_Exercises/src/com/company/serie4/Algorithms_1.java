package com.company.serie4;

import java.util.List;

public class Algorithms_1 {

    public boolean  binarySearch (List<Integer> input, Integer searchedValue){


        /*

         1. Robię 3 zmienne:
         currentIndex - reprezentuje indeks, który będzie wszukiwany w liście, domyślnie input.length /2
         max - oznacza tymczasowy maksymalny indeks, domyślnie input.length - 1
         min - tymczasowy minimalny indeks, domyślnie 0

         2. while dopóki max jest większe od min

         3. currentValue = input[currentIndex]
         4. jeśli current jest mniejsze od searched:
         min = currentIndex
         currentIndex = minIndex + ((maxIndex - minIndex) / 2)

         5. Jeśli current jest zwiększe od searched
         max = currentIndex
          currentIndex = minIndex + ((maxIndex - minIndex) / 2)

         */

        int currentIndex = input.size() / 2;
        int maxIndex = input.size();
        int minIndex = 0;

        int currentValue = input.get(currentIndex);

        while(maxIndex > minIndex){
            if(currentValue == searchedValue){
                return true;
            } else if(currentValue < searchedValue){
                minIndex = currentIndex;
            } else {
                maxIndex = currentIndex;
            }
            currentIndex = minIndex + ((maxIndex - minIndex) / 2);
            currentValue = input.get(currentIndex);

        }

        return false;

    }

}

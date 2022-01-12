package com.company.array.serie_1;

public class Collections_1 {

    public static void secondMinimumElement(int[] inputArray) {

        /*
        1. Zrób zmiienną najmniejsza
        2. Zrób zmienną druga najmniejsza.
        3. Iteruj się po kolekcji. 
        4. Wpisuj zmienne uzywając ifów. 
         */

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int number : inputArray
        ) {
            if(number < smallest){
                secondSmallest = smallest;
                smallest = number;
            } else if (number < secondSmallest){
                secondSmallest = number;
            }
        }


        System.out.println(secondSmallest);

    }
}

package com.company;

public class Collections_1_FindTheSecondMinimumElementOfArray {

    /*
            Tworzę zmienną firstMinimum i ustawiam go na INTEGER.MAX
            Tworzę zmienną secondMinimum i ustawiam go na INTEGER.MAX

            Iteruję po input array
            Jeśli element jest mneijszy od first minimum
            second minimum = first minimum
            element = first minimum

            Jeżeli element jest element jest większy od first element, ale mniejszy od second element,
            secondElement = element

            Zwróć second element

            PSEUDOKOD:

            firstElement = Integer.Max
            secondElement = Integer.Max

            int element : inputArray
                if element > firstElement

                    secondElement = firstElement
                    firstElement = leement

                else if element > firstElemenet && element < secondElement

                    secondElement = element

            return secondElement
     */

    public static void findSecondMinimumElement(int[] inputArray){

        int firstMinElement = Integer.MAX_VALUE;
        int secondMinElement = Integer.MAX_VALUE;

        for(int element : inputArray){

            if(element < firstMinElement){
                secondMinElement = firstMinElement;
                firstMinElement = element;
            } else if (element > firstMinElement && element < secondMinElement){
                secondMinElement = element;
            }
        }
        System.out.println( secondMinElement);

    }

}

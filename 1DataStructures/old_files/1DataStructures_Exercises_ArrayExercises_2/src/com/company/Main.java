package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static int[] firstExampleIntUnsortedArray = {1, 4, 1, 4, 1, 4, 3, 3, 4, 4, 2, 2, -10};

    public static int[] secondExampleIntSortedArray = {1, 5, 8, 20, 21, 26, 29, 31, 46, 79, 80, 101, 242, 333};
    public static int[] thirdExampleIntSortedArray = {-10000, -666, -121, -120, -40, -31, -9, 0, 5, 10, 15, 37, 40, 80, 81, 82};
    public static int[] forthExampleIntUnSortedArray = {-99, -80, -40, 1, 3, 2004, 1995, 512, 7000, -450, 200929, -1590 - 2, 204, -100000000};
    public static String[] fifthExampleStringArray = {"Your", "leg", "is", "very", "sexy!"};
    public static String[] sixthExampleStringArray = {"beb", "Your", "leg", "is", "very", "sexy!", "very", "a", "a", "a"};

    public static int[] seventhExampleIntSortedArray = {1, 3, 4, 5, 7};
    public static int[] eighthExampleIntSortedArray = {2, 3, 5, 6};

    public static int[] ninthExampleIntSortedArray = {2, 5, 6};
    public static int[] tenthExampleIntSortedArray = {4, 6, 8, 10};


    public static void main(String[] args) {

//        System.out.println(collections_1_findSecondMinimumElement(thirdExampleIntSortedArray));
//        System.out.println(collections_2_firstUniqueElement(firstExampleIntUnsortedArray));
//        System.out.println(Arrays.toString(collections3_mergeTwoSortedArrays(secondExampleIntSortedArray,thirdExampleIntSortedArray)));

//        collections3_mergeTwoSortedArrays(secondExampleIntSortedArray,thirdExampleIntSortedArray);
//        collections4_rearrangePositiveAndNegativeValues(forthExampleIntUnSortedArray);
        collections8_unionAndIntersection(ninthExampleIntSortedArray, tenthExampleIntSortedArray);
    }

    public static void collections8_unionAndIntersection(int[] inputArray1, int[] inputArray2) {

        /*
            // dodaj 4 minuty do licznika
            NA PAPIERZE:

            INTERSECTION:

                Robię pętlę, iteruję po elementach inputArray1, wewnątrz pętli robię następną pętlę, w której iteruję po elementach drugiej tablicy.
                Mam przy tym dwa indexy - i oraz j.
                Sprawdzam, czy element pierwszej tablicy jest obecny w elemencie drugiej tablicy.
                Jeśli to prawda, to dodaję taki element do mojej intersectionOutputArrayList.


            UNION:

                Robię sobie dwa wskaźniki i oraz j.
                Robię pętlę while, której warunkiem działania jest to, że i jest mniejsze od długości tablicy arr1, analogicznie j.

                Jeśli element z i jest mniejszy od j to dodaję go do unionOutputArrayList.
                i robię i ++

                Jeśli j jest mniejsze  to dodaję go do union outputArrayList
                robię j++

                jeśli są równe, to dodaję element pierwszy.
                i robię i ++
                i j ++

                potem sprawdzam, czy i jest mniejsze od arr1.length
                jeśli tak, to dodaję pozostałe elementy z inputArray1
                sprawdzam czy j jest mneijszer od arr2.length
                jeśli tak, to dodaję pozostałe elementy z inputArray2

                Iteruję po intersectionunionlist oraz po unionArraylist i wypisuje elementy.

                PSEUDOKOD:
                INTERSECTION:

                for loop, i < inputArray1, i ++
                    for loop, j < inputArray2, j++
                        jeśli inputArray1[i] jest równe inputArray2[j]
                            to dodaj to do intersectionoutputArrayList

                UNION
                int j, i =
                while loop i < inputArr1 and j < inputArr2
                    jeśli inputarr1 element jest mniejszy od tego z inputArr2
                        dodaję inputArr1
                        i ++
                    jeśli jest większy to
                        dodaję inputArr2
                        j ++
                   else
                        dodaję inputArr1
                        i++
                        j++
            Tutaj dokładnie przetestuj, czy to rozwiązanie się sprawdza, zwróć uwagę na te warunki, czy na pewno są odpowiednie.
            sprawdzam czy i < inputArr1.length
                jeśli tak, to dodaję pozostałe elementy do outputIntersectionArrayList.
            else if sprawdzam czy j< inputArr2.length
                jeśli tak, to dodaję pozostałe elementy do outputIntersectionArrayList.

                Stan początkowy I : 0, J 0
                I0 mniejsze od J0, więc dodaję liczbę 1 a I1;
                J0 mniejsze od I1 więc dodaję 2 a J1
                I1 i J1 są takie same, dodaję 3, a I2,J2
                I2 mniejsze od J2, dodaję 4, a I3
                J2 i I3 są takie same, więc dodaję 5 a J3, I4
                J3 mniejsze od I4, dodaję 6 a J4

                Kończy się ta pętla, bo nie jest spełniony warunek J < arr2.length
         */
        List<Integer> intersectionOutputArrayList = new ArrayList<>();

        for (int a = 0; a < inputArray1.length; a++) {
            for (int b = 0; b < inputArray2.length; b++) {

                if (inputArray1[a] == inputArray2[b]) {
                    intersectionOutputArrayList.add(inputArray1[a]);
                }
            }
        }
        List<Integer> unionOutputArrayList = new ArrayList<>();

        int i = 0, j = 0;
        while (i < inputArray1.length && j < inputArray2.length) {

            if (inputArray1[i] < inputArray2[j]) {
                unionOutputArrayList.add(inputArray1[i]);
                i++;
            } else if (inputArray2[j] < inputArray1[i]) {
                unionOutputArrayList.add(inputArray2[j]);
                j++;
            } else {
                unionOutputArrayList.add(inputArray1[i]);
                i++;
                j++;
            }
        }

        if (i < inputArray1.length) {
            while (i < inputArray1.length) {
                unionOutputArrayList.add(inputArray1[i]);
                i++;
            }
        } else if (j < inputArray2.length) {
            while (j < inputArray2.length) {
                unionOutputArrayList.add(inputArray2[j]);
                j++;
            }
        }

        System.out.println("INTERSECTION:");
        for (Integer integer : intersectionOutputArrayList) {
            System.out.println(integer);
        }

        System.out.println("UNION:");
        for (Integer integer : unionOutputArrayList) {
            System.out.println(integer);
        }

    }


    public static int[] collections4_rearrangePositiveAndNegativeValues(int[] inputArray1) {

        /*
                NA PAPIERZE:

                positiveArrayIndex = 0;
                negativeArrayIndex = 0;

                iteruje się przez tablicę, wskazując na dodatnie i ujemne liczby
                tworzę następnie 2 arrayki o odpowiednich długościach

                towrzę outputArray o długości dwóch porpzednich arrayek
                robię dwa indexy - i oraz j
                robię jeden outputArrayIndex = 0;

                robię pętlę while sprawdzającą czy i jest mniejsze od positive index array i analogicznie z j
                jeśli
                        outputIndexArray % 2 = 0
                 to dodaję do outputu ujemny numer i zwiększam ujemny index
                 else
                        dodaję pozytywny numer i zwiększam dodatni index

                 robię dwie pętle while, które będą dodawały pozostałe numerki, zwiększam też outputArrayIndex.length

                 PSEUDOKOD:

                 positive index = 0;
                 negative index = 0

                 for (element : inputArray1)
                        jeśli element mniejszy od zera
                            negative index ++;
                        else
                            positive index ++;

                positiveNumbersArray = new int [positiveArrayIndex]
                negativeNumbersArray = new int [negativeArrayIndex]

                while positiveArrayIndex >= 0
                    positiveNumbersArray [positiveArrayIndex]
                    positiveArrayIndex --;

                while negativeArrayIndex >= 0
                    negativeNumbersArray [negativeArrayIndex]
                    negativeArrayIndex --;

                outputArray[positiveNumbersArray.length + negativeNumbersArray.length]

                int i = 0, j = 0, outputIndexArray = 0;
                while (i < posiriveNumversarray,length and j < negativenumbersArray.length){
                       jeśli outputIndexArray % 2 = 0 to
                            outputArray[outputIndexArray] = positive indexArray[i]
                            i ++
                            else
                             outputArray[outputIndexArray] = negative indexArray[j]
                             j++
                       outputIndexArray ++;

                robię pętlę while w której warunkeim jest i < positiveIndexArray
                sprawdzam czy i jest mniejsze od positiveindexarray, jeśli tak to dodaje do outputu elementy, inkrementując też wskaźnik i
                robię drugą pętlę while i to samo z negative i J
                }
         */

        int positiveArrayIndex = -1;
        int negativeArrayIndex = -1;

        for (int element : inputArray1) {
            if (element < 0) {
                negativeArrayIndex++;
            } else {
                positiveArrayIndex++;
            }
        }
        int[] positiveNumbersArray = new int[positiveArrayIndex + 1];
        int[] negativeNumbersArray = new int[negativeArrayIndex + 1];

        for (int element : inputArray1) {
            if (element < 0) {
                negativeNumbersArray[negativeArrayIndex] = element;
                negativeArrayIndex--;
            } else {
                positiveNumbersArray[positiveArrayIndex] = element;
                positiveArrayIndex--;
            }
        }

        int[] outputArray = new int[positiveNumbersArray.length + negativeNumbersArray.length];

        int i = 0, j = 0, outputArrayIndex = 0;
        while (i < positiveNumbersArray.length && j < negativeNumbersArray.length) {
            if (outputArrayIndex % 2 == 0) {
                outputArray[outputArrayIndex] = positiveNumbersArray[i];
                i++;
            } else {
                outputArray[outputArrayIndex] = negativeNumbersArray[j];
                j++;
            }
            outputArrayIndex++;
        }
        while (i < positiveNumbersArray.length) {
            outputArray[outputArrayIndex] = positiveNumbersArray[i];
            i++;
            outputArrayIndex++;
        }

        while (j < negativeNumbersArray.length) {
            outputArray[outputArrayIndex] = negativeNumbersArray[j];
            j++;
            outputArrayIndex++;
        }

        System.out.println(Arrays.toString(outputArray));
        return outputArray;
    }


    public static int[] collections3_mergeTwoSortedArrays(int[] inputArray1, int[] inputArray2) {

        /*
                NA PAPIERZE:

                Mam dwie arrayki wejściowe iArr1 oraz iArr2
                Tworzę outputArray o długości iArr1 + iArr2
                Tworzę outputArrayIndex = 0;

                Robię dwa wskaźniki "i" oraz "j", które będą liczyły na któ©ym elementcie w danej tablicy się znajduję.

                Robię pętlę while, której warunkiem jest to, że i jest mniejsze od iArr1 i analogiczna sprawa z J.

                Jeśli iArr[i] < iArr2[j]
                    wtedy outputArray[outputArrayIndex] = iArr1[i]
                    i++;
                else
                     outputArray[outputArrayIndex] = iArr2[j]
                     j++'
                outputArrayIndex ++;

                Robię while i < inputArray1.length
                Robię while j < inputArray2.length

                W każdej z tych pętli będę robił coś w stylu outputArray[outputArrayIndex] =  inputArray1[i]
                i++
                outputArrayIndex ++;

                PSEUDOKOD

                int[] iArr1, iArr2
                outputArrayLength = length of iArr1 + iArr2.length
                outputArrayIndex = 0;


                int i
                int j
                while(i < iArr1.length && j < iArr2.length){
                       if iarr1 element < iarr2 element
                       dodaj wtedy iarr1
                       else dodaj iarr2 do outputArray
                }

                while i< inputArray1.length
                dodaj outputArray[outputArrayIndex] = inputArray[i]
                to samo zrób z j
         */

        int inputArray1Length = inputArray1.length;
        int inputArray2Length = inputArray2.length;

        int outputArrayLength = inputArray1Length + inputArray2Length;
        int[] outputArray = new int[outputArrayLength];

        int outputArrayIndex = 0;
        int i = 0;
        int j = 0;


        while (i < inputArray1Length && j < inputArray2Length) {
            System.out.println("To jest I " + i);
            System.out.println("To jest input Array Length 1  " + inputArray1Length);

            System.out.println("To jest J " + j);
            System.out.println("To jest input Array Length 2  " + inputArray2Length);

            if (inputArray1[i] <= inputArray2[j]) {
                outputArray[outputArrayIndex] = inputArray1[i];
                i++;
            } else {
                outputArray[outputArrayIndex] = inputArray2[j];
                j++;
            }
            outputArrayIndex++;
        }


        while (i < inputArray1Length) {
            outputArray[outputArrayIndex] = inputArray1[i];
            i++;
            outputArrayIndex++;
        }

        while (j < inputArray2Length) {
            outputArray[outputArrayIndex] = inputArray2[j];
            j++;
            outputArrayIndex++;
        }


        System.out.println(Arrays.toString(outputArray));
        return outputArray;
    }

    public static int collections_2_firstUniqueElement(int[] inputArray) {
        int arrayLength = inputArray.length;
        /*

        NA PAPIERZE:

        Mam daną tablicę która posiada zduplikowane elementy
        tworzę zmienną z elmeentme unikalnym
        Iteruje się po nich w jednej pętli z zmienną i
        Potem w środku robię drugą pętlę z zmienną j

        uniqueElement=inputArr[j]

        W środkowej pętli sprawdzam czy takie same są inputArray[i] i inputArray[j] oraz czy indeksy i oraz j nie są identyczne
        jeśli tak, to uniqueElement = null.


        W wewnętrznej pętli tworzę warunek, który sprawdza czy uniqueElement != null, jeśi tak, przerywa działanie pętli
        Zwraca Unique

        PSEUDOKOD:

        int [] inputArr;
        uniqueElement= null;
        for loop z i po inputArray
            for loop z j po inputArray
                  uniqueElemenet=inputArr[j]
                    jeśli element inputArr[j] jest taki sam jak inputArr[i] oraz indeksy nie są tożsame to
                        uniqueElement = null;
            jeśli uniqueElemenet !=null
             to break

          return uniqueElement
        */

        Integer uniqueElement = null;
        for (int i = 0; i < arrayLength; i++) {
            uniqueElement = inputArray[i];
            for (int j = 0; j < arrayLength; j++) {
                if (i != j && inputArray[i] == inputArray[j]) {
                    uniqueElement = null;
                }
            }
            if (uniqueElement != null) {
                break;
            }
        }
        return uniqueElement;

    }

    public static int collections_1_findSecondMinimumElement(int[] inputArray) {

        /*
            NA PAPIERZE:
            robię dwie zmienne, jedna na firstMinimum, druga secon Miniumm
            iteruje się przez tablicę
            sprawdzam, czy element jest mniejszy niż firstMinium, jeśli tak to secondMinnmum = firstMinimum, firstMinimum = element
            else if sprawdzam czy element jest mniejszy niż second minimum, jeśli tak to secondMinium = element

            PSEUDOKOD:

            INT SECOND_MINIMUM;
            INT FIRST_MNIMUM;

            FOR(INT ELEMENT : ARRAY){

                    IF ( ELEMENT < FIRST MINIMUM)

                            ELSE IF (ELEMENT < SECOND MINIMUM
            }
         */

        int firstMinimum = Integer.MAX_VALUE;
        int secondMinimum = Integer.MAX_VALUE;

        for (int element : inputArray) {
            if (element < firstMinimum) {
                secondMinimum = firstMinimum;
                firstMinimum = element;
            } else if (element < secondMinimum) {

                secondMinimum = element;
            }
        }

        return secondMinimum;
    }

}

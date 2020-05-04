package com.company;
import java.util.Arrays;

public class Main {

    public static int[] firstExampleIntUnsortedArray = {-1, 1, 4, 1, 4, 1, 4, 3, 3, 4, 4, 2, 2, -10};

    public static int[] secondExampleIntSortedArray = {1, 5, 8, 20, 21, 26, 29, 31, 46, 79, 80, 101, 242, 333};
    public static int[] thirdExampleIntSortedArray = {-121, -120, -40, -31, -9, 0, 5, 10, 15, 37, 40, 80, 81, 82};
    public static int[] forthExampleIntUnSortedArray = {-99, -80, -40, 1, 3, 2004, 1995, 512, 7000, -450, 100929, -1590 - 2, 204};

    public static void main(String[] args) {
//        Collections1_FindTheSecondMinimumElementInArray();
//        System.out.println(Collections2_FindSecondUniqueElementInArray(firstExampleIntUnsortedArray));
//        Collections3_MergeTwoSortedArrays();
//        collections3_MergeTwoSortedArrays(secondExampleIntSortedArray,thirdExampleIntSortedArray);

        collections4_RearrangePositiveAndNegativeNumbers_v2(forthExampleIntUnSortedArray);
    }

    public static void collections4_RearrangePositiveAndNegativeNumbers_v2(int[] arrayToRearange) {

        int lengthOfArray = arrayToRearange.length;
        int negativeNumberIndex = -1, temp = 0;

        for (int j = 0; j < lengthOfArray; j++) {
            if (arrayToRearange[j] < 0) {
                negativeNumberIndex++;

//                System.out.println("Array element to rearange - " + arrayToRearange[j]);
//                System.out.println(negativeNumberIndex);

                temp = arrayToRearange[negativeNumberIndex];
                arrayToRearange[negativeNumberIndex] = arrayToRearange[j];
                arrayToRearange[j] = temp;
            }
        }

//        System.out.println(negativeNumberIndex);
    }

    public static void collections4_RearrangePositiveAndNegativeNumbers(int[] arrayToRearange) {


        /*
                NA PAPIERZE:

                Tworzę positiveIndex, który daje mi info o dodatnich liczbach.
                Tworzę negativeIndex, dający ilość ilczb negatywnych

                Tworzę tablicę positiveArray
                Tworzę tablicę negativeArray

                Tworzę nową output tablicę o długości positiveIndex+negativeIndex.
                Tworzę outputIndex, który liczy ile miejsc w tablicy zostało do wypełnienia

                Iteruję się przez outputArray, ale jendocześnie sprawdzam, czy negative i positive Index są większe niż zero, sprawdzam czy index jest parzysty, jeśli tak, to wypełniam arrayOutupt[outputIndex] liczbą positiveArray[positiveIndex] oraz positiveIndex --.
                else wypełniam arrayOutput[outputIndex] liczbą negativeArray[negativeIndex] oraz negativeIndex --.

                JEśli positive arrray jest większe niż zero, to iteruje się i dodaję resztę cyfr do outputArray.
                else if negative array jest większe niż zero, to robię to samo.

                IMPLEMENTACJA:
         */

        int positiveIndex = 0;
        int negativeIndex = 0;

        for (int integer : arrayToRearange) {
            if (integer >= 0) {
                positiveIndex++;
            } else {
                negativeIndex++;
            }
        }

        int[] positiveArray = new int[positiveIndex + 1];
        int[] negativeArray = new int[negativeIndex + 1];

        int tmpPositiveIndex = positiveIndex;
        int tmpNegativeIndex = negativeIndex;
        for (int integer : arrayToRearange) {
            if (integer >= 0) {
                positiveArray[tmpPositiveIndex] = integer;
                tmpPositiveIndex--;

            } else {
                negativeArray[tmpNegativeIndex] = integer;
                tmpNegativeIndex--;
            }
        }

        int outputArrayLength = positiveIndex + negativeIndex;

        int[] outputArray = new int[outputArrayLength];
        int outputIndex = 0;

        for (; outputIndex < outputArrayLength && positiveIndex >= 0 && negativeIndex >= 0; outputIndex++) {
            if (outputIndex % 2 == 0) {
                outputArray[outputIndex] = positiveArray[positiveIndex];
                positiveIndex--;
            } else {
                outputArray[outputIndex] = negativeArray[negativeIndex];
                negativeIndex--;
            }
        }

        if (negativeIndex >= 0) {
            for (; outputIndex < outputArrayLength; outputIndex++) {
                outputArray[outputIndex] = outputArray[negativeIndex];
                negativeIndex--;
            }
        } else if (positiveIndex >= 0) {
            for (; outputIndex < outputArrayLength; outputIndex++) {
                outputArray[outputIndex] = outputArray[positiveIndex];
                positiveIndex--;
            }
        }

        System.out.println(Arrays.toString(outputArray));

    }

    public static void collections3_MergeTwoSortedArrays(int[] firstSmallArray, int[] secondSmallArray) {


        /*

        Na papierze:

        Dane są tablice A i B o takiej samej długości.

        Kroki do wykonania:

        1. Tworzę nową tablicę, która ma długość sumy dwóch tablic do posortowania.
        2. Tworzę dwa indexy - i oraz j, które będą mi wskazywać postęp w przeglądaniu zarówno jednej i drugiej arrayki.
        3. Iteruje się przez którąkolwiek z danych tablic, warunek jest taki, żeby j albo i było mniejsze od długości tablicy A, iteruje po każdym elemencie.
        4. Sprawdzam czy element tablicy A jest mniejszy od B
        5. Jeśli jest mniejszy, no to oddaję A[index] do mojej tablicy a także oznaczam i++.
        6. Lub dodjaę B[index] do tablicy i oznaczam j ++.
        7. JEśli jedna z tablic się wyczerpie, dodaję resztę w osobnym for loopie.

       PSEUDO KOD :

         int[] wielkaTablica = new Array[A.length + B.length];
         int i, j, index;
         index iteruje przez wszystkie elementy wielkiejTablicy, warunek jest taki, żeby i oraz j były mniejsze niż A.length
         jeśli pierwszy element A[i] jest mniejszy, to robię wielkaTAblica[index] = A[i]; i++
          w przeciwnym razie wielkaTAblica[index] = B[j]; j++



          */
        // IMPLEMENTACJA :

        int firstSmallArrayLength = firstSmallArray.length;
        int secondSmallArrayLength = secondSmallArray.length;

        int largeArrayLength = firstSmallArrayLength + secondSmallArrayLength;
        int[] largeArray = new int[largeArrayLength];

        int i = 0;
        int j = 0;
        int index = 0;

        for (; index < largeArrayLength && j < secondSmallArrayLength && i < firstSmallArrayLength; index++) {

            if (firstSmallArray[i] < secondSmallArray[j]) {
                largeArray[index] = firstSmallArray[i];
                i++;
            } else {
                largeArray[index] = secondSmallArray[j];
                j++;
            }
        }

        if (i < firstSmallArrayLength) {

            for (; index < largeArrayLength; index++) {
                largeArray[index] = firstSmallArray[i];
                i++;
            }

        } else if (j < secondSmallArrayLength) {

            for (; index < largeArrayLength; index++) {
                largeArray[index] = secondSmallArray[j];
                j++;
            }
        }


    }

    public static Integer collections2_FindSecondUniqueElementInArray(int[] arrayToSearch) {

/*
        Na papierze:
        Będzie to wyszukiwanie metodą brute Force.
        Każdy element w array będę porównywał z każdym elementem.
        Pierwszy element, który przejdzie do końca tablicy i nie zostanie znaleziony będzie zwrócony w funkcji.

        Pseudokod:
        Zmienna z unikatowym wynikiem, zainicjowana jako null.
        First Loop {
           Second Loop tutaj nie nadaje się for loop ze względu na potrzebę śledzenia indexu elementu{
                If Element występuje w tablicy to zrób break.
                else if Jeśli to ostatni element tablicy to zrób return z liczbą.
           }
        }

        Zwróć zmienną
 */

        Integer uniqueNumber = null;
        int arrayLength = arrayToSearch.length;

        for (int i = 0; i < arrayLength; i++) {

            boolean isNumberUnique = true;
            for (int j = 0; j < arrayLength; j++) {
                if (i != j && arrayToSearch[i] == arrayToSearch[j]) {

                    isNumberUnique = false;
                }
            }
            if (isNumberUnique) {
                uniqueNumber = arrayToSearch[i];
                break;
            }
        }
        return uniqueNumber;
    }


    public static void Collections1_FindTheSecondMinimumElementInArray() {

        int firstMinElement = Integer.MAX_VALUE;
        int secondMinElement = Integer.MAX_VALUE;

        for (int element : firstExampleIntUnsortedArray) {
            if (element < firstMinElement) {
                secondMinElement = firstMinElement;
                firstMinElement = element;
            }

        }

        System.out.println(secondMinElement);
    }

}

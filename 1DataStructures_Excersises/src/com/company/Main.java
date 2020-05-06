package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static int[] firstExampleIntUnsortedArray = {-1, 1, 4, 1, 4, 1, 4, 3, 3, 4, 4, 2, 2, -10};

    public static int[] secondExampleIntSortedArray = {1, 5, 8, 20, 21, 26, 29, 31, 46, 79, 80, 101, 242, 333};
    public static int[] thirdExampleIntSortedArray = {-121, -120, -40, -31, -9, 0, 5, 10, 15, 37, 40, 80, 81, 82};
    public static int[] forthExampleIntUnSortedArray = {-99, -80, -40, 1, 3, 2004, 1995, 512, 7000, -450, 200929, -1590 - 2, 204, -100000000};
    public static String[] fifthExampleStringArray = {"Your", "leg", "is", "very", "sexy!"};
    public static String[] sixthExampleStringArray = {"beb", "Your", "leg", "is", "very", "sexy!", "very", "a", "a", "a"};

    public static int[] seventhExampleIntSortedArray = {1, 3, 4, 5, 7};
    public static int[] eighthExampleIntSortedArray = {2, 3, 5, 6} ;


    public static void main(String[] args) {
//        Collections1_FindTheSecondMinimumElementInArray();
//        System.out.println(Collections2_FindSecondUniqueElementInArray(firstExampleIntUnsortedArray));
//        Collections3_MergeTwoSortedArrays();
//        collections3_MergeTwoSortedArrays(secondExampleIntSortedArray,thirdExampleIntSortedArray);

//        collections4_RearrangePositiveAndNegativeNumbers_v2(forthExampleIntUnSortedArray);
//        System.out.println(Arrays.toString(collections5_howToReverseArray(fifthExampleStringArray)));
//        System.out.println(Arrays.toString(collections6_findDuplicatesInArray(sixthExampleStringArray)));
//        getLargestAndSmallestNumber();
        collections8_intersectionAndUnionOfArrays(seventhExampleIntSortedArray, eighthExampleIntSortedArray);
    }

    public static void collections8_intersectionAndUnionOfArrays(int[] inputArray1, int[] inputArray2) {

        /*
                NA PAPIERZE:
                INUT : Mam dwie tablicę, posortowane, które w samych sobie nie zawierają duplikatów, natomiast mogą zawierać duplikaty między sobą.
                OUTPUT: Logi w systemie, z których jeden zwraca tablicę, która będzie zawierała wyłącznie elementy wspólne, a druga tablica  będzie zawierała połączenie dwóch arrayek - values mają być posortowane i bez duplikatów.

                Intersection:
                Dla ułatwienia robię tutaj intersectionArrayList, żeby można było dynamicznie dodawać elementy do arrayki.

                Iteruję przez jedną tablicę, następnie przez drugą. W środku drugiej robię warunek, który sprawdza, czy indexy nie są takie same i czy elementy są takie same. Jeśli tak, to dodaje to do intersectionArrayList.

*/

        List<Integer> intersectionArrayList = new ArrayList<>();

        for (int a = 0; a < inputArray1.length; a++) {
            for (int b = 0; b < inputArray2.length; b++) {
                if (inputArray1[a] == inputArray2[b]) {
                    intersectionArrayList.add(inputArray1[a]);
                }
            }
        }
        System.out.println("Intersection:");
        intersectionArrayList.forEach(System.out::println);


/*



                Union:
                Dla ułatwienia robię unionArrayList.
                Tworzę dwa indexy - i oraz j, wynoszą one 0.
                Robię pętlę while, która sprawdza czy i jest mniejsze od inputArr1.length i analogicznie z j.
                W środku pętli:

                Wyrażenie warunkowe sprawdza, czy liczby są równe, jeśli są, to dodaję do intersectionArrayList element z pierwszej tablicy, i inkrementuję wskaźniki I oraz J.
                Else if
                Wyrażenie warunkowe, które sprawdza, czy pierwszy element jest mniejszy od drugiego. Jeśli tak to:

                Dodaję arr1[i] do unionArrayList.
                Ikrementuję wskaźnik i,

                else if
                jeśli drugi jest mniejszy od pierwszego to robię analogiczną rzecz.

                if Sprawdzam czy i jest mniejsze od arr1.length
                zrób pętle, która doda pozostałę elementy z arr1 do unionArrayList1

                else if sprawdzma czy j jest mniejsze od arr2.length
                zrób pętle, która doda pozostałę elementy z arr1 do unionArrayList2

         */


        List<Integer> unionArrayList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < inputArray1.length && j < inputArray2.length) {

            if (inputArray1[i] == inputArray2[j]) {

                unionArrayList.add(inputArray1[i]);
                i++;
                j++;
            } else if (inputArray1[i] < inputArray2[j]) {

                unionArrayList.add(inputArray1[i]);
                i++;

            } else if (inputArray2[j] < inputArray1[i]) {
                unionArrayList.add(inputArray2[j]);
                j++;
            }
        }

        if (i < inputArray1.length) {

            while (i < inputArray1.length) {
                unionArrayList.add(inputArray1[i]);
                i++;
            }

        } else if (j < inputArray2.length) {
            while (j < inputArray2.length) {



                unionArrayList.add(inputArray2[j]);
                j++;
            }
        }
        System.out.println("Union:");
        unionArrayList.forEach(System.out::println);


    }

    public static void collections7_getLargestAndSmallestNumber() {

        /*
            NA PAPIERZE:
            tworzę dwie zmienne larges,smallest
            iteruje po wszystkich elementach tablicy, sprawdzając, czy dany element jest mniejszy od smallest, jeśli tak to przypisz, albo czy jest większy od largest, jeśli tak to przypisz.


            PSEUDOKOD
            LARGEST
            SMALLEST
            Forloop for each
                if int < smallest
                    smallest = int
                    else if int > largest
                    largest = int

         */

        int LARGEST_INT = forthExampleIntUnSortedArray[0];
        int SMALLEST_INT = forthExampleIntUnSortedArray[0];

        for (int integer : forthExampleIntUnSortedArray) {

            if (integer > LARGEST_INT) {
                LARGEST_INT = integer;
            } else if (integer < SMALLEST_INT) {
                SMALLEST_INT = integer;
            }
        }

        System.out.println(LARGEST_INT);
        System.out.println(SMALLEST_INT);

    }

    public static String[] collections6_findDuplicatesInArray(String[] intputArray) {

        /*

            NA PAPIERZE:
            Mam arraykę, która posiada Stringi, które są zduplikowane
            Iteruje po niej i sprawdzam, ile jest takich stringów zduplikowanych.

            Tworzę arraykę o długości zduplikowanych stringów
            Iteruję ponownie po inputArray, tym razem daję do kolejną pętlę, która porównuje każdy element z następnym.
            Jeśli znajdzie duplikat, dodaje go do outputArray

            PSEUDOKOD:

            inputArray
            duplicateIndex
            for loop i input array
                for loop j input Array
                    jeśli i != j i inputArray[i] == inputArray [j]
                        duplicate index ++;

            duplicateArray[duplicateIndex]

                for loop i input array
                    for loop j input Array
                    jeśli i != j i inputArray[i] == inputArray [j]
                        duplicateArray[i] = inputArray[i];
         */

        int duplicateIndex = -1;
        for (int i = 0; i < intputArray.length; i++) {
            for (int j = 0; j < intputArray.length; j++) {
                if (i != j && intputArray[j] == intputArray[i]) {
                    duplicateIndex++;
                }
            }
        }
        String[] outputArray = new String[duplicateIndex + 1];
        for (int i = 0; i < intputArray.length; i++) {
            for (int j = 0; j < intputArray.length; j++) {
                if (i != j && intputArray[j].equals(intputArray[i])) {
                    outputArray[duplicateIndex] = intputArray[i];
                    duplicateIndex--;
                }
            }
        }
        return outputArray;

    }

    public static String[] collections5_howToReverseArray(String[] inputArray) {

        /*
                NA PAPIERZE :
                Mam array, która zawiera String`i.
                Tworzę outputArraykę
                Iteruję po inputArray ale dekrementuję wkaźnik
                Z każdą iteracją zapisuję elementy na początku pierwszej tablicy

                PSEUDOKOD:
                inputArray
                outputArray

                j = 0
                for loop, i = inputArray.length -  1;  i >= 0, i --
                    outputArray[j] = inputArray[i]

         */
        String[] outputArray = new String[inputArray.length];
        int j = 0;
        for (int i = inputArray.length - 1; i >= 0; i--) {
            outputArray[j] = inputArray[i];
            j++;
        }

        return outputArray;
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

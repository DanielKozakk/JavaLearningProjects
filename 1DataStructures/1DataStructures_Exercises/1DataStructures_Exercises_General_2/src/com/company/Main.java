package com.company;

public class Main {

    public static int[] firstExampleIntUnsortedArray = { 1, 4, 1, 4, 1, 4, 3, 3, 4, 4, 2, 2, -10};

    public static int[] secondExampleIntSortedArray = {1, 5, 8, 20, 21, 26, 29, 31, 46, 79, 80, 101, 242, 333};
    public static int[] thirdExampleIntSortedArray = {-121, -120, -40, -31, -9, 0, 5, 10, 15, 37, 40, 80, 81, 82};
    public static int[] forthExampleIntUnSortedArray = {-99, -80, -40, 1, 3, 2004, 1995, 512, 7000, -450, 200929, -1590 - 2, 204, -100000000};
    public static String[] fifthExampleStringArray = {"Your", "leg", "is", "very", "sexy!"};
    public static String[] sixthExampleStringArray = {"beb", "Your", "leg", "is", "very", "sexy!", "very", "a", "a", "a"};

    public static int[] seventhExampleIntSortedArray = {1, 3, 4, 5, 7};
    public static int[] eighthExampleIntSortedArray = {2, 3, 5, 6};



    public static void main(String[] args) {

//        System.out.println(collections_1_findSecondMinimumElement(thirdExampleIntSortedArray));
        System.out.println(collections_2_firstUniqueElement(firstExampleIntUnsortedArray));

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
        for(int i = 0; i < arrayLength; i++){
            uniqueElement = inputArray[i];
            for(int j = 0; j < arrayLength; j++){
                if(i != j && inputArray[i] == inputArray [j]){
                    uniqueElement = null;
                }
            }
            if(uniqueElement != null){
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

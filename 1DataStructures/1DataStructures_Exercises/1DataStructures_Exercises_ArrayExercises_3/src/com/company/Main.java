package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int[] firstSortedArray = {1, 3};
    public static int[] secondSortedArray = {1};

    public static void main(String[] args) {

        collections8_UnionAndIntersection(firstSortedArray, secondSortedArray);

    }

    public static void collections8_UnionAndIntersection(int[] inputArray1, int[] inputArray2) {

        /*

            NA PAPIERZE:

            INTERSECTION:
            Elementy wspólne dwóch tablic:

            intersectionOutputArrayList - tu umieszczczę wynik
            Jedna pętla iterująca przez jedną tablicę, index i, w środku druga, iterująca przez drugą index j
            Jeśli inputArray1 [i] równy inputArray2 [j] to dodaj eleement do intersectionoutputArrayList
            przerwij pętlę

            UNION:

            robię unionOutputArrayList
            robię wskaźnik i
            robię wskaźnik j

            robię pętlę while, z warunkiem działania takim, że i jest mniejsze od inputArraylist1 i to samo z j i inputArrayList2

            jeśli elemenet i jest mniejszy to go dodaję i robię i++
            jeśli element j jest mniejszy to gododaję i robię j ++
            jeśli emenety są equals to dodaję pierwszy i robię i ++,, j++

            robię dwie pętlę while, jedna z i mniejsze od inputArray1length to samo z j
            w środku nich dodaję resztę elementów z każdej z pętli

            PSEUDOKOD:

            intersectionOutputArrayList = new ArrayList
            forloop i; i < inputArraylist1; i ++
                forloop j; j < inputarraylist2; j++
                    jeśli inputArray1-i jest równe inputArray2-j
                        dodaj element do intersectionOutputArrayList
                        break

            unionOutputArrayList = new arraylist
            int j = 0, i = 0;
            while j < inputArrayList2.length && i < inputArrayList1.length
                jeśli inputarrayList1 i jest mniejsze od inputarraylist2 j
                    unionOutputArrayList.add intputArrayList1
                    i ++
                jeśli inputArrayList2 j < inputArrayList1 i
                    unionOutputArraList.add input arraylist2 -j
                    j++
                    else
                     unionOutputArrayList.add intputArrayList1
                    i ++
                    j++
            while ( j < inputArrayList2){
                outputArraylist.add inputArrayList2[j]
                j++
            while ( i < inputArrayList2){
                outputArraylist.add inputArrayList1[i]
                i++

         */
        // IMPLEMENTACJA:
        List<Integer> intersectionOutputArrayList = new ArrayList<Integer>();

        for (int a : inputArray1) {
            for (int b : inputArray2) {
                if (a == b) {
                    intersectionOutputArrayList.add(a);
                    break;
                }
            }
        }
        System.out.println("INTERSECTION: ");
        System.out.println(intersectionOutputArrayList.toString());

        List<Integer> unionOutputArrayList = new ArrayList<Integer>();
        int i = 0, j = 0;

        while(j < inputArray2.length && i < inputArray1.length){

            if(inputArray1[i] < inputArray2[j]){
                unionOutputArrayList.add(inputArray1[i]);
                i++;
            } else if(inputArray2[j] < inputArray1[i]){
                unionOutputArrayList.add(inputArray2[j]);
                j++;
            } else {
                unionOutputArrayList.add(inputArray1[i]);
                i++;
                j++;
            }
        }

        while(j < inputArray2.length){
            unionOutputArrayList.add(inputArray2[j]);
            j++;
        }
        while(i < inputArray1.length){
            unionOutputArrayList.add(inputArray1[i]);
            i++;
        }

        System.out.println("UNION: ");
        System.out.println(unionOutputArrayList.toString());
    }
}

package com.company;

import com.company.array.serie_1.Collections_1;
import com.company.array.serie_1.Collections_2;
import com.company.array.serie_1.Collections_3;

public class Main {

    public static void main(String[] args) {

//    int [] firstArray = {1, 3, 4, 5};
//    int [] secondArray = {2, 4, 6, 8};
//    Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}

    int [] firstArray = { 5, 8, 9};
    int [] secondArray =  {4, 7, 8};
//    Output: arr3[] = {4, 5, 7, 8, 8, 9}

        Collections_3.mergeTwoSortedArrays(firstArray, secondArray);
    }
}

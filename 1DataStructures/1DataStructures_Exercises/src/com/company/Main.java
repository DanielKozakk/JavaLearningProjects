package com.company;

import com.company.array.serie_1.Collections_8;

public class Main {

    public static void main(String[] args) {
        int[] firstArray = {1, 3, 4, 5, 7};
        int[] secondArray = {2, 3, 5, 6};

        int[] thirdArray = {2, 5, 6};
        int[] forthArray = {4, 6, 8, 10};

        Collections_8.unionAndIntersection(firstArray, secondArray);
        Collections_8.unionAndIntersection(thirdArray, forthArray);
    }
}

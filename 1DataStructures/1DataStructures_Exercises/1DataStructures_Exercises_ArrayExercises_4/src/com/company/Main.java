package com.company;

public class Main {

    public static void main(String[] args) {

        //    Input : arr1[] = {1, 3, 4, 5, 7}
//    arr2[] = {2, 3, 5, 6}
//    Output :
//
//    Union : {1, 2, 3, 4, 5, 6, 7}
//    Intersection : {3, 5}
//

        //    Input : arr1[] = {2, 5, 6}
//    arr2[] = {4, 6, 8, 10}
//    Output : Union : {2, 4, 5, 6, 8, 10}
//    Intersection : {6}

        int [] arr1 = {2,5,6};
        int [] arr2 = {4,6,8,10};
        Collections_8_UnionAndIntersection.intersectionAndUnion(arr1,arr2);


    }
}

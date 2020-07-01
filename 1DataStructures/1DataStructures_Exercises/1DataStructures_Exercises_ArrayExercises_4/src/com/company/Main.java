package com.company;

public class Main {

    public static void main(String[] args) {
//        Input : -1 2 -1 3 2
//        Output : 3
//        Explanation : The first number that does not
//        repeat is : 3
//
//        Input : 9 4 9 6 7 4
//        Output : 6


        int [] arr1 = {2,5,6};
        int [] arr2 = {4,6,8,10};
//        Collections_8_UnionAndIntersection.intersectionAndUnion(arr1,arr2);

        int [] arr3 = {-1,2,-1,3,2};
        int [] arr4 = {9,4,9,6,7,4};

        //    Input : -1 2 -1 3 2
//    Output : 3
//    Explanation : The first number that does not
//    repeat is : 3
//
//    Input : 9 4 9 6 7 4
//    Output : 6


        Collections_2_FirstNonRepeatingIntegerInArray col2 = new Collections_2_FirstNonRepeatingIntegerInArray();
        col2.findFirstNonRepeating(arr4);


    }
}

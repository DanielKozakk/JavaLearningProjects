package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    private static int[] intArray = {2, 4, 6, 23, 67, 56, 34, 34, 12121212, 8, 56, 20, 1, 2, 3, 20, 9, 24, 64, 38, 25, 67, 0, 1, 2, 99, 2, 53, 36, 57, 23, 76, 23, 75, 33, 65, 12, 33, 1, 57, 87, 70, 94, 48, 85, 34, 65, 12, 62, -4, 9, 8, -65, -65};

    public static void main(String[] args) {
//        firstSmallestNonRepeatingIntegerInArray();
//          getIntersectionAndUnion();
//        getTwoHighestNumbers();
        mergeArrays();

    }


//    private int[] intersectionOfSortedArrays(){
//
//        int [] abc = {12,12};
//        return abc;
//    }



    public static void mergeArrays()
    {

        int[] arr1 = {2, 7, 9, 10, 232, 635, 700, 906, 950, 985, 989, 990, 999, 1001, 1002, 1003};
        int[] arr2 = {4, 7, 20, 156, 200, 346, 347, 477, 544, 567, 675, 892, 1000, 1205, 1206};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int [] arr3 = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        // Traverse both array
        while (i<n1 && j <n2)
        {
            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Otherwise do same with second array
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }

        // Store remaining elements of first array
        while (i < n1)
            arr3[k++] = arr1[i++];

        // Store remaining elements of second array
        while (j < n2)
            arr3[k++] = arr2[j++];

        System.out.println(Arrays.toString(arr3));

    }

    public static void getTwoHighestNumbers() {

        int firstTop = intArray[0];
        int secondTop = intArray[0];

        for (int i : intArray) {
            if (i > firstTop) {
                firstTop = i;
            } else if (i > secondTop) {
                secondTop = i;
            }
        }

        System.out.println(firstTop);
        System.out.println(secondTop);


    }


    public static void getIntersectionAndUnion() {

        // jest tu interowaniie po najmniejszej tablicy, nawet bez wiedzy, która to jest

        int arr01[] = {1, 2, 4, 5, 6};
        int arr02[] = {2, 3, 5, 7};

        int i = 0, j = 0;
        while (i < arr01.length && j < arr02.length) {
            if (arr01[i] < arr02[j])
                i++;
            else if (arr02[j] < arr01[i])
                j++;
            else {
                System.out.print(arr02[j++] + " ");
                i++;
            }
        }
    }


    public static void getIntersection(int arr01[], int arr02[], int m, int n) {

    }


    private static void firstSmallestNonRepeatingIntegerInArray() {

        Integer smallestNonDouplicate = null;
        int smallestInteger = intArray[0];

        for (Integer integer : intArray) {

            if (integer <= smallestInteger) {
                smallestInteger = integer;

                if (smallestNonDouplicate != null && smallestInteger == smallestNonDouplicate) {
                    smallestNonDouplicate = null;
                } else {
                    smallestNonDouplicate = smallestInteger;
                }
            }
        }

        System.out.println("firstSmallestNonRepeatingIntegerInArray:");
        System.out.println(smallestNonDouplicate);
    }

    private static void secondMinimumElementOfArray() {

        int firstMinimumElementOfArray = intArray[0];
        Integer secondMinimumElementOfArray = null;

    }
}

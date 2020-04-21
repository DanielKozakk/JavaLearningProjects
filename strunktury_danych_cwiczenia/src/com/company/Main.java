package com.company;

public class Main {

    public static void main(String[] args) {
        firstSmallestNonRepeatingIntegerInArray();

    }

    private static int[] intArray = {2, 4, 6, 23, 67, 56, 34, 34, 8, 56, 20, 1, 2, 3, 20, 9, 24, 64, 38, 25, 67, 0, 1, 2, 99, 2, 53, 36, 57, 23, 76, 23, 75, 33, 65, 12, 33, 1, 57, 87, 70, 94, 48, 85, 34, 65, 12, 62, -4, 9, 8, -65, -65};

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

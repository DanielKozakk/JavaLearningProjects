package com.company;

import javax.sound.midi.SysexMessage;
import java.util.Arrays;

public class Collections_4_RearrangePositiveAndNegativeValuesInArray {

//    For example, if the input array is [-1, 2, -3, 4, 5, 6, -7, 8, 9], then the output should be [9, -7, 8, -3, 5, -1, 2, 4, 6]


    //    [-1, -3, -7, 4, 5, 6, 2, 8, 9]

    public void rearrange(int[] input) {

// [-1, 2, -3, 4, 5, 6, -7, 8, 9]
// [-1, -3, 2, 4, 5, 6, -7, 8, 9]


        Integer positiveTmpIndex = null;
        for (int i = 0; i < input.length; i++) {

            if (positiveTmpIndex == null && input[i] > 0) {
                positiveTmpIndex = i;
            } else if (input[i] < 0 && positiveTmpIndex != null) {
                int tmpValue = input[positiveTmpIndex];
                input[positiveTmpIndex] = input[i];
                input[i] = tmpValue;
                positiveTmpIndex++;
            }

        }


        if (positiveTmpIndex != null) {
            for (int i = 0; i < input.length && positiveTmpIndex < input.length; i++) {
                if (i % 2 == 0 && input[i] < 0) {
                    int tmp = input[i];
                    input[i] = input[positiveTmpIndex];
                    input[positiveTmpIndex] = tmp;
                    positiveTmpIndex++;
                }
            }
        }
        System.out.println(Arrays.toString(input));

        /*

    J to index pierwszej liczby dodatniej, w tym przykładzie J = 3

    Iteruje się po elementach, jeśli index jest parzysty, a liczba ujemna
    To zamieniam tę liczbę na pierwszą dodatnią, a następnie J++.

    [-1, -3, -7, 4, 5, 6, 2, 8, 9]
    [4, -3, -7, -1, 5, 6, 2, 8, 9]

    J = 4

    // następnie iteracja idzie na -3, ale index jest nieparzysty, więc idzie dalej
    // trafia na -7 a index to 2

    Więc zamienia na -7 na 5 wykorzystując J
    Następnie J ++
    Na początku trzeba sprawdzać, czy J jest mniejsze od input.length

 */

    }


}

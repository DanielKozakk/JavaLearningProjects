package com.company;

import com.company.array.serie_1.Collections_8;
import com.company.stack.serie_1.Collections_10;
import com.company.stack.serie_1.Collections_9;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();
        List<Integer> intList = Arrays.asList(34, 3, 31, 98, 92, 93);
        intStack.addAll(intList);

        Stack<Integer> secondInitStack = new Stack<>();
        List<Integer> intList2 = Arrays.asList(3, 5, 1, 4, 2, 8);
        secondInitStack.addAll(intList2);

        Collections_10.sortStackUsingATemporaryStack(intStack);
    }
}

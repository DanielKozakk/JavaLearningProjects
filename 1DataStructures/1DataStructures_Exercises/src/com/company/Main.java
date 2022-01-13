package com.company;

import com.company.array.serie_1.Collections_8;
import com.company.stack.serie_1.Collections_9;

public class Main {

    public static void main(String[] args) {
        String [] expression = {"10", "2", "8", "*", "+", "3", "-"};

        Collections_9.evaluatePostfixExpression(expression);
    }
}

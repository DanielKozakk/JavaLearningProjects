package com.company.serie1;

public class Algorithms_3_RecursiveFactorial {

    public static int recursiveFactorial(int input){

        if(input == 1){
            return 1;
        }
        return recursiveFactorial(input - 1) * input;
    }

}

package com.company.serie3;

public class Algorithms_3 {
    public static Integer factorial (Integer number){
        if(number == 1){
            return 1;
        } else {
            return number * factorial(number - 1 );
        }
    }
}

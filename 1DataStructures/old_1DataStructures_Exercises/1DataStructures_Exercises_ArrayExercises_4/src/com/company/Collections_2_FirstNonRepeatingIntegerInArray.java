package com.company;

public class Collections_2_FirstNonRepeatingIntegerInArray {
//    Input : -1 2 -1 3 2
//    Output : 3
//    Explanation : The first number that does not
//    repeat is : 3
//
//    Input : 9 4 9 6 7 4
//    Output : 6


    public void findFirstNonRepeating (int [] input){

        /*

        for (int i = 0; i < input.length; i ++){
            boolean isUnique = true;
            for(int j = i+1; j< input.length; j++){

                if(input[i] == input[j]){
                    isUnique = false;
                    break;
                }
            }
            if(!isUnique){
                continue;
            } else {
                System.out.println(input[i]);
                break;
            }

        }


         */

        for (int i = 0; i < input.length; i ++){
            boolean isUnique = true;
            for(int j = 0; j< input.length; j++){
                if(i != j && input[i] == input[j]){
                    isUnique = false;
                    break;
                }
            }
            if(!isUnique){
                continue;
            } else {
                System.out.println(input[i]);
                break;
            }
        }

    }
}

package com.company;

public class Collections_2_FirstNonRepeatingIntegerInArray {

    /*

            Pierwsza pętla leci po wszystkich elementach tablicy

                boolean isUnique = true
                Druga pętla wewnątrz pierwszej też leci po wszystkich elementahc tablicy
                    W środku warunek, który sprawdza, czy liczby są równe, oraz czy indeksy nie są równe
                         jeśli tak, to isUnique = false

                Następnie warunek, który sprawdza, czy isUnique jest true
                    jeśli jest true to wypisuje element i robię break
     */

    /*

            for(i = 0; i < inputArray.lemngth; i++)

                 Integer uniqueElement = null;

                 for(j = 0; j < inputArray.lemngth; j++)
                    uniqueElement = inputArray[i]
                    if inputArray[j] == inputArray[i] && i != j
                        uniqueElement = null

                 if(isUnique)
                    System.ouit.println(uniqueElement)
                    break;

     */
    public static void findFirstNonRepeatingInteger(int [] inputArray){

            for(int i = 0; i < inputArray.length; i++){

                Integer uniqueElement = null;

                for(int j = 0; j < inputArray.length; j++){

                    if(i != j) {
                        uniqueElement = inputArray[i];
                    }

                    if(inputArray[i] == inputArray[j] && i != j){
                        uniqueElement = null;
                        break;

                    }

//                    System.out.println("Unique Element "+ uniqueElement + " z indexem j " + j );
//                    System.out.println("Unique Element "+ uniqueElement + " z indexem i " + i);
                }


                if (uniqueElement != null){
                    System.out.println(uniqueElement);
                    break;
                }

            }
    }

}



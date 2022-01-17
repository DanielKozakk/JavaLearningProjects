package com.company.queue.serie1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Collections_14 {

    /**

     Input: n = 2
     Output: 1, 10

     Input: n = 5
     Output: 1, 10, 11, 100, 101



     */

    public static void generateBinaryNumbersFrom1ToN(int n){

        /*

        Robię queue i dodaję 01 i 02 do niego
        robię pętlę, która działa n razy

        za każdym powtórzeniem pętli

            00 -> 01
            01 -> 10
            10 -> 11
            11 (tylko jedynki) jeśli istnieje zero przed jeedynkami -> zamień to zero na 1 zamień 11 na 00
            11 (tylko jedynki) jeśli nie istnieje zero przed jedynkami -> dodaj jeden na początek i zamień resztę na zera

         */

        String binaryOne = "01";
        String binaryTwo = "10";
        String binaryThree= "11";
        Queue<String> binaryGeneratorQueue = new LinkedList<>();

        binaryGeneratorQueue.add(binaryOne);
        binaryGeneratorQueue.add(binaryTwo);
        binaryGeneratorQueue.add(binaryThree);

        for(int i = 0; i < n ; i ++ ){
            if(i == 0){
//                binaryGeneratorQueue.poll();
                System.out.println(binaryGeneratorQueue.poll());
                continue;
            }

            String nextNumber = binaryGeneratorQueue.poll();
            String endOfString = nextNumber.substring(nextNumber.length() - 2);

            Pattern pattern = Pattern.compile("^1+$");
            Matcher matcher = pattern.matcher(nextNumber);

            if(endOfString.equals("00")){
                String startOfString = nextNumber.substring(0, nextNumber.length()-2);
                binaryGeneratorQueue.add(startOfString + "01");
                binaryGeneratorQueue.add(startOfString + "10");
                binaryGeneratorQueue.add(startOfString + "11");
            } else if(matcher.find()){
                StringBuilder sb = new StringBuilder("1");
                for(int nextNumberChar = 0; nextNumberChar < nextNumber.length(); nextNumberChar++){
                    sb.append("0");
                }
                binaryGeneratorQueue.add(sb.toString());
            } else if(endOfString.equals("11")){

                Integer firstZeroFromLast = null;
                StringBuilder sb = new StringBuilder();
                for(int index = nextNumber.length() - 1; index > 0; index --){
                    if(nextNumber.charAt(index) == '0'){
                        firstZeroFromLast = index;
                        break;
                    }
                    sb.append("0");
                }
                String startOfString = nextNumber.substring(0, firstZeroFromLast);
                startOfString += "1";
                String newString = startOfString;
                newString += sb.toString();
                binaryGeneratorQueue.add(newString);

            }

            System.out.println(nextNumber);
        }

    }
}

